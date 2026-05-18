package com.applovin.shadow.okhttp3.internal.ws;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1 extends Task {
    final /* synthetic */ long $pingIntervalNanos$inlined;
    final /* synthetic */ RealWebSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1(String str, RealWebSocket realWebSocket, long j) {
        super(str, false, 2, null);
        this.this$0 = realWebSocket;
        this.$pingIntervalNanos$inlined = j;
    }

    public long runOnce() {
        this.this$0.writePingFrame$okhttp();
        return this.$pingIntervalNanos$inlined;
    }
}
