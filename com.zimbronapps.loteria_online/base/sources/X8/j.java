package x8;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j implements SuccessContinuation {
    public final /* synthetic */ c.a a;

    public /* synthetic */ j(c.a aVar) {
        this.a = aVar;
    }

    public final Task then(Object obj) {
        return com.google.firebase.remoteconfig.internal.c.b(this.a, (com.google.firebase.remoteconfig.internal.b) obj);
    }
}
