package k7;

import android.app.job.JobParameters;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ m6 a;
    public final /* synthetic */ C2 b;
    public final /* synthetic */ JobParameters c;

    public /* synthetic */ j6(m6 m6Var, C2 c2, JobParameters jobParameters) {
        this.a = m6Var;
        this.b = c2;
        this.c = jobParameters;
    }

    public final /* synthetic */ void run() {
        this.a.g(this.b, this.c);
    }
}
