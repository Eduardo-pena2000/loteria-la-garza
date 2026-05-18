package va;

import android.util.Log;
import da.a;
import da.b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class r {

    public static final class a {
        public String a;
        public String b;

        public static final class a {
            public String a;
            public String b;

            public a a() {
                a aVar = new a();
                aVar.b(this.a);
                aVar.c(this.b);
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
        }

        public static a a(ArrayList arrayList) {
            a aVar = new a();
            aVar.b((String) arrayList.get(0));
            aVar.c((String) arrayList.get(1));
            return aVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Objects.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b});
        }
    }

    public static final class b {
        public c a;
        public a b;
        public List c;

        public static final class a {
            public c a;
            public a b;
            public List c;

            public b a() {
                b bVar = new b();
                bVar.d(this.a);
                bVar.b(this.b);
                bVar.c(this.c);
                return bVar;
            }

            public a b(a aVar) {
                this.b = aVar;
                return this;
            }

            public a c(List list) {
                this.c = list;
                return this;
            }

            public a d(c cVar) {
                this.a = cVar;
                return this;
            }
        }

        public static b a(ArrayList arrayList) {
            b bVar = new b();
            bVar.d((c) arrayList.get(0));
            bVar.b((a) arrayList.get(1));
            bVar.c((List) arrayList.get(2));
            return bVar;
        }

        public void b(a aVar) {
            this.b = aVar;
        }

        public void c(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            this.c = list;
        }

        public void d(c cVar) {
            if (cVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.a = cVar;
        }

        public ArrayList e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Objects.equals(this.b, bVar.b) && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }
    }

    public enum c {
        IMAGE(0),
        VIDEO(1);

        public final int a;

        c(int i) {
            this.a = i;
        }
    }

    public static class d extends RuntimeException {
        public final String a;
        public final Object b;

        public d(String str, String str2, Object obj) {
            super(str2);
            this.a = str;
            this.b = obj;
        }
    }

    public static final class e {
        public Boolean a;
        public Boolean b;
        public Long c;

        public static e a(ArrayList arrayList) {
            e eVar = new e();
            eVar.e((Boolean) arrayList.get(0));
            eVar.g((Boolean) arrayList.get(1));
            eVar.f((Long) arrayList.get(2));
            return eVar;
        }

        public Boolean b() {
            return this.a;
        }

        public Long c() {
            return this.c;
        }

        public Boolean d() {
            return this.b;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            }
            this.a = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && Objects.equals(this.c, eVar.c);
        }

        public void f(Long l) {
            this.c = l;
        }

        public void g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
            }
            this.b = bool;
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }
    }

    public interface f {

        public class a implements j {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public a(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(r.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(List list) {
                this.a.add(0, list);
                this.b.a(this.a);
            }
        }

        public class b implements j {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public b(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(r.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(List list) {
                this.a.add(0, list);
                this.b.a(this.a);
            }
        }

        public class c implements j {
            public final /* synthetic */ ArrayList a;
            public final /* synthetic */ a.e b;

            public c(ArrayList arrayList, a.e eVar) {
                this.a = arrayList;
                this.b = eVar;
            }

            public void b(Throwable th) {
                this.b.a(r.a(th));
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(List list) {
                this.a.add(0, list);
                this.b.a(this.a);
            }
        }

        static da.h a() {
            return i.d;
        }

        static /* synthetic */ void b(f fVar, Object obj, a.e eVar) {
            h(fVar, obj, eVar);
        }

        static void d(da.b bVar, f fVar) {
            m(bVar, "", fVar);
        }

        static /* synthetic */ void e(f fVar, Object obj, a.e eVar) {
            f(fVar, obj, eVar);
        }

        static /* synthetic */ void f(f fVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, fVar.n());
            } catch (Throwable th) {
                arrayList = r.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void g(f fVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            fVar.j((h) arrayList.get(0), (e) arrayList.get(1), new c(new ArrayList(), eVar));
        }

        static /* synthetic */ void h(f fVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            fVar.c((l) arrayList.get(0), (n) arrayList.get(1), (e) arrayList.get(2), new b(new ArrayList(), eVar));
        }

        static /* synthetic */ void i(f fVar, Object obj, a.e eVar) {
            l(fVar, obj, eVar);
        }

        static /* synthetic */ void l(f fVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            fVar.k((l) arrayList.get(0), (g) arrayList.get(1), (e) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        static void m(da.b bVar, String str, f fVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            b.c b2 = bVar.b();
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages" + str2, a(), b2);
            if (fVar != null) {
                aVar.e(new s(fVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos" + str2, a(), b2);
            if (fVar != null) {
                aVar2.e(new t(fVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia" + str2, a());
            if (fVar != null) {
                aVar3.e(new u(fVar));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults" + str2, a(), b2);
            if (fVar != null) {
                aVar4.e(new v(fVar));
            } else {
                aVar4.e(null);
            }
        }

        static /* synthetic */ void o(f fVar, Object obj, a.e eVar) {
            g(fVar, obj, eVar);
        }

        void c(l lVar, n nVar, e eVar, j jVar);

        void j(h hVar, e eVar, j jVar);

        void k(l lVar, g gVar, e eVar, j jVar);

        b n();
    }

    public static final class g {
        public Double a;
        public Double b;
        public Long c;

        public static g a(ArrayList arrayList) {
            g gVar = new g();
            gVar.f((Double) arrayList.get(0));
            gVar.e((Double) arrayList.get(1));
            gVar.g((Long) arrayList.get(2));
            return gVar;
        }

        public Double b() {
            return this.b;
        }

        public Double c() {
            return this.a;
        }

        public Long d() {
            return this.c;
        }

        public void e(Double d) {
            this.b = d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.a, gVar.a) && Objects.equals(this.b, gVar.b) && this.c.equals(gVar.c);
        }

        public void f(Double d) {
            this.a = d;
        }

        public void g(Long l) {
            if (l == null) {
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            }
            this.c = l;
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.a);
            arrayList.add(this.b);
            arrayList.add(this.c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }
    }

    public static final class h {
        public g a;

        public static h a(ArrayList arrayList) {
            h hVar = new h();
            hVar.c((g) arrayList.get(0));
            return hVar;
        }

        public g b() {
            return this.a;
        }

        public void c(g gVar) {
            if (gVar == null) {
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            }
            this.a = gVar;
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || h.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((h) obj).a);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a});
        }
    }

    public static class i extends da.o {
        public static final i d = new i();

        public Object g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case -127:
                    Object f = f(byteBuffer);
                    if (f == null) {
                        return null;
                    }
                    return k.values()[((Long) f).intValue()];
                case -126:
                    Object f2 = f(byteBuffer);
                    if (f2 == null) {
                        return null;
                    }
                    return m.values()[((Long) f2).intValue()];
                case -125:
                    Object f3 = f(byteBuffer);
                    if (f3 == null) {
                        return null;
                    }
                    return c.values()[((Long) f3).intValue()];
                case -124:
                    return e.a((ArrayList) f(byteBuffer));
                case -123:
                    return g.a((ArrayList) f(byteBuffer));
                case -122:
                    return h.a((ArrayList) f(byteBuffer));
                case -121:
                    return n.a((ArrayList) f(byteBuffer));
                case -120:
                    return l.a((ArrayList) f(byteBuffer));
                case -119:
                    return a.a((ArrayList) f(byteBuffer));
                case -118:
                    return b.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b, byteBuffer);
            }
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof k) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, obj != null ? Integer.valueOf(((k) obj).a) : null);
                return;
            }
            if (obj instanceof m) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, obj != null ? Integer.valueOf(((m) obj).a) : null);
                return;
            }
            if (obj instanceof c) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, obj != null ? Integer.valueOf(((c) obj).a) : null);
                return;
            }
            if (obj instanceof e) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((e) obj).h());
                return;
            }
            if (obj instanceof g) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((g) obj).h());
                return;
            }
            if (obj instanceof h) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((h) obj).d());
                return;
            }
            if (obj instanceof n) {
                byteArrayOutputStream.write(135);
                p(byteArrayOutputStream, ((n) obj).d());
                return;
            }
            if (obj instanceof l) {
                byteArrayOutputStream.write(136);
                p(byteArrayOutputStream, ((l) obj).f());
            } else if (obj instanceof a) {
                byteArrayOutputStream.write(137);
                p(byteArrayOutputStream, ((a) obj).d());
            } else if (!(obj instanceof b)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(138);
                p(byteArrayOutputStream, ((b) obj).e());
            }
        }
    }

    public interface j {
        void a(Object obj);

        void b(Throwable th);
    }

    public enum k {
        REAR(0),
        FRONT(1);

        public final int a;

        k(int i) {
            this.a = i;
        }
    }

    public static final class l {
        public m a;
        public k b;

        public static l a(ArrayList arrayList) {
            l lVar = new l();
            lVar.e((m) arrayList.get(0));
            lVar.d((k) arrayList.get(1));
            return lVar;
        }

        public k b() {
            return this.b;
        }

        public m c() {
            return this.a;
        }

        public void d(k kVar) {
            this.b = kVar;
        }

        public void e(m mVar) {
            if (mVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.a = mVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || l.class != obj.getClass()) {
                return false;
            }
            l lVar = (l) obj;
            return this.a.equals(lVar.a) && Objects.equals(this.b, lVar.b);
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.a);
            arrayList.add(this.b);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b});
        }
    }

    public enum m {
        CAMERA(0),
        GALLERY(1);

        public final int a;

        m(int i) {
            this.a = i;
        }
    }

    public static final class n {
        public Long a;

        public static n a(ArrayList arrayList) {
            n nVar = new n();
            nVar.c((Long) arrayList.get(0));
            return nVar;
        }

        public Long b() {
            return this.a;
        }

        public void c(Long l) {
            this.a = l;
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.a, ((n) obj).a);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a});
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.a);
            arrayList.add(dVar.getMessage());
            arrayList.add(dVar.b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
