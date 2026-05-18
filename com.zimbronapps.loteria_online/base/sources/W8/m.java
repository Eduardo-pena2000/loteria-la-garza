package w8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class m implements Continuation {
    public final /* synthetic */ o a;

    public /* synthetic */ m(o oVar) {
        this.a = oVar;
    }

    public final Object then(Task task) {
        return Boolean.valueOf(o.b(this.a, task));
    }
}
