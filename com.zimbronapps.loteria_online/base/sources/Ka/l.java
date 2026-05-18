package ka;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ B7.g a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ l(B7.g gVar, TaskCompletionSource taskCompletionSource) {
        this.a = gVar;
        this.b = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.b(this.a, this.b);
    }
}
