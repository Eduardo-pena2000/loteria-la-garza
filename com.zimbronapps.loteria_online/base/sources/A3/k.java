package a3;

import android.net.Uri;
import g3.D;
import java.io.IOException;
import k3.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface k {

    public interface a {
        k a(Z2.g gVar, k3.k kVar, j jVar);
    }

    public interface b {
        void a();

        boolean e(Uri uri, k.c cVar, boolean z);
    }

    public static final class c extends IOException {
        public final Uri a;

        public c(Uri uri) {
            this.a = uri;
        }
    }

    public static final class d extends IOException {
        public final Uri a;

        public d(Uri uri) {
            this.a = uri;
        }
    }

    public interface e {
        void q(f fVar);
    }

    void a(b bVar);

    void b(Uri uri);

    void c(Uri uri);

    void d(Uri uri, D.a aVar, e eVar);

    long e();

    g f();

    void g(Uri uri);

    boolean h(Uri uri);

    boolean j();

    boolean l(Uri uri, long j);

    void m();

    f n(Uri uri, boolean z);

    void p(b bVar);

    void stop();
}
