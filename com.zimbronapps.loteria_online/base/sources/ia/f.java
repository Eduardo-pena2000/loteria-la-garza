package ia;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class F implements Runnable {
    public final /* synthetic */ X a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ F(X x, String str, TaskCompletionSource taskCompletionSource) {
        this.a = x;
        this.b = str;
        this.c = taskCompletionSource;
    }

    public final void run() {
        X.o(this.a, this.b, this.c);
    }
}
