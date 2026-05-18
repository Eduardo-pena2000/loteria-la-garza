package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1 extends Task {
    final /* synthetic */ int $payload1$inlined;
    final /* synthetic */ int $payload2$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, int i2) {
        super(str, z);
        this.this$0 = http2Connection;
        this.$payload1$inlined = i;
        this.$payload2$inlined = i2;
    }

    public long runOnce() {
        this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
        return -1L;
    }
}
