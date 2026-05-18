package w8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class f implements Continuation {
    public final /* synthetic */ o a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;

    public /* synthetic */ f(o oVar, Task task, Task task2) {
        this.a = oVar;
        this.b = task;
        this.c = task2;
    }

    public final Object then(Task task) {
        return o.h(this.a, this.b, this.c, task);
    }
}
