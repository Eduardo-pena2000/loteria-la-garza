package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 extends Task {
    final /* synthetic */ boolean $clearPrevious$inlined;
    final /* synthetic */ Settings $settings$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(String str, boolean z, Http2Connection.ReaderRunnable readerRunnable, boolean z2, Settings settings) {
        super(str, z);
        this.this$0 = readerRunnable;
        this.$clearPrevious$inlined = z2;
        this.$settings$inlined = settings;
    }

    public long runOnce() {
        this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
        return -1L;
    }
}
