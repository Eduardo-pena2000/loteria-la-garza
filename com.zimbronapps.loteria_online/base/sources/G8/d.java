package g8;

import e8.g;
import e8.h;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d implements f8.b {
    public static final e8.e e = new g8.a();
    public static final g f = new g8.b();
    public static final g g = new c();
    public static final b h = new b(null);
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public e8.e c = e;
    public boolean d = false;

    public class a implements e8.a {
        public a() {
        }

        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.e(d.this), d.f(d.this), d.g(d.this), d.h(d.this));
            eVar.k(obj, false);
            eVar.u();
        }

        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class b implements g {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, h hVar) {
            hVar.a(a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f);
        p(Boolean.class, g);
        p(Date.class, h);
    }

    public static /* synthetic */ void b(Boolean bool, h hVar) {
        n(bool, hVar);
    }

    public static /* synthetic */ void c(Object obj, e8.f fVar) {
        l(obj, fVar);
    }

    public static /* synthetic */ void d(String str, h hVar) {
        m(str, hVar);
    }

    public static /* synthetic */ Map e(d dVar) {
        return dVar.a;
    }

    public static /* synthetic */ Map f(d dVar) {
        return dVar.b;
    }

    public static /* synthetic */ e8.e g(d dVar) {
        return dVar.c;
    }

    public static /* synthetic */ boolean h(d dVar) {
        return dVar.d;
    }

    public static /* synthetic */ void l(Object obj, e8.f fVar) {
        throw new e8.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void m(String str, h hVar) {
        hVar.a(str);
    }

    public static /* synthetic */ void n(Boolean bool, h hVar) {
        hVar.g(bool.booleanValue());
    }

    public e8.a i() {
        return new a();
    }

    public d j(f8.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z) {
        this.d = z;
        return this;
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, e8.e eVar) {
        this.a.put(cls, eVar);
        this.b.remove(cls);
        return this;
    }

    public d p(Class cls, g gVar) {
        this.b.put(cls, gVar);
        this.a.remove(cls);
        return this;
    }
}
