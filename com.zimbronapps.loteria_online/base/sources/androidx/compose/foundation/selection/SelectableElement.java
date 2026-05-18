package androidx.compose.foundation.selection;

import A.Q;
import E.m;
import O0.Y;
import P0.N0;
import W0.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class SelectableElement extends Y {
    public final boolean b;
    public final m c;
    public final Q d;
    public final boolean e;
    public final h f;
    public final Qa.a g;

    public /* synthetic */ SelectableElement(boolean z, m mVar, Q q, boolean z2, h hVar, Qa.a aVar, k kVar) {
        this(z, mVar, q, z2, hVar, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.b == selectableElement.b && t.c(this.c, selectableElement.c) && t.c(this.d, selectableElement.d) && this.e == selectableElement.e && t.c(this.f, selectableElement.f) && this.g == selectableElement.g;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public L.b create() {
        return new L.b(this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(L.b bVar) {
        bVar.f2(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        m mVar = this.c;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Q q = this.d;
        int hashCode3 = (((hashCode2 + (q != null ? q.hashCode() : 0)) * 31) + Boolean.hashCode(this.e)) * 31;
        h hVar = this.f;
        return ((hashCode3 + (hVar != null ? h.n(hVar.p()) : 0)) * 31) + this.g.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("selectable");
        n0.b().c("selected", Boolean.valueOf(this.b));
        n0.b().c("interactionSource", this.c);
        n0.b().c("indicationNodeFactory", this.d);
        n0.b().c("enabled", Boolean.valueOf(this.e));
        n0.b().c("role", this.f);
        n0.b().c("onClick", this.g);
    }

    public SelectableElement(boolean z, m mVar, Q q, boolean z2, h hVar, Qa.a aVar) {
        this.b = z;
        this.c = mVar;
        this.d = q;
        this.e = z2;
        this.f = hVar;
        this.g = aVar;
    }
}
