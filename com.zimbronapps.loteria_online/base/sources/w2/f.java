package W2;

import androidx.media3.exoplayer.dash.DashMediaSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ DashMediaSource a;

    public /* synthetic */ f(DashMediaSource dashMediaSource) {
        this.a = dashMediaSource;
    }

    public final void run() {
        DashMediaSource.C(this.a);
    }
}
