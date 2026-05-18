package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgau implements zzikg {
    private final zzikp zza;

    private zzgau(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgau zza(zzikp zzikpVar) {
        return new zzgau(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zziko.zzb(dir);
        return dir;
    }
}
