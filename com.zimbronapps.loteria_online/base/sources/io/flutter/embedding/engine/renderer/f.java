package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ boolean a(SyncFence syncFence) {
        return syncFence.awaitForever();
    }
}
