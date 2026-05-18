package ia;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class E implements Runnable {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ X b;

    public /* synthetic */ E(TaskCompletionSource taskCompletionSource, X x) {
        this.a = taskCompletionSource;
        this.b = x;
    }

    public final void run() {
        X.A(this.a, this.b);
    }
}
