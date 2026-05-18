package j0;

import b0.D;
import b0.J;
import b0.U0;
import b0.n2;
import g0.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends g0.d implements U0 {
    public static final b g = new b(null);
    public static final int h = 8;
    public static final m i;

    public static final class a extends g0.f implements U0.a {
        public m g;

        public a(m mVar) {
            super(mVar);
            this.g = mVar;
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof D) {
                return r((D) obj);
            }
            return false;
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof n2) {
                return s((n2) obj);
            }
            return false;
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof D) {
                return t((D) obj);
            }
            return null;
        }

        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof D) ? obj2 : u((D) obj, (n2) obj2);
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public m g() {
            m mVar;
            if (j() == this.g.s()) {
                mVar = this.g;
            } else {
                o(new i0.e());
                mVar = new m(j(), size());
            }
            this.g = mVar;
            return mVar;
        }

        public /* bridge */ boolean r(D d) {
            return super.containsKey(d);
        }

        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof D) {
                return v((D) obj);
            }
            return null;
        }

        public /* bridge */ boolean s(n2 n2Var) {
            return super/*java.util.AbstractMap*/.containsValue(n2Var);
        }

        public /* bridge */ n2 t(D d) {
            return (n2) super.get(d);
        }

        public /* bridge */ n2 u(D d, n2 n2Var) {
            return (n2) super/*java.util.AbstractMap*/.getOrDefault(d, n2Var);
        }

        public /* bridge */ n2 v(D d) {
            return (n2) super.remove(d);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final m a() {
            return m.w();
        }

        public b() {
        }
    }

    static {
        g0.t a2 = g0.t.e.a();
        kotlin.jvm.internal.t.e(a2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        i = new m(a2, 0);
    }

    public m(g0.t tVar, int i2) {
        super(tVar, i2);
    }

    public static final /* synthetic */ m w() {
        return i;
    }

    public /* bridge */ n2 A(D d) {
        return (n2) super.get(d);
    }

    public /* bridge */ n2 B(D d, n2 n2Var) {
        return (n2) super.getOrDefault(d, n2Var);
    }

    public Object a(D d) {
        return J.b(this, d);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof D) {
            return y((D) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof n2) {
            return z((n2) obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof D) {
            return A((D) obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof D) ? obj2 : B((D) obj, (n2) obj2);
    }

    public U0 i(D d, n2 n2Var) {
        t.b P = s().P(d.hashCode(), d, n2Var, 0);
        return P == null ? this : new m(P.a(), size() + P.b());
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a p() {
        return new a(this);
    }

    public /* bridge */ boolean y(D d) {
        return super.containsKey(d);
    }

    public /* bridge */ boolean z(n2 n2Var) {
        return super.containsValue(n2Var);
    }
}
