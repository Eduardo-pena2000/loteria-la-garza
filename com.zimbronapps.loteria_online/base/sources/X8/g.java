package x8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class g implements Continuation {
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.c a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Map c;

    public /* synthetic */ g(com.google.firebase.remoteconfig.internal.c cVar, long j, Map map) {
        this.a = cVar;
        this.b = j;
        this.c = map;
    }

    public final Object then(Task task) {
        return com.google.firebase.remoteconfig.internal.c.e(this.a, this.b, this.c, task);
    }
}
