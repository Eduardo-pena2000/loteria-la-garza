package androidx.compose.material3;

import O0.Y;
import P0.N0;
import X.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class MinimumInteractiveModifier extends Y {
    public static final MinimumInteractiveModifier b = new MinimumInteractiveModifier();

    private MinimumInteractiveModifier() {
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public G create() {
        return new G();
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("minimumInteractiveComponentSize");
        n0.b().c("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(G g) {
    }
}
