package com.applovin.shadow.okio;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class BlackholeSink implements Sink {
    public void close() {
    }

    public void flush() {
    }

    public Timeout timeout() {
        return Timeout.NONE;
    }

    public void write(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "source");
        buffer.skip(j);
    }
}
