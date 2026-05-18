package androidx.datastore.preferences.protobuf;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k0 {
    public static final Unsafe a = A();
    public static final Class b = androidx.datastore.preferences.protobuf.d.b();
    public static final boolean c = m(Long.TYPE);
    public static final boolean d = m(Integer.TYPE);
    public static final e e = y();
    public static final boolean f = Q();
    public static final boolean g = P();
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final int v;
    public static final boolean w;

    public class a implements PrivilegedExceptionAction {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (AccessibleObject accessibleObject : Unsafe.class.getDeclaredFields()) {
                accessibleObject.setAccessible(true);
                Object obj = accessibleObject.get((Object) null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            return k0.w ? k0.e(obj, j) : k0.f(obj, j);
        }

        public double d(Object obj, long j) {
            return Double.longBitsToDouble(g(obj, j));
        }

        public float e(Object obj, long j) {
            return Float.intBitsToFloat(f(obj, j));
        }

        public void j(Object obj, long j, boolean z) {
            if (k0.w) {
                k0.g(obj, j, z);
            } else {
                k0.h(obj, j, z);
            }
        }

        public void k(Object obj, long j, byte b) {
            if (k0.w) {
                k0.c(obj, j, b);
            } else {
                k0.d(obj, j, b);
            }
        }

        public void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        public void m(Object obj, long j, float f) {
            n(obj, j, Float.floatToIntBits(f));
        }

        public boolean r() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            return k0.w ? k0.e(obj, j) : k0.f(obj, j);
        }

        public double d(Object obj, long j) {
            return Double.longBitsToDouble(g(obj, j));
        }

        public float e(Object obj, long j) {
            return Float.intBitsToFloat(f(obj, j));
        }

        public void j(Object obj, long j, boolean z) {
            if (k0.w) {
                k0.g(obj, j, z);
            } else {
                k0.h(obj, j, z);
            }
        }

        public void k(Object obj, long j, byte b) {
            if (k0.w) {
                k0.c(obj, j, b);
            } else {
                k0.d(obj, j, b);
            }
        }

        public void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        public void m(Object obj, long j, float f) {
            n(obj, j, Float.floatToIntBits(f));
        }

        public boolean r() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        public double d(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        public float e(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        public void j(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        public void k(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        public void l(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        public void m(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class cls = this.a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", new Class[]{Object.class, cls2});
                cls.getMethod("putByte", new Class[]{Object.class, cls2, Byte.TYPE});
                cls.getMethod("getBoolean", new Class[]{Object.class, cls2});
                cls.getMethod("putBoolean", new Class[]{Object.class, cls2, Boolean.TYPE});
                cls.getMethod("getFloat", new Class[]{Object.class, cls2});
                cls.getMethod("putFloat", new Class[]{Object.class, cls2, Float.TYPE});
                cls.getMethod("getDouble", new Class[]{Object.class, cls2});
                cls.getMethod("putDouble", new Class[]{Object.class, cls2, Double.TYPE});
                return true;
            } catch (Throwable th) {
                k0.a(th);
                return false;
            }
        }

        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class cls = this.a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", new Class[]{cls2});
                cls.getMethod("putByte", new Class[]{cls2, Byte.TYPE});
                cls.getMethod("getInt", new Class[]{cls2});
                cls.getMethod("putInt", new Class[]{cls2, Integer.TYPE});
                cls.getMethod("getLong", new Class[]{cls2});
                cls.getMethod("putLong", new Class[]{cls2, cls2});
                cls.getMethod("copyMemory", new Class[]{cls2, cls2, cls2});
                cls.getMethod("copyMemory", new Class[]{Object.class, cls2, Object.class, cls2, cls2});
                return true;
            } catch (Throwable th) {
                k0.a(th);
                return false;
            }
        }
    }

    public static abstract class e {
        public Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract double d(Object obj, long j);

        public abstract float e(Object obj, long j);

        public final int f(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long g(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object h(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public final long i(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j, boolean z);

        public abstract void k(Object obj, long j, byte b);

        public abstract void l(Object obj, long j, double d);

        public abstract void m(Object obj, long j, float f);

        public final void n(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void o(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void p(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", new Class[]{Object.class, cls2});
                cls.getMethod("putInt", new Class[]{Object.class, cls2, Integer.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, cls2});
                cls.getMethod("putLong", new Class[]{Object.class, cls2, cls2});
                cls.getMethod("getObject", new Class[]{Object.class, cls2});
                cls.getMethod("putObject", new Class[]{Object.class, cls2, Object.class});
                return true;
            } catch (Throwable th) {
                k0.a(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return k0.b() != null;
            } catch (Throwable th) {
                k0.a(th);
                return false;
            }
        }
    }

    static {
        long j2 = j(byte[].class);
        h = j2;
        i = j(boolean[].class);
        j = k(boolean[].class);
        k = j(int[].class);
        l = k(int[].class);
        m = j(long[].class);
        n = k(long[].class);
        o = j(float[].class);
        p = k(float[].class);
        q = j(double[].class);
        r = k(double[].class);
        s = j(Object[].class);
        t = k(Object[].class);
        u = o(l());
        v = (int) (j2 & 7);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean B() {
        return g;
    }

    public static boolean C() {
        return f;
    }

    public static void D(Throwable th) {
        Logger.getLogger(k0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void E(Object obj, long j2, boolean z) {
        e.j(obj, j2, z);
    }

    public static void F(Object obj, long j2, boolean z) {
        I(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j2, boolean z) {
        J(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j2, byte b2) {
        e.k(bArr, h + j2, b2);
    }

    public static void I(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int w2 = w(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (w2 & (~(255 << i2))));
    }

    public static void J(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (w(obj, j3) & (~(255 << i2))));
    }

    public static void K(Object obj, long j2, double d2) {
        e.l(obj, j2, d2);
    }

    public static void L(Object obj, long j2, float f2) {
        e.m(obj, j2, f2);
    }

    public static void M(Object obj, long j2, int i2) {
        e.n(obj, j2, i2);
    }

    public static void N(Object obj, long j2, long j3) {
        e.o(obj, j2, j3);
    }

    public static void O(Object obj, long j2, Object obj2) {
        e.p(obj, j2, obj2);
    }

    public static boolean P() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    public static boolean Q() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static /* synthetic */ void a(Throwable th) {
        D(th);
    }

    public static /* synthetic */ Field b() {
        return l();
    }

    public static /* synthetic */ void c(Object obj, long j2, byte b2) {
        I(obj, j2, b2);
    }

    public static /* synthetic */ void d(Object obj, long j2, byte b2) {
        J(obj, j2, b2);
    }

    public static /* synthetic */ boolean e(Object obj, long j2) {
        return q(obj, j2);
    }

    public static /* synthetic */ boolean f(Object obj, long j2) {
        return r(obj, j2);
    }

    public static /* synthetic */ void g(Object obj, long j2, boolean z) {
        F(obj, j2, z);
    }

    public static /* synthetic */ void h(Object obj, long j2, boolean z) {
        G(obj, j2, z);
    }

    public static Object i(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int j(Class cls) {
        if (g) {
            return e.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (g) {
            return e.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field n2;
        if (androidx.datastore.preferences.protobuf.d.c() && (n2 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n2;
        }
        Field n3 = n(Buffer.class, "address");
        if (n3 == null || n3.getType() != Long.TYPE) {
            return null;
        }
        return n3;
    }

    public static boolean m(Class cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", new Class[]{cls, cls3});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls3});
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", new Class[]{cls, cls4, cls3});
            cls2.getMethod("peekInt", new Class[]{cls, cls3});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, cls4, cls4});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, cls4, cls4});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    public static boolean p(Object obj, long j2) {
        return e.c(obj, j2);
    }

    public static boolean q(Object obj, long j2) {
        return s(obj, j2) != 0;
    }

    public static boolean r(Object obj, long j2) {
        return t(obj, j2) != 0;
    }

    public static byte s(Object obj, long j2) {
        return (byte) ((w(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte t(Object obj, long j2) {
        return (byte) ((w(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double u(Object obj, long j2) {
        return e.d(obj, j2);
    }

    public static float v(Object obj, long j2) {
        return e.e(obj, j2);
    }

    public static int w(Object obj, long j2) {
        return e.f(obj, j2);
    }

    public static long x(Object obj, long j2) {
        return e.g(obj, j2);
    }

    public static e y() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (c) {
            return new c(unsafe);
        }
        if (d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object z(Object obj, long j2) {
        return e.h(obj, j2);
    }
}
