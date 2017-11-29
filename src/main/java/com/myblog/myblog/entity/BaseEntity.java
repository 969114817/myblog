package com.myblog.myblog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zyk
 * @Description: baseEntity类
 * @Date:Create in 10:56 2017/11/22
 * @Modified By:
 **/
public class BaseEntity implements Serializable {

    /**
     * 主键id  mybatisconfig 设置自增
     */
    private Long id;
    /**
     * 创建人id
     */
    private Long createid;

    /**
     * 创建人姓名
     */
    private String createname;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人id
     */
    private Long updateid;

    /**
     * 修改人姓名
     */
    private String updatename;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 0禁用 1启用 2删除
     */
    private Integer flag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateid() {
        return createid;
    }

    public void setCreateid(Long createid) {
        this.createid = createid;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Long updateid) {
        this.updateid = updateid;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
