package Y1;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface j {
    boolean isAvailableOnDevice();

    void onClearCredential(a aVar, CancellationSignal cancellationSignal, Executor executor, g gVar);

    void onGetCredential(Context context, J j, CancellationSignal cancellationSignal, Executor executor, g gVar);

    default void onGetCredential(Context context, N n, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(n, "pendingGetCredentialHandle");
        kotlin.jvm.internal.t.g(executor, "executor");
        kotlin.jvm.internal.t.g(gVar, "callback");
    }

    default void onPrepareCredential(J j, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        kotlin.jvm.internal.t.g(j, "request");
        kotlin.jvm.internal.t.g(executor, "executor");
        kotlin.jvm.internal.t.g(gVar, "callback");
    }
}
