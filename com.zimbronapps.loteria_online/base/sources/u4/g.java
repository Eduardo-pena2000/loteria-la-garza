package U4;

import Ca.I;
import M0.f;
import Qa.l;
import U4.b;
import Wa.n;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.m;
import b0.w;
import e5.h;
import e5.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final long a = n1.b.b.c(0, 0);

    public static final class a extends u implements l {
        public final /* synthetic */ l a;
        public final /* synthetic */ l b;
        public final /* synthetic */ l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, l lVar2, l lVar3) {
            super(1);
            this.a = lVar;
            this.b = lVar2;
            this.c = lVar3;
        }

        public final void a(b.c cVar) {
            if (cVar instanceof b.c.c) {
                l lVar = this.a;
                if (lVar != null) {
                    lVar.invoke(cVar);
                    return;
                }
                return;
            }
            if (cVar instanceof b.c.d) {
                l lVar2 = this.b;
                if (lVar2 != null) {
                    lVar2.invoke(cVar);
                    return;
                }
                return;
            }
            if (!(cVar instanceof b.c.b)) {
                boolean z = cVar instanceof b.c.a;
                return;
            }
            l lVar3 = this.c;
            if (lVar3 != null) {
                lVar3.invoke(cVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b.c) obj);
            return I.a;
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ A0.c a;
        public final /* synthetic */ A0.c b;
        public final /* synthetic */ A0.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A0.c cVar, A0.c cVar2, A0.c cVar3) {
            super(1);
            this.a = cVar;
            this.b = cVar2;
            this.c = cVar3;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.c invoke(b.c cVar) {
            if (cVar instanceof b.c.c) {
                A0.c cVar2 = this.a;
                b.c.c cVar3 = (b.c.c) cVar;
                return cVar2 != null ? cVar3.b(cVar2) : cVar3;
            }
            if (!(cVar instanceof b.c.b)) {
                return cVar;
            }
            b.c.b bVar = (b.c.b) cVar;
            if (bVar.d().c() instanceof k) {
                A0.c cVar4 = this.b;
                return cVar4 != null ? b.c.b.c(bVar, cVar4, null, 2, null) : bVar;
            }
            A0.c cVar5 = this.c;
            return cVar5 != null ? b.c.b.c(bVar, cVar5, null, 2, null) : bVar;
        }
    }

    public static final float a(long j, float f) {
        return n.l(f, n1.b.m(j), n1.b.k(j));
    }

    public static final float b(long j, float f) {
        return n.l(f, n1.b.n(j), n1.b.l(j));
    }

    public static final long c() {
        return a;
    }

    public static final l d(l lVar, l lVar2, l lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new a(lVar, lVar2, lVar3);
    }

    public static final h e(Object obj, m mVar, int i) {
        if (w.L()) {
            w.U(1151830858, i, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        return obj instanceof h ? (h) obj : new h.a((Context) mVar.x(AndroidCompositionLocals_androidKt.g())).c(obj).a();
    }

    public static final long f(long j) {
        return s.a(Sa.c.d(u0.l.i(j)), Sa.c.d(u0.l.g(j)));
    }

    public static final f5.g g(M0.f fVar) {
        f.a aVar = M0.f.a;
        return t.c(fVar, aVar.b()) ? true : t.c(fVar, aVar.c()) ? f5.g.FIT : f5.g.FILL;
    }

    public static final l h(A0.c cVar, A0.c cVar2, A0.c cVar3) {
        return (cVar == null && cVar2 == null && cVar3 == null) ? U4.b.v.a() : new b(cVar, cVar3, cVar2);
    }
}
