package com.google.android.gms.internal.firebase-auth-api;

import E6.a;
import E6.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzafx {
    private final String zza;
    private final String zzb;

    public zzafx(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafx(Context context, String str) {
        t.l(context);
        String f = t.f(str);
        this.zza = f;
        try {
            byte[] a = a.a(context, f);
            if (a != null) {
                this.zzb = l.c(a, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
