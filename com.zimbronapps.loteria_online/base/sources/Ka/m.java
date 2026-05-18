package ka;

import android.util.Log;
import da.a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class m {

    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;

        public static final class a {
            public String a;
            public String b;
            public String c;
            public String d;
            public String e;
            public String f;
            public String g;
            public String h;
            public String i;
            public String j;
            public String k;
            public String l;
            public String m;
            public String n;

            public a a() {
                a aVar = new a();
                aVar.k(this.a);
                aVar.m(this.b);
                aVar.t(this.c);
                aVar.u(this.d);
                aVar.n(this.e);
                aVar.o(this.f);
                aVar.v(this.g);
                aVar.s(this.h);
                aVar.w(this.i);
                aVar.p(this.j);
                aVar.j(this.k);
                aVar.r(this.l);
                aVar.q(this.m);
                aVar.l(this.n);
                return aVar;
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }

            public a d(String str) {
                this.f = str;
                return this;
            }

            public a e(String str) {
                this.c = str;
                return this;
            }

            public a f(String str) {
                this.d = str;
                return this;
            }

            public a g(String str) {
                this.g = str;
                return this;
            }

            public a h(String str) {
                this.i = str;
                return this;
            }
        }

        public static a a(ArrayList arrayList) {
            a aVar = new a();
            aVar.k((String) arrayList.get(0));
            aVar.m((String) arrayList.get(1));
            aVar.t((String) arrayList.get(2));
            aVar.u((String) arrayList.get(3));
            aVar.n((String) arrayList.get(4));
            aVar.o((String) arrayList.get(5));
            aVar.v((String) arrayList.get(6));
            aVar.s((String) arrayList.get(7));
            aVar.w((String) arrayList.get(8));
            aVar.p((String) arrayList.get(9));
            aVar.j((String) arrayList.get(10));
            aVar.r((String) arrayList.get(11));
            aVar.q((String) arrayList.get(12));
            aVar.l((String) arrayList.get(13));
            return aVar;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && Objects.equals(this.e, aVar.e) && Objects.equals(this.f, aVar.f) && Objects.equals(this.g, aVar.g) && Objects.equals(this.h, aVar.h) && Objects.equals(this.i, aVar.i) && Objects.equals(this.j, aVar.j) && Objects.equals(this.k, aVar.k) && Objects.equals(this.l, aVar.l) && Objects.equals(this.m, aVar.m) && Objects.equals(this.n, aVar.n);
        }

        public String f() {
            return this.c;
        }

        public String g() {
            return this.d;
        }

        public String h() {
            return this.g;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n});
        }

        public String i() {
            return this.i;
        }

        public void j(String str) {
            this.k = str;
        }

        public void k(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.a = str;
        }

        public void l(String str) {
            this.n = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.b = str;
        }

        public void n(String str) {
            this.e = str;
        }

        public void o(String str) {
            this.f = str;
        }

        public void p(String str) {
            this.j = str;
        }

        public void q(String str) {
            this.m = str;
        }

        public void r(String str) {
            this.l = str;
        }

        public void s(String str) {
            this.h = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.c = str;
        }

        public void u(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.d = str;
        }

        public void v(String str) {
            this.g = str;
        }

        public void w(String str) {
            this.i = str;
        }

        public ArrayList x() {
            ArrayList arrayList = new ArrayList(14);
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
            arrayList.add(this.m);
            arrayList.add(this.n);
            return arrayList;
        }
    }

    public static final class b {
        public String a;
        public a b;
        public Boolean c;
        public Map d;

        public static final class a {
            public String a;
            public a b;
            public Boolean c;
            public Map d;

            public b a() {
                b bVar = new b();
                bVar.c(this.a);
                bVar.d(this.b);
                bVar.b(this.c);
                bVar.e(this.d);
                return bVar;
            }

            public a b(Boolean bool) {
                this.c = bool;
                return this;
            }

            public a c(String str) {
                this.a = str;
                return this;
            }

            public a d(a aVar) {
                this.b = aVar;
                return this;
            }

            public a e(Map map) {
                this.d = map;
                return this;
            }
        }

        public static b a(ArrayList arrayList) {
            b bVar = new b();
            bVar.c((String) arrayList.get(0));
            bVar.d((a) arrayList.get(1));
            bVar.b((Boolean) arrayList.get(2));
            bVar.e((Map) arrayList.get(3));
            return bVar;
        }

        public void b(Boolean bool) {
            this.c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.a = str;
        }

        public void d(a aVar) {
            if (aVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.b = aVar;
        }

        public void e(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && Objects.equals(this.c, bVar.c) && this.d.equals(bVar.d);
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            arrayList.add(this.d);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
        }
    }

    public interface c {

        public class a implements g {
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
                this.b.a(m.a(th));
            }
        }

        public class b implements g {
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
                this.b.a(m.a(th));
            }
        }

        public class c implements g {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public c(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void a() {
                this.a.add(0, (Object) null);
                this.b.a(this.a);
            }

            public void b(Throwable th) {
                this.b.a(m.a(th));
            }
        }

        static da.h a() {
            return e.d;
        }

        static void c(da.b bVar, c cVar) {
            m(bVar, "", cVar);
        }

        static /* synthetic */ void d(c cVar, Object obj, a.e eVar) {
            o(cVar, obj, eVar);
        }

        static /* synthetic */ void g(c cVar, Object obj, a.e eVar) {
            t(cVar, obj, eVar);
        }

        static /* synthetic */ void j(c cVar, Object obj, a.e eVar) {
            r(cVar, obj, eVar);
        }

        static void m(da.b bVar, String str, c cVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled" + str2, a());
            if (cVar != null) {
                aVar.e(new n(cVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled" + str2, a());
            if (cVar != null) {
                aVar2.e(new o(cVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(bVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete" + str2, a());
            if (cVar != null) {
                aVar3.e(new p(cVar));
            } else {
                aVar3.e(null);
            }
        }

        static /* synthetic */ void o(c cVar, Object obj, a.e eVar) {
            cVar.q((String) ((ArrayList) obj).get(0), new c(new ArrayList(), eVar));
        }

        static /* synthetic */ void r(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.e((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
        }

        static /* synthetic */ void t(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.w((String) arrayList.get(0), (Boolean) arrayList.get(1), new a(new ArrayList(), eVar));
        }

        void e(String str, Boolean bool, g gVar);

        void q(String str, g gVar);

        void w(String str, Boolean bool, g gVar);
    }

    public interface d {

        public class a implements f {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(m.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(b bVar) {
                this.a.add(0, bVar);
                this.b.a(this.a);
            }
        }

        public class b implements f {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public b(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(m.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(List list) {
                this.a.add(0, list);
                this.b.a(this.a);
            }
        }

        public class c implements f {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public c(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(m.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(a aVar) {
                this.a.add(0, aVar);
                this.b.a(this.a);
            }
        }

        static da.h a() {
            return e.d;
        }

        static void f(da.b bVar, d dVar) {
            k(bVar, "", dVar);
        }

        static /* synthetic */ void h(d dVar, Object obj, a.e eVar) {
            u(dVar, obj, eVar);
        }

        static void k(da.b bVar, String str, d dVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeApp" + str2, a());
            if (dVar != null) {
                aVar.e(new q(dVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeCore" + str2, a());
            if (dVar != null) {
                aVar2.e(new r(dVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(bVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.optionsFromResource" + str2, a());
            if (dVar != null) {
                aVar3.e(new s(dVar));
            } else {
                aVar3.e(null);
            }
        }

        static /* synthetic */ void l(d dVar, Object obj, a.e eVar) {
            dVar.i(new c(new ArrayList(), eVar));
        }

        static /* synthetic */ void p(d dVar, Object obj, a.e eVar) {
            dVar.n(new b(new ArrayList(), eVar));
        }

        static /* synthetic */ void s(d dVar, Object obj, a.e eVar) {
            p(dVar, obj, eVar);
        }

        static /* synthetic */ void u(d dVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            dVar.b((String) arrayList.get(0), (a) arrayList.get(1), new a(new ArrayList(), eVar));
        }

        static /* synthetic */ void v(d dVar, Object obj, a.e eVar) {
            l(dVar, obj, eVar);
        }

        void b(String str, a aVar, f fVar);

        void i(f fVar);

        void n(f fVar);
    }

    public static class e extends da.o {
        public static final e d = new e();

        public Object g(byte b, ByteBuffer byteBuffer) {
            return b != -127 ? b != -126 ? super.g(b, byteBuffer) : b.a((ArrayList) f(byteBuffer)) : a.a((ArrayList) f(byteBuffer));
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof a) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((a) obj).x());
            } else if (!(obj instanceof b)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((b) obj).f());
            }
        }
    }

    public interface f {
        void a(Object obj);

        void b(Throwable th);
    }

    public interface g {
        void a();

        void b(Throwable th);
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
