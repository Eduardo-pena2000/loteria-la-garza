package h8;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class h {
    public final Map a;
    public final Map b;
    public final e8.e c;

    public static final class a implements f8.b {
        public static final e8.e d = new g();
        public final Map a = new HashMap();
        public final Map b = new HashMap();
        public e8.e c = d;

        public static /* synthetic */ void b(Object obj, e8.f fVar) {
            e(obj, fVar);
        }

        private static /* synthetic */ void e(Object obj, e8.f fVar) {
            throw new e8.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(f8.a aVar) {
            aVar.a(this);
            return this;
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, e8.e eVar) {
            this.a.put(cls, eVar);
            this.b.remove(cls);
            return this;
        }
    }

    public h(Map map, Map map2, e8.e eVar) {
        this.a = map;
        this.b = map2;
        this.c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.a, this.b, this.c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
