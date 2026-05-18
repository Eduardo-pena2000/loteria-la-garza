package V0;

import Ca.I;
import M0.q;
import V0.c;
import W0.w;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import b0.C0;
import b0.U1;
import cb.P;
import java.util.function.Consumer;
import kotlin.jvm.internal.u;
import n1.n;
import v0.s1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements c.a {
    public final C0 a = U1.i(Boolean.FALSE, null, 2, null);

    public /* synthetic */ class a extends kotlin.jvm.internal.a implements Qa.l {
        public a(Object obj) {
            super(1, obj, d0.c.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(l lVar) {
            ((d0.c) ((kotlin.jvm.internal.a) this).receiver).b(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return I.a;
        }
    }

    public static final class b extends u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(l lVar) {
            return Integer.valueOf(lVar.b());
        }
    }

    public static final class c extends u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(l lVar) {
            return Integer.valueOf(lVar.d().e());
        }
    }

    public void a() {
        e(true);
    }

    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void d(View view, w wVar, Ga.i iVar, Consumer consumer) {
        d0.c cVar = new d0.c(new l[16], 0);
        m.e(wVar.d(), 0, new a(cVar), 2, null);
        cVar.A(Fa.b.b(new Qa.l[]{b.a, c.a}));
        l lVar = (l) (cVar.m() != 0 ? cVar.a[cVar.m() - 1] : null);
        if (lVar == null) {
            return;
        }
        V0.c cVar2 = new V0.c(lVar.c(), lVar.d(), P.a(iVar), this, view);
        u0.h b2 = q.b(lVar.a());
        long i = lVar.d().i();
        ScrollCaptureTarget a2 = h.a(view, s1.a(n1.q.b(b2)), new Point(n.k(i), n.l(i)), i.a(cVar2));
        j.a(a2, s1.a(lVar.d()));
        consumer.accept(a2);
    }

    public final void e(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}
