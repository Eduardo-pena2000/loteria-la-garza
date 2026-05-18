package Ca;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class y implements Comparable {
    public static final a b = new a(null);
    public final byte a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ y(byte b2) {
        this.a = b2;
    }

    public static final /* synthetic */ y a(byte b2) {
        return new y(b2);
    }

    public static boolean c(byte b2, Object obj) {
        return (obj instanceof y) && b2 == ((y) obj).f();
    }

    public static int d(byte b2) {
        return Byte.hashCode(b2);
    }

    public static String e(byte b2) {
        return String.valueOf(b2 & 255);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.t.h(f() & 255, ((y) obj).f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }

    public static byte b(byte b2) {
        return b2;
    }
}
