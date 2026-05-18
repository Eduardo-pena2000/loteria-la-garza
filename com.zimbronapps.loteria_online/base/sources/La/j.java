package la;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ j(o oVar, TaskCompletionSource taskCompletionSource) {
        this.a = oVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        o.h(this.a, this.b);
    }
}
