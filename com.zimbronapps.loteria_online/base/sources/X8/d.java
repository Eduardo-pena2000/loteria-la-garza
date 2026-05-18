package x8;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements SuccessContinuation {
    public final /* synthetic */ e a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.b c;

    public /* synthetic */ d(e eVar, boolean z, com.google.firebase.remoteconfig.internal.b bVar) {
        this.a = eVar;
        this.b = z;
        this.c = bVar;
    }

    public final Task then(Object obj) {
        return e.a(this.a, this.b, this.c, (Void) obj);
    }
}
