package J8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class m {
    public static final G8.p A;
    public static final G8.p B;
    public static final G8.q C;
    public static final G8.p D;
    public static final G8.q E;
    public static final G8.p F;
    public static final G8.q G;
    public static final G8.p H;
    public static final G8.q I;
    public static final G8.p J;
    public static final G8.q K;
    public static final G8.p L;
    public static final G8.q M;
    public static final G8.p N;
    public static final G8.q O;
    public static final G8.p P;
    public static final G8.q Q;
    public static final G8.p R;
    public static final G8.q S;
    public static final G8.p T;
    public static final G8.q U;
    public static final G8.p V;
    public static final G8.q W;
    public static final G8.q X;
    public static final G8.p a;
    public static final G8.q b;
    public static final G8.p c;
    public static final G8.q d;
    public static final G8.p e;
    public static final G8.p f;
    public static final G8.q g;
    public static final G8.p h;
    public static final G8.q i;
    public static final G8.p j;
    public static final G8.q k;
    public static final G8.p l;
    public static final G8.q m;
    public static final G8.p n;
    public static final G8.q o;
    public static final G8.p p;
    public static final G8.q q;
    public static final G8.p r;
    public static final G8.q s;
    public static final G8.p t;
    public static final G8.p u;
    public static final G8.p v;
    public static final G8.p w;
    public static final G8.q x;
    public static final G8.p y;
    public static final G8.p z;

    public class A extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Boolean bool) {
            aVar.M(bool);
        }
    }

    public class B extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Boolean bool) {
            aVar.O(bool == null ? "null" : bool.toString());
        }
    }

    public class C extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Number number) {
            if (number == null) {
                aVar.u();
            } else {
                aVar.L(number.byteValue());
            }
        }
    }

    public class D extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Number number) {
            if (number == null) {
                aVar.u();
            } else {
                aVar.L(number.shortValue());
            }
        }
    }

    public class E extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Number number) {
            if (number == null) {
                aVar.u();
            } else {
                aVar.L(number.intValue());
            }
        }
    }

    public class F extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, AtomicInteger atomicInteger) {
            aVar.L(atomicInteger.get());
        }
    }

    public class G extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, AtomicBoolean atomicBoolean) {
            aVar.P(atomicBoolean.get());
        }
    }

    public static final class H extends G8.p {
        public final Map a = new HashMap();
        public final Map b = new HashMap();
        public final Map c = new HashMap();

        public class a implements PrivilegedAction {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public H(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get((Object) null);
                    String name = r4.name();
                    String str = r4.toString();
                    H8.c cVar = (H8.c) field.getAnnotation(H8.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str2 : cVar.alternate()) {
                            this.a.put(str2, r4);
                        }
                    }
                    this.a.put(name, r4);
                    this.b.put(str, r4);
                    this.c.put(r4, name);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Enum r3) {
            aVar.O(r3 == null ? null : (String) this.c.get(r3));
        }
    }

    public class a extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, AtomicIntegerArray atomicIntegerArray) {
            aVar.c();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                aVar.L(atomicIntegerArray.get(i));
            }
            aVar.g();
        }
    }

    public class b extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Number number) {
            if (number == null) {
                aVar.u();
            } else {
                aVar.L(number.longValue());
            }
        }
    }

    public class c extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Number number) {
            if (number == null) {
                aVar.u();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            aVar.N(number);
        }
    }

    public class d extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Number number) {
            if (number == null) {
                aVar.u();
            } else {
                aVar.J(number.doubleValue());
            }
        }
    }

    public class e extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Character ch) {
            aVar.O(ch == null ? null : String.valueOf(ch));
        }
    }

    public class f extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, String str) {
            aVar.O(str);
        }
    }

    public class g extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, BigDecimal bigDecimal) {
            aVar.N(bigDecimal);
        }
    }

    public class h extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, BigInteger bigInteger) {
            aVar.N(bigInteger);
        }
    }

    public class i extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, I8.f fVar) {
            aVar.N(fVar);
        }
    }

    public class j extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, StringBuilder sb) {
            aVar.O(sb == null ? null : sb.toString());
        }
    }

    public class k extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public class l extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, StringBuffer stringBuffer) {
            aVar.O(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class m extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, URL url) {
            aVar.O(url == null ? null : url.toExternalForm());
        }
    }

    public class n extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, URI uri) {
            aVar.O(uri == null ? null : uri.toASCIIString());
        }
    }

    public class o extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, InetAddress inetAddress) {
            aVar.O(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class p extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, UUID uuid) {
            aVar.O(uuid == null ? null : uuid.toString());
        }
    }

    public class q extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Currency currency) {
            aVar.O(currency.getCurrencyCode());
        }
    }

    public class r extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Calendar calendar) {
            if (calendar == null) {
                aVar.u();
                return;
            }
            aVar.d();
            aVar.s("year");
            aVar.L(calendar.get(1));
            aVar.s("month");
            aVar.L(calendar.get(2));
            aVar.s("dayOfMonth");
            aVar.L(calendar.get(5));
            aVar.s("hourOfDay");
            aVar.L(calendar.get(11));
            aVar.s("minute");
            aVar.L(calendar.get(12));
            aVar.s("second");
            aVar.L(calendar.get(13));
            aVar.h();
        }
    }

    public class s extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Locale locale) {
            aVar.O(locale == null ? null : locale.toString());
        }
    }

    public class t extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, G8.f fVar) {
            if (fVar == null || fVar.f()) {
                aVar.u();
                return;
            }
            if (fVar.h()) {
                G8.k c = fVar.c();
                if (c.n()) {
                    aVar.N(c.j());
                    return;
                } else if (c.l()) {
                    aVar.P(c.i());
                    return;
                } else {
                    aVar.O(c.k());
                    return;
                }
            }
            if (fVar.e()) {
                aVar.c();
                Iterator it = fVar.a().iterator();
                while (it.hasNext()) {
                    c(aVar, (G8.f) it.next());
                }
                aVar.g();
                return;
            }
            if (!fVar.g()) {
                throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
            }
            aVar.d();
            for (Map.Entry entry : fVar.b().j()) {
                aVar.s((String) entry.getKey());
                c(aVar, (G8.f) entry.getValue());
            }
            aVar.h();
        }
    }

    public class u implements G8.q {
        public G8.p a(G8.d dVar, N8.a aVar) {
            Class c = aVar.c();
            if (!Enum.class.isAssignableFrom(c) || c == Enum.class) {
                return null;
            }
            if (!c.isEnum()) {
                c = c.getSuperclass();
            }
            return new H(c);
        }
    }

    public class v extends G8.p {
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, BitSet bitSet) {
            aVar.c();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                aVar.L(bitSet.get(i) ? 1L : 0L);
            }
            aVar.g();
        }
    }

    public class w implements G8.q {
        public final /* synthetic */ Class a;
        public final /* synthetic */ G8.p b;

        public w(Class cls, G8.p pVar) {
            this.a = cls;
            this.b = pVar;
        }

        public G8.p a(G8.d dVar, N8.a aVar) {
            if (aVar.c() == this.a) {
                return this.b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
        }
    }

    public class x implements G8.q {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Class b;
        public final /* synthetic */ G8.p c;

        public x(Class cls, Class cls2, G8.p pVar) {
            this.a = cls;
            this.b = cls2;
            this.c = pVar;
        }

        public G8.p a(G8.d dVar, N8.a aVar) {
            Class c = aVar.c();
            if (c == this.a || c == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
        }
    }

    public class y implements G8.q {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Class b;
        public final /* synthetic */ G8.p c;

        public y(Class cls, Class cls2, G8.p pVar) {
            this.a = cls;
            this.b = cls2;
            this.c = pVar;
        }

        public G8.p a(G8.d dVar, N8.a aVar) {
            Class c = aVar.c();
            if (c == this.a || c == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.a.getName() + "+" + this.b.getName() + ",adapter=" + this.c + "]";
        }
    }

    public class z implements G8.q {
        public final /* synthetic */ Class a;
        public final /* synthetic */ G8.p b;

        public class a extends G8.p {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            public void c(O8.a aVar, Object obj) {
                z.this.b.c(aVar, obj);
            }
        }

        public z(Class cls, G8.p pVar) {
            this.a = cls;
            this.b = pVar;
        }

        public G8.p a(G8.d dVar, N8.a aVar) {
            Class c = aVar.c();
            if (this.a.isAssignableFrom(c)) {
                return new a(c);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
        }
    }

    static {
        G8.p a2 = new k().a();
        a = a2;
        b = a(Class.class, a2);
        G8.p a3 = new v().a();
        c = a3;
        d = a(BitSet.class, a3);
        A a4 = new A();
        e = a4;
        f = new B();
        g = b(Boolean.TYPE, Boolean.class, a4);
        C c2 = new C();
        h = c2;
        i = b(Byte.TYPE, Byte.class, c2);
        D d2 = new D();
        j = d2;
        k = b(Short.TYPE, Short.class, d2);
        E e2 = new E();
        l = e2;
        m = b(Integer.TYPE, Integer.class, e2);
        G8.p a5 = new F().a();
        n = a5;
        o = a(AtomicInteger.class, a5);
        G8.p a6 = new G().a();
        p = a6;
        q = a(AtomicBoolean.class, a6);
        G8.p a7 = new a().a();
        r = a7;
        s = a(AtomicIntegerArray.class, a7);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = b(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new g();
        A = new h();
        B = new i();
        C = a(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = a(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = a(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = a(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = a(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = d(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = a(UUID.class, pVar);
        G8.p a8 = new q().a();
        P = a8;
        Q = a(Currency.class, a8);
        r rVar = new r();
        R = rVar;
        S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = a(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = d(G8.f.class, tVar);
        X = new u();
    }

    public static G8.q a(Class cls, G8.p pVar) {
        return new w(cls, pVar);
    }

    public static G8.q b(Class cls, Class cls2, G8.p pVar) {
        return new x(cls, cls2, pVar);
    }

    public static G8.q c(Class cls, Class cls2, G8.p pVar) {
        return new y(cls, cls2, pVar);
    }

    public static G8.q d(Class cls, G8.p pVar) {
        return new z(cls, pVar);
    }
}
