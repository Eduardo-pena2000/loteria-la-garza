package k5;

import com.google.android.gms.tasks.OnFailureListener;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class i0 implements OnFailureListener {
    public final /* synthetic */ p0 a;
    public final /* synthetic */ j.d b;

    public /* synthetic */ i0(p0 p0Var, j.d dVar) {
        this.a = p0Var;
        this.b = dVar;
    }

    public final void onFailure(Exception exc) {
        p0.g(this.a, this.b, exc);
    }
}
