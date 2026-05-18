package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhmk extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhmj zzc;
    private final zzhmi zzd;

    public /* synthetic */ zzhmk(int i, int i2, zzhmj zzhmjVar, zzhmi zzhmiVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhmjVar;
        this.zzd = zzhmiVar;
    }

    public static zzhmh zzb() {
        return new zzhmh(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmk)) {
            return false;
        }
        zzhmk zzhmkVar = (zzhmk) obj;
        return zzhmkVar.zza == this.zza && zzhmkVar.zze() == zze() && zzhmkVar.zzc == this.zzc && zzhmkVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhmk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        zzhmi zzhmiVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzhmiVar);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.zzb;
        int length3 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zzc != zzhmj.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhmj zzhmjVar = this.zzc;
        if (zzhmjVar == zzhmj.zzd) {
            return this.zzb;
        }
        if (zzhmjVar == zzhmj.zza || zzhmjVar == zzhmj.zzb || zzhmjVar == zzhmj.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhmj zzf() {
        return this.zzc;
    }

    public final zzhmi zzg() {
        return this.zzd;
    }
}
