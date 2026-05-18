package ka;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ka.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class h implements OnCompleteListener {
    public final /* synthetic */ m.f a;

    public /* synthetic */ h(m.f fVar) {
        this.a = fVar;
    }

    public final void onComplete(Task task) {
        j.F(this.a, task);
    }
}
