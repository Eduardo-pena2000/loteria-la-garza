package w8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j implements Continuation {
    public final /* synthetic */ Task a;

    public /* synthetic */ j(Task task) {
        this.a = task;
    }

    public final Object then(Task task) {
        return o.e(this.a, task);
    }
}
