package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaom implements zzaon {
    private final List zza;
    private final zzagh[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzaom(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
    }

    private final boolean zzf(zzer zzerVar, int i) {
        if (zzerVar.zzd() == 0) {
            return false;
        }
        if (zzerVar.zzs() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        int i = 0;
        while (true) {
            zzagh[] zzaghVarArr = this.zzc;
            if (i >= zzaghVarArr.length) {
                return;
            }
            zzapy zzapyVar = (zzapy) this.zza.get(i);
            zzaqbVar.zza();
            zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzaqbVar.zzc());
            zztVar.zzl(this.zzb);
            zztVar.zzm("application/dvbsubs");
            zztVar.zzp(Collections.singletonList(zzapyVar.zzb));
            zztVar.zze(zzapyVar.zza);
            zzu.zzz(zztVar.zzM());
            zzaghVarArr[i] = zzu;
            i++;
        }
    }

    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    public final void zzd(zzer zzerVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzerVar, 32)) {
                if (this.zze != 1 || zzf(zzerVar, 0)) {
                    int zzg = zzerVar.zzg();
                    int zzd = zzerVar.zzd();
                    for (zzagh zzaghVar : this.zzc) {
                        zzerVar.zzh(zzg);
                        zzaghVar.zzc(zzerVar, zzd);
                    }
                    this.zzf += zzd;
                }
            }
        }
    }

    public final void zze(boolean z) {
        if (this.zzd) {
            zzgrc.zzi(this.zzg != -9223372036854775807L);
            for (zzagh zzaghVar : this.zzc) {
                zzaghVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
