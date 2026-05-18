package la;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ i(o oVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.a = oVar;
        this.b = map;
        this.c = taskCompletionSource;
    }

    public final void run() {
        o.d(this.a, this.b, this.c);
    }
}
