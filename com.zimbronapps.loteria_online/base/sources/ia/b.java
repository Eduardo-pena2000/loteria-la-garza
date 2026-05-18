package ia;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class B implements OnCompleteListener {
    public final /* synthetic */ X a;
    public final /* synthetic */ Qa.l b;

    public /* synthetic */ B(X x, Qa.l lVar) {
        this.a = x;
        this.b = lVar;
    }

    public final void onComplete(Task task) {
        X.u(this.a, this.b, task);
    }
}
