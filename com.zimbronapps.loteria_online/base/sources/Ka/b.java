package ka;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ b(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.a = str;
        this.b = bool;
        this.c = taskCompletionSource;
    }

    public final void run() {
        j.x(this.a, this.b, this.c);
    }
}
