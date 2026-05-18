package androidx.compose.foundation.text.modifiers;

import M0.A;
import M0.C;
import M0.p;
import O0.E;
import O0.H;
import O0.m;
import O0.t;
import O0.v;
import Qa.l;
import S.g;
import Z0.Y0;
import Z0.e;
import d1.u;
import java.util.List;
import kotlin.jvm.internal.k;
import v0.t0;
import x0.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends m implements E, t, v {
    public g c;
    public l d;
    public final b e;

    public /* synthetic */ a(e eVar, Y0 y0, u.b bVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, g gVar, t0 t0Var, l lVar3, k kVar) {
        this(eVar, y0, bVar, lVar, i, z, i2, i3, list, lVar2, gVar, t0Var, lVar3);
    }

    public final void K1(e eVar, Y0 y0, List list, int i, int i2, boolean z, u.b bVar, int i3, l lVar, l lVar2, g gVar, t0 t0Var) {
        b bVar2 = this.e;
        bVar2.L1(bVar2.Y1(t0Var, y0), this.e.a2(eVar), this.e.Z1(y0, list, i, i2, z, bVar, i3), this.e.X1(lVar, lVar2, gVar, this.d));
        H.b(this);
    }

    public void draw(c cVar) {
        this.e.M1(cVar);
    }

    public int maxIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return this.e.R1(mVar, lVar, i);
    }

    public int maxIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return this.e.S1(mVar, lVar, i);
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a, long j) {
        return this.e.T1(lVar, a, j);
    }

    public int minIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        return this.e.U1(mVar, lVar, i);
    }

    public int minIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        return this.e.V1(mVar, lVar, i);
    }

    public /* synthetic */ a(e eVar, Y0 y0, u.b bVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, g gVar, t0 t0Var, l lVar3, int i4, k kVar) {
        this(eVar, y0, bVar, (i4 & 8) != 0 ? null : lVar, (i4 & 16) != 0 ? l1.v.a.a() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : lVar2, (i4 & 1024) != 0 ? null : gVar, (i4 & 2048) != 0 ? null : t0Var, (i4 & 4096) != 0 ? null : lVar3, null);
    }

    public a(e eVar, Y0 y0, u.b bVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, g gVar, t0 t0Var, l lVar3) {
        this.d = lVar3;
        this.e = (b) E1(new b(eVar, y0, bVar, lVar, i, z, i2, i3, list, lVar2, this.c, t0Var, this.d, null));
        throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
    }

    public void g(p pVar) {
    }
}
