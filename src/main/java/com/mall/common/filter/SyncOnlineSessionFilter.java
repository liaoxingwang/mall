package com.mall.common.filter;

import com.mall.common.constant.ShiroConstants;
import com.mall.modules.monitor.entity.OnlineSession;
import com.mall.modules.sys.service.SysUserOnlineService;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * 同步Session数据到Db
 * 
 * @author mall
 */
public class SyncOnlineSessionFilter extends PathMatchingFilter
{
    /**
     * 日志对象
     */
    private static Logger logger = LoggerFactory.getLogger(SyncOnlineSessionFilter.class);

    @Autowired
    private SysUserOnlineService sysUserOnlineService;
    /**
     * 强制退出后重定向的地址
     */
    @Value("${shiro.user.loginUrl}")
    private String loginUrl;

    /**
     * 同步会话数据到DB 一次请求最多同步一次 防止过多处理 需要放到Shiro过滤器之前
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception
    {
        try {
            OnlineSessionFilter onlineSessionFilter=new OnlineSessionFilter();
            onlineSessionFilter.isAccessAllowed(request,response,null);
            //isAccessAllowed(request, response);
            OnlineSession session = (OnlineSession) request.getAttribute(ShiroConstants.ONLINE_SESSION);
            // 如果session stop了 也不同步
            // session停止时间，如果stopTimestamp不为null，则代表已停止
            if (session != null && session.getUserId() != null && session.getStopTimestamp() == null)
            {
                sysUserOnlineService.syncToDb(session);
            }
            return true;
        }catch (Exception e){
            logger.error("SyncOnlineSessionFilter preHandle error:", e.getMessage());
            return true;
        }

    }



}
