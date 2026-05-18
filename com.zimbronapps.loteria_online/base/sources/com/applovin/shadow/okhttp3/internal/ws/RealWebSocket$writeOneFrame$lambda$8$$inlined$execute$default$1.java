package com.applovin.shadow.okhttp3.internal.ws;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1 extends Task {
    final /* synthetic */ RealWebSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1(String str, boolean z, RealWebSocket realWebSocket) {
        super(str, z);
        this.this$0 = realWebSocket;
    }

    public long runOnce() {
        this.this$0.cancel();
        return -1L;
    }
}
