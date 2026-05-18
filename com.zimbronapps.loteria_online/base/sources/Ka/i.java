package ka;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ j a;
    public final /* synthetic */ B7.g b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ i(j jVar, B7.g gVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = gVar;
        this.c = taskCompletionSource;
    }

    public final void run() {
        j.E(this.a, this.b, this.c);
    }
}
