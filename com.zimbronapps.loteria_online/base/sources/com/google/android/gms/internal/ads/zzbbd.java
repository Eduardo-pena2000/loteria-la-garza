package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbd implements Callable {
    private final zzbak zza;
    private final zzawg zzb;

    public zzbbd(zzbak zzbakVar, zzawg zzawgVar) {
        this.zza = zzbakVar;
        this.zzb = zzawgVar;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbak zzbakVar = this.zza;
        if (zzbakVar.zzm() != null) {
            zzbakVar.zzm().get();
        }
        zzaxg zzl = zzbakVar.zzl();
        if (zzl == null) {
            return null;
        }
        try {
            zzawg zzawgVar = this.zzb;
            synchronized (zzawgVar) {
                zzawgVar.zzaY(zzl.zzaN(), zzibb.zza());
            }
            return null;
        } catch (zzicg | NullPointerException unused) {
            return null;
        }
    }
}
