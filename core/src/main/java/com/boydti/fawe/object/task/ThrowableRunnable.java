package com.boydti.fawe.object.task;

public interface ThrowableRunnable<T extends Throwable> {
    void run() throws T;
}
