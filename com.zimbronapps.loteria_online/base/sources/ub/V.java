package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class v extends n {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(A writer, boolean z) {
        super(writer);
        kotlin.jvm.internal.t.g(writer, "writer");
        this.c = z;
    }

    public void e(byte b) {
        boolean z = this.c;
        String e = Ca.y.e(Ca.y.b(b));
        if (z) {
            n(e);
        } else {
            k(e);
        }
    }

    public void i(int i) {
        boolean z = this.c;
        int b = Ca.A.b(i);
        if (z) {
            n(r.a(b));
        } else {
            k(s.a(b));
        }
    }

    public void j(long j) {
        boolean z = this.c;
        long b = Ca.C.b(j);
        if (z) {
            n(p.a(b));
        } else {
            k(q.a(b));
        }
    }

    public void l(short s) {
        boolean z = this.c;
        String e = Ca.F.e(Ca.F.b(s));
        if (z) {
            n(e);
        } else {
            k(e);
        }
    }
}
