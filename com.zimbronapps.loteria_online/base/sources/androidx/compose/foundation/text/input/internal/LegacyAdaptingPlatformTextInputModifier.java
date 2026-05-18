package androidx.compose.foundation.text.input.internal;

import N.y;
import O0.Y;
import P0.N0;
import Q.n0;
import Q.q0;
import T.F;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends Y {
    public final q0 b;
    public final y c;
    public final F d;

    public LegacyAdaptingPlatformTextInputModifier(q0 q0Var, y yVar, F f) {
        this.b = q0Var;
        this.c = yVar;
        this.d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return t.c(this.b, legacyAdaptingPlatformTextInputModifier.b) && t.c(this.c, legacyAdaptingPlatformTextInputModifier.c) && t.c(this.d, legacyAdaptingPlatformTextInputModifier.d);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public n0 create() {
        return new n0(this.b, this.c, this.d);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(n0 n0Var) {
        n0Var.G1(this.b);
        n0Var.F1(this.c);
        n0Var.H1(this.d);
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ')';
    }

    public void inspectableProperties(N0 n0) {
    }
}
