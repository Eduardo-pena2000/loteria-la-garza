package io.flutter.plugin.platform;

import android.view.Surface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface m {
    void a(int i, int i2);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
