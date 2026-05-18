package ka;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ka.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class g implements OnCompleteListener {
    public final /* synthetic */ m.g a;

    public /* synthetic */ g(m.g gVar) {
        this.a = gVar;
    }

    public final void onComplete(Task task) {
        j.y(this.a, task);
    }
}
