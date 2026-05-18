package ja;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ B7.g a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ m(B7.g gVar, TaskCompletionSource taskCompletionSource) {
        this.a = gVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        v.E0(this.a, this.b);
    }
}
