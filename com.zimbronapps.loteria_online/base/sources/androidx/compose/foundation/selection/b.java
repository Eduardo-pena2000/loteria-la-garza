package androidx.compose.foundation.selection;

import A.M;
import A.Q;
import Qa.l;
import Qa.q;
import W0.h;
import androidx.compose.foundation.d;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {

    public static final class a extends u implements q {
        public final /* synthetic */ M a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ h d;
        public final /* synthetic */ l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M m, boolean z, boolean z2, h hVar, l lVar) {
            super(3);
            this.a = m;
            this.b = z;
            this.c = z2;
            this.d = hVar;
            this.e = lVar;
        }

        public final e a(e eVar, m mVar, int i) {
            mVar.V(-1525724089);
            if (w.L()) {
                w.U(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object C = mVar.C();
            if (C == m.a.a()) {
                C = E.l.a();
                mVar.t(C);
            }
            E.m mVar2 = (E.m) C;
            e then = d.b(e.a, mVar2, this.a).then(new ToggleableElement(this.b, mVar2, null, this.c, this.d, this.e, null));
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

    public static final e a(e eVar, boolean z, E.m mVar, M m, boolean z2, h hVar, l lVar) {
        return eVar.then(m instanceof Q ? new ToggleableElement(z, mVar, (Q) m, z2, hVar, lVar, null) : m == null ? new ToggleableElement(z, mVar, null, z2, hVar, lVar, null) : mVar != null ? d.b(e.a, mVar, m).then(new ToggleableElement(z, mVar, null, z2, hVar, lVar, null)) : c.c(e.a, null, new a(m, z, z2, hVar, lVar), 1, null));
    }
}
