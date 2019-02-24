package com.yj.common.persistence;

public abstract class DataEntity<T> extends BaseEntity<T> {
    private static final long serialVersionUID = 1L;
    protected String remarks;    // 备注
    protected String delFlag;    // 删除标记（0：正常；1：删除；2：审核）

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
