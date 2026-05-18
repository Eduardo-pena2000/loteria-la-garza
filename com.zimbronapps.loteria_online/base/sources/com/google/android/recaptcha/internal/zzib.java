package com.google.android.recaptcha.internal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import o5.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzib implements zzih {
    private final Context zza;

    public zzib(Context context) {
        this.zza = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final Object zza(Object... objArr) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent a = Build.VERSION.SDK_INT >= 33 ? p.a(this.zza, (BroadcastReceiver) null, intentFilter, 4) : this.zza.registerReceiver((BroadcastReceiver) null, intentFilter);
        if (a == null) {
            throw new zzce(7, 19, null);
        }
        int intExtra = a.getIntExtra("health", -1);
        int intExtra2 = a.getIntExtra("level", -1);
        int intExtra3 = a.getIntExtra("plugged", -1);
        boolean booleanExtra = a.getBooleanExtra("present", false);
        int intExtra4 = a.getIntExtra("scale", -1);
        int intExtra5 = a.getIntExtra("status", -1);
        String stringExtra = a.getStringExtra("technology");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5), stringExtra, Integer.valueOf(a.getIntExtra("temperature", -1)), Integer.valueOf(a.getIntExtra("voltage", -1))};
    }
}
