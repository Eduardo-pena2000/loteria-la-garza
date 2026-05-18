package k5;

import com.google.android.gms.tasks.OnFailureListener;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class w implements OnFailureListener {
    public final /* synthetic */ j.d a;

    public /* synthetic */ w(j.d dVar) {
        this.a = dVar;
    }

    public final void onFailure(Exception exc) {
        D.p(this.a, exc);
    }
}
