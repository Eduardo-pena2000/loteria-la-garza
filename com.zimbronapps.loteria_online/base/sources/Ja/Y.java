package ja;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ja.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class y implements OnCompleteListener {
    public final /* synthetic */ c0.F a;
    public final /* synthetic */ J7.A b;

    public /* synthetic */ y(c0.F f, J7.A a) {
        this.a = f;
        this.b = a;
    }

    public final void onComplete(Task task) {
        S.V(this.a, this.b, task);
    }
}
