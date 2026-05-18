package k7;

import android.app.job.JobParameters;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ m6 a;
    public final /* synthetic */ JobParameters b;

    public /* synthetic */ k6(m6 m6Var, JobParameters jobParameters) {
        this.a = m6Var;
        this.b = jobParameters;
    }

    public final /* synthetic */ void run() {
        this.a.h(this.b);
    }
}
