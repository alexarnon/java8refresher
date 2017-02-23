package com.exelate.training.java8refresher.holders;

import java.io.Serializable;

public class IntHolder implements Serializable {

    private static final long serialVersionUID = 82749384174L;

    private int value;

    public IntHolder() {
        this(0);
    }

    public IntHolder(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public IntHolder set(int value) {
        this.value = value;
        return this;
    }

    public IntHolder add(int value) {
        this.value += value;
        return this;
    }
    
}
