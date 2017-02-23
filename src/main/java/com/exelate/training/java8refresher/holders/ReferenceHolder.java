package com.exelate.training.java8refresher.holders;

import java.io.Serializable;

public class ReferenceHolder<T> implements Serializable {

    private static final long serialVersionUID = 4856792834L;

    private T value;

    public ReferenceHolder() {
        this(null);
    }

    public ReferenceHolder(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public ReferenceHolder<T> set(T value) {
        this.value = value;
        return this;
    }

}
