package G4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface p {
    public static final b.c a = new b.c(null);
    public static final b.b b = new b.b(null);

    public static abstract class b {

        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        public static final class b extends b {
            public /* synthetic */ b(a aVar) {
                this();
            }

            public String toString() {
                return "IN_PROGRESS";
            }

            public b() {
            }
        }

        public static final class c extends b {
            public /* synthetic */ c(a aVar) {
                this();
            }

            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }
}
