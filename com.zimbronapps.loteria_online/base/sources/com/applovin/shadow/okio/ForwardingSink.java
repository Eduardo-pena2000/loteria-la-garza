package com.applovin.shadow.okio;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class ForwardingSink implements Sink {
    private final Sink delegate;

    public ForwardingSink(Sink sink) {
        kotlin.jvm.internal.t.g(sink, "delegate");
        this.delegate = sink;
    }

    @Ca.e
    public final Sink -deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final Sink delegate() {
        return this.delegate;
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public void write(Buffer buffer, long j) throws IOException {
        kotlin.jvm.internal.t.g(buffer, "source");
        this.delegate.write(buffer, j);
    }
}
