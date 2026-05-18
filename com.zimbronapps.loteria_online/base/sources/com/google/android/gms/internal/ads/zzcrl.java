package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcrl implements zzdca {
    private final zzfki zza;

    public zzcrl(zzfki zzfkiVar) {
        this.zza = zzfkiVar;
    }

    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfjr e) {
            int i = o0.b;
            W5.p.g("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzb(Context context) {
        try {
            zzfki zzfkiVar = this.zza;
            zzfkiVar.zzj();
            if (context != null) {
                zzfkiVar.zzp(context);
            }
        } catch (zzfjr e) {
            int i = o0.b;
            W5.p.g("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfjr e) {
            int i = o0.b;
            W5.p.g("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
