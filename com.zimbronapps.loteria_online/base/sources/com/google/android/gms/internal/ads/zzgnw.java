package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgnw extends BroadcastReceiver implements zzgnb, zzgdd {
    private final Context zza;
    private final ExecutorService zzb;
    private boolean zzc = true;

    public zzgnw(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    private final synchronized void zzg(boolean z) {
        this.zzc = z;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzg(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzg(false);
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final x7.e zza() {
        return zzgzo.zzd(new zzgnv(this), this.zzb);
    }

    public final void zzb(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    public final void zzc(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(zze()));
    }

    public final void zzd(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final /* synthetic */ Void zzf() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.zza.registerReceiver(this, intentFilter);
        return null;
    }
}
