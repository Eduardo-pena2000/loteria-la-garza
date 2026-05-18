package com.google.android.recaptcha.internal;

import Ga.e;
import android.app.Application;
import cb.Q;
import cb.a1;
import cb.i;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, e eVar) throws a1, com.google.android.gms.common.api.b, RecaptchaException {
        return zzcv.zzh(zza(application), str, j, null, null, null, eVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) throws a1, com.google.android.gms.common.api.b, RecaptchaException {
        return zzas.zza(i.b(zza(application).zzd().zza(), (Ga.i) null, (Q) null, new zzco(application, str, j, null), 3, (Object) null));
    }

    public static final Object zzd(Application application, String str, e eVar) throws com.google.android.gms.common.api.b, RecaptchaException {
        return zzcv.zzf(zza(application), str, null, null, eVar, 6, null);
    }

    public static final Task zze(Application application, String str) throws com.google.android.gms.common.api.b, RecaptchaException {
        return zzas.zza(i.b(zza(application).zzd().zza(), (Ga.i) null, (Q) null, new zzcp(application, str, null), 3, (Object) null));
    }
}
