package androidx.compose.foundation;

import A.Q;
import E.m;
import O0.Y;
import P0.N0;
import W0.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class ClickableElement extends Y {
    public final m b;
    public final Q c;
    public final boolean d;
    public final String e;
    public final h f;
    public final Qa.a g;

    public /* synthetic */ ClickableElement(m mVar, Q q, boolean z, String str, h hVar, Qa.a aVar, k kVar) {
        this(mVar, q, z, str, hVar, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return t.c(this.b, clickableElement.b) && t.c(this.c, clickableElement.c) && this.d == clickableElement.d && t.c(this.e, clickableElement.e) && t.c(this.f, clickableElement.f) && this.g == clickableElement.g;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public A.m create() {
        return new A.m(this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(A.m mVar) {
        mVar.e2(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public int hashCode() {
        m mVar = this.b;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        Q q = this.c;
        int hashCode2 = (((hashCode + (q != null ? q.hashCode() : 0)) * 31) + Boolean.hashCode(this.d)) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        h hVar = this.f;
        return ((hashCode3 + (hVar != null ? h.n(hVar.p()) : 0)) * 31) + this.g.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("clickable");
        n0.b().c("enabled", Boolean.valueOf(this.d));
        n0.b().c("onClick", this.g);
        n0.b().c("onClickLabel", this.e);
        n0.b().c("role", this.f);
        n0.b().c("interactionSource", this.b);
        n0.b().c("indicationNodeFactory", this.c);
    }

    public ClickableElement(m mVar, Q q, boolean z, String str, h hVar, Qa.a aVar) {
        this.b = mVar;
        this.c = q;
        this.d = z;
        this.e = str;
        this.f = hVar;
        this.g = aVar;
    }
}
