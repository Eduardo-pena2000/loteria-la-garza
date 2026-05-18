package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeaa implements zzgzl {
    final /* synthetic */ zzeak zza;

    public zzeaa(zzeak zzeakVar) {
        Objects.requireNonNull(zzeakVar);
        this.zza = zzeakVar;
    }

    public final void zza(Throwable th) {
        synchronized (this) {
            zzeak zzeakVar = this.zza;
            zzeakVar.zzn(true);
            zzeakVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (R5.t.o().b() - zzeakVar.zzo()));
            zzeakVar.zzp().zzd(new Exception());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            zzeak zzeakVar = this.zza;
            zzeakVar.zzn(true);
            zzeakVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (R5.t.o().b() - zzeakVar.zzo()));
            zzeakVar.zzq().execute(new zzdzz(this, str));
        }
    }
}
