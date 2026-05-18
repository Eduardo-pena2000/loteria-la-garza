package ma;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ E a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ u(E e, TaskCompletionSource taskCompletionSource) {
        this.a = e;
        this.b = taskCompletionSource;
    }

    public final void run() {
        E.s(this.a, this.b);
    }
}
