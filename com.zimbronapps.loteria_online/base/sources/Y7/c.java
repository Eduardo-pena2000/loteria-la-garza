package Y7;

import R7.E;
import com.google.android.gms.tasks.TaskCompletionSource;
import w5.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class c implements k {
    public final /* synthetic */ e a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ E d;

    public /* synthetic */ c(e eVar, TaskCompletionSource taskCompletionSource, boolean z, E e) {
        this.a = eVar;
        this.b = taskCompletionSource;
        this.c = z;
        this.d = e;
    }

    public final void a(Exception exc) {
        e.a(this.a, this.b, this.c, this.d, exc);
    }
}
