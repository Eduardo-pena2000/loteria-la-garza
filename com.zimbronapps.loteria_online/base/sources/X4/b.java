package x4;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final a c = new a(null);
    public final c a;
    public final x4.a b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final b a(float f, float f2) {
            return new b(c.b.a(f), x4.a.b.a(f2), null);
        }

        public a() {
        }
    }

    public /* synthetic */ b(c cVar, x4.a aVar, k kVar) {
        this(cVar, aVar);
    }

    public final x4.a a() {
        return this.b;
    }

    public final c b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass");
        b bVar = (b) obj;
        return t.c(this.a, bVar.a) && t.c(this.b, bVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "WindowSizeClass {windowWidthSizeClass=" + this.a + ", windowHeightSizeClass=" + this.b + " }";
    }

    public b(c cVar, x4.a aVar) {
        this.a = cVar;
        this.b = aVar;
    }
}
