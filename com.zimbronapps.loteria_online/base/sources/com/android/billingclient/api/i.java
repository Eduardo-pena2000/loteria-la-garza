package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i implements ServiceConnection {
    public final /* synthetic */ j a;

    public /* synthetic */ i(j jVar, zzcd zzcdVar) {
        Objects.requireNonNull(jVar);
        this.a = jVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        j jVar = this.a;
        j.y1(jVar, com.google.android.gms.internal.play_billing.zzat.zzc(iBinder));
        j.z1(jVar, 2);
        j.F1(jVar, 26);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        j jVar = this.a;
        j.y1(jVar, null);
        j.z1(jVar, 0);
    }
}
