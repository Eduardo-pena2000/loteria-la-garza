package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhel extends zzhch {
    private final String zza;
    private final zzhek zzb;

    private zzhel(String str, zzhek zzhekVar) {
        this.zza = str;
        this.zzb = zzhekVar;
    }

    public static zzhel zzb(String str, zzhek zzhekVar) {
        return new zzhel(str, zzhekVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhel)) {
            return false;
        }
        zzhel zzhelVar = (zzhel) obj;
        return zzhelVar.zza.equals(this.zza) && zzhelVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhel.class, this.zza, this.zzb});
    }

    public final String toString() {
        String obj = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + obj.length() + 1);
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(str);
        sb.append(", variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zzb != zzhek.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhek zzd() {
        return this.zzb;
    }
}
