package na;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ x a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ h(x xVar, TaskCompletionSource taskCompletionSource) {
        this.a = xVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        x.j(this.a, this.b);
    }
}
