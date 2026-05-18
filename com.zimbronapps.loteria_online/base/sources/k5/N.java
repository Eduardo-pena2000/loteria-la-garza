package k5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import da.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class n implements OnCompleteListener {
    public final /* synthetic */ D a;
    public final /* synthetic */ c.b b;

    public /* synthetic */ n(D d, c.b bVar) {
        this.a = d;
        this.b = bVar;
    }

    public final void onComplete(Task task) {
        D.m(this.a, this.b, task);
    }
}
