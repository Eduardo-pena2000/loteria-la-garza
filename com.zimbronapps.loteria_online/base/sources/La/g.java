package la;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class g implements OnCompleteListener {
    public final /* synthetic */ j.d a;

    public /* synthetic */ g(j.d dVar) {
        this.a = dVar;
    }

    public final void onComplete(Task task) {
        o.c(this.a, task);
    }
}
