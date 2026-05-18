package na;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ TaskCompletionSource a;

    public /* synthetic */ q(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public final void run() {
        x.o(this.a);
    }
}
