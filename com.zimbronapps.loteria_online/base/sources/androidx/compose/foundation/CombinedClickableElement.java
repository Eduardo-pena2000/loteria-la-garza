package androidx.compose.foundation;

import A.Q;
import A.p;
import E.m;
import O0.Y;
import P0.N0;
import W0.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class CombinedClickableElement extends Y {
    public final m b;
    public final Q c;
    public final boolean d;
    public final String e;
    public final h f;
    public final Qa.a g;
    public final String h;
    public final Qa.a i;
    public final Qa.a j;

    public /* synthetic */ CombinedClickableElement(m mVar, Q q, boolean z, String str, h hVar, Qa.a aVar, String str2, Qa.a aVar2, Qa.a aVar3, k kVar) {
        this(mVar, q, z, str, hVar, aVar, str2, aVar2, aVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return t.c(this.b, combinedClickableElement.b) && t.c(this.c, combinedClickableElement.c) && this.d == combinedClickableElement.d && t.c(this.e, combinedClickableElement.e) && t.c(this.f, combinedClickableElement.f) && this.g == combinedClickableElement.g && t.c(this.h, combinedClickableElement.h) && this.i == combinedClickableElement.i && this.j == combinedClickableElement.j;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p create() {
        return new p(this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.e, this.f, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(p pVar) {
        pVar.f2(this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.e, this.f);
    }

    public int hashCode() {
        m mVar = this.b;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        Q q = this.c;
        int hashCode2 = (((hashCode + (q != null ? q.hashCode() : 0)) * 31) + Boolean.hashCode(this.d)) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        h hVar = this.f;
        int n = (((hashCode3 + (hVar != null ? h.n(hVar.p()) : 0)) * 31) + this.g.hashCode()) * 31;
        String str2 = this.h;
        int hashCode4 = (n + (str2 != null ? str2.hashCode() : 0)) * 31;
        Qa.a aVar = this.i;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Qa.a aVar2 = this.j;
        return hashCode5 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("combinedClickable");
        n0.b().c("indicationNodeFactory", this.c);
        n0.b().c("interactionSource", this.b);
        n0.b().c("enabled", Boolean.valueOf(this.d));
        n0.b().c("onClickLabel", this.e);
        n0.b().c("role", this.f);
        n0.b().c("onClick", this.g);
        n0.b().c("onDoubleClick", this.j);
        n0.b().c("onLongClick", this.i);
        n0.b().c("onLongClickLabel", this.h);
    }

    public CombinedClickableElement(m mVar, Q q, boolean z, String str, h hVar, Qa.a aVar, String str2, Qa.a aVar2, Qa.a aVar3) {
        this.b = mVar;
        this.c = q;
        this.d = z;
        this.e = str;
        this.f = hVar;
        this.g = aVar;
        this.h = str2;
        this.i = aVar2;
        this.j = aVar3;
    }
}
