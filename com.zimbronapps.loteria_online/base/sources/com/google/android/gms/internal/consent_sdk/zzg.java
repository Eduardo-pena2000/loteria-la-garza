package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final String getMessage() {
        return super/*java.lang.Throwable*/.getMessage();
    }

    public final FormError zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super/*java.lang.Throwable*/.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super/*java.lang.Throwable*/.getMessage(), getCause());
        }
        return new FormError(this.zza, super/*java.lang.Throwable*/.getMessage());
    }

    public zzg(int i, String str, Throwable th) {
        super(str, th);
        this.zza = i;
    }
}
