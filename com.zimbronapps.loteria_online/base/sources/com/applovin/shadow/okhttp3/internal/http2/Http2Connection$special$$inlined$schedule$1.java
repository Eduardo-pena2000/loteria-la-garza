package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection$special$$inlined$schedule$1 extends Task {
    final /* synthetic */ long $pingIntervalNanos$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$special$$inlined$schedule$1(String str, Http2Connection http2Connection, long j) {
        super(str, false, 2, null);
        this.this$0 = http2Connection;
        this.$pingIntervalNanos$inlined = j;
    }

    public long runOnce() {
        boolean z;
        synchronized (this.this$0) {
            if (Http2Connection.access$getIntervalPongsReceived$p(this.this$0) < Http2Connection.access$getIntervalPingsSent$p(this.this$0)) {
                z = true;
            } else {
                Http2Connection.access$setIntervalPingsSent$p(this.this$0, Http2Connection.access$getIntervalPingsSent$p(this.this$0) + 1);
                z = false;
            }
        }
        if (z) {
            Http2Connection.access$failConnection(this.this$0, null);
            return -1L;
        }
        this.this$0.writePing(false, 1, 0);
        return this.$pingIntervalNanos$inlined;
    }
}
