package x8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class f implements Continuation {
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.c a;
    public final /* synthetic */ Map b;

    public /* synthetic */ f(com.google.firebase.remoteconfig.internal.c cVar, Map map) {
        this.a = cVar;
        this.b = map;
    }

    public final Object then(Task task) {
        return com.google.firebase.remoteconfig.internal.c.d(this.a, this.b, task);
    }
}
