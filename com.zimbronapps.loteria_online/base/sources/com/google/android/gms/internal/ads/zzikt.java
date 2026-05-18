package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzikt implements zzikp {
    private static final Object zza = new Object();
    private volatile zzikp zzb;
    private volatile Object zzc = zza;

    private zzikt(zzikp zzikpVar) {
        this.zzb = zzikpVar;
    }

    public static zzikp zza(zzikp zzikpVar) {
        return ((zzikpVar instanceof zzikt) || (zzikpVar instanceof zzikf)) ? zzikpVar : new zzikt(zzikpVar);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzikp zzikpVar = this.zzb;
        if (zzikpVar == null) {
            return this.zzc;
        }
        Object zzb = zzikpVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
