package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public final boolean a;
    public w.K b;
    public final D0 c = new D0(o.a());

    public n(boolean z) {
        this.a = z;
    }

    public final void a(J j) {
        if (!j.g()) {
            L0.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.a) {
            w.K f = f();
            int e = f.e(j, Integer.MAX_VALUE);
            if (e == Integer.MAX_VALUE) {
                f.u(j, j.S());
            } else {
                if (!(e == j.S())) {
                    L0.a.b("invalid node depth");
                }
            }
        }
        this.c.add(j);
    }

    public final boolean b(J j) {
        boolean contains = this.c.contains(j);
        if (this.a) {
            if (!(contains == f().a(j))) {
                L0.a.b("inconsistency in TreeSet");
            }
        }
        return contains;
    }

    public final boolean c() {
        return this.c.isEmpty();
    }

    public final J d() {
        J j = (J) this.c.first();
        e(j);
        return j;
    }

    public final boolean e(J j) {
        if (!j.g()) {
            L0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.c.remove(j);
        if (this.a) {
            w.K f = f();
            if (f.a(j)) {
                int c = f.c(j);
                f.r(j);
                if (!(c == (remove ? j.S() : Integer.MAX_VALUE))) {
                    L0.a.b("invalid node depth");
                }
            }
        }
        return remove;
    }

    public final w.K f() {
        if (this.b == null) {
            this.b = w.U.b();
        }
        w.K k = this.b;
        kotlin.jvm.internal.t.d(k);
        return k;
    }

    public String toString() {
        return this.c.toString();
    }
}
