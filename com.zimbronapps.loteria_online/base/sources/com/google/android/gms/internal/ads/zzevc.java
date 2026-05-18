package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzevc implements zzfax {
    private final zzgzy zza;
    private final Context zzb;

    public zzevc(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) S5.D.c().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter) : o5.p.a(this.zzb, null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final x7.e zza() {
        return this.zza.submit(new zzevb(this));
    }

    public final int zzb() {
        return 14;
    }

    public final /* synthetic */ zzevd zzc() {
        double intExtra;
        boolean z;
        if (((Boolean) S5.D.c().zzd(zzbhe.zznw)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            z = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            intExtra = zzd != null ? zzd.getIntExtra("level", -1) / zzd.getIntExtra("scale", -1) : -1.0d;
            z = zze;
        }
        return new zzevd(intExtra, z);
    }
}
