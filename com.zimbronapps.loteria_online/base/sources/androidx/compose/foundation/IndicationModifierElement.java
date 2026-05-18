package androidx.compose.foundation;

import A.P;
import A.Q;
import E.k;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class IndicationModifierElement extends Y {
    public final k b;
    public final Q c;

    public IndicationModifierElement(k kVar, Q q) {
        this.b = kVar;
        this.c = q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return t.c(this.b, indicationModifierElement.b) && t.c(this.c, indicationModifierElement.c);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public P create() {
        return new P(this.c.a(this.b));
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(P p) {
        p.K1(this.c.a(this.b));
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("indication");
        n0.b().c("interactionSource", this.b);
        n0.b().c("indication", this.c);
    }
}
