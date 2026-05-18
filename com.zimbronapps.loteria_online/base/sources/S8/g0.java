package s8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import s8.k0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class g0 implements OnCompleteListener {
    public final /* synthetic */ k0.a a;

    public /* synthetic */ g0(k0.a aVar) {
        this.a = aVar;
    }

    public final void onComplete(Task task) {
        h0.a(this.a, task);
    }
}
