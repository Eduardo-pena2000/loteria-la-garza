package androidx.compose.foundation.lazy.layout;

import C.q;
import I.E;
import I.F;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class LazyLayoutSemanticsModifier extends Y {
    public final Qa.a b;
    public final E c;
    public final q d;
    public final boolean e;
    public final boolean f;

    public LazyLayoutSemanticsModifier(Qa.a aVar, E e, q qVar, boolean z, boolean z2) {
        this.b = aVar;
        this.c = e;
        this.d = qVar;
        this.e = z;
        this.f = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.b == lazyLayoutSemanticsModifier.b && t.c(this.c, lazyLayoutSemanticsModifier.c) && this.d == lazyLayoutSemanticsModifier.d && this.e == lazyLayoutSemanticsModifier.e && this.f == lazyLayoutSemanticsModifier.f;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public F create() {
        return new F(this.b, this.c, this.d, this.e, this.f);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(F f) {
        f.I1(this.b, this.c, this.d, this.e, this.f);
    }

    public int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public void inspectableProperties(N0 n0) {
    }
}
