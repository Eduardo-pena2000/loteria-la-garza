package ma;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ B7.g a;
    public final /* synthetic */ E b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ v(B7.g gVar, E e, TaskCompletionSource taskCompletionSource) {
        this.a = gVar;
        this.b = e;
        this.c = taskCompletionSource;
    }

    public final void run() {
        E.q(this.a, this.b, this.c);
    }
}
