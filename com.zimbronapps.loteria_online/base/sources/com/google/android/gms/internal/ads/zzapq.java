package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzapq {
    private final List zza;
    private final zzagh[] zzc;
    private final String zzb = "video/mp2t";
    private final zzgq zzd = new zzgq(new zzapp(this));

    public zzapq(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
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
            String str2 = zzvVar.zza;
            if (str2 == null) {
                str2 = zzaqbVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(str2);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzer zzerVar) {
        this.zzd.zzc(j, zzerVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j, zzer zzerVar) {
        zzaeh.zza(j, zzerVar, this.zzc);
    }
}
