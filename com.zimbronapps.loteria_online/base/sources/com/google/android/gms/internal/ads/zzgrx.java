package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgrx implements zzgru {
    private static final zzgru zzb = zzgrw.zza;
    private final zzgsb zza = new zzgsb();
    private volatile zzgru zzc;
    private Object zzd;

    public zzgrx(zzgru zzgruVar) {
        this.zzc = zzgruVar;
    }

    public final String toString() {
        String str = this.zzc;
        if (str == zzb) {
            String valueOf = String.valueOf(this.zzd);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            str = sb.toString();
        }
        String valueOf2 = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public final Object zza() {
        zzgru zzgruVar = this.zzc;
        zzgru zzgruVar2 = zzb;
        if (zzgruVar != zzgruVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzgruVar2) {
                        Object zza = this.zzc.zza();
                        this.zzd = zza;
                        this.zzc = zzgruVar2;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
