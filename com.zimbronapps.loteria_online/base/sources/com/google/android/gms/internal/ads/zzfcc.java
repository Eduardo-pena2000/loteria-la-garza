package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfcc implements zzfax {
    private final Executor zza;
    private final String zzb;

    public zzfcc(zzcdm zzcdmVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    public final x7.e zza() {
        x7.e zza = zzgzo.zza(this.zzb);
        zzfcb zzfcbVar = zzfcb.zza;
        Executor executor = this.zza;
        return zzgzo.zzh(zzgzo.zzk(zza, zzfcbVar, executor), Throwable.class, new zzfca(this), executor);
    }

    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ x7.e zzc(Throwable th) {
        return zzgzo.zza(new zzfcd(this.zzb));
    }
}
