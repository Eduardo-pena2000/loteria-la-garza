package ia;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class C implements OnCompleteListener {
    public final /* synthetic */ X a;
    public final /* synthetic */ Qa.l b;

    public /* synthetic */ C(X x, Qa.l lVar) {
        this.a = x;
        this.b = lVar;
    }

    public final void onComplete(Task task) {
        X.F(this.a, this.b, task);
    }
}
