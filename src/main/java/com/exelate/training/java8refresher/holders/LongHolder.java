package com.exelate.training.java8refresher.holders;

import java.io.Serializable;

public class LongHolder implements Serializable {

    private static final long serialVersionUID = 19274392842L;

    private long value;

    public LongHolder() {
        this(0);
    }

    public LongHolder(long value) {
        this.value = value;
    }

    public long get() {
        return value;
    }

    public LongHolder set(long value) {
        this.value = value;
        return this;
    }

    public LongHolder add(long value) {
        this.value += value;
        return this;
    }

}
