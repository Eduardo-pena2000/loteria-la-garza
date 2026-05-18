package k5;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class t implements OnFailureListener {
    public final /* synthetic */ D a;

    public /* synthetic */ t(D d) {
        this.a = d;
    }

    public final void onFailure(Exception exc) {
        D.l(this.a, exc);
    }
}
