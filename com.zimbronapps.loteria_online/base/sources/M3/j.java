package m3;

import android.view.Surface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class j extends c3.l {
    public final int d;
    public final boolean e;

    public j(Throwable th, c3.m mVar, Surface surface) {
        super(th, mVar);
        this.d = System.identityHashCode(surface);
        this.e = surface == null || surface.isValid();
    }
}
