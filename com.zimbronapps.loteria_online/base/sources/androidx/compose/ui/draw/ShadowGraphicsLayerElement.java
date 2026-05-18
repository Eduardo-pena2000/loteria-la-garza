package androidx.compose.ui.draw;

import Ca.I;
import O0.Y;
import P0.N0;
import Qa.l;
import androidx.compose.ui.graphics.g;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import v0.E1;
import v0.f0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class ShadowGraphicsLayerElement extends Y {
    public final float b;
    public final E1 c;
    public final boolean d;
    public final long e;
    public final long f;

    public static final class a extends u implements l {
        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return I.a;
        }

        public final void invoke(g gVar) {
            gVar.v(gVar.j1(ShadowGraphicsLayerElement.this.k()));
            gVar.i1(ShadowGraphicsLayerElement.this.l());
            gVar.n(ShadowGraphicsLayerElement.this.j());
            gVar.k(ShadowGraphicsLayerElement.this.i());
            gVar.o(ShadowGraphicsLayerElement.this.m());
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f, E1 e1, boolean z, long j, long j2, k kVar) {
        this(f, e1, z, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return h.i(this.b, shadowGraphicsLayerElement.b) && t.c(this.c, shadowGraphicsLayerElement.c) && this.d == shadowGraphicsLayerElement.d && r0.s(this.e, shadowGraphicsLayerElement.e) && r0.s(this.f, shadowGraphicsLayerElement.f);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0 create() {
        return new f0(h());
    }

    public final l h() {
        return new a();
    }

    public int hashCode() {
        return (((((((h.k(this.b) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + r0.y(this.e)) * 31) + r0.y(this.f);
    }

    public final long i() {
        return this.e;
    }

    public void inspectableProperties(N0 n0) {
        n0.d("shadow");
        n0.b().c("elevation", h.d(this.b));
        n0.b().c("shape", this.c);
        n0.b().c("clip", Boolean.valueOf(this.d));
        n0.b().c("ambientColor", r0.m(this.e));
        n0.b().c("spotColor", r0.m(this.f));
    }

    public final boolean j() {
        return this.d;
    }

    public final float k() {
        return this.b;
    }

    public final E1 l() {
        return this.c;
    }

    public final long m() {
        return this.f;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void update(f0 f0Var) {
        f0Var.G1(h());
        f0Var.F1();
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + h.l(this.b) + ", shape=" + this.c + ", clip=" + this.d + ", ambientColor=" + r0.z(this.e) + ", spotColor=" + r0.z(this.f) + ')';
    }

    public ShadowGraphicsLayerElement(float f, E1 e1, boolean z, long j, long j2) {
        this.b = f;
        this.c = e1;
        this.d = z;
        this.e = j;
        this.f = j2;
    }
}
