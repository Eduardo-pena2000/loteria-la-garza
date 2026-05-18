package na;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ j(Map map, TaskCompletionSource taskCompletionSource) {
        this.a = map;
        this.b = taskCompletionSource;
    }

    public final void run() {
        x.n(this.a, this.b);
    }
}
