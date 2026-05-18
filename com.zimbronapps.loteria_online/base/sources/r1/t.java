package r1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public t(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }

    public final int d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b && this.c == tVar.c && this.d == tVar.d && this.e == tVar.e && this.f == tVar.f;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public /* synthetic */ t(boolean z, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    public t(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, u.a, true, z4);
    }

    public /* synthetic */ t(boolean z, boolean z2, boolean z3, u uVar, boolean z4, boolean z5, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? u.a : uVar, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }

    public t(boolean z, boolean z2, boolean z3, u uVar, boolean z4, boolean z5) {
        this(z, z2, z3, uVar, z4, z5, false);
    }

    public t(boolean z, boolean z2, boolean z3, u uVar, boolean z4, boolean z5, boolean z6) {
        this(b.d(z, uVar, z5), uVar == u.a, z2, z3, z4, z6);
    }
}
