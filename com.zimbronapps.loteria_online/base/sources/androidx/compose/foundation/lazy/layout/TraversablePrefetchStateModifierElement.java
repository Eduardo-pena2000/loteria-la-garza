package androidx.compose.foundation.lazy.layout;

import I.D;
import I.V;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class TraversablePrefetchStateModifierElement extends Y {
    public final D b;

    public TraversablePrefetchStateModifierElement(D d) {
        this.b = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && t.c(this.b, ((TraversablePrefetchStateModifierElement) obj).b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public V create() {
        return new V(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(V v) {
        v.G1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("traversablePrefetchState");
        n0.e(this.b);
    }

    public String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ')';
    }
}
