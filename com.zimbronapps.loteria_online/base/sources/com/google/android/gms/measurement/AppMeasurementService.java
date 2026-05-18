package com.google.android.gms.measurement;

import B2.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import k7.i6;
import k7.m6;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AppMeasurementService extends Service implements i6 {
    public m6 a;

    private final m6 c() {
        if (this.a == null) {
            this.a = new m6(this);
        }
        return this.a;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public IBinder onBind(Intent intent) {
        return c().d(intent);
    }

    public void onCreate() {
        super.onCreate();
        c().a();
    }

    public void onDestroy() {
        c().b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        c();
        m6.i(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        c().c(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        c();
        m6.j(intent);
        return true;
    }

    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
