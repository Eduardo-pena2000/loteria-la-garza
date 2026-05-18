package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzhdh implements zzhjb {
    static final /* synthetic */ zzhdh zza = new zzhdh();

    private /* synthetic */ zzhdh() {
    }

    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        zzhdm zzhdmVar = (zzhdm) zzhbpVar;
        int i = zzhdj.zza;
        if (zzhdmVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhde zzhdeVar = new zzhde(null);
        zzhdeVar.zza(zzhdmVar);
        zzhdeVar.zzc(num);
        zzhdeVar.zzb(zzhyg.zzb(zzhdmVar.zzc()));
        return zzhdeVar.zzd();
    }
}
