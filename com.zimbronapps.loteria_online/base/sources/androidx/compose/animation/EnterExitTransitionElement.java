package androidx.compose.animation;

import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;
import y.o;
import y.u;
import z.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class EnterExitTransitionElement extends Y {
    public final o0 b;
    public o0.a c;
    public o0.a d;
    public o0.a e;
    public f f;
    public g g;
    public Qa.a h;
    public u i;

    public EnterExitTransitionElement(o0 o0Var, o0.a aVar, o0.a aVar2, o0.a aVar3, f fVar, g gVar, Qa.a aVar4, u uVar) {
        this.b = o0Var;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = fVar;
        this.g = gVar;
        this.h = aVar4;
        this.i = uVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return t.c(this.b, enterExitTransitionElement.b) && t.c(this.c, enterExitTransitionElement.c) && t.c(this.d, enterExitTransitionElement.d) && t.c(this.e, enterExitTransitionElement.e) && t.c(this.f, enterExitTransitionElement.f) && t.c(this.g, enterExitTransitionElement.g) && t.c(this.h, enterExitTransitionElement.h) && t.c(this.i, enterExitTransitionElement.i);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public o create() {
        return new o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(o oVar) {
        oVar.P1(this.b);
        oVar.N1(this.c);
        oVar.M1(this.d);
        oVar.O1(this.e);
        oVar.I1(this.f);
        oVar.J1(this.g);
        oVar.H1(this.h);
        oVar.K1(this.i);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        o0.a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o0.a aVar2 = this.d;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        o0.a aVar3 = this.e;
        return ((((((((hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("enterExitTransition");
        n0.b().c("transition", this.b);
        n0.b().c("sizeAnimation", this.c);
        n0.b().c("offsetAnimation", this.d);
        n0.b().c("slideAnimation", this.e);
        n0.b().c("enter", this.f);
        n0.b().c("exit", this.g);
        n0.b().c("graphicsLayerBlock", this.i);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.b + ", sizeAnimation=" + this.c + ", offsetAnimation=" + this.d + ", slideAnimation=" + this.e + ", enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }
}
