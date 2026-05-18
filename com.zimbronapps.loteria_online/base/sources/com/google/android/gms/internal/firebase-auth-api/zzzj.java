package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzzj {
    public static final zzzj zza = new zzzj(new zzzs());
    public static final zzzj zzb = new zzzj(new zzzw());
    public static final zzzj zzc;
    public static final zzzj zzd;
    public static final zzzj zze;
    private final zzzn zzf;

    static {
        new zzzj(new zzzy());
        new zzzj(new zzzv());
        zzc = new zzzj(new zzzr());
        zzd = new zzzj(new zzzt());
        zze = new zzzj(new zzzu());
    }

    private zzzj(zzzp zzzpVar) {
        if (zziv.zzb()) {
            this.zzf = new zzzo(zzzpVar, null);
        } else if (zzaaf.zza()) {
            this.zzf = new zzzm(zzzpVar, null);
        } else {
            this.zzf = new zzzl(zzzpVar, null);
        }
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzf.zza(str);
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }
}
