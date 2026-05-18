package O0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final a a = new a();
    public static final Qa.l b = b.a;
    public static final Qa.l c = c.a;

    public static final class a implements N0.k {
        public Object j(N0.c cVar) {
            return cVar.a().invoke();
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(O0.c cVar) {
            cVar.H1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((O0.c) obj);
            return Ca.I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(O0.c cVar) {
            cVar.K1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((O0.c) obj);
            return Ca.I.a;
        }
    }

    public static final /* synthetic */ a a() {
        return a;
    }

    public static final /* synthetic */ Qa.l b() {
        return c;
    }

    public static final /* synthetic */ boolean c(O0.c cVar) {
        return d(cVar);
    }

    public static final boolean d(O0.c cVar) {
        e.c o = k.n(cVar).s0().o();
        kotlin.jvm.internal.t.e(o, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((E0) o).E1();
    }
}
