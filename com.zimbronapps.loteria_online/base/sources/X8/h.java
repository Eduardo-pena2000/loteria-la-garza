package x8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class h implements Continuation {
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.c a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;
    public final /* synthetic */ Date d;
    public final /* synthetic */ Map e;

    public /* synthetic */ h(com.google.firebase.remoteconfig.internal.c cVar, Task task, Task task2, Date date, Map map) {
        this.a = cVar;
        this.b = task;
        this.c = task2;
        this.d = date;
        this.e = map;
    }

    public final Object then(Task task) {
        return com.google.firebase.remoteconfig.internal.c.a(this.a, this.b, this.c, this.d, this.e, task);
    }
}
