package na;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class r implements OnCompleteListener {
    public final /* synthetic */ x a;
    public final /* synthetic */ j.d b;

    public /* synthetic */ r(x xVar, j.d dVar) {
        this.a = xVar;
        this.b = dVar;
    }

    public final void onComplete(Task task) {
        x.r(this.a, this.b, task);
    }
}
