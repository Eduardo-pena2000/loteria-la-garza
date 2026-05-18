package ma;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class w implements OnCompleteListener {
    public final /* synthetic */ Qa.l a;
    public final /* synthetic */ E b;

    public /* synthetic */ w(Qa.l lVar, E e) {
        this.a = lVar;
        this.b = e;
    }

    public final void onComplete(Task task) {
        E.n(this.a, this.b, task);
    }
}
