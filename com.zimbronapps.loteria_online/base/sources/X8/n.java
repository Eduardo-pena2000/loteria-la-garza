package x8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class n implements Continuation {
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.d a;
    public final /* synthetic */ Task b;

    public /* synthetic */ n(com.google.firebase.remoteconfig.internal.d dVar, Task task) {
        this.a = dVar;
        this.b = task;
    }

    public final Object then(Task task) {
        return com.google.firebase.remoteconfig.internal.d.a(this.a, this.b, task);
    }
}
