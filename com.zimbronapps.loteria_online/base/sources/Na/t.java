package na;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ t(Map map, TaskCompletionSource taskCompletionSource) {
        this.a = map;
        this.b = taskCompletionSource;
    }

    public final void run() {
        x.a(this.a, this.b);
    }
}
