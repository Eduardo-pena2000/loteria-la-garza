package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i1 {

    public static final class a extends i1 {
        public final m1 a;

        public a(m1 m1Var) {
            super(null);
            this.a = m1Var;
        }

        public u0.h a() {
            return this.a.a();
        }

        public final m1 b() {
            return this.a;
        }
    }

    public static final class b extends i1 {
        public final u0.h a;

        public b(u0.h hVar) {
            super(null);
            this.a = hVar;
        }

        public u0.h a() {
            return this.a;
        }

        public final u0.h b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.t.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class c extends i1 {
        public final u0.j a;
        public final m1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u0.j jVar) {
            super(null);
            m1 m1Var = null;
            this.a = jVar;
            if (!u0.k.e(jVar)) {
                m1 a = V.a();
                m1.h(a, jVar, null, 2, null);
                m1Var = a;
            }
            this.b = m1Var;
        }

        public u0.h a() {
            return u0.k.d(this.a);
        }

        public final u0.j b() {
            return this.a;
        }

        public final m1 c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.t.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public /* synthetic */ i1(kotlin.jvm.internal.k kVar) {
        this();
    }

    public abstract u0.h a();

    public i1() {
    }
}
