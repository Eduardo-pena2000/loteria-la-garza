package s8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;
import s8.k0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j0 implements OnCompleteListener {
    public final /* synthetic */ ScheduledFuture a;

    public /* synthetic */ j0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void onComplete(Task task) {
        k0.a.a(this.a, task);
    }
}
