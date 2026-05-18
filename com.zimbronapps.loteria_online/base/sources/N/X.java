package N;

import f1.s;
import f1.y;
import f1.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x {
    public static final a g = new a(null);
    public static final x h = new x(0, null, 0, 0, null, null, null, 127, null);
    public static final x i = new x(0, Boolean.FALSE, f1.z.b.f(), 0, null, null, null, 121, null);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final h1.e f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final x a() {
            return x.a();
        }

        public a() {
        }
    }

    public /* synthetic */ x(int i2, Boolean bool, int i3, int i4, f1.L l, Boolean bool2, h1.e eVar, kotlin.jvm.internal.k kVar) {
        this(i2, bool, i3, i4, l, bool2, eVar);
    }

    public static final /* synthetic */ x a() {
        return h;
    }

    public final boolean b() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final int c() {
        f1.y f = f1.y.f(this.a);
        int l = f.l();
        y.a aVar = f1.y.b;
        if (f1.y.i(l, aVar.d())) {
            f = null;
        }
        return f != null ? f.l() : aVar.b();
    }

    public final h1.e d() {
        h1.e eVar = this.f;
        return eVar == null ? h1.e.c.b() : eVar;
    }

    public final int e() {
        f1.s j = f1.s.j(this.d);
        int p = j.p();
        s.a aVar = f1.s.b;
        if (f1.s.m(p, aVar.i())) {
            j = null;
        }
        return j != null ? j.p() : aVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!f1.y.i(this.a, xVar.a) || !kotlin.jvm.internal.t.c(this.b, xVar.b) || !f1.z.n(this.c, xVar.c) || !f1.s.m(this.d, xVar.d)) {
            return false;
        }
        xVar.getClass();
        return kotlin.jvm.internal.t.c((Object) null, (Object) null) && kotlin.jvm.internal.t.c(this.e, xVar.e) && kotlin.jvm.internal.t.c(this.f, xVar.f);
    }

    public final int f() {
        f1.z k = f1.z.k(this.c);
        int q = k.q();
        z.a aVar = f1.z.b;
        if (f1.z.n(q, aVar.i())) {
            k = null;
        }
        return k != null ? k.q() : aVar.h();
    }

    public final f1.t g(boolean z) {
        return new f1.t(z, c(), b(), f(), e(), null, d(), null);
    }

    public int hashCode() {
        int j = f1.y.j(this.a) * 31;
        Boolean bool = this.b;
        int hashCode = (((((j + (bool != null ? bool.hashCode() : 0)) * 31) + f1.z.o(this.c)) * 31) + f1.s.n(this.d)) * 961;
        Boolean bool2 = this.e;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        h1.e eVar = this.f;
        return hashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + f1.y.k(this.a) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + f1.z.p(this.c) + ", imeAction=" + f1.s.o(this.d) + ", platformImeOptions=" + ((Object) null) + "showKeyboardOnFocus=" + this.e + ", hintLocales=" + this.f + ')';
    }

    public x(int i2, Boolean bool, int i3, int i4, f1.L l, Boolean bool2, h1.e eVar) {
        this.a = i2;
        this.b = bool;
        this.c = i3;
        this.d = i4;
        this.e = bool2;
        this.f = eVar;
    }

    public /* synthetic */ x(int i2, Boolean bool, int i3, int i4, f1.L l, Boolean bool2, h1.e eVar, int i5, kotlin.jvm.internal.k kVar) {
        this((i5 & 1) != 0 ? f1.y.b.d() : i2, (i5 & 2) != 0 ? null : bool, (i5 & 4) != 0 ? f1.z.b.i() : i3, (i5 & 8) != 0 ? f1.s.b.i() : i4, (i5 & 16) != 0 ? null : l, (i5 & 32) != 0 ? null : bool2, (i5 & 64) == 0 ? eVar : null, null);
    }
}
