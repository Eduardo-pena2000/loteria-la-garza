package ka;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ e(String str, TaskCompletionSource taskCompletionSource) {
        this.a = str;
        this.b = taskCompletionSource;
    }

    public final void run() {
        j.D(this.a, this.b);
    }
}
