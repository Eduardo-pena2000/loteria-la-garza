package androidx.compose.ui.focus;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface m extends O0.j {
    static /* synthetic */ boolean g0(m mVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i2 & 1) != 0) {
            i = c.b.b();
        }
        return mVar.q(i);
    }

    boolean q(int i);
}
