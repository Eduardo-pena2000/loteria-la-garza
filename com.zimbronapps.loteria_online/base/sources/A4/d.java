package A4;

import A4.c;
import android.graphics.Rect;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements c {
    public static final a d = new a(null);
    public final w4.b a;
    public final b b;
    public final c.c c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final void a(w4.b bVar) {
            t.g(bVar, "bounds");
            if (bVar.d() == 0 && bVar.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bVar.b() != 0 && bVar.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    public static final class b {
        public static final a b = new a(null);
        public static final b c = new b("FOLD");
        public static final b d = new b("HINGE");
        public final String a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final b a() {
                return b.a();
            }

            public final b b() {
                return b.b();
            }

            public a() {
            }
        }

        public b(String str) {
            this.a = str;
        }

        public static final /* synthetic */ b a() {
            return c;
        }

        public static final /* synthetic */ b b() {
            return d;
        }

        public String toString() {
            return this.a;
        }
    }

    public d(w4.b bVar, b bVar2, c.c cVar) {
        t.g(bVar, "featureBounds");
        t.g(bVar2, "type");
        t.g(cVar, "state");
        this.a = bVar;
        this.b = bVar2;
        this.c = cVar;
        d.a(bVar);
    }

    public Rect a() {
        return this.a.f();
    }

    public boolean b() {
        b bVar = this.b;
        b.a aVar = b.b;
        if (t.c(bVar, aVar.b())) {
            return true;
        }
        return t.c(this.b, aVar.a()) && t.c(getState(), c.c.d);
    }

    public c.a c() {
        return (this.a.d() == 0 || this.a.a() == 0) ? c.a.c : c.a.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return t.c(this.a, dVar.a) && t.c(this.b, dVar.b) && t.c(getState(), dVar.getState());
    }

    public c.b getOrientation() {
        return this.a.d() > this.a.a() ? c.b.d : c.b.c;
    }

    public c.c getState() {
        return this.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + getState() + " }";
    }
}
