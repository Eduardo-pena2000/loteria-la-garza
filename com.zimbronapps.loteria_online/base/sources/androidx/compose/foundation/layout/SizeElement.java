package androidx.compose.foundation.layout;

import F.X;
import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.k;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class SizeElement extends Y {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final l g;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, l lVar, k kVar) {
        this(f, f2, f3, f4, z, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return h.i(this.b, sizeElement.b) && h.i(this.c, sizeElement.c) && h.i(this.d, sizeElement.d) && h.i(this.e, sizeElement.e) && this.f == sizeElement.f;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public X create() {
        return new X(this.b, this.c, this.d, this.e, this.f, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(X x) {
        x.J1(this.b);
        x.I1(this.c);
        x.H1(this.d);
        x.G1(this.e);
        x.F1(this.f);
    }

    public int hashCode() {
        return (((((((h.k(this.b) * 31) + h.k(this.c)) * 31) + h.k(this.d)) * 31) + h.k(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public void inspectableProperties(N0 n0) {
        this.g.invoke(n0);
    }

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, l lVar, int i, k kVar) {
        this((i & 1) != 0 ? h.b.c() : f, (i & 2) != 0 ? h.b.c() : f2, (i & 4) != 0 ? h.b.c() : f3, (i & 8) != 0 ? h.b.c() : f4, z, lVar, null);
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z, l lVar) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = lVar;
    }
}
