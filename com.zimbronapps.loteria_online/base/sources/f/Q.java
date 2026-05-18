package F;

import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {
    public static final b a = new b(null);
    public static final q b = a.e;
    public static final q c = e.e;
    public static final q d = c.e;

    public static final class a extends q {
        public static final a e = new a();

        public a() {
            super(null);
        }

        public int a(int i, n1.t tVar, androidx.compose.ui.layout.q qVar, int i2) {
            return i / 2;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final q a(e.b bVar) {
            return new d(bVar);
        }

        public final q b(e.c cVar) {
            return new f(cVar);
        }

        public b() {
        }
    }

    public static final class c extends q {
        public static final c e = new c();

        public c() {
            super(null);
        }

        public int a(int i, n1.t tVar, androidx.compose.ui.layout.q qVar, int i2) {
            if (tVar == n1.t.a) {
                return i;
            }
            return 0;
        }
    }

    public static final class d extends q {
        public final e.b e;

        public d(e.b bVar) {
            super(null);
            this.e = bVar;
        }

        public int a(int i, n1.t tVar, androidx.compose.ui.layout.q qVar, int i2) {
            return this.e.a(0, i, tVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.t.c(this.e, ((d) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.e + ')';
        }
    }

    public static final class e extends q {
        public static final e e = new e();

        public e() {
            super(null);
        }

        public int a(int i, n1.t tVar, androidx.compose.ui.layout.q qVar, int i2) {
            if (tVar == n1.t.a) {
                return 0;
            }
            return i;
        }
    }

    public static final class f extends q {
        public final e.c e;

        public f(e.c cVar) {
            super(null);
            this.e = cVar;
        }

        public int a(int i, n1.t tVar, androidx.compose.ui.layout.q qVar, int i2) {
            return this.e.a(0, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.t.c(this.e, ((f) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.e + ')';
        }
    }

    public /* synthetic */ q(kotlin.jvm.internal.k kVar) {
        this();
    }

    public abstract int a(int i, n1.t tVar, androidx.compose.ui.layout.q qVar, int i2);

    public Integer b(androidx.compose.ui.layout.q qVar) {
        return null;
    }

    public boolean c() {
        return false;
    }

    public q() {
    }
}
