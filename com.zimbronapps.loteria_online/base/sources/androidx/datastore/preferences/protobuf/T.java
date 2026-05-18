package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class t extends androidx.datastore.preferences.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected i0 unknownFields = i0.c();

    public static abstract class a extends a.a {
        public final t a;
        public t b;

        public a(t tVar) {
            this.a = tVar;
            if (tVar.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.b = l();
        }

        public static void k(Object obj, Object obj2) {
            W.a().d(obj).a(obj, obj2);
        }

        private t l() {
            return this.a.E();
        }

        public final t e() {
            t buildPartial = buildPartial();
            if (buildPartial.w()) {
                return buildPartial;
            }
            throw a.a.d(buildPartial);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t buildPartial() {
            if (!this.b.y()) {
                return this.b;
            }
            this.b.z();
            return this.b;
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.b = buildPartial();
            return newBuilderForType;
        }

        public final void h() {
            if (this.b.y()) {
                return;
            }
            i();
        }

        public void i() {
            t l = l();
            k(l, this.b);
            this.b = l;
        }

        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public t getDefaultInstanceForType() {
            return this.a;
        }
    }

    public static class b extends androidx.datastore.preferences.protobuf.b {
        public final t b;

        public b(t tVar) {
            this.b = tVar;
        }
    }

    public static class c extends k {
    }

    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static u.b B(u.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object D(K k, String str, Object[] objArr) {
        return new Y(k, str, objArr);
    }

    public static t F(t tVar, InputStream inputStream) {
        return g(G(tVar, g.g(inputStream), m.b()));
    }

    public static t G(t tVar, g gVar, m mVar) {
        t E = tVar.E();
        try {
            a0 d2 = W.a().d(E);
            d2.e(E, h.O(gVar), mVar);
            d2.b(E);
            return E;
        } catch (IOException e) {
            if (e.getCause() instanceof v) {
                throw e.getCause();
            }
            throw new v(e).k(E);
        } catch (g0 e2) {
            throw e2.a().k(E);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof v) {
                throw e3.getCause();
            }
            throw e3;
        } catch (v e4) {
            e = e4;
            if (e.a()) {
                e = new v(e);
            }
            throw e.k(E);
        }
    }

    public static void H(Class cls, t tVar) {
        tVar.A();
        defaultInstanceMap.put(cls, tVar);
    }

    public static t g(t tVar) {
        if (tVar == null || tVar.w()) {
            return tVar;
        }
        throw tVar.d().a().k(tVar);
    }

    public static u.b p() {
        return X.c();
    }

    public static t q(Class cls) {
        t tVar = (t) defaultInstanceMap.get(cls);
        if (tVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                tVar = (t) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (tVar == null) {
            tVar = ((t) k0.i(cls)).getDefaultInstanceForType();
            if (tVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, tVar);
        }
        return tVar;
    }

    public static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            Error cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        }
    }

    public static final boolean x(t tVar, boolean z) {
        byte byteValue = ((Byte) tVar.m(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = W.a().d(tVar).c(tVar);
        if (z) {
            tVar.n(d.SET_MEMOIZED_IS_INITIALIZED, c2 ? tVar : null);
        }
        return c2;
    }

    public void A() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) m(d.NEW_BUILDER);
    }

    public t E() {
        return (t) m(d.NEW_MUTABLE_INSTANCE);
    }

    public void I(int i) {
        this.memoizedHashCode = i;
    }

    public void J(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public void a(i iVar) {
        W.a().d(this).f(this, j.P(iVar));
    }

    public int c(a0 a0Var) {
        if (!y()) {
            if (t() != Integer.MAX_VALUE) {
                return t();
            }
            int k = k(a0Var);
            J(k);
            return k;
        }
        int k2 = k(a0Var);
        if (k2 >= 0) {
            return k2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + k2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return W.a().d(this).equals(this, (t) obj);
        }
        return false;
    }

    public Object f() {
        return m(d.BUILD_MESSAGE_INFO);
    }

    public int getSerializedSize() {
        return c(null);
    }

    public void h() {
        this.memoizedHashCode = 0;
    }

    public int hashCode() {
        if (y()) {
            return j();
        }
        if (u()) {
            I(j());
        }
        return s();
    }

    public void i() {
        J(Integer.MAX_VALUE);
    }

    public int j() {
        return W.a().d(this).hashCode(this);
    }

    public final int k(a0 a0Var) {
        return a0Var == null ? W.a().d(this).d(this) : a0Var.d(this);
    }

    public final a l() {
        return (a) m(d.NEW_BUILDER);
    }

    public Object m(d dVar) {
        return o(dVar, null, null);
    }

    public Object n(d dVar, Object obj) {
        return o(dVar, obj, null);
    }

    public abstract Object o(d dVar, Object obj, Object obj2);

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final t getDefaultInstanceForType() {
        return (t) m(d.GET_DEFAULT_INSTANCE);
    }

    public int s() {
        return this.memoizedHashCode;
    }

    public int t() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public String toString() {
        return M.f(this, super.toString());
    }

    public boolean u() {
        return s() == 0;
    }

    public final boolean w() {
        return x(this, true);
    }

    public boolean y() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void z() {
        W.a().d(this).b(this);
        A();
    }
}
