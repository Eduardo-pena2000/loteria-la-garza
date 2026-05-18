package ja;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ja.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class o implements OnCompleteListener {
    public final /* synthetic */ c0.G a;

    public /* synthetic */ o(c0.G g) {
        this.a = g;
    }

    public final void onComplete(Task task) {
        v.I0(this.a, task);
    }
}
