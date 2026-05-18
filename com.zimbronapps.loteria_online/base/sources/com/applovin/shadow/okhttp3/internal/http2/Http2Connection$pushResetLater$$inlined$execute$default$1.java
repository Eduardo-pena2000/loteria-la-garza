package com.applovin.shadow.okhttp3.internal.http2;

import Ca.I;
import com.applovin.shadow.okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection$pushResetLater$$inlined$execute$default$1 extends Task {
    final /* synthetic */ ErrorCode $errorCode$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushResetLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, ErrorCode errorCode) {
        super(str, z);
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$errorCode$inlined = errorCode;
    }

    public long runOnce() {
        Http2Connection.access$getPushObserver$p(this.this$0).onReset(this.$streamId$inlined, this.$errorCode$inlined);
        synchronized (this.this$0) {
            Http2Connection.access$getCurrentPushRequests$p(this.this$0).remove(Integer.valueOf(this.$streamId$inlined));
            I i = I.a;
        }
        return -1L;
    }
}
