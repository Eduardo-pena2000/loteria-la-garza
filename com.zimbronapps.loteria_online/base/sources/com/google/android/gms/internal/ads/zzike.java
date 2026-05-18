package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzike implements zzikg {
    private zzikp zza;

    public static void zza(zzikp zzikpVar, zzikp zzikpVar2) {
        zzike zzikeVar = (zzike) zzikpVar;
        if (zzikeVar.zza != null) {
            throw new IllegalStateException();
        }
        zzikeVar.zza = zzikpVar2;
    }

    public final Object zzb() {
        zzikp zzikpVar = this.zza;
        if (zzikpVar != null) {
            return zzikpVar.zzb();
        }
        throw new IllegalStateException();
    }
}
