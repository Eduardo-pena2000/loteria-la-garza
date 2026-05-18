package ka;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ j a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        j.A(this.a, this.b);
    }
}
