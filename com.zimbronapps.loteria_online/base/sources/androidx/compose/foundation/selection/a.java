package androidx.compose.foundation.selection;

import A.M;
import A.Q;
import Ca.I;
import E.l;
import P0.L0;
import P0.N0;
import Qa.q;
import W0.h;
import androidx.compose.foundation.d;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {

    public static final class a extends u implements q {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ h c;
        public final /* synthetic */ Qa.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2, h hVar, Qa.a aVar) {
            super(3);
            this.a = z;
            this.b = z2;
            this.c = hVar;
            this.d = aVar;
        }

        public final e a(e eVar, m mVar, int i) {
            E.m mVar2;
            mVar.V(-2124609672);
            if (w.L()) {
                w.U(-2124609672, i, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
            }
            M m = (M) mVar.x(d.a());
            if (m instanceof Q) {
                mVar.V(-1412264498);
                mVar.P();
                mVar2 = null;
            } else {
                mVar.V(-1412156525);
                Object C = mVar.C();
                if (C == m.a.a()) {
                    C = l.a();
                    mVar.t(C);
                }
                mVar2 = (E.m) C;
                mVar.P();
            }
            e a = a.a(e.a, this.a, mVar2, m, this.b, this.c, this.d);
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((e) obj, (m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class b extends u implements q {
        public final /* synthetic */ M a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ h d;
        public final /* synthetic */ Qa.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M m, boolean z, boolean z2, h hVar, Qa.a aVar) {
            super(3);
            this.a = m;
            this.b = z;
            this.c = z2;
            this.d = hVar;
            this.e = aVar;
        }

        public final e a(e eVar, m mVar, int i) {
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
            e then = d.b(e.a, mVar2, this.a).then(new SelectableElement(this.b, mVar2, null, this.c, this.d, this.e, null));
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return then;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((e) obj, (m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class c extends u implements Qa.l {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ h c;
        public final /* synthetic */ Qa.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, boolean z2, h hVar, Qa.a aVar) {
            super(1);
            this.a = z;
            this.b = z2;
            this.c = hVar;
            this.d = aVar;
        }

        public final void a(N0 n0) {
            n0.d("selectable");
            n0.b().c("selected", Boolean.valueOf(this.a));
            n0.b().c("enabled", Boolean.valueOf(this.b));
            n0.b().c("role", this.c);
            n0.b().c("onClick", this.d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final e a(e eVar, boolean z, E.m mVar, M m, boolean z2, h hVar, Qa.a aVar) {
        return eVar.then(m instanceof Q ? new SelectableElement(z, mVar, (Q) m, z2, hVar, aVar, null) : m == null ? new SelectableElement(z, mVar, null, z2, hVar, aVar, null) : mVar != null ? d.b(e.a, mVar, m).then(new SelectableElement(z, mVar, null, z2, hVar, aVar, null)) : androidx.compose.ui.c.c(e.a, null, new b(m, z, z2, hVar, aVar), 1, null));
    }

    public static final e b(e eVar, boolean z, boolean z2, h hVar, Qa.a aVar) {
        return androidx.compose.ui.c.b(eVar, L0.b() ? new c(z, z2, hVar, aVar) : L0.a(), new a(z, z2, hVar, aVar));
    }

    public static /* synthetic */ e c(e eVar, boolean z, boolean z2, h hVar, Qa.a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            hVar = null;
        }
        return b(eVar, z, z2, hVar, aVar);
    }
}
