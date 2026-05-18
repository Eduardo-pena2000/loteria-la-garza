package ka;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ j a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ d(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        j.C(this.a, this.b);
    }
}
