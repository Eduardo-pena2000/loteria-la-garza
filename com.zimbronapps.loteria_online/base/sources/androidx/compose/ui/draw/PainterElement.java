package androidx.compose.ui.draw;

import A0.c;
import M0.f;
import O0.H;
import O0.Y;
import O0.u;
import P0.N0;
import androidx.compose.ui.graphics.d;
import kotlin.jvm.internal.t;
import o0.e;
import s0.n;
import u0.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class PainterElement extends Y {
    public final c b;
    public final boolean c;
    public final e d;
    public final f e;
    public final float f;
    public final d g;

    public PainterElement(c cVar, boolean z, e eVar, f fVar, float f, d dVar) {
        this.b = cVar;
        this.c = z;
        this.d = eVar;
        this.e = fVar;
        this.f = f;
        this.g = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return t.c(this.b, painterElement.b) && this.c == painterElement.c && t.c(this.d, painterElement.d) && t.c(this.e, painterElement.e) && Float.compare(this.f, painterElement.f) == 0 && t.c(this.g, painterElement.g);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public n create() {
        return new n(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(n nVar) {
        boolean G1 = nVar.G1();
        boolean z = this.c;
        boolean z2 = G1 != z || (z && !l.f(nVar.F1().k(), this.b.k()));
        nVar.N1(this.b);
        nVar.O1(this.c);
        nVar.L1(this.d);
        nVar.M1(this.e);
        nVar.d(this.f);
        nVar.c(this.g);
        if (z2) {
            H.b(nVar);
        }
        u.a(nVar);
    }

    public int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Float.hashCode(this.f)) * 31;
        d dVar = this.g;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public void inspectableProperties(N0 n0) {
        n0.d("paint");
        n0.b().c("painter", this.b);
        n0.b().c("sizeToIntrinsics", Boolean.valueOf(this.c));
        n0.b().c("alignment", this.d);
        n0.b().c("contentScale", this.e);
        n0.b().c("alpha", Float.valueOf(this.f));
        n0.b().c("colorFilter", this.g);
    }

    public String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
