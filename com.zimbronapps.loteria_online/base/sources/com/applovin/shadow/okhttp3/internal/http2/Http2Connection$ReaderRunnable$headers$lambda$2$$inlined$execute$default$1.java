package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1 extends Task {
    final /* synthetic */ Http2Stream $newStream$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, Http2Stream http2Stream) {
        super(str, z);
        this.this$0 = http2Connection;
        this.$newStream$inlined = http2Stream;
    }

    public long runOnce() {
        try {
            this.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
            return -1L;
        } catch (IOException e) {
            Platform.Companion.get().log("Http2Connection.Listener failure for " + this.this$0.getConnectionName$okhttp(), 4, e);
            try {
                this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
