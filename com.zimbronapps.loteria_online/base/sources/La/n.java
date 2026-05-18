package la;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ n(o oVar, TaskCompletionSource taskCompletionSource) {
        this.a = oVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        o.b(this.a, this.b);
    }
}
