package io.flutter.plugin.platform;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class z {
    public static /* bridge */ /* synthetic */ boolean a(AttachedSurfaceControl attachedSurfaceControl, SurfaceControl.Transaction transaction) {
        return attachedSurfaceControl.applyTransactionOnDraw(transaction);
    }
}
