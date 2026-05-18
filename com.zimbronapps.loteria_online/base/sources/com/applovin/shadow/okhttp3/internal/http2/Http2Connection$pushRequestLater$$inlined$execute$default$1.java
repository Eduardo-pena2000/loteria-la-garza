package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection$pushRequestLater$$inlined$execute$default$1 extends Task {
    final /* synthetic */ List $requestHeaders$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushRequestLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, List list) {
        super(str, z);
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$requestHeaders$inlined = list;
    }

    public long runOnce() {
        if (!Http2Connection.access$getPushObserver$p(this.this$0).onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
            return -1L;
        }
        try {
            this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
            synchronized (this.this$0) {
                Http2Connection.access$getCurrentPushRequests$p(this.this$0).remove(Integer.valueOf(this.$streamId$inlined));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
