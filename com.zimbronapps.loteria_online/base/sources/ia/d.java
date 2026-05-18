package ia;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class D implements Runnable {
    public final /* synthetic */ X a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ D(X x, boolean z, TaskCompletionSource taskCompletionSource) {
        this.a = x;
        this.b = z;
        this.c = taskCompletionSource;
    }

    public final void run() {
        X.q(this.a, this.b, this.c);
    }
}
