package io.flutter.plugin.platform;

import android.view.SurfaceControl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class v {
    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction a(SurfaceControl.Transaction transaction, SurfaceControl surfaceControl, boolean z) {
        return transaction.setVisibility(surfaceControl, z);
    }
}
