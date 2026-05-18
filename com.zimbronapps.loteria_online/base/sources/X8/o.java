package x8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class o implements Continuation {
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.d a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;

    public /* synthetic */ o(com.google.firebase.remoteconfig.internal.d dVar, Task task, Task task2) {
        this.a = dVar;
        this.b = task;
        this.c = task2;
    }

    public final Object then(Task task) {
        return com.google.firebase.remoteconfig.internal.d.b(this.a, this.b, this.c, task);
    }
}
