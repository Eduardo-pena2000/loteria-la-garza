package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzahn extends zzahm {
    private final zzer zzb;
    private final zzer zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzahn(zzagh zzaghVar) {
        super(zzaghVar);
        this.zzb = new zzer(zzgm.zza);
        this.zzc = new zzer(4);
    }

    public final boolean zza(zzer zzerVar) throws zzahl {
        int zzs = zzerVar.zzs();
        int i = zzs >> 4;
        int i2 = zzs & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzahl(sb.toString());
    }

    public final boolean zzb(zzer zzerVar, long j) throws zzat {
        int i;
        int zzs = zzerVar.zzs();
        long zzy = zzerVar.zzy();
        if (zzs == 0) {
            if (!this.zze) {
                zzer zzerVar2 = new zzer(new byte[zzerVar.zzd()]);
                zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar.zzd());
                zzadz zza = zzadz.zza(zzerVar2);
                this.zzd = zza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("video/avc");
                zztVar.zzj(zza.zzl);
                zztVar.zzt(zza.zzc);
                zztVar.zzu(zza.zzd);
                zztVar.zzz(zza.zzk);
                zztVar.zzp(zza.zza);
                this.zza.zzz(zztVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (zzs == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            zzer zzerVar3 = this.zzc;
            byte[] zzi = zzerVar3.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzerVar.zzd() > 0) {
                zzerVar.zzm(zzerVar3.zzi(), i3, this.zzd);
                zzerVar3.zzh(0);
                zzer zzerVar4 = this.zzb;
                int zzH = zzerVar3.zzH();
                zzerVar4.zzh(0);
                zzagh zzaghVar = this.zza;
                zzaghVar.zzc(zzerVar4, 4);
                zzaghVar.zzc(zzerVar, zzH);
                i4 = i4 + 4 + zzH;
            }
            this.zza.zze(j + (zzy * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
