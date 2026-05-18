package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzhcz implements zzhjb {
    static final /* synthetic */ zzhcz zza = new zzhcz();

    private /* synthetic */ zzhcz() {
    }

    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        zzhdd zzhddVar = (zzhdd) zzhbpVar;
        int i = zzhda.zza;
        if (zzhddVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhcw zzhcwVar = new zzhcw(null);
        zzhcwVar.zza(zzhddVar);
        zzhcwVar.zzc(num);
        zzhcwVar.zzb(zzhyg.zzb(zzhddVar.zzc()));
        return zzhcwVar.zzd();
    }
}
