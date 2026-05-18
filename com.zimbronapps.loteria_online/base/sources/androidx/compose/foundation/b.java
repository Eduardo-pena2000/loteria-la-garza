package androidx.compose.foundation;

import A.M;
import A.Q;
import C.v;
import Ca.I;
import E.l;
import O0.I0;
import O0.J0;
import P0.L0;
import P0.N0;
import Qa.q;
import W0.h;
import b0.m;
import b0.w;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {

    public static final class a extends u implements q {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ h c;
        public final /* synthetic */ Qa.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, String str, h hVar, Qa.a aVar) {
            super(3);
            this.a = z;
            this.b = str;
            this.c = hVar;
            this.d = aVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, m mVar, int i) {
            E.m mVar2;
            mVar.V(-756081143);
            if (w.L()) {
                w.U(-756081143, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            M m = (M) mVar.x(androidx.compose.foundation.d.a());
            if (m instanceof Q) {
                mVar.V(617140216);
                mVar.P();
                mVar2 = null;
            } else {
                mVar.V(617248189);
                Object C = mVar.C();
                if (C == m.a.a()) {
                    C = l.a();
                    mVar.t(C);
                }
                mVar2 = (E.m) C;
                mVar.P();
            }
            androidx.compose.ui.e a = b.a(androidx.compose.ui.e.a, mVar2, m, this.a, this.b, this.c, this.d);
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class b extends u implements q {
        public final /* synthetic */ M a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ h d;
        public final /* synthetic */ Qa.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M m, boolean z, String str, h hVar, Qa.a aVar) {
            super(3);
            this.a = m;
            this.b = z;
            this.c = str;
            this.d = hVar;
            this.e = aVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, m mVar, int i) {
            mVar.V(-1525724089);
            if (w.L()) {
                w.U(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object C = mVar.C();
            if (C == m.a.a()) {
                C = l.a();
                mVar.t(C);
            }
            E.m mVar2 = (E.m) C;
            androidx.compose.ui.e then = androidx.compose.foundation.d.b(androidx.compose.ui.e.a, mVar2, this.a).then(new ClickableElement(mVar2, null, this.b, this.c, this.d, this.e, null));
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return then;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class c extends u implements Qa.l {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ h c;
        public final /* synthetic */ Qa.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, String str, h hVar, Qa.a aVar) {
            super(1);
            this.a = z;
            this.b = str;
            this.c = hVar;
            this.d = aVar;
        }

        public final void a(N0 n0) {
            n0.d("clickable");
            n0.b().c("enabled", Boolean.valueOf(this.a));
            n0.b().c("onClickLabel", this.b);
            n0.b().c("role", this.c);
            n0.b().c("onClick", this.d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class d extends u implements q {
        public final /* synthetic */ M a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ h d;
        public final /* synthetic */ Qa.a e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Qa.a g;
        public final /* synthetic */ Qa.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(M m, boolean z, String str, h hVar, Qa.a aVar, String str2, Qa.a aVar2, Qa.a aVar3) {
            super(3);
            this.a = m;
            this.b = z;
            this.c = str;
            this.d = hVar;
            this.e = aVar;
            this.f = str2;
            this.g = aVar2;
            this.h = aVar3;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, m mVar, int i) {
            mVar.V(-1525724089);
            if (w.L()) {
                w.U(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object C = mVar.C();
            if (C == m.a.a()) {
                C = l.a();
                mVar.t(C);
            }
            E.m mVar2 = (E.m) C;
            androidx.compose.ui.e then = androidx.compose.foundation.d.b(androidx.compose.ui.e.a, mVar2, this.a).then(new CombinedClickableElement(mVar2, null, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null));
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return then;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class e extends u implements Qa.l {
        public final /* synthetic */ J a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(J j) {
            super(1);
            this.a = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(O0.I0 r4) {
            /*
                r3 = this;
                kotlin.jvm.internal.J r0 = r3.a
                boolean r1 = r0.a
                r2 = 1
                if (r1 != 0) goto L17
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                kotlin.jvm.internal.t.e(r4, r1)
                C.v r4 = (C.v) r4
                boolean r4 = r4.E1()
                if (r4 == 0) goto L15
                goto L17
            L15:
                r4 = 0
                goto L18
            L17:
                r4 = r2
            L18:
                r0.a = r4
                kotlin.jvm.internal.J r4 = r3.a
                boolean r4 = r4.a
                r4 = r4 ^ r2
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.b.e.invoke(O0.I0):java.lang.Boolean");
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, E.m mVar, M m, boolean z, String str, h hVar, Qa.a aVar) {
        return eVar.then(m instanceof Q ? new ClickableElement(mVar, (Q) m, z, str, hVar, aVar, null) : m == null ? new ClickableElement(mVar, null, z, str, hVar, aVar, null) : mVar != null ? androidx.compose.foundation.d.b(androidx.compose.ui.e.a, mVar, m).then(new ClickableElement(mVar, null, z, str, hVar, aVar, null)) : androidx.compose.ui.c.c(androidx.compose.ui.e.a, null, new b(m, z, str, hVar, aVar), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, E.m mVar, M m, boolean z, String str, h hVar, Qa.a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return a(eVar, mVar, m, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : hVar, aVar);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z, String str, h hVar, Qa.a aVar) {
        return androidx.compose.ui.c.b(eVar, L0.b() ? new c(z, str, hVar, aVar) : L0.a(), new a(z, str, hVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z, String str, h hVar, Qa.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            hVar = null;
        }
        return c(eVar, z, str, hVar, aVar);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, E.m mVar, M m, boolean z, String str, h hVar, String str2, Qa.a aVar, Qa.a aVar2, Qa.a aVar3) {
        return eVar.then(m instanceof Q ? new CombinedClickableElement(mVar, (Q) m, z, str, hVar, aVar3, str2, aVar, aVar2, null) : m == null ? new CombinedClickableElement(mVar, null, z, str, hVar, aVar3, str2, aVar, aVar2, null) : mVar != null ? androidx.compose.foundation.d.b(androidx.compose.ui.e.a, mVar, m).then(new CombinedClickableElement(mVar, null, z, str, hVar, aVar3, str2, aVar, aVar2, null)) : androidx.compose.ui.c.c(androidx.compose.ui.e.a, null, new d(m, z, str, hVar, aVar3, str2, aVar, aVar2), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, E.m mVar, M m, boolean z, String str, h hVar, String str2, Qa.a aVar, Qa.a aVar2, Qa.a aVar3, int i, Object obj) {
        return e(eVar, mVar, m, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : hVar, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : aVar, (i & 128) != 0 ? null : aVar2, aVar3);
    }

    public static final boolean g(I0 i0) {
        J j = new J();
        J0.c(i0, v.c, new e(j));
        return j.a;
    }
}
