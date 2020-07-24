// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 2017/5/31 16:24:06
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   GenTemplate.java

package com.mall.modules.gen.entity;

import com.google.common.collect.Lists;
import com.mall.common.persistence.AbstractBaseEntity;
import com.mall.common.utils.StringUtils;
import org.hibernate.validator.constraints.Length;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

@XmlRootElement(name="template")
public class GenTemplate
  extends AbstractBaseEntity<GenTemplate>
{
  private static final long serialVersionUID = 1L;
  private String name;
  private String category;
  private String filePath;
  private String fileName;
  private String content;
  
  public GenTemplate() {}
  
  public GenTemplate(String id)
  {
    super(id);
  }
  
  @Length(min=1, max=200)
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getFileName()
  {
    return this.fileName;
  }
  
  public void setFileName(String fileName)
  {
    this.fileName = fileName;
  }
  
  public String getFilePath()
  {
    return this.filePath;
  }
  
  public void setFilePath(String filePath)
  {
    this.filePath = filePath;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public void setContent(String content)
  {
    this.content = content;
  }
  
  public String getCategory()
  {
    return this.category;
  }
  
  public void setCategory(String category)
  {
    this.category = category;
  }
  
  @XmlTransient
  public List<String> getCategoryList()
  {
    if (this.category == null) {
      return (List)Lists.newArrayList();
    }
    return Lists.newArrayList(StringUtils.split(this.category, ","));
  }
  
  public void setCategoryList(List<String> categoryList)
  {
    if (categoryList == null) {
      this.category = "";
    } else {
      this.category = ("," + StringUtils.join(categoryList, ",") + ",");
    }
  }
}
