package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzedm implements zzikg {
    private final zzikp zza;

    private zzedm(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzedm zzc(zzikp zzikpVar) {
        return new zzedm(zzikpVar);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcmj) this.zza).zza().getPackageName();
        zziko.zzb(packageName);
        return packageName;
    }
}
