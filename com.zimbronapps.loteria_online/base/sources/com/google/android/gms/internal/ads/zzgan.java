package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgan {
    private static zzgan zzb;
    final zzgaj zza;

    private zzgan(Context context) {
        this.zza = zzgaj.zza(context);
        zzgai.zza(context);
    }

    public static final zzgan zza(Context context) {
        zzgan zzganVar;
        synchronized (zzgan.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgan(context);
                }
                zzganVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzganVar;
    }

    public final void zzb(zzgah zzgahVar) throws IOException {
        synchronized (zzgan.class) {
            zzgaj zzgajVar = this.zza;
            zzgajVar.zzf("vendor_scoped_gpid_v2_id");
            zzgajVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
