package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;
import android.media.Image;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ SyncFence a(Image image) {
        return image.getFence();
    }
}
