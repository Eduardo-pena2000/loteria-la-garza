package com.google.android.gms.internal.fido;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbr implements zzbp {
    private static final zzbp zza = zzbq.zza;
    private volatile zzbp zzb;

    public zzbr(zzbp zzbpVar) {
        this.zzb = zzbpVar;
    }

    public final String toString() {
        String str = this.zzb;
        if (str == zza) {
            str = "<supplier that returned null>";
        }
        return "Suppliers.memoize(" + String.valueOf(str) + ")";
    }

    public final Object zza() {
        throw null;
    }
}
