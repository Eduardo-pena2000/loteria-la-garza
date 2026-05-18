package R2;

import P2.K;
import R2.f;
import R2.l;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements f {
    public final Context a;
    public final List b = new ArrayList();
    public final f c;
    public f d;
    public f e;
    public f f;
    public f g;
    public f h;
    public f i;
    public f j;
    public f k;

    public static final class a implements f.a {
        public final Context a;
        public final f.a b;
        public x c;

        public a(Context context) {
            this(context, new l.b());
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a() {
            k kVar = new k(this.a, this.b.a());
            x xVar = this.c;
            if (xVar != null) {
                kVar.l(xVar);
            }
            return kVar;
        }

        public a(Context context, f.a aVar) {
            this.a = context.getApplicationContext();
            this.b = aVar;
        }
    }

    public k(Context context, f fVar) {
        this.a = context.getApplicationContext();
        this.c = (f) P2.a.e(fVar);
    }

    public void close() {
        f fVar = this.k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    public Map e() {
        f fVar = this.k;
        return fVar == null ? Collections.emptyMap() : fVar.e();
    }

    public long g(j jVar) {
        P2.a.f(this.k == null);
        String scheme = jVar.a.getScheme();
        if (K.D0(jVar.a)) {
            String path = jVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.k = u();
            } else {
                this.k = r();
            }
        } else if ("asset".equals(scheme)) {
            this.k = r();
        } else if ("content".equals(scheme)) {
            this.k = s();
        } else if ("rtmp".equals(scheme)) {
            this.k = w();
        } else if ("udp".equals(scheme)) {
            this.k = x();
        } else if ("data".equals(scheme)) {
            this.k = t();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.k = v();
        } else {
            this.k = this.c;
        }
        return this.k.g(jVar);
    }

    public void l(x xVar) {
        P2.a.e(xVar);
        this.c.l(xVar);
        this.b.add(xVar);
        y(this.d, xVar);
        y(this.e, xVar);
        y(this.f, xVar);
        y(this.g, xVar);
        y(this.h, xVar);
        y(this.i, xVar);
        y(this.j, xVar);
    }

    public Uri o() {
        f fVar = this.k;
        if (fVar == null) {
            return null;
        }
        return fVar.o();
    }

    public final void q(f fVar) {
        for (int i = 0; i < this.b.size(); i++) {
            fVar.l((x) this.b.get(i));
        }
    }

    public final f r() {
        if (this.e == null) {
            R2.a aVar = new R2.a(this.a);
            this.e = aVar;
            q(aVar);
        }
        return this.e;
    }

    public int read(byte[] bArr, int i, int i2) {
        return ((f) P2.a.e(this.k)).read(bArr, i, i2);
    }

    public final f s() {
        if (this.f == null) {
            d dVar = new d(this.a);
            this.f = dVar;
            q(dVar);
        }
        return this.f;
    }

    public final f t() {
        if (this.i == null) {
            e eVar = new e();
            this.i = eVar;
            q(eVar);
        }
        return this.i;
    }

    public final f u() {
        if (this.d == null) {
            o oVar = new o();
            this.d = oVar;
            q(oVar);
        }
        return this.d;
    }

    public final f v() {
        if (this.j == null) {
            v vVar = new v(this.a);
            this.j = vVar;
            q(vVar);
        }
        return this.j;
    }

    public final f w() {
        if (this.g == null) {
            try {
                f fVar = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                this.g = fVar;
                q(fVar);
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            } catch (ClassNotFoundException unused) {
                P2.o.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    public final f x() {
        if (this.h == null) {
            y yVar = new y();
            this.h = yVar;
            q(yVar);
        }
        return this.h;
    }

    public final void y(f fVar, x xVar) {
        if (fVar != null) {
            fVar.l(xVar);
        }
    }
}
