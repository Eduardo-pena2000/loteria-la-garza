package W4;

import W4.a;
import W4.b;
import cb.K;
import kotlin.jvm.internal.k;
import xb.C;
import xb.h;
import xb.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements W4.a {
    public static final a e = new a(null);
    public final long a;
    public final C b;
    public final l c;
    public final W4.b d;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements a.b {
        public final b.b a;

        public b(b.b bVar) {
            this.a = bVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c f() {
            b.d c = this.a.c();
            if (c != null) {
                return new c(c);
            }
            return null;
        }

        public void abort() {
            this.a.a();
        }

        public C e() {
            return this.a.f(0);
        }

        public C getData() {
            return this.a.f(1);
        }
    }

    public static final class c implements a.c {
        public final b.d a;

        public c(b.d dVar) {
            this.a = dVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b c1() {
            b.b a = this.a.a();
            if (a != null) {
                return new b(a);
            }
            return null;
        }

        public void close() {
            this.a.close();
        }

        public C e() {
            return this.a.b(0);
        }

        public C getData() {
            return this.a.b(1);
        }
    }

    public d(long j, C c2, l lVar, K k) {
        this.a = j;
        this.b = c2;
        this.c = lVar;
        this.d = new W4.b(c(), d(), k, e(), 1, 2);
    }

    public a.b a(String str) {
        b.b z = this.d.z(f(str));
        if (z != null) {
            return new b(z);
        }
        return null;
    }

    public a.c b(String str) {
        b.d A = this.d.A(f(str));
        if (A != null) {
            return new c(A);
        }
        return null;
    }

    public l c() {
        return this.c;
    }

    public C d() {
        return this.b;
    }

    public long e() {
        return this.a;
    }

    public final String f(String str) {
        return h.d.d(str).C().l();
    }
}
