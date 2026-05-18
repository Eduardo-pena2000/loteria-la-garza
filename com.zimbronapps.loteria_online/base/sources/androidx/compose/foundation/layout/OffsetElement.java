package androidx.compose.foundation.layout;

import F.J;
import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.k;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class OffsetElement extends Y {
    public final float b;
    public final float c;
    public final boolean d;
    public final l e;

    public /* synthetic */ OffsetElement(float f, float f2, boolean z, l lVar, k kVar) {
        this(f, f2, z, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return h.i(this.b, offsetElement.b) && h.i(this.c, offsetElement.c) && this.d == offsetElement.d;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public J create() {
        return new J(this.b, this.c, this.d, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(J j) {
        j.I1(this.b);
        j.J1(this.c);
        j.H1(this.d);
    }

    public int hashCode() {
        return (((h.k(this.b) * 31) + h.k(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    public void inspectableProperties(N0 n0) {
        this.e.invoke(n0);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + h.l(this.b) + ", y=" + h.l(this.c) + ", rtlAware=" + this.d + ')';
    }

    public OffsetElement(float f, float f2, boolean z, l lVar) {
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = lVar;
    }
}
