package I;

import b0.C0;
import b0.U1;
import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z implements h2 {
    public static final a e = new a(null);
    public final int a;
    public final int b;
    public final C0 c;
    public int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ Wa.i a(a aVar, int i, int i2, int i3) {
            return aVar.b(i, i2, i3);
        }

        public final Wa.i b(int i, int i2, int i3) {
            int i4 = (i / i2) * i2;
            return Wa.n.w(Math.max(i4 - i3, 0), i4 + i2 + i3);
        }

        public a() {
        }
    }

    public z(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = U1.h(a.a(e, i, i2, i3), U1.q());
        this.d = i;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Wa.i getValue() {
        return (Wa.i) this.c.getValue();
    }

    public final void e(Wa.i iVar) {
        this.c.setValue(iVar);
    }

    public final void f(int i) {
        if (i != this.d) {
            this.d = i;
            e(a.a(e, i, this.a, this.b));
        }
    }
}
