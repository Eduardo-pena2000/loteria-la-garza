package u6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class h implements OnCompleteListener {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ScheduledFuture c;

    public /* synthetic */ h(c cVar, String str, ScheduledFuture scheduledFuture) {
        this.a = cVar;
        this.b = str;
        this.c = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.a.h(this.b, this.c, task);
    }
}
