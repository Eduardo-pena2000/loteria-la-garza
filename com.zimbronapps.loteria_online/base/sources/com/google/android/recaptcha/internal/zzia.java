package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzia implements zzih {
    private final Context zza;

    public zzia(Context context) {
        this.zza = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        return zzap.zza(this.zza.getContentResolver());
    }
}
