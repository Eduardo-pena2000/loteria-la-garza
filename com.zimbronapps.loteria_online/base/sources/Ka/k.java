package ka;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ TaskCompletionSource a;

    public /* synthetic */ k(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.a(this.a);
    }
}
