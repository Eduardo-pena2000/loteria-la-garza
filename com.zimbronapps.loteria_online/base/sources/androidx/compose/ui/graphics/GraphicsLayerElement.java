package androidx.compose.ui.graphics;

import O0.Y;
import P0.N0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.E1;
import v0.r0;
import v0.u1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class GraphicsLayerElement extends Y {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final long l;
    public final E1 m;
    public final boolean n;
    public final u1 o;
    public final long p;
    public final long q;
    public final int r;
    public final int s;
    public final d t;

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i, int i2, d dVar, k kVar) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, e1, z, u1Var, j2, j3, i, i2, dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.b, graphicsLayerElement.b) == 0 && Float.compare(this.c, graphicsLayerElement.c) == 0 && Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(this.e, graphicsLayerElement.e) == 0 && Float.compare(this.f, graphicsLayerElement.f) == 0 && Float.compare(this.g, graphicsLayerElement.g) == 0 && Float.compare(this.h, graphicsLayerElement.h) == 0 && Float.compare(this.i, graphicsLayerElement.i) == 0 && Float.compare(this.j, graphicsLayerElement.j) == 0 && Float.compare(this.k, graphicsLayerElement.k) == 0 && j.e(this.l, graphicsLayerElement.l) && t.c(this.m, graphicsLayerElement.m) && this.n == graphicsLayerElement.n && t.c(this.o, graphicsLayerElement.o) && r0.s(this.p, graphicsLayerElement.p) && r0.s(this.q, graphicsLayerElement.q) && e.g(this.r, graphicsLayerElement.r) && c.G(this.s, graphicsLayerElement.s) && t.c(this.t, graphicsLayerElement.t);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i create() {
        return new i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(i iVar) {
        iVar.l(this.b);
        iVar.y(this.c);
        iVar.d(this.d);
        iVar.G(this.e);
        iVar.f(this.f);
        iVar.v(this.g);
        iVar.s(this.h);
        iVar.t(this.i);
        iVar.w(this.j);
        iVar.r(this.k);
        iVar.t0(this.l);
        iVar.i1(this.m);
        iVar.n(this.n);
        iVar.D(this.o);
        iVar.k(this.p);
        iVar.o(this.q);
        iVar.V(this.r);
        iVar.b(this.s);
        iVar.c(this.t);
        iVar.P1();
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((Float.hashCode(this.b) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.h)) * 31) + Float.hashCode(this.i)) * 31) + Float.hashCode(this.j)) * 31) + Float.hashCode(this.k)) * 31) + j.h(this.l)) * 31) + this.m.hashCode()) * 31) + Boolean.hashCode(this.n)) * 31;
        u1 u1Var = this.o;
        int hashCode2 = (((((((((hashCode + (u1Var == null ? 0 : u1Var.hashCode())) * 31) + r0.y(this.p)) * 31) + r0.y(this.q)) * 31) + e.h(this.r)) * 31) + c.H(this.s)) * 31;
        d dVar = this.t;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("graphicsLayer");
        n0.b().c("scaleX", Float.valueOf(this.b));
        n0.b().c("scaleY", Float.valueOf(this.c));
        n0.b().c("alpha", Float.valueOf(this.d));
        n0.b().c("translationX", Float.valueOf(this.e));
        n0.b().c("translationY", Float.valueOf(this.f));
        n0.b().c("shadowElevation", Float.valueOf(this.g));
        n0.b().c("rotationX", Float.valueOf(this.h));
        n0.b().c("rotationY", Float.valueOf(this.i));
        n0.b().c("rotationZ", Float.valueOf(this.j));
        n0.b().c("cameraDistance", Float.valueOf(this.k));
        n0.b().c("transformOrigin", j.b(this.l));
        n0.b().c("shape", this.m);
        n0.b().c("clip", Boolean.valueOf(this.n));
        n0.b().c("renderEffect", this.o);
        n0.b().c("ambientShadowColor", r0.m(this.p));
        n0.b().c("spotShadowColor", r0.m(this.q));
        n0.b().c("compositingStrategy", e.d(this.r));
        n0.b().c("blendMode", c.D(this.s));
        n0.b().c("colorFilter", this.t);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.b + ", scaleY=" + this.c + ", alpha=" + this.d + ", translationX=" + this.e + ", translationY=" + this.f + ", shadowElevation=" + this.g + ", rotationX=" + this.h + ", rotationY=" + this.i + ", rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + j.i(this.l) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=" + this.o + ", ambientShadowColor=" + r0.z(this.p) + ", spotShadowColor=" + r0.z(this.q) + ", compositingStrategy=" + e.i(this.r) + ", blendMode=" + c.I(this.s) + ", colorFilter=" + this.t + ')';
    }

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i, int i2, d dVar) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = j;
        this.m = e1;
        this.n = z;
        this.o = u1Var;
        this.p = j2;
        this.q = j3;
        this.r = i;
        this.s = i2;
        this.t = dVar;
    }
}
