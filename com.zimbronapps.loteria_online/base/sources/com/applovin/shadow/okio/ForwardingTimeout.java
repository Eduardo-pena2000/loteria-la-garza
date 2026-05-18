package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout timeout) {
        kotlin.jvm.internal.t.g(timeout, "delegate");
        this.delegate = timeout;
    }

    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    public final Timeout delegate() {
        return this.delegate;
    }

    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    public final /* synthetic */ void setDelegate(Timeout timeout) {
        kotlin.jvm.internal.t.g(timeout, "<set-?>");
        this.delegate = timeout;
    }

    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    public Timeout timeout(long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.t.g(timeUnit, "unit");
        return this.delegate.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    public Timeout deadlineNanoTime(long j) {
        return this.delegate.deadlineNanoTime(j);
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
        kotlin.jvm.internal.t.g(timeout, "delegate");
        this.delegate = timeout;
        return this;
    }
}
