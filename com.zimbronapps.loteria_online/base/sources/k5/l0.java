package k5;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class l0 implements Continuation {
    public final /* synthetic */ p0 a;
    public final /* synthetic */ j.d b;

    public /* synthetic */ l0(p0 p0Var, j.d dVar) {
        this.a = p0Var;
        this.b = dVar;
    }

    public final Object then(Task task) {
        return p0.d(this.a, this.b, task);
    }
}
