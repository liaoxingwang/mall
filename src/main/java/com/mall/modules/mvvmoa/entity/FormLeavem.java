
package com.mall.modules.mvvmoa.entity;

import com.mall.modules.sys.entity.User;
import javax.validation.constraints.NotNull;
import com.mall.modules.sys.entity.Office;
import com.mall.modules.sys.entity.Area;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.mall.common.persistence.AbstractBaseEntity;
import com.mall.common.utils.excel.annotation.ExcelField;

/**
 * 员工请假Entity
 * @author mall
 * @version 2017-07-17
 */
public class FormLeavem extends AbstractBaseEntity<FormLeavem> {
	
	private static final long serialVersionUID = 1L;
	private com.mall.modules.sys.entity.User user;		// 员工
	private com.mall.modules.sys.entity.Office office;		// 归属部门
	private com.mall.modules.sys.entity.Area area;		// 归属区域
	private Date beginDate;		// 请假开始日期
	private Date endDate;		// 请假结束日期
	
	public FormLeavem() {
		super();
	}

	public FormLeavem(String id){
		super(id);
	}

	@NotNull(message="员工不能为空")
	@ExcelField(title="员工", fieldType=User.class, value="user.name", align=2, sort=1)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@NotNull(message="归属部门不能为空")
	@ExcelField(title="归属部门", fieldType=Office.class, value="office.name", align=2, sort=2)
	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}
	
	@ExcelField(title="归属区域", fieldType=Area.class, value="area.name", align=2, sort=3)
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="请假开始日期不能为空")
	@ExcelField(title="请假开始日期", align=2, sort=4)
	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="请假结束日期不能为空")
	@ExcelField(title="请假结束日期", align=2, sort=5)
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}