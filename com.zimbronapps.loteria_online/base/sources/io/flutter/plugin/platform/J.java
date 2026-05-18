package io.flutter.plugin.platform;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j {
    private final da.h createArgsCodec;

    public j(da.h hVar) {
        this.createArgsCodec = hVar;
    }

    public abstract i create(Context context, int i, Object obj);

    public final da.h getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
