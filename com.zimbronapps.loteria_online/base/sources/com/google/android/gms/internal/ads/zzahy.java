package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzahy implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/id3");
        zztVar.zzM();
        zzt zztVar2 = new zzt();
        zztVar2.zzm("application/x-scte35");
        zztVar2.zzM();
    }

    public zzahy(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahy.class == obj.getClass()) {
            zzahy zzahyVar = (zzahy) obj;
            if (this.zzc == zzahyVar.zzc && this.zzd == zzahyVar.zzd && Objects.equals(this.zza, zzahyVar.zza) && Objects.equals(this.zzb, zzahyVar.zzb) && Arrays.equals(this.zze, zzahyVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
        long j = this.zzc;
        int hashCode2 = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) this.zzd)) * 31) + Arrays.hashCode(this.zze);
        this.zzf = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        long j = this.zzd;
        int length = String.valueOf(j).length();
        long j2 = this.zzc;
        int length2 = String.valueOf(j2).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length3 + 8 + str2.length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }
}
