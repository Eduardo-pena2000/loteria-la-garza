package ka;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ c(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.a = str;
        this.b = bool;
        this.c = taskCompletionSource;
    }

    public final void run() {
        j.z(this.a, this.b, this.c);
    }
}
