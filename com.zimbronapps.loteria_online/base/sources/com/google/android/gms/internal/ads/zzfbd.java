package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbd implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzfbd(Context context, zzgzy zzgzyVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    public final x7.e zza() {
        return ((Boolean) zzbiw.zzb.zze()).booleanValue() ? this.zzb.zzc(new zzfbc(this)) : zzgzo.zza(new zzfbe(-1, -1));
    }

    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzfbe zzc() {
        Context context = this.zza;
        return new zzfbe(zzbgp.zzc(context), zzbgp.zzd(context));
    }
}
