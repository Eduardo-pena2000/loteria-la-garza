package y8;

import A8.f;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements OnSuccessListener {
    public final /* synthetic */ e a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ f c;

    public /* synthetic */ b(e eVar, Task task, f fVar) {
        this.a = eVar;
        this.b = task;
        this.c = fVar;
    }

    public final void onSuccess(Object obj) {
        e.a(this.a, this.b, this.c, (com.google.firebase.remoteconfig.internal.b) obj);
    }
}
