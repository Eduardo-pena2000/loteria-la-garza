package s8;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ g(h hVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.a = hVar;
        this.b = intent;
        this.c = taskCompletionSource;
    }

    public final void run() {
        h.a(this.a, this.b, this.c);
    }
}
