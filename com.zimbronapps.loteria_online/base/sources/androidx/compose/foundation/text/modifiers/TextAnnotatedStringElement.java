package androidx.compose.foundation.text.modifiers;

import O0.Y;
import P0.N0;
import Qa.l;
import S.g;
import Z0.Y0;
import Z0.e;
import d1.u;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import l1.v;
import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class TextAnnotatedStringElement extends Y {
    public final e b;
    public final Y0 c;
    public final u.b d;
    public final l e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final l k;
    public final g l;
    public final t0 m;
    public final l n;

    public /* synthetic */ TextAnnotatedStringElement(e eVar, Y0 y0, u.b bVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, g gVar, t0 t0Var, l lVar3, k kVar) {
        this(eVar, y0, bVar, lVar, i, z, i2, i3, list, lVar2, gVar, t0Var, lVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return t.c(this.m, textAnnotatedStringElement.m) && t.c(this.b, textAnnotatedStringElement.b) && t.c(this.c, textAnnotatedStringElement.c) && t.c(this.j, textAnnotatedStringElement.j) && t.c(this.d, textAnnotatedStringElement.d) && this.e == textAnnotatedStringElement.e && this.n == textAnnotatedStringElement.n && v.g(this.f, textAnnotatedStringElement.f) && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.k == textAnnotatedStringElement.k && t.c(this.l, textAnnotatedStringElement.l);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b create() {
        return new b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b bVar) {
        bVar.L1(bVar.Y1(this.m, this.c), bVar.a2(this.b), bVar.Z1(this.c, this.j, this.i, this.h, this.g, this.d, this.f), bVar.X1(this.e, this.k, this.l, this.n));
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        l lVar = this.e;
        int hashCode2 = (((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + v.h(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l lVar2 = this.k;
        int hashCode4 = (((hashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + 0) * 31;
        t0 t0Var = this.m;
        int hashCode5 = (hashCode4 + (t0Var != null ? t0Var.hashCode() : 0)) * 31;
        l lVar3 = this.n;
        return hashCode5 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    public TextAnnotatedStringElement(e eVar, Y0 y0, u.b bVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, g gVar, t0 t0Var, l lVar3) {
        this.b = eVar;
        this.c = y0;
        this.d = bVar;
        this.e = lVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = lVar2;
        this.m = t0Var;
        this.n = lVar3;
    }

    public void inspectableProperties(N0 n0) {
    }
}
