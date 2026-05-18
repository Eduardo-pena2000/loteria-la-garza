package ja;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ v a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ c(v vVar, TaskCompletionSource taskCompletionSource) {
        this.a = vVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        v.J0(this.a, this.b);
    }
}
