package A4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface c extends A4.a {

    public static final class a {
        public static final a b = new a(null);
        public static final a c = new a("NONE");
        public static final a d = new a("FULL");
        public final String a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public a() {
            }
        }

        public a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class b {
        public static final a b = new a(null);
        public static final b c = new b("VERTICAL");
        public static final b d = new b("HORIZONTAL");
        public final String a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class c {
        public static final a b = new a(null);
        public static final c c = new c("FLAT");
        public static final c d = new c("HALF_OPENED");
        public final String a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public a() {
            }
        }

        public c(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    boolean b();

    a c();

    b getOrientation();

    c getState();
}
