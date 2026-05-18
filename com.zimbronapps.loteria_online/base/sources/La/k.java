package la;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ k(Map map, TaskCompletionSource taskCompletionSource) {
        this.a = map;
        this.b = taskCompletionSource;
    }

    public final void run() {
        o.g(this.a, this.b);
    }
}
