package androidx.compose.foundation;

import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.E1;
import v0.h0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class BackgroundElement extends Y {
    public final long b;
    public final h0 c;
    public final float d;
    public final E1 e;
    public final l f;

    public /* synthetic */ BackgroundElement(long j, h0 h0Var, float f, E1 e1, l lVar, k kVar) {
        this(j, h0Var, f, e1, lVar);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && r0.s(this.b, backgroundElement.b) && t.c(this.c, backgroundElement.c) && this.d == backgroundElement.d && t.c(this.e, backgroundElement.e);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public A.e create() {
        return new A.e(this.b, this.c, this.d, this.e, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(A.e eVar) {
        eVar.J1(this.b);
        eVar.I1(this.c);
        eVar.d(this.d);
        eVar.i1(this.e);
    }

    public int hashCode() {
        int y = r0.y(this.b) * 31;
        h0 h0Var = this.c;
        return ((((y + (h0Var != null ? h0Var.hashCode() : 0)) * 31) + Float.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        this.f.invoke(n0);
    }

    public /* synthetic */ BackgroundElement(long j, h0 h0Var, float f, E1 e1, l lVar, int i, k kVar) {
        this((i & 1) != 0 ? r0.b.j() : j, (i & 2) != 0 ? null : h0Var, f, e1, lVar, null);
    }

    public BackgroundElement(long j, h0 h0Var, float f, E1 e1, l lVar) {
        this.b = j;
        this.c = h0Var;
        this.d = f;
        this.e = e1;
        this.f = lVar;
    }
}
