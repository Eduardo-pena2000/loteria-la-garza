package na;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class n implements b {
    public final /* synthetic */ TaskCompletionSource a;

    public /* synthetic */ n(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public final void onError(String str) {
        x.m(this.a, str);
    }
}
