package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaia implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaia(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static zzaia zzb(zzer zzerVar) {
        int zzB = zzerVar.zzB();
        String zzh = zzas.zzh(zzerVar.zzK(zzerVar.zzB(), StandardCharsets.US_ASCII));
        String zzK = zzerVar.zzK(zzerVar.zzB(), StandardCharsets.UTF_8);
        int zzB2 = zzerVar.zzB();
        int zzB3 = zzerVar.zzB();
        int zzB4 = zzerVar.zzB();
        int zzB5 = zzerVar.zzB();
        int zzB6 = zzerVar.zzB();
        byte[] bArr = new byte[zzB6];
        zzerVar.zzm(bArr, 0, zzB6);
        return new zzaia(zzB, zzh, zzK, zzB2, zzB3, zzB4, zzB5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaia.class == obj.getClass()) {
            zzaia zzaiaVar = (zzaia) obj;
            if (this.zza == zzaiaVar.zza && this.zzb.equals(zzaiaVar.zzb) && this.zzc.equals(zzaiaVar.zzc) && this.zzd == zzaiaVar.zzd && this.zze == zzaiaVar.zze && this.zzf == zzaiaVar.zzf && this.zzg == zzaiaVar.zzg && Arrays.equals(this.zzh, zzaiaVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 32 + str2.length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
