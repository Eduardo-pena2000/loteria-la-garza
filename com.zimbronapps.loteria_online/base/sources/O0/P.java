package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public final n a;
    public final n b;
    public final n c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[B.values().length];
            try {
                iArr[B.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[B.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public p(boolean z) {
        this.a = new n(z);
        this.b = new n(z);
        this.c = new n(z);
    }

    public static final /* synthetic */ n a(p pVar) {
        return pVar.c;
    }

    public static final /* synthetic */ n b(p pVar) {
        return pVar.a;
    }

    public static final /* synthetic */ n c(p pVar) {
        return pVar.b;
    }

    public final void d(J j, B b) {
        int i = a.a[b.ordinal()];
        if (i == 1) {
            this.a.a(j);
            this.c.a(j);
            return;
        }
        if (i == 2) {
            this.b.a(j);
            this.c.a(j);
            return;
        }
        if (i == 3) {
            if (j.j0() != null) {
                this.c.a(j);
                return;
            } else {
                this.a.a(j);
                return;
            }
        }
        if (i != 4) {
            throw new Ca.o();
        }
        if (j.j0() != null) {
            this.c.a(j);
        } else {
            this.b.a(j);
        }
    }

    public final boolean e(J j) {
        return this.a.b(j) || this.b.b(j) || this.c.b(j);
    }

    public final boolean f(J j, boolean z) {
        boolean z2 = j.j0() == null;
        boolean z3 = this.a.b(j) || this.b.b(j);
        if (z) {
            if (z2 || !z3) {
                return false;
            }
        } else if ((!z2 || !z3) && !this.c.b(j)) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return (this.c.c() || this.a.c()) ? false : true;
    }

    public final boolean h() {
        return this.a.c() && this.c.c() && this.b.c();
    }

    public final boolean i() {
        return !h();
    }

    public final boolean j(J j) {
        return this.c.e(j) || this.a.e(j) || this.b.e(j);
    }
}
