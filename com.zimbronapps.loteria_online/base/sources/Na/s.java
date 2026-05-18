package na;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ x a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ s(x xVar, TaskCompletionSource taskCompletionSource) {
        this.a = xVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        x.e(this.a, this.b);
    }
}
