package x8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Continuation {
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.a a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ a(com.google.firebase.remoteconfig.internal.a aVar, Task task, Task task2, long j, int i) {
        this.a = aVar;
        this.b = task;
        this.c = task2;
        this.d = j;
        this.e = i;
    }

    public final Object then(Task task) {
        return com.google.firebase.remoteconfig.internal.a.a(this.a, this.b, this.c, this.d, this.e, task);
    }
}
