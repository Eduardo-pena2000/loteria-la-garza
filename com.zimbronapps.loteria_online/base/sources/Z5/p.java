package z5;

import android.util.Base64;
import z5.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(w5.f fVar);
    }

    public static a a() {
        return new d.b().d(w5.f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract w5.f d();

    public boolean e() {
        return c() != null;
    }

    public p f(w5.f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", new Object[]{b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2)});
    }
}
