package u6;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ TaskCompletionSource a;

    public /* synthetic */ g(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public final void run() {
        if (this.a.trySetException(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
