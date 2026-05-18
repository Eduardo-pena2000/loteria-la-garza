package na;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ x a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ k(x xVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.a = xVar;
        this.b = map;
        this.c = taskCompletionSource;
    }

    public final void run() {
        x.q(this.a, this.b, this.c);
    }
}
