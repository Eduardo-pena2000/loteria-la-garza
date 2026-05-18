package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i0 {
    public static final i0 a = new i0();

    public static final class a implements M0.A {
        public final M0.l a;
        public final c b;
        public final d c;

        public a(M0.l lVar, c cVar, d dVar) {
            this.a = lVar;
            this.b = cVar;
            this.c = dVar;
        }

        public int A0(int i) {
            return this.a.A0(i);
        }

        public int B0(int i) {
            return this.a.B0(i);
        }

        public androidx.compose.ui.layout.q C0(long j) {
            if (this.c == d.a) {
                return new b(this.b == c.b ? this.a.B0(n1.b.k(j)) : this.a.A0(n1.b.k(j)), n1.b.g(j) ? n1.b.k(j) : 32767);
            }
            return new b(n1.b.h(j) ? n1.b.l(j) : 32767, this.b == c.b ? this.a.J(n1.b.l(j)) : this.a.q0(n1.b.l(j)));
        }

        public int J(int i) {
            return this.a.J(i);
        }

        public Object j() {
            return this.a.j();
        }

        public int q0(int i) {
            return this.a.q0(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a = new c("Min", 0);
        public static final c b = new c("Max", 1);
        public static final /* synthetic */ c[] c;
        public static final /* synthetic */ Ja.a d;

        static {
            c[] a2 = a();
            c = a2;
            d = Ja.b.a(a2);
        }

        public c(String str, int i) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{a, b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a = new d("Width", 0);
        public static final d b = new d("Height", 1);
        public static final /* synthetic */ d[] c;
        public static final /* synthetic */ Ja.a d;

        static {
            d[] a2 = a();
            c = a2;
            d = Ja.b.a(a2);
        }

        public d(String str, int i) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{a, b};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    public interface e {
        M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a, long j);
    }

    public final int a(e eVar, M0.m mVar, M0.l lVar, int i) {
        return eVar.measure-3p2s80s(new androidx.compose.ui.layout.g(mVar, mVar.getLayoutDirection()), new a(lVar, c.b, d.b), n1.c.b(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int b(e eVar, M0.m mVar, M0.l lVar, int i) {
        return eVar.measure-3p2s80s(new androidx.compose.ui.layout.g(mVar, mVar.getLayoutDirection()), new a(lVar, c.b, d.a), n1.c.b(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int c(e eVar, M0.m mVar, M0.l lVar, int i) {
        return eVar.measure-3p2s80s(new androidx.compose.ui.layout.g(mVar, mVar.getLayoutDirection()), new a(lVar, c.a, d.b), n1.c.b(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int d(e eVar, M0.m mVar, M0.l lVar, int i) {
        return eVar.measure-3p2s80s(new androidx.compose.ui.layout.g(mVar, mVar.getLayoutDirection()), new a(lVar, c.a, d.a), n1.c.b(0, 0, 0, i, 7, null)).getWidth();
    }

    public static final class b extends androidx.compose.ui.layout.q {
        public b(int i, int i2) {
            g1(n1.r.c((i2 & 4294967295L) | (i << 32)));
        }

        public int W(M0.a aVar) {
            return Integer.MIN_VALUE;
        }

        public void Z0(long j, float f, Qa.l lVar) {
        }
    }
}
