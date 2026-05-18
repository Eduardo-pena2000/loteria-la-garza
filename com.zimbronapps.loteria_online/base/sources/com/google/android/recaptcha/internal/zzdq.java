package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdq extends u implements Qa.a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    public final Object invoke() {
        int i = zzav.zza;
        Object zzb = zzau.zza().zzb(Application.class.getName().hashCode());
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
