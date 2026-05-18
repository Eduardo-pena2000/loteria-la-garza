package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzezb implements zzfax {
    private static String zzc;
    private final zzgzy zza;
    private final Context zzb;

    public zzezb(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    public final x7.e zza() {
        return this.zza.zzc(new zzeza(this));
    }

    public final int zzb() {
        return 27;
    }

    public final /* synthetic */ zzezc zzc() {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue()) {
            return new zzezc(null);
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzgs)).booleanValue()) {
            return new zzezc(R5.t.y().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = R5.t.y().zzb(this.zzb);
        }
        return new zzezc(zzc);
    }
}
