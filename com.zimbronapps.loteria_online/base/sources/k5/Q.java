package k5;

import com.google.android.gms.tasks.OnFailureListener;
import da.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class q implements OnFailureListener {
    public final /* synthetic */ c.b a;

    public /* synthetic */ q(c.b bVar) {
        this.a = bVar;
    }

    public final void onFailure(Exception exc) {
        D.b(this.a, exc);
    }
}
