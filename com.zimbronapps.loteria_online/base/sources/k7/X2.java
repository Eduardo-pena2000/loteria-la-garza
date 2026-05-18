package k7;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class x2 implements OnFailureListener {
    public final /* synthetic */ y2 a;
    public final /* synthetic */ long b;

    public /* synthetic */ x2(y2 y2Var, long j) {
        this.a = y2Var;
        this.b = j;
    }

    public final /* synthetic */ void onFailure(Exception exc) {
        this.a.c(this.b, exc);
    }
}
