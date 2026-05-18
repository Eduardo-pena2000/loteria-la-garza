package androidx.compose.foundation;

import A.S;
import A.e0;
import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class MagnifierElement extends Y {
    public final l b;
    public final l c;
    public final l d;
    public final float e;
    public final boolean f;
    public final long g;
    public final float h;
    public final float i;
    public final boolean j;
    public final e0 k;

    public /* synthetic */ MagnifierElement(l lVar, l lVar2, l lVar3, float f, boolean z, long j, float f2, float f3, boolean z2, e0 e0Var, k kVar) {
        this(lVar, lVar2, lVar3, f, z, j, f2, f3, z2, e0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.b == magnifierElement.b && this.c == magnifierElement.c && this.e == magnifierElement.e && this.f == magnifierElement.f && n1.k.f(this.g, magnifierElement.g) && h.i(this.h, magnifierElement.h) && h.i(this.i, magnifierElement.i) && this.j == magnifierElement.j && this.d == magnifierElement.d && t.c(this.k, magnifierElement.k);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public S create() {
        return new S(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(S s) {
        s.M1(this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.d, this.k);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        l lVar = this.c;
        int hashCode2 = (((((((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + Float.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + n1.k.i(this.g)) * 31) + h.k(this.h)) * 31) + h.k(this.i)) * 31) + Boolean.hashCode(this.j)) * 31;
        l lVar2 = this.d;
        return ((hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + this.k.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("magnifier");
        n0.b().c("sourceCenter", this.b);
        n0.b().c("magnifierCenter", this.c);
        n0.b().c("zoom", Float.valueOf(this.e));
        n0.b().c("size", n1.k.c(this.g));
        n0.b().c("cornerRadius", h.d(this.h));
        n0.b().c("elevation", h.d(this.i));
        n0.b().c("clippingEnabled", Boolean.valueOf(this.j));
    }

    public MagnifierElement(l lVar, l lVar2, l lVar3, float f, boolean z, long j, float f2, float f3, boolean z2, e0 e0Var) {
        this.b = lVar;
        this.c = lVar2;
        this.d = lVar3;
        this.e = f;
        this.f = z;
        this.g = j;
        this.h = f2;
        this.i = f3;
        this.j = z2;
        this.k = e0Var;
    }
}
