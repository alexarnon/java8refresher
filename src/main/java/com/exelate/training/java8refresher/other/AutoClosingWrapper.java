package com.exelate.training.java8refresher.other;

import java.util.function.Consumer;

/**
 * A generic wrapper for adding {@link AutoCloseable}-ity to any resource.
 */
public class AutoClosingWrapper<T> implements AutoCloseable {

    private final T resource;
    private final Consumer<T> close;

    public AutoClosingWrapper(T resource, Consumer<T> close) {
        this.resource = resource;
        this.close = close;
    }

    @Override
    public void close() throws Exception {
        close.accept(resource);
    }
}
