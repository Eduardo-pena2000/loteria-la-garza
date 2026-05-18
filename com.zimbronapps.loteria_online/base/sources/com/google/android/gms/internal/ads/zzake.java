package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzake implements zzakb {
    private final int zza;
    private final int zzb;
    private final zzer zzc;

    public zzake(zzfv zzfvVar, zzv zzvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zzc = zzerVar;
        zzerVar.zzh(12);
        int zzH = zzerVar.zzH();
        if ("audio/raw".equals(zzvVar.zzo)) {
            int zzD = zzfj.zzD(zzvVar.zzI) * zzvVar.zzG;
            if (zzH == 0 || zzH % zzD != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzD).length() + 66 + String.valueOf(zzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(zzD);
                sb.append(", stsz sample size: ");
                sb.append(zzH);
                zzee.zzc("BoxParsers", sb.toString());
                zzH = zzD;
            }
        }
        this.zza = zzH == 0 ? -1 : zzH;
        this.zzb = zzerVar.zzH();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzH() : i;
    }
}
