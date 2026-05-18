package ia;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class G implements Runnable {
    public final /* synthetic */ X a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ G(X x, Map map, TaskCompletionSource taskCompletionSource) {
        this.a = x;
        this.b = map;
        this.c = taskCompletionSource;
    }

    public final void run() {
        X.y(this.a, this.b, this.c);
    }
}
