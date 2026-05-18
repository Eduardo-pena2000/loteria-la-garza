package f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public static final a g = new a(null);
    public static final t h = new t(false, 0, false, 0, 0, null, null, 127, null);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final h1.e f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final t a() {
            return t.a();
        }

        public a() {
        }
    }

    public /* synthetic */ t(boolean z, int i, boolean z2, int i2, int i3, L l, h1.e eVar, kotlin.jvm.internal.k kVar) {
        this(z, i, z2, i2, i3, l, eVar);
    }

    public static final /* synthetic */ t a() {
        return h;
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final h1.e d() {
        return this.f;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a != tVar.a || !y.i(this.b, tVar.b) || this.c != tVar.c || !z.n(this.d, tVar.d) || !s.m(this.e, tVar.e)) {
            return false;
        }
        tVar.getClass();
        return kotlin.jvm.internal.t.c((Object) null, (Object) null) && kotlin.jvm.internal.t.c(this.f, tVar.f);
    }

    public final int f() {
        return this.d;
    }

    public final L g() {
        return null;
    }

    public final boolean h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.a) * 31) + y.j(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + z.o(this.d)) * 31) + s.n(this.e)) * 961) + this.f.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + y.k(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + z.p(this.d) + ", imeAction=" + s.o(this.e) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.f + ')';
    }

    public t(boolean z, int i, boolean z2, int i2, int i3, L l, h1.e eVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = eVar;
    }

    public /* synthetic */ t(boolean z, int i, boolean z2, int i2, int i3, L l, h1.e eVar, int i4, kotlin.jvm.internal.k kVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? y.b.b() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? z.b.h() : i2, (i4 & 16) != 0 ? s.b.a() : i3, (i4 & 32) != 0 ? null : l, (i4 & 64) != 0 ? h1.e.c.b() : eVar, null);
    }
}
