package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static final int a(m mVar, int i) {
        if (w.L()) {
            w.U(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int Q = mVar.Q();
        if (w.L()) {
            w.T();
        }
        return Q;
    }

    public static final long b(m mVar, int i) {
        if (w.L()) {
            w.U(-168259424, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long n = mVar.n();
        if (w.L()) {
            w.T();
        }
        return n;
    }

    public static final d1 c(m mVar, int i) {
        if (w.L()) {
            w.U(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        d1 z = mVar.z();
        if (z == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        mVar.L(z);
        if (w.L()) {
            w.T();
        }
        return z;
    }

    public static final void d() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final y e(m mVar, int i) {
        if (w.L()) {
            w.U(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        y R = mVar.R();
        if (w.L()) {
            w.T();
        }
        return R;
    }
}
