package ja;

import android.util.Log;
import da.a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c0 {

    public static final class A {
        public B a;
        public r b;
        public s c;

        public static final class a {
            public B a;
            public r b;
            public s c;

            public A a() {
                A a = new A();
                a.d(this.a);
                a.b(this.b);
                a.c(this.c);
                return a;
            }

            public a b(r rVar) {
                this.b = rVar;
                return this;
            }

            public a c(s sVar) {
                this.c = sVar;
                return this;
            }

            public a d(B b) {
                this.a = b;
                return this;
            }
        }

        public static A a(ArrayList arrayList) {
            A a2 = new A();
            a2.d((B) arrayList.get(0));
            a2.b((r) arrayList.get(1));
            a2.c((s) arrayList.get(2));
            return a2;
        }

        public void b(r rVar) {
            this.b = rVar;
        }

        public void c(s sVar) {
            this.c = sVar;
        }

        public void d(B b) {
            this.a = b;
        }

        public ArrayList e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            return arrayList;
        }
    }

    public static final class B {
        public C a;
        public List b;

        public static final class a {
            public C a;
            public List b;

            public B a() {
                B b = new B();
                b.e(this.a);
                b.d(this.b);
                return b;
            }

            public a b(List list) {
                this.b = list;
                return this;
            }

            public a c(C c) {
                this.a = c;
                return this;
            }
        }

        public static B a(ArrayList arrayList) {
            B b = new B();
            b.e((C) arrayList.get(0));
            b.d((List) arrayList.get(1));
            return b;
        }

        public List b() {
            return this.b;
        }

        public C c() {
            return this.a;
        }

        public void d(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"providerData\" is null.");
            }
            this.b = list;
        }

        public void e(C c) {
            if (c == null) {
                throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
            }
            this.a = c;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.a);
            arrayList.add(this.b);
            return arrayList;
        }
    }

    public static final class C {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public Boolean f;
        public Boolean g;
        public String h;
        public String i;
        public String j;
        public Long k;
        public Long l;

        public static final class a {
            public String a;
            public String b;
            public String c;
            public String d;
            public String e;
            public Boolean f;
            public Boolean g;
            public String h;
            public String i;
            public String j;
            public Long k;
            public Long l;

            public C a() {
                C c = new C();
                c.m(this.a);
                c.d(this.b);
                c.c(this.c);
                c.i(this.d);
                c.h(this.e);
                c.e(this.f);
                c.f(this.g);
                c.j(this.h);
                c.l(this.i);
                c.k(this.j);
                c.b(this.k);
                c.g(this.l);
                return c;
            }

            public a b(Long l) {
                this.k = l;
                return this;
            }

            public a c(String str) {
                this.c = str;
                return this;
            }

            public a d(String str) {
                this.b = str;
                return this;
            }

            public a e(Boolean bool) {
                this.f = bool;
                return this;
            }

            public a f(Boolean bool) {
                this.g = bool;
                return this;
            }

            public a g(Long l) {
                this.l = l;
                return this;
            }

            public a h(String str) {
                this.e = str;
                return this;
            }

            public a i(String str) {
                this.d = str;
                return this;
            }

            public a j(String str) {
                this.i = str;
                return this;
            }

            public a k(String str) {
                this.a = str;
                return this;
            }
        }

        public static C a(ArrayList arrayList) {
            Long valueOf;
            C c = new C();
            c.m((String) arrayList.get(0));
            c.d((String) arrayList.get(1));
            c.c((String) arrayList.get(2));
            c.i((String) arrayList.get(3));
            c.h((String) arrayList.get(4));
            c.e((Boolean) arrayList.get(5));
            c.f((Boolean) arrayList.get(6));
            c.j((String) arrayList.get(7));
            c.l((String) arrayList.get(8));
            c.k((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            c.b(valueOf);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                l = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            c.g(l);
            return c;
        }

        public void b(Long l) {
            this.k = l;
        }

        public void c(String str) {
            this.c = str;
        }

        public void d(String str) {
            this.b = str;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
            }
            this.f = bool;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
            }
            this.g = bool;
        }

        public void g(Long l) {
            this.l = l;
        }

        public void h(String str) {
            this.e = str;
        }

        public void i(String str) {
            this.d = str;
        }

        public void j(String str) {
            this.h = str;
        }

        public void k(String str) {
            this.j = str;
        }

        public void l(String str) {
            this.i = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.a = str;
        }

        public ArrayList n() {
            ArrayList arrayList = new ArrayList(12);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            arrayList.add(this.f);
            arrayList.add(this.g);
            arrayList.add(this.h);
            arrayList.add(this.i);
            arrayList.add(this.j);
            arrayList.add(this.k);
            arrayList.add(this.l);
            return arrayList;
        }
    }

    public static final class D {
        public String a;
        public String b;
        public Boolean c;
        public Boolean d;

        public static D a(ArrayList arrayList) {
            D d = new D();
            d.f((String) arrayList.get(0));
            d.h((String) arrayList.get(1));
            d.g((Boolean) arrayList.get(2));
            d.i((Boolean) arrayList.get(3));
            return d;
        }

        public String b() {
            return this.a;
        }

        public Boolean c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        public Boolean e() {
            return this.d;
        }

        public void f(String str) {
            this.a = str;
        }

        public void g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
            }
            this.c = bool;
        }

        public void h(String str) {
            this.b = str;
        }

        public void i(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
            }
            this.d = bool;
        }

        public ArrayList j() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            return arrayList;
        }
    }

    public static final class E {
        public String a;
        public Long b;
        public Long c;
        public String d;
        public String e;
        public String f;

        public static E a(ArrayList arrayList) {
            Long valueOf;
            E e = new E();
            e.l((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e.m(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                l = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            e.i(l);
            e.h((String) arrayList.get(3));
            e.j((String) arrayList.get(4));
            e.k((String) arrayList.get(5));
            return e;
        }

        public String b() {
            return this.d;
        }

        public Long c() {
            return this.c;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.f;
        }

        public String f() {
            return this.a;
        }

        public Long g() {
            return this.b;
        }

        public void h(String str) {
            this.d = str;
        }

        public void i(Long l) {
            this.c = l;
        }

        public void j(String str) {
            this.e = str;
        }

        public void k(String str) {
            this.f = str;
        }

        public void l(String str) {
            this.a = str;
        }

        public void m(Long l) {
            if (l == null) {
                throw new IllegalStateException("Nonnull field \"timeout\" is null.");
            }
            this.b = l;
        }

        public ArrayList n() {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            arrayList.add(this.f);
            return arrayList;
        }
    }

    public interface F {
        void a(Object obj);

        void b(Throwable th);
    }

    public interface G {
        void a();

        void b(Throwable th);
    }

    public enum a {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);

        public final int a;

        a(int i2) {
            this.a = i2;
        }
    }

    public static final class b {
        public String a;
        public String b;
        public String c;

        public static b a(ArrayList arrayList) {
            b bVar = new b();
            bVar.e((String) arrayList.get(0));
            bVar.g((String) arrayList.get(1));
            bVar.f((String) arrayList.get(2));
            return bVar;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.a = str;
        }

        public void f(String str) {
            this.c = str;
        }

        public void g(String str) {
            this.b = str;
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            return arrayList;
        }
    }

    public interface c {

        public class a implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class b implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public b(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class c implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public c(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class d implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public d(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class e implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public e(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class f implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public f(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(List list) {
                this.a.add(0, list);
                this.b.a(this.a);
            }
        }

        public class g implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public g(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class h implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public h(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class i implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public i(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        public class j implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public j(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class k implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public k(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        public class l implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public l(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        public class m implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public m(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        public class n implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public n(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class o implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public o(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class p implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public p(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        public class q implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public q(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class r implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public r(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class s implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public s(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(o oVar) {
                this.a.add(0, oVar);
                this.b.a(this.a);
            }
        }

        public class t implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public t(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class u implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public u(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class v implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public v(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class w implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public w(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        static /* synthetic */ void A(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.w((b) arrayList.get(0), (t) arrayList.get(1), new j(new ArrayList(), eVar));
        }

        static /* synthetic */ void B(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.s0((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new t(new ArrayList(), eVar));
        }

        static /* synthetic */ void C(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.p((b) arrayList.get(0), (String) arrayList.get(1), new i(new ArrayList(), eVar));
        }

        static /* synthetic */ void D(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.d((b) arrayList.get(0), (String) arrayList.get(1), new s(new ArrayList(), eVar));
        }

        static /* synthetic */ void F(c cVar, Object obj, a.e eVar) {
            c(cVar, obj, eVar);
        }

        static /* synthetic */ void G(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.o0((b) arrayList.get(0), (String) arrayList.get(1), (q) arrayList.get(2), new h(new ArrayList(), eVar));
        }

        static /* synthetic */ void H(c cVar, Object obj, a.e eVar) {
            A(cVar, obj, eVar);
        }

        static /* synthetic */ void K(c cVar, Object obj, a.e eVar) {
            e(cVar, obj, eVar);
        }

        static /* synthetic */ void L(c cVar, Object obj, a.e eVar) {
            cVar.i((b) ((ArrayList) obj).get(0), new v(new ArrayList(), eVar));
        }

        static /* synthetic */ void M(c cVar, Object obj, a.e eVar) {
            s(cVar, obj, eVar);
        }

        static /* synthetic */ void O(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.I((b) arrayList.get(0), (String) arrayList.get(1), (q) arrayList.get(2), new g(new ArrayList(), eVar));
        }

        static /* synthetic */ void P(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.f0((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new u(new ArrayList(), eVar));
        }

        static /* synthetic */ void Q(c cVar, Object obj, a.e eVar) {
            m0(cVar, obj, eVar);
        }

        static /* synthetic */ void R(c cVar, Object obj, a.e eVar) {
            S(cVar, obj, eVar);
        }

        static /* synthetic */ void S(c cVar, Object obj, a.e eVar) {
            cVar.h0((b) ((ArrayList) obj).get(0), new p(new ArrayList(), eVar));
        }

        static /* synthetic */ void T(c cVar, Object obj, a.e eVar) {
            b0(cVar, obj, eVar);
        }

        static /* synthetic */ void U(c cVar, Object obj, a.e eVar) {
            z(cVar, obj, eVar);
        }

        static /* synthetic */ void V(c cVar, Object obj, a.e eVar) {
            cVar.q((b) ((ArrayList) obj).get(0), new k(new ArrayList(), eVar));
        }

        static /* synthetic */ void X(c cVar, Object obj, a.e eVar) {
            L(cVar, obj, eVar);
        }

        static /* synthetic */ void Y(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.W((b) arrayList.get(0), (String) arrayList.get(1), new r(new ArrayList(), eVar));
        }

        static /* synthetic */ void Z(c cVar, Object obj, a.e eVar) {
            j(cVar, obj, eVar);
        }

        static da.h a() {
            return d.d;
        }

        static void a0(da.b bVar, String str, c cVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener" + str2, a());
            if (cVar != null) {
                aVar.e(new d0(cVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener" + str2, a());
            if (cVar != null) {
                aVar2.e(new f0(cVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator" + str2, a());
            if (cVar != null) {
                aVar3.e(new j0(cVar));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode" + str2, a());
            if (cVar != null) {
                aVar4.e(new k0(cVar));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode" + str2, a());
            if (cVar != null) {
                aVar5.e(new l0(cVar));
            } else {
                aVar5.e(null);
            }
            da.a aVar6 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset" + str2, a());
            if (cVar != null) {
                aVar6.e(new m0(cVar));
            } else {
                aVar6.e(null);
            }
            da.a aVar7 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword" + str2, a());
            if (cVar != null) {
                aVar7.e(new n0(cVar));
            } else {
                aVar7.e(null);
            }
            da.a aVar8 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously" + str2, a());
            if (cVar != null) {
                aVar8.e(new p0(cVar));
            } else {
                aVar8.e(null);
            }
            da.a aVar9 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential" + str2, a());
            if (cVar != null) {
                aVar9.e(new q0(cVar));
            } else {
                aVar9.e(null);
            }
            da.a aVar10 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken" + str2, a());
            if (cVar != null) {
                aVar10.e(new r0(cVar));
            } else {
                aVar10.e(null);
            }
            da.a aVar11 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword" + str2, a());
            if (cVar != null) {
                aVar11.e(new o0(cVar));
            } else {
                aVar11.e(null);
            }
            da.a aVar12 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink" + str2, a());
            if (cVar != null) {
                aVar12.e(new s0(cVar));
            } else {
                aVar12.e(null);
            }
            da.a aVar13 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider" + str2, a());
            if (cVar != null) {
                aVar13.e(new t0(cVar));
            } else {
                aVar13.e(null);
            }
            da.a aVar14 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut" + str2, a());
            if (cVar != null) {
                aVar14.e(new u0(cVar));
            } else {
                aVar14.e(null);
            }
            da.a aVar15 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail" + str2, a());
            if (cVar != null) {
                aVar15.e(new v0(cVar));
            } else {
                aVar15.e(null);
            }
            da.a aVar16 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail" + str2, a());
            if (cVar != null) {
                aVar16.e(new w0(cVar));
            } else {
                aVar16.e(null);
            }
            da.a aVar17 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail" + str2, a());
            if (cVar != null) {
                aVar17.e(new x0(cVar));
            } else {
                aVar17.e(null);
            }
            da.a aVar18 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode" + str2, a());
            if (cVar != null) {
                aVar18.e(new y0(cVar));
            } else {
                aVar18.e(null);
            }
            da.a aVar19 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings" + str2, a());
            if (cVar != null) {
                aVar19.e(new z0(cVar));
            } else {
                aVar19.e(null);
            }
            da.a aVar20 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode" + str2, a());
            if (cVar != null) {
                aVar20.e(new e0(cVar));
            } else {
                aVar20.e(null);
            }
            da.a aVar21 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber" + str2, a());
            if (cVar != null) {
                aVar21.e(new g0(cVar));
            } else {
                aVar21.e(null);
            }
            da.a aVar22 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode" + str2, a());
            if (cVar != null) {
                aVar22.e(new h0(cVar));
            } else {
                aVar22.e(null);
            }
            da.a aVar23 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.initializeRecaptchaConfig" + str2, a());
            if (cVar != null) {
                aVar23.e(new i0(cVar));
            } else {
                aVar23.e(null);
            }
        }

        static /* synthetic */ void b(c cVar, Object obj, a.e eVar) {
            C(cVar, obj, eVar);
        }

        static /* synthetic */ void b0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.N((b) arrayList.get(0), (String) arrayList.get(1), new l(new ArrayList(), eVar));
        }

        static /* synthetic */ void c(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.n0((b) arrayList.get(0), (String) arrayList.get(1), new a(new ArrayList(), eVar));
        }

        static /* synthetic */ void c0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            b bVar = (b) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Number number = (Number) arrayList2.get(2);
            cVar.d0(bVar, str, number == null ? null : Long.valueOf(number.longValue()), new q(arrayList, eVar));
        }

        static /* synthetic */ void e(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.t((b) arrayList.get(0), (String) arrayList.get(1), new f(new ArrayList(), eVar));
        }

        static /* synthetic */ void e0(c cVar, Object obj, a.e eVar) {
            k(cVar, obj, eVar);
        }

        static /* synthetic */ void f(c cVar, Object obj, a.e eVar) {
            V(cVar, obj, eVar);
        }

        static /* synthetic */ void i0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.E((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new b(new ArrayList(), eVar));
        }

        static /* synthetic */ void j(c cVar, Object obj, a.e eVar) {
            cVar.g((b) ((ArrayList) obj).get(0), new e(new ArrayList(), eVar));
        }

        static /* synthetic */ void k(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.j0((b) arrayList.get(0), (Map) arrayList.get(1), new w(new ArrayList(), eVar));
        }

        static /* synthetic */ void k0(c cVar, Object obj, a.e eVar) {
            q0(cVar, obj, eVar);
        }

        static /* synthetic */ void l(c cVar, Object obj, a.e eVar) {
            B(cVar, obj, eVar);
        }

        static /* synthetic */ void m0(c cVar, Object obj, a.e eVar) {
            cVar.l0((b) ((ArrayList) obj).get(0), new o(new ArrayList(), eVar));
        }

        static /* synthetic */ void n(c cVar, Object obj, a.e eVar) {
            t0(cVar, obj, eVar);
        }

        static void o(da.b bVar, c cVar) {
            a0(bVar, "", cVar);
        }

        static /* synthetic */ void p0(c cVar, Object obj, a.e eVar) {
            c0(cVar, obj, eVar);
        }

        static /* synthetic */ void q0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.J((b) arrayList.get(0), (String) arrayList.get(1), new n(new ArrayList(), eVar));
        }

        static /* synthetic */ void r(c cVar, Object obj, a.e eVar) {
            O(cVar, obj, eVar);
        }

        static /* synthetic */ void r0(c cVar, Object obj, a.e eVar) {
            i0(cVar, obj, eVar);
        }

        static /* synthetic */ void s(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.m((b) arrayList.get(0), (y) arrayList.get(1), new d(new ArrayList(), eVar));
        }

        static /* synthetic */ void t0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.g0((b) arrayList.get(0), (E) arrayList.get(1), new m(new ArrayList(), eVar));
        }

        static /* synthetic */ void u(c cVar, Object obj, a.e eVar) {
            P(cVar, obj, eVar);
        }

        static /* synthetic */ void v(c cVar, Object obj, a.e eVar) {
            D(cVar, obj, eVar);
        }

        static /* synthetic */ void x(c cVar, Object obj, a.e eVar) {
            Y(cVar, obj, eVar);
        }

        static /* synthetic */ void y(c cVar, Object obj, a.e eVar) {
            G(cVar, obj, eVar);
        }

        static /* synthetic */ void z(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.h((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new c(new ArrayList(), eVar));
        }

        void E(b bVar, String str, String str2, F f2);

        void I(b bVar, String str, q qVar, G g2);

        void J(b bVar, String str, G g2);

        void N(b bVar, String str, F f2);

        void W(b bVar, String str, G g2);

        void d(b bVar, String str, F f2);

        void d0(b bVar, String str, Long l2, G g2);

        void f0(b bVar, String str, String str2, F f2);

        void g(b bVar, G g2);

        void g0(b bVar, E e2, F f2);

        void h(b bVar, String str, String str2, F f2);

        void h0(b bVar, F f2);

        void i(b bVar, F f2);

        void j0(b bVar, Map map, F f2);

        void l0(b bVar, G g2);

        void m(b bVar, y yVar, F f2);

        void n0(b bVar, String str, F f2);

        void o0(b bVar, String str, q qVar, G g2);

        void p(b bVar, String str, F f2);

        void q(b bVar, F f2);

        void s0(b bVar, String str, String str2, G g2);

        void t(b bVar, String str, F f2);

        void w(b bVar, t tVar, G g2);
    }

    public static class d extends da.o {
        public static final d d = new d();

        public Object g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return A.a((ArrayList) f(byteBuffer));
                case -114:
                    return B.a((ArrayList) f(byteBuffer));
                case -113:
                    return C.a((ArrayList) f(byteBuffer));
                case -112:
                    return D.a((ArrayList) f(byteBuffer));
                case -111:
                    return E.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b, byteBuffer);
            }
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((b) obj).h());
                return;
            }
            if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((o) obj).d());
                return;
            }
            if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((p) obj).d());
                return;
            }
            if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((q) obj).r());
                return;
            }
            if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((r) obj).g());
                return;
            }
            if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((s) obj).f());
                return;
            }
            if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((t) obj).k());
                return;
            }
            if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                p(byteArrayOutputStream, ((u) obj).i());
                return;
            }
            if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                p(byteArrayOutputStream, ((v) obj).g());
                return;
            }
            if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                p(byteArrayOutputStream, ((w) obj).c());
                return;
            }
            if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                p(byteArrayOutputStream, ((x) obj).f());
                return;
            }
            if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                p(byteArrayOutputStream, ((y) obj).h());
                return;
            }
            if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                p(byteArrayOutputStream, ((z) obj).g());
                return;
            }
            if (obj instanceof A) {
                byteArrayOutputStream.write(141);
                p(byteArrayOutputStream, ((A) obj).e());
                return;
            }
            if (obj instanceof B) {
                byteArrayOutputStream.write(142);
                p(byteArrayOutputStream, ((B) obj).f());
                return;
            }
            if (obj instanceof C) {
                byteArrayOutputStream.write(143);
                p(byteArrayOutputStream, ((C) obj).n());
            } else if (obj instanceof D) {
                byteArrayOutputStream.write(144);
                p(byteArrayOutputStream, ((D) obj).j());
            } else if (!(obj instanceof E)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(145);
                p(byteArrayOutputStream, ((E) obj).n());
            }
        }
    }

    public interface e {

        public class a implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(B b) {
                this.a.add(0, b);
                this.b.a(this.a);
            }
        }

        public class b implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public b(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(B b) {
                this.a.add(0, b);
                this.b.a(this.a);
            }
        }

        public class c implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public c(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(B b) {
                this.a.add(0, b);
                this.b.a(this.a);
            }
        }

        public class d implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public d(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(B b) {
                this.a.add(0, b);
                this.b.a(this.a);
            }
        }

        public class e implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public e(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class f implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public f(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class g implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public g(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(u uVar) {
                this.a.add(0, uVar);
                this.b.a(this.a);
            }
        }

        public class h implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public h(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class i implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public i(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class j implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public j(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class k implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public k(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        public class l implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public l(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(B b) {
                this.a.add(0, b);
                this.b.a(this.a);
            }
        }

        public class m implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public m(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class n implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public n(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        static /* synthetic */ void A(e eVar, Object obj, a.e eVar2) {
            n(eVar, obj, eVar2);
        }

        static /* synthetic */ void B(e eVar, Object obj, a.e eVar2) {
            o(eVar, obj, eVar2);
        }

        static /* synthetic */ void C(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.H((b) arrayList.get(0), (Boolean) arrayList.get(1), new g(new ArrayList(), eVar2));
        }

        static /* synthetic */ void E(e eVar, Object obj, a.e eVar2) {
            e(eVar, obj, eVar2);
        }

        static /* synthetic */ void F(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.p((b) arrayList.get(0), (Map) arrayList.get(1), new h(new ArrayList(), eVar2));
        }

        static /* synthetic */ void G(e eVar, Object obj, a.e eVar2) {
            L(eVar, obj, eVar2);
        }

        static /* synthetic */ void I(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.x((b) arrayList.get(0), (q) arrayList.get(1), new m(new ArrayList(), eVar2));
        }

        static /* synthetic */ void K(e eVar, Object obj, a.e eVar2) {
            k(eVar, obj, eVar2);
        }

        static /* synthetic */ void L(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.J((b) arrayList.get(0), (String) arrayList.get(1), new n(new ArrayList(), eVar2));
        }

        static /* synthetic */ void M(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.s((b) arrayList.get(0), (String) arrayList.get(1), new a(new ArrayList(), eVar2));
        }

        static /* synthetic */ void N(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.w((b) arrayList.get(0), (y) arrayList.get(1), new k(new ArrayList(), eVar2));
        }

        static /* synthetic */ void P(e eVar, Object obj, a.e eVar2) {
            F(eVar, obj, eVar2);
        }

        static /* synthetic */ void Q(e eVar, Object obj, a.e eVar2) {
            C(eVar, obj, eVar2);
        }

        static /* synthetic */ void R(e eVar, Object obj, a.e eVar2) {
            S(eVar, obj, eVar2);
        }

        static /* synthetic */ void S(e eVar, Object obj, a.e eVar2) {
            eVar.b((b) ((ArrayList) obj).get(0), new l(new ArrayList(), eVar2));
        }

        static da.h a() {
            return f.d;
        }

        static void c(da.b bVar, e eVar) {
            q(bVar, "", eVar);
        }

        static /* synthetic */ void e(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.d((b) arrayList.get(0), (String) arrayList.get(1), (q) arrayList.get(2), new e(new ArrayList(), eVar2));
        }

        static /* synthetic */ void f(e eVar, Object obj, a.e eVar2) {
            j(eVar, obj, eVar2);
        }

        static /* synthetic */ void g(e eVar, Object obj, a.e eVar2) {
            M(eVar, obj, eVar2);
        }

        static /* synthetic */ void h(e eVar, Object obj, a.e eVar2) {
            z(eVar, obj, eVar2);
        }

        static /* synthetic */ void j(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.D((b) arrayList.get(0), (D) arrayList.get(1), new d(new ArrayList(), eVar2));
        }

        static /* synthetic */ void k(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.i((b) arrayList.get(0), (Map) arrayList.get(1), new c(new ArrayList(), eVar2));
        }

        static /* synthetic */ void l(e eVar, Object obj, a.e eVar2) {
            u(eVar, obj, eVar2);
        }

        static /* synthetic */ void m(e eVar, Object obj, a.e eVar2) {
            I(eVar, obj, eVar2);
        }

        static /* synthetic */ void n(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.t((b) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar2));
        }

        static /* synthetic */ void o(e eVar, Object obj, a.e eVar2) {
            eVar.v((b) ((ArrayList) obj).get(0), new f(new ArrayList(), eVar2));
        }

        static void q(da.b bVar, String str, e eVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete" + str2, a());
            if (eVar != null) {
                aVar.e(new A0(eVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken" + str2, a());
            if (eVar != null) {
                aVar2.e(new J0(eVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential" + str2, a());
            if (eVar != null) {
                aVar3.e(new K0(eVar));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider" + str2, a());
            if (eVar != null) {
                aVar4.e(new L0(eVar));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential" + str2, a());
            if (eVar != null) {
                aVar5.e(new M0(eVar));
            } else {
                aVar5.e(null);
            }
            da.a aVar6 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider" + str2, a());
            if (eVar != null) {
                aVar6.e(new N0(eVar));
            } else {
                aVar6.e(null);
            }
            da.a aVar7 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload" + str2, a());
            if (eVar != null) {
                aVar7.e(new B0(eVar));
            } else {
                aVar7.e(null);
            }
            da.a aVar8 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification" + str2, a());
            if (eVar != null) {
                aVar8.e(new C0(eVar));
            } else {
                aVar8.e(null);
            }
            da.a aVar9 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink" + str2, a());
            if (eVar != null) {
                aVar9.e(new D0(eVar));
            } else {
                aVar9.e(null);
            }
            da.a aVar10 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail" + str2, a());
            if (eVar != null) {
                aVar10.e(new E0(eVar));
            } else {
                aVar10.e(null);
            }
            da.a aVar11 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword" + str2, a());
            if (eVar != null) {
                aVar11.e(new F0(eVar));
            } else {
                aVar11.e(null);
            }
            da.a aVar12 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber" + str2, a());
            if (eVar != null) {
                aVar12.e(new G0(eVar));
            } else {
                aVar12.e(null);
            }
            da.a aVar13 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile" + str2, a());
            if (eVar != null) {
                aVar13.e(new H0(eVar));
            } else {
                aVar13.e(null);
            }
            da.a aVar14 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail" + str2, a());
            if (eVar != null) {
                aVar14.e(new I0(eVar));
            } else {
                aVar14.e(null);
            }
        }

        static /* synthetic */ void u(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.O((b) arrayList.get(0), (y) arrayList.get(1), new i(new ArrayList(), eVar2));
        }

        static /* synthetic */ void y(e eVar, Object obj, a.e eVar2) {
            N(eVar, obj, eVar2);
        }

        static /* synthetic */ void z(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.r((b) arrayList.get(0), (Map) arrayList.get(1), new j(new ArrayList(), eVar2));
        }

        void D(b bVar, D d2, F f2);

        void H(b bVar, Boolean bool, F f2);

        void J(b bVar, String str, F f2);

        void O(b bVar, y yVar, F f2);

        void b(b bVar, F f2);

        void d(b bVar, String str, q qVar, G g2);

        void i(b bVar, Map map, F f2);

        void p(b bVar, Map map, F f2);

        void r(b bVar, Map map, F f2);

        void s(b bVar, String str, F f2);

        void t(b bVar, String str, F f2);

        void v(b bVar, G g2);

        void w(b bVar, y yVar, F f2);

        void x(b bVar, q qVar, G g2);
    }

    public static class f extends da.o {
        public static final f d = new f();

        public Object g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return A.a((ArrayList) f(byteBuffer));
                case -114:
                    return B.a((ArrayList) f(byteBuffer));
                case -113:
                    return C.a((ArrayList) f(byteBuffer));
                case -112:
                    return D.a((ArrayList) f(byteBuffer));
                case -111:
                    return E.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b, byteBuffer);
            }
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((b) obj).h());
                return;
            }
            if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((o) obj).d());
                return;
            }
            if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((p) obj).d());
                return;
            }
            if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((q) obj).r());
                return;
            }
            if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((r) obj).g());
                return;
            }
            if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((s) obj).f());
                return;
            }
            if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((t) obj).k());
                return;
            }
            if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                p(byteArrayOutputStream, ((u) obj).i());
                return;
            }
            if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                p(byteArrayOutputStream, ((v) obj).g());
                return;
            }
            if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                p(byteArrayOutputStream, ((w) obj).c());
                return;
            }
            if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                p(byteArrayOutputStream, ((x) obj).f());
                return;
            }
            if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                p(byteArrayOutputStream, ((y) obj).h());
                return;
            }
            if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                p(byteArrayOutputStream, ((z) obj).g());
                return;
            }
            if (obj instanceof A) {
                byteArrayOutputStream.write(141);
                p(byteArrayOutputStream, ((A) obj).e());
                return;
            }
            if (obj instanceof B) {
                byteArrayOutputStream.write(142);
                p(byteArrayOutputStream, ((B) obj).f());
                return;
            }
            if (obj instanceof C) {
                byteArrayOutputStream.write(143);
                p(byteArrayOutputStream, ((C) obj).n());
            } else if (obj instanceof D) {
                byteArrayOutputStream.write(144);
                p(byteArrayOutputStream, ((D) obj).j());
            } else if (!(obj instanceof E)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(145);
                p(byteArrayOutputStream, ((E) obj).n());
            }
        }
    }

    public static class g extends RuntimeException {
        public final String a;
        public final Object b;

        public g(String str, String str2, Object obj) {
            super(str2);
            this.a = str;
            this.b = obj;
        }
    }

    public interface h {

        public class a implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(A a) {
                this.a.add(0, a);
                this.b.a(this.a);
            }
        }

        static da.h a() {
            return i.d;
        }

        static /* synthetic */ void c(h hVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            hVar.s((String) arrayList.get(0), (x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        static void i(da.b bVar, String str, h hVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn" + str2, a());
            if (hVar != null) {
                aVar.e(new O0(hVar));
            } else {
                aVar.e(null);
            }
        }

        static /* synthetic */ void q(h hVar, Object obj, a.e eVar) {
            c(hVar, obj, eVar);
        }

        static void r(da.b bVar, h hVar) {
            i(bVar, "", hVar);
        }

        void s(String str, x xVar, String str2, F f);
    }

    public static class i extends da.o {
        public static final i d = new i();

        public Object g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return r.a((ArrayList) f(byteBuffer));
                case -127:
                    return s.a((ArrayList) f(byteBuffer));
                case -126:
                    return x.a((ArrayList) f(byteBuffer));
                case -125:
                    return A.a((ArrayList) f(byteBuffer));
                case -124:
                    return B.a((ArrayList) f(byteBuffer));
                case -123:
                    return C.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b, byteBuffer);
            }
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof r) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((r) obj).g());
                return;
            }
            if (obj instanceof s) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((s) obj).f());
                return;
            }
            if (obj instanceof x) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((x) obj).f());
                return;
            }
            if (obj instanceof A) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((A) obj).e());
            } else if (obj instanceof B) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((B) obj).f());
            } else if (!(obj instanceof C)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((C) obj).n());
            }
        }
    }

    public interface j {

        public class a implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(z zVar) {
                this.a.add(0, zVar);
                this.b.a(this.a);
            }
        }

        public class b implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public b(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        public class c implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public c(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        static da.h a() {
            return k.d;
        }

        static void b(da.b bVar, j jVar) {
            g(bVar, "", jVar);
        }

        static /* synthetic */ void c(j jVar, Object obj, a.e eVar) {
            h(jVar, obj, eVar);
        }

        static /* synthetic */ void d(j jVar, Object obj, a.e eVar) {
            k(jVar, obj, eVar);
        }

        static /* synthetic */ void e(j jVar, Object obj, a.e eVar) {
            i(jVar, obj, eVar);
        }

        static void g(da.b bVar, String str, j jVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret" + str2, a());
            if (jVar != null) {
                aVar.e(new P0(jVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment" + str2, a());
            if (jVar != null) {
                aVar2.e(new Q0(jVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn" + str2, a());
            if (jVar != null) {
                aVar3.e(new R0(jVar));
            } else {
                aVar3.e(null);
            }
        }

        static /* synthetic */ void h(j jVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            jVar.f((String) arrayList.get(0), (String) arrayList.get(1), new c(new ArrayList(), eVar));
        }

        static /* synthetic */ void i(j jVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            jVar.l((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
        }

        static /* synthetic */ void k(j jVar, Object obj, a.e eVar) {
            jVar.j((String) ((ArrayList) obj).get(0), new a(new ArrayList(), eVar));
        }

        void f(String str, String str2, F f);

        void j(String str, F f);

        void l(String str, String str2, F f);
    }

    public static class k extends da.o {
        public static final k d = new k();

        public Object g(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.g(b, byteBuffer) : z.a((ArrayList) f(byteBuffer));
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof z)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((z) obj).g());
            }
        }
    }

    public interface l {

        public class a implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                this.a.add(0, str);
                this.b.a(this.a);
            }
        }

        public class b implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public b(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        static da.h a() {
            return new da.o();
        }

        static /* synthetic */ void b(l lVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            lVar.f((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        static void c(da.b bVar, l lVar) {
            g(bVar, "", lVar);
        }

        static /* synthetic */ void d(l lVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            lVar.h((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
        }

        static /* synthetic */ void e(l lVar, Object obj, a.e eVar) {
            b(lVar, obj, eVar);
        }

        static void g(da.b bVar, String str, l lVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl" + str2, a());
            if (lVar != null) {
                aVar.e(new S0(lVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp" + str2, a());
            if (lVar != null) {
                aVar2.e(new T0(lVar));
            } else {
                aVar2.e(null);
            }
        }

        static /* synthetic */ void i(l lVar, Object obj, a.e eVar) {
            d(lVar, obj, eVar);
        }

        void f(String str, String str2, String str3, F f);

        void h(String str, String str2, G g);
    }

    public interface m {

        public class a implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class b implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public b(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class c implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public c(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(w wVar) {
                this.a.add(0, wVar);
                this.b.a(this.a);
            }
        }

        public class d implements G {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public d(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }
        }

        public class e implements F {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public e(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(c0.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(List list) {
                this.a.add(0, list);
                this.b.a(this.a);
            }
        }

        static da.h a() {
            return n.d;
        }

        static /* synthetic */ void b(m mVar, Object obj, a.e eVar) {
            n(mVar, obj, eVar);
        }

        static /* synthetic */ void d(m mVar, Object obj, a.e eVar) {
            t(mVar, obj, eVar);
        }

        static void e(da.b bVar, m mVar) {
            p(bVar, "", mVar);
        }

        static /* synthetic */ void f(m mVar, Object obj, a.e eVar) {
            m(mVar, obj, eVar);
        }

        static /* synthetic */ void k(m mVar, Object obj, a.e eVar) {
            v(mVar, obj, eVar);
        }

        static /* synthetic */ void l(m mVar, Object obj, a.e eVar) {
            u(mVar, obj, eVar);
        }

        static /* synthetic */ void m(m mVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            mVar.g((b) arrayList.get(0), (x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        static /* synthetic */ void n(m mVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            mVar.w((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new b(new ArrayList(), eVar));
        }

        static void p(da.b bVar, String str, m mVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone" + str2, a());
            if (mVar != null) {
                aVar.e(new U0(mVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp" + str2, a());
            if (mVar != null) {
                aVar2.e(new V0(mVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession" + str2, a());
            if (mVar != null) {
                aVar3.e(new W0(mVar));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll" + str2, a());
            if (mVar != null) {
                aVar4.e(new X0(mVar));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors" + str2, a());
            if (mVar != null) {
                aVar5.e(new Y0(mVar));
            } else {
                aVar5.e(null);
            }
        }

        static /* synthetic */ void t(m mVar, Object obj, a.e eVar) {
            mVar.o((b) ((ArrayList) obj).get(0), new c(new ArrayList(), eVar));
        }

        static /* synthetic */ void u(m mVar, Object obj, a.e eVar) {
            mVar.j((b) ((ArrayList) obj).get(0), new e(new ArrayList(), eVar));
        }

        static /* synthetic */ void v(m mVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            mVar.h((b) arrayList.get(0), (String) arrayList.get(1), new d(new ArrayList(), eVar));
        }

        void g(b bVar, x xVar, String str, G g);

        void h(b bVar, String str, G g);

        void j(b bVar, F f);

        void o(b bVar, F f);

        void w(b bVar, String str, String str2, G g);
    }

    public static class n extends da.o {
        public static final n d = new n();

        public Object g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return v.a((ArrayList) f(byteBuffer));
                case -126:
                    return w.a((ArrayList) f(byteBuffer));
                case -125:
                    return x.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b, byteBuffer);
            }
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((b) obj).h());
                return;
            }
            if (obj instanceof v) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((v) obj).g());
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((w) obj).c());
            } else if (!(obj instanceof x)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((x) obj).f());
            }
        }
    }

    public static final class o {
        public a a;
        public p b;

        public static final class a {
            public a a;
            public p b;

            public o a() {
                o oVar = new o();
                oVar.c(this.a);
                oVar.b(this.b);
                return oVar;
            }

            public a b(p pVar) {
                this.b = pVar;
                return this;
            }

            public a c(a aVar) {
                this.a = aVar;
                return this;
            }
        }

        public static o a(ArrayList arrayList) {
            o oVar = new o();
            oVar.c(a.values()[((Integer) arrayList.get(0)).intValue()]);
            oVar.b((p) arrayList.get(1));
            return oVar;
        }

        public void b(p pVar) {
            if (pVar == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.b = pVar;
        }

        public void c(a aVar) {
            if (aVar == null) {
                throw new IllegalStateException("Nonnull field \"operation\" is null.");
            }
            this.a = aVar;
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(2);
            a aVar = this.a;
            arrayList.add(aVar == null ? null : Integer.valueOf(aVar.a));
            arrayList.add(this.b);
            return arrayList;
        }
    }

    public static final class p {
        public String a;
        public String b;

        public static final class a {
            public String a;
            public String b;

            public p a() {
                p pVar = new p();
                pVar.b(this.a);
                pVar.c(this.b);
                return pVar;
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }
        }

        public static p a(ArrayList arrayList) {
            p pVar = new p();
            pVar.b((String) arrayList.get(0));
            pVar.c((String) arrayList.get(1));
            return pVar;
        }

        public void b(String str) {
            this.a = str;
        }

        public void c(String str) {
            this.b = str;
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.a);
            arrayList.add(this.b);
            return arrayList;
        }
    }

    public static final class q {
        public String a;
        public String b;
        public Boolean c;
        public String d;
        public String e;
        public Boolean f;
        public String g;
        public String h;

        public static q a(ArrayList arrayList) {
            q qVar = new q();
            qVar.q((String) arrayList.get(0));
            qVar.m((String) arrayList.get(1));
            qVar.n((Boolean) arrayList.get(2));
            qVar.o((String) arrayList.get(3));
            qVar.l((String) arrayList.get(4));
            qVar.j((Boolean) arrayList.get(5));
            qVar.k((String) arrayList.get(6));
            qVar.p((String) arrayList.get(7));
            return qVar;
        }

        public Boolean b() {
            return this.f;
        }

        public String c() {
            return this.g;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.b;
        }

        public Boolean f() {
            return this.c;
        }

        public String g() {
            return this.d;
        }

        public String h() {
            return this.h;
        }

        public String i() {
            return this.a;
        }

        public void j(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
            }
            this.f = bool;
        }

        public void k(String str) {
            this.g = str;
        }

        public void l(String str) {
            this.e = str;
        }

        public void m(String str) {
            this.b = str;
        }

        public void n(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
            }
            this.c = bool;
        }

        public void o(String str) {
            this.d = str;
        }

        public void p(String str) {
            this.h = str;
        }

        public void q(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.a = str;
        }

        public ArrayList r() {
            ArrayList arrayList = new ArrayList(8);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            arrayList.add(this.f);
            arrayList.add(this.g);
            arrayList.add(this.h);
            return arrayList;
        }
    }

    public static final class r {
        public Boolean a;
        public String b;
        public String c;
        public String d;
        public Map e;

        public static final class a {
            public Boolean a;
            public String b;
            public String c;
            public String d;
            public Map e;

            public r a() {
                r rVar = new r();
                rVar.c(this.a);
                rVar.e(this.b);
                rVar.f(this.c);
                rVar.b(this.d);
                rVar.d(this.e);
                return rVar;
            }

            public a b(Boolean bool) {
                this.a = bool;
                return this;
            }

            public a c(Map map) {
                this.e = map;
                return this;
            }

            public a d(String str) {
                this.b = str;
                return this;
            }

            public a e(String str) {
                this.c = str;
                return this;
            }
        }

        public static r a(ArrayList arrayList) {
            r rVar = new r();
            rVar.c((Boolean) arrayList.get(0));
            rVar.e((String) arrayList.get(1));
            rVar.f((String) arrayList.get(2));
            rVar.b((String) arrayList.get(3));
            rVar.d((Map) arrayList.get(4));
            return rVar;
        }

        public void b(String str) {
            this.d = str;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
            }
            this.a = bool;
        }

        public void d(Map map) {
            this.e = map;
        }

        public void e(String str) {
            this.b = str;
        }

        public void f(String str) {
            this.c = str;
        }

        public ArrayList g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            return arrayList;
        }
    }

    public static final class s {
        public String a;
        public String b;
        public Long c;
        public String d;

        public static final class a {
            public String a;
            public String b;
            public Long c;
            public String d;

            public s a() {
                s sVar = new s();
                sVar.d(this.a);
                sVar.e(this.b);
                sVar.c(this.c);
                sVar.b(this.d);
                return sVar;
            }

            public a b(String str) {
                this.d = str;
                return this;
            }

            public a c(Long l) {
                this.c = l;
                return this;
            }

            public a d(String str) {
                this.a = str;
                return this;
            }

            public a e(String str) {
                this.b = str;
                return this;
            }
        }

        public static s a(ArrayList arrayList) {
            Long valueOf;
            s sVar = new s();
            sVar.d((String) arrayList.get(0));
            sVar.e((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.c(valueOf);
            sVar.b((String) arrayList.get(3));
            return sVar;
        }

        public void b(String str) {
            this.d = str;
        }

        public void c(Long l) {
            if (l == null) {
                throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
            }
            this.c = l;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.a = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
            }
            this.b = str;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            return arrayList;
        }
    }

    public static final class t {
        public Boolean a;
        public String b;
        public String c;
        public String d;
        public Boolean e;

        public static t a(ArrayList arrayList) {
            t tVar = new t();
            tVar.f((Boolean) arrayList.get(0));
            tVar.j((String) arrayList.get(1));
            tVar.h((String) arrayList.get(2));
            tVar.i((String) arrayList.get(3));
            tVar.g((Boolean) arrayList.get(4));
            return tVar;
        }

        public Boolean b() {
            return this.a;
        }

        public Boolean c() {
            return this.e;
        }

        public String d() {
            return this.c;
        }

        public String e() {
            return this.d;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
            }
            this.a = bool;
        }

        public void g(Boolean bool) {
            this.e = bool;
        }

        public void h(String str) {
            this.c = str;
        }

        public void i(String str) {
            this.d = str;
        }

        public void j(String str) {
            this.b = str;
        }

        public ArrayList k() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            return arrayList;
        }
    }

    public static final class u {
        public String a;
        public Long b;
        public Long c;
        public Long d;
        public String e;
        public Map f;
        public String g;

        public static final class a {
            public String a;
            public Long b;
            public Long c;
            public Long d;
            public String e;
            public Map f;
            public String g;

            public u a() {
                u uVar = new u();
                uVar.h(this.a);
                uVar.d(this.b);
                uVar.b(this.c);
                uVar.e(this.d);
                uVar.f(this.e);
                uVar.c(this.f);
                uVar.g(this.g);
                return uVar;
            }

            public a b(Long l) {
                this.c = l;
                return this;
            }

            public a c(Map map) {
                this.f = map;
                return this;
            }

            public a d(Long l) {
                this.b = l;
                return this;
            }

            public a e(Long l) {
                this.d = l;
                return this;
            }

            public a f(String str) {
                this.e = str;
                return this;
            }

            public a g(String str) {
                this.g = str;
                return this;
            }

            public a h(String str) {
                this.a = str;
                return this;
            }
        }

        public static u a(ArrayList arrayList) {
            Long valueOf;
            Long valueOf2;
            u uVar = new u();
            uVar.h((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            uVar.d(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            uVar.b(valueOf2);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                l = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            uVar.e(l);
            uVar.f((String) arrayList.get(4));
            uVar.c((Map) arrayList.get(5));
            uVar.g((String) arrayList.get(6));
            return uVar;
        }

        public void b(Long l) {
            this.c = l;
        }

        public void c(Map map) {
            this.f = map;
        }

        public void d(Long l) {
            this.b = l;
        }

        public void e(Long l) {
            this.d = l;
        }

        public void f(String str) {
            this.e = str;
        }

        public void g(String str) {
            this.g = str;
        }

        public void h(String str) {
            this.a = str;
        }

        public ArrayList i() {
            ArrayList arrayList = new ArrayList(7);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            arrayList.add(this.f);
            arrayList.add(this.g);
            return arrayList;
        }
    }

    public static final class v {
        public String a;
        public Double b;
        public String c;
        public String d;
        public String e;

        public static final class a {
            public String a;
            public Double b;
            public String c;
            public String d;
            public String e;

            public v a() {
                v vVar = new v();
                vVar.b(this.a);
                vVar.c(this.b);
                vVar.d(this.c);
                vVar.f(this.d);
                vVar.e(this.e);
                return vVar;
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            public a c(Double d) {
                this.b = d;
                return this;
            }

            public a d(String str) {
                this.c = str;
                return this;
            }

            public a e(String str) {
                this.e = str;
                return this;
            }

            public a f(String str) {
                this.d = str;
                return this;
            }
        }

        public static v a(ArrayList arrayList) {
            v vVar = new v();
            vVar.b((String) arrayList.get(0));
            vVar.c((Double) arrayList.get(1));
            vVar.d((String) arrayList.get(2));
            vVar.f((String) arrayList.get(3));
            vVar.e((String) arrayList.get(4));
            return vVar;
        }

        public void b(String str) {
            this.a = str;
        }

        public void c(Double d) {
            if (d == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.b = d;
        }

        public void d(String str) {
            this.c = str;
        }

        public void e(String str) {
            this.e = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.d = str;
        }

        public ArrayList g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            return arrayList;
        }
    }

    public static final class w {
        public String a;

        public static final class a {
            public String a;

            public w a() {
                w wVar = new w();
                wVar.b(this.a);
                return wVar;
            }

            public a b(String str) {
                this.a = str;
                return this;
            }
        }

        public static w a(ArrayList arrayList) {
            w wVar = new w();
            wVar.b((String) arrayList.get(0));
            return wVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.a = str;
        }

        public ArrayList c() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.a);
            return arrayList;
        }
    }

    public static final class x {
        public String a;
        public String b;

        public static x a(ArrayList arrayList) {
            x xVar = new x();
            xVar.e((String) arrayList.get(0));
            xVar.d((String) arrayList.get(1));
            return xVar;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.b = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.a = str;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.a);
            arrayList.add(this.b);
            return arrayList;
        }
    }

    public static final class y {
        public String a;
        public List b;
        public Map c;

        public static y a(ArrayList arrayList) {
            y yVar = new y();
            yVar.f((String) arrayList.get(0));
            yVar.g((List) arrayList.get(1));
            yVar.e((Map) arrayList.get(2));
            return yVar;
        }

        public Map b() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public List d() {
            return this.b;
        }

        public void e(Map map) {
            this.c = map;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.a = str;
        }

        public void g(List list) {
            this.b = list;
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            return arrayList;
        }
    }

    public static final class z {
        public Long a;
        public Long b;
        public Long c;
        public String d;
        public String e;

        public static final class a {
            public Long a;
            public Long b;
            public Long c;
            public String d;
            public String e;

            public z a() {
                z zVar = new z();
                zVar.b(this.a);
                zVar.c(this.b);
                zVar.d(this.c);
                zVar.e(this.d);
                zVar.f(this.e);
                return zVar;
            }

            public a b(Long l) {
                this.a = l;
                return this;
            }

            public a c(Long l) {
                this.b = l;
                return this;
            }

            public a d(Long l) {
                this.c = l;
                return this;
            }

            public a e(String str) {
                this.d = str;
                return this;
            }

            public a f(String str) {
                this.e = str;
                return this;
            }
        }

        public static z a(ArrayList arrayList) {
            Long valueOf;
            Long valueOf2;
            z zVar = new z();
            Object obj = arrayList.get(0);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            zVar.b(valueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            zVar.c(valueOf2);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                l = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            zVar.d(l);
            zVar.e((String) arrayList.get(3));
            zVar.f((String) arrayList.get(4));
            return zVar;
        }

        public void b(Long l) {
            this.a = l;
        }

        public void c(Long l) {
            this.b = l;
        }

        public void d(Long l) {
            this.c = l;
        }

        public void e(String str) {
            this.d = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
            }
            this.e = str;
        }

        public ArrayList g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            arrayList.add(this.e);
            return arrayList;
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof g) {
            g gVar = (g) th;
            arrayList.add(gVar.a);
            arrayList.add(gVar.getMessage());
            arrayList.add(gVar.b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
