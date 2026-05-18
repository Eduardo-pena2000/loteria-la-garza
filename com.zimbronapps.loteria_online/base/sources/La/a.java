package la;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ B7.g c;

    public /* synthetic */ a(o oVar, TaskCompletionSource taskCompletionSource, B7.g gVar) {
        this.a = oVar;
        this.b = taskCompletionSource;
        this.c = gVar;
    }

    public final void run() {
        o.a(this.a, this.b, this.c);
    }
}
