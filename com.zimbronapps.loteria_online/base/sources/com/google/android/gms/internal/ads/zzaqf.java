package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaqf {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzagh[] zzc;
    private final zzgq zzd;

    public zzaqf(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
        zzgq zzgqVar = new zzgq(new zzaqe(this));
        this.zzd = zzgqVar;
        zzgqVar.zza(3);
    }

    public final void zza(zzaex zzaexVar, zzaqb zzaqbVar) {
        int i = 0;
        while (true) {
            zzagh[] zzaghVarArr = this.zzc;
            if (i >= zzaghVarArr.length) {
                return;
            }
            zzaqbVar.zza();
            zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i);
            String str = zzvVar.zzo;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzgrc.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzaqbVar.zzc());
            zztVar.zzl(this.zzb);
            zztVar.zzm(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzJ(zzvVar.zzL);
            zztVar.zzp(zzvVar.zzr);
            zzu.zzz(zztVar.zzM());
            zzaghVarArr[i] = zzu;
            i++;
        }
    }

    public final void zzb(long j, zzer zzerVar) {
        if (zzerVar.zzd() < 9) {
            return;
        }
        int zzB = zzerVar.zzB();
        int zzB2 = zzerVar.zzB();
        int zzs = zzerVar.zzs();
        if (zzB == 434 && zzB2 == 1195456820 && zzs == 3) {
            this.zzd.zzc(j, zzerVar);
        }
    }

    public final /* synthetic */ void zzc(long j, zzer zzerVar) {
        zzaeh.zzb(j, zzerVar, this.zzc);
    }
}
