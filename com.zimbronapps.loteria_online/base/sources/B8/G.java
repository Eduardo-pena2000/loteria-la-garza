package B8;

import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g implements h {
    public static final a b = new a(null);
    public final l8.b a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public g(l8.b bVar) {
        kotlin.jvm.internal.t.g(bVar, "transportFactoryProvider");
        this.a = bVar;
    }

    public static /* synthetic */ byte[] b(g gVar, K k) {
        return gVar.c(k);
    }

    public void a(K k) {
        kotlin.jvm.internal.t.g(k, "sessionEvent");
        ((w5.j) this.a.get()).a("FIREBASE_APPQUALITY_SESSION", K.class, w5.c.b("json"), new f(this)).b(w5.d.f(k));
    }

    public final byte[] c(K k) {
        String b2 = L.a.c().b(k);
        kotlin.jvm.internal.t.f(b2, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: " + k.b().name());
        byte[] bytes = b2.getBytes(Za.c.b);
        kotlin.jvm.internal.t.f(bytes, "getBytes(...)");
        return bytes;
    }
}
