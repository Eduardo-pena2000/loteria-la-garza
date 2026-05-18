package ka;

import com.google.android.gms.tasks.TaskCompletionSource;
import ka.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ j a;
    public final /* synthetic */ m.a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ a(j jVar, m.a aVar, String str, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = aVar;
        this.c = str;
        this.d = taskCompletionSource;
    }

    public final void run() {
        j.B(this.a, this.b, this.c, this.d);
    }
}
