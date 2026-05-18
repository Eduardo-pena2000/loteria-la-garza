package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeod implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;

    public zzeod(zzeoe zzeoeVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzeoeVar);
    }

    public final void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z);
            zzfkiVar.zzw(context);
        } catch (zzfjr e) {
            throw new zzdmb(e.getCause());
        }
    }

    public final zzfir zzb() {
        return this.zzb;
    }
}
