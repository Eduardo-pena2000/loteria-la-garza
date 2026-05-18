package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgrv implements Serializable, zzgru {
    final zzgru zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgsb zzd = new zzgsb();

    public zzgrv(zzgru zzgruVar) {
        this.zza = zzgruVar;
    }

    public final String toString() {
        String str;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            str = sb.toString();
        } else {
            str = this.zza;
        }
        String obj = str.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
