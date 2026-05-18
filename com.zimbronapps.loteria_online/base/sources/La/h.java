package la;

import android.os.Handler;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ h(o oVar, Map map, Handler handler, TaskCompletionSource taskCompletionSource) {
        this.a = oVar;
        this.b = map;
        this.c = handler;
        this.d = taskCompletionSource;
    }

    public final void run() {
        o.j(this.a, this.b, this.c, this.d);
    }
}
