package f1;

import android.view.Choreographer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class a0 implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ a0(Runnable runnable) {
        this.a = runnable;
    }

    public final void doFrame(long j) {
        b0.a(this.a, j);
    }
}
