package l7;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ b(Context context, TaskCompletionSource taskCompletionSource) {
        this.a = context;
        this.b = taskCompletionSource;
    }

    public final void run() {
        Context context = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        try {
            a.e(context);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }
}
