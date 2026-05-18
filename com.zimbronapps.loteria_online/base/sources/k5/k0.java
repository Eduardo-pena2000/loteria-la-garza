package k5;

import com.google.android.gms.tasks.OnFailureListener;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class k0 implements OnFailureListener {
    public final /* synthetic */ p0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j.d c;

    public /* synthetic */ k0(p0 p0Var, String str, j.d dVar) {
        this.a = p0Var;
        this.b = str;
        this.c = dVar;
    }

    public final void onFailure(Exception exc) {
        p0.b(this.a, this.b, this.c, exc);
    }
}
