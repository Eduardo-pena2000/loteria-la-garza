package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzesy implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final int zzc;

    public zzesy(zzgzy zzgzyVar, zzfjk zzfjkVar, zzfka zzfkaVar, int i) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = i;
    }

    public final x7.e zza() {
        return this.zza.submit(new zzesx(this));
    }

    public final int zzb() {
        return 5;
    }

    public final /* synthetic */ zzesz zzc() {
        List asList;
        String str = null;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhW)).booleanValue()) {
            zzfjk zzfjkVar = this.zzb;
            if (this.zzc != 2) {
                String c = b6.c.c(zzfjkVar.zzd);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzhY)).booleanValue()) {
                    asList = Arrays.asList(((String) S5.D.c().zzd(zzbhe.zzhZ)).split(","));
                } else {
                    asList = Arrays.asList(((String) S5.D.c().zzd(zzbhe.zzhX)).split(","));
                }
                if (asList.contains(b6.c.b(c))) {
                    str = zzfka.zza();
                }
            }
        }
        return new zzesz(str);
    }
}
