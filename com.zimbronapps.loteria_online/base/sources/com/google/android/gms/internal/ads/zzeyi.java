package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyi implements zzfax {
    private final Context zza;
    private final Intent zzb;

    public zzeyi(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    public final x7.e zza() {
        o0.k("HsdpMigrationSignal.produce");
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzom)).booleanValue()) {
            return zzgzo.zza(new zzeyj(null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                o0.k("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            R5.t.l().zzg(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgzo.zza(new zzeyj(Boolean.valueOf(z)));
    }

    public final int zzb() {
        return 60;
    }
}
