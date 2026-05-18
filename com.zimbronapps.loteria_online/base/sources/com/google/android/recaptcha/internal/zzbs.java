package com.google.android.recaptcha.internal;

import android.content.Context;
import v6.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbs {
    private final h zza;

    public zzbs(h hVar) {
        this.zza = hVar;
    }

    public final int zza(Context context) {
        int g = this.zza.g(context);
        return (g == 1 || g == 3 || g == 9) ? 4 : 3;
    }

    public zzbs() {
        this.zza = h.f();
    }
}
