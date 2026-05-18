package ja;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ja.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class j implements OnCompleteListener {
    public final /* synthetic */ c0.F a;

    public /* synthetic */ j(c0.F f) {
        this.a = f;
    }

    public final void onComplete(Task task) {
        v.A0(this.a, task);
    }
}
