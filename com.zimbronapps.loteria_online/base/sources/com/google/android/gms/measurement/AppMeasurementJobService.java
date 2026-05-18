package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import k7.i6;
import k7.m6;

@TargetApi(24)
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AppMeasurementJobService extends JobService implements i6 {
    public m6 a;

    public final void a(Intent intent) {
    }

    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final m6 c() {
        if (this.a == null) {
            this.a = new m6(this);
        }
        return this.a;
    }

    public void onCreate() {
        super/*android.app.Service*/.onCreate();
        c().a();
    }

    public void onDestroy() {
        c().b();
        super/*android.app.Service*/.onDestroy();
    }

    public void onRebind(Intent intent) {
        c();
        m6.i(intent);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        c().e(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        c();
        m6.j(intent);
        return true;
    }

    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }
}
