package com.google.android.gms.internal.ads;

import V5.f0;
import android.content.Context;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbgl {
    private final Context zza;

    public zzbgl(Context context) {
        com.google.android.gms.common.internal.t.m(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza() {
        Context context = this.zza;
        return ((Boolean) f0.a(context, zzbgk.zza)).booleanValue() && G6.e.a(context).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean zzb() {
        return zzc(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc(Intent intent) {
        com.google.android.gms.common.internal.t.m(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
