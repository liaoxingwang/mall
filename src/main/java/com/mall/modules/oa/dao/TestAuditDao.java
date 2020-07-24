package com.mall.modules.oa.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.oa.entity.TestAudit;
import org.apache.ibatis.annotations.Mapper;

/**
 * 审批DAO接口
 * @author
 * @version
 */
@Mapper
public interface TestAuditDao extends InterfaceBaseDao<TestAudit> {

	public TestAudit getByProcInsId(String procInsId);
	
	public int updateInsId(TestAudit testAudit);
	
	public int updateHrText(TestAudit testAudit);
	
	public int updateLeadText(TestAudit testAudit);
	
	public int updateMainLeadText(TestAudit testAudit);
	
}
