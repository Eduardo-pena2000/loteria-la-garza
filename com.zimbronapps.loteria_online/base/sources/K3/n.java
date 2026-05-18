package k3;

import P2.K;
import R2.j;
import R2.w;
import android.net.Uri;
import g3.r;
import java.io.InputStream;
import java.util.Map;
import k3.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n implements l.e {
    public final long a;
    public final R2.j b;
    public final int c;
    public final w d;
    public final a e;
    public volatile Object f;

    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public n(R2.f fVar, Uri uri, int i, a aVar) {
        this(fVar, new j.b().i(uri).b(1).a(), i, aVar);
    }

    public long a() {
        return this.d.q();
    }

    public final void b() {
        this.d.t();
        R2.h hVar = new R2.h(this.d, this.b);
        try {
            hVar.b();
            this.f = this.e.a((Uri) P2.a.e(this.d.o()), hVar);
        } finally {
            K.m(hVar);
        }
    }

    public Map d() {
        return this.d.s();
    }

    public final Object e() {
        return this.f;
    }

    public Uri f() {
        return this.d.r();
    }

    public n(R2.f fVar, R2.j jVar, int i, a aVar) {
        this.d = new w(fVar);
        this.b = jVar;
        this.c = i;
        this.e = aVar;
        this.a = r.a();
    }

    public final void c() {
    }
}
