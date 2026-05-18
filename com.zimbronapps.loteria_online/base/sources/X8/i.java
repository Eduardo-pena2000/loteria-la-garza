package x8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class i implements Continuation {
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.c a;
    public final /* synthetic */ Date b;

    public /* synthetic */ i(com.google.firebase.remoteconfig.internal.c cVar, Date date) {
        this.a = cVar;
        this.b = date;
    }

    public final Object then(Task task) {
        return com.google.firebase.remoteconfig.internal.c.c(this.a, this.b, task);
    }
}
