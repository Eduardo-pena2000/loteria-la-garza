package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzent {
    private final zzfkd zza;
    private final zzdvm zzb;
    private final zzdxz zzc;

    public zzent(zzfkd zzfkdVar, zzdvm zzdvmVar, zzdxz zzdxzVar) {
        this.zza = zzfkdVar;
        this.zzb = zzdvmVar;
        this.zzc = zzdxzVar;
    }

    public final void zza(zzfiu zzfiuVar, zzfir zzfirVar, int i, zzekk zzekkVar, long j) {
        zzdvl zzdvlVar;
        zzdxy zza = this.zzc.zza();
        zza.zza(zzfiuVar);
        zza.zzb(zzfirVar);
        zza.zzc("action", "adapter_status");
        zza.zzc("adapter_l", String.valueOf(j));
        zza.zzc("sc", Integer.toString(i));
        if (zzekkVar != null) {
            zza.zzc("arec", Integer.toString(zzekkVar.zzb().a));
            String zza2 = this.zza.zza(zzekkVar.getMessage());
            if (zza2 != null) {
                zza.zzc("areec", zza2);
            }
        }
        zzdvm zzdvmVar = this.zzb;
        Iterator it = zzfirVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdvlVar = null;
                break;
            } else {
                zzdvlVar = zzdvmVar.zzc((String) it.next());
                if (zzdvlVar != null) {
                    break;
                }
            }
        }
        if (zzdvlVar != null) {
            zza.zzc("ancn", zzdvlVar.zza);
            zzbwh zzbwhVar = zzdvlVar.zzb;
            if (zzbwhVar != null) {
                zza.zzc("adapter_v", zzbwhVar.toString());
            }
            zzbwh zzbwhVar2 = zzdvlVar.zzc;
            if (zzbwhVar2 != null) {
                zza.zzc("adapter_sv", zzbwhVar2.toString());
            }
        }
        zza.zzd();
    }
}
