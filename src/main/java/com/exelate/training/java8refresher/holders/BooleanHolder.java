package com.exelate.training.java8refresher.holders;

import java.io.Serializable;

public class BooleanHolder implements Serializable {

    private static final long serialVersionUID = 6345126442L;

    private boolean value;

    public BooleanHolder() {
        this(false);
    }

    public BooleanHolder(boolean value) {
        this.value = value;
    }

    public boolean get() {
        return value;
    }

    public BooleanHolder set(boolean value) {
        this.value = value;
        return this;
    }
    
}
