package kb;

import Ca.I;
import Qa.q;
import cb.n;
import hb.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class k {
    public static final q a = a.a;
    public static final D b = new D("STATE_REG");
    public static final D c = new D("STATE_COMPLETED");
    public static final D d = new D("STATE_CANCELLED");
    public static final D e = new D("NO_RESULT");
    public static final D f = new D("PARAM_CLAUSE_0");

    public static final class a implements q {
        public static final a a = new a();

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final l a(int i) {
        if (i == 0) {
            return l.a;
        }
        if (i == 1) {
            return l.b;
        }
        if (i == 2) {
            return l.c;
        }
        if (i == 3) {
            return l.d;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    public static final /* synthetic */ l b(int i) {
        return a(i);
    }

    public static final /* synthetic */ q c() {
        return a;
    }

    public static final /* synthetic */ D d() {
        return e;
    }

    public static final /* synthetic */ D e() {
        return d;
    }

    public static final /* synthetic */ D f() {
        return c;
    }

    public static final /* synthetic */ D g() {
        return b;
    }

    public static final /* synthetic */ boolean h(n nVar, q qVar) {
        return j(nVar, qVar);
    }

    public static final D i() {
        return f;
    }

    public static final boolean j(n nVar, q qVar) {
        Object g = nVar.g(I.a, null, qVar);
        if (g == null) {
            return false;
        }
        nVar.B(g);
        return true;
    }
}
