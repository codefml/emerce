package com.yj.common.persistence;

import java.io.Serializable;

public abstract class BaseEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
