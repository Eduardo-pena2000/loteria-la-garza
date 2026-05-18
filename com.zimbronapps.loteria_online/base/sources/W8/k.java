package w8;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class k implements SuccessContinuation {
    public final /* synthetic */ o a;

    public /* synthetic */ k(o oVar) {
        this.a = oVar;
    }

    public final Task then(Object obj) {
        return o.g(this.a, (Void) obj);
    }
}
