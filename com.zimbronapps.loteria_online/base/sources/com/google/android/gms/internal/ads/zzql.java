package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzql {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    public /* synthetic */ zzql(zzqk zzqkVar, byte[] bArr) {
        this.zza = zzqkVar.zzi();
        this.zzb = zzqkVar.zzj();
        this.zzc = zzqkVar.zzk();
        this.zze = zzqkVar.zzl();
        this.zzf = zzqkVar.zzm();
        this.zzg = zzqkVar.zzn();
        this.zzh = zzqkVar.zzo();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzql.class == obj.getClass()) {
            zzql zzqlVar = (zzql) obj;
            if (this.zza == zzqlVar.zza && this.zzb == zzqlVar.zzb && this.zzc == zzqlVar.zzc && this.zze == zzqlVar.zze && this.zzg == zzqlVar.zzg && this.zzh == zzqlVar.zzh && this.zzf.equals(zzqlVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.zza);
        Integer valueOf2 = Integer.valueOf(this.zzb);
        Integer valueOf3 = Integer.valueOf(this.zzc);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(new Object[]{valueOf, valueOf2, valueOf3, bool, bool, Integer.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), bool, bool});
    }
}
