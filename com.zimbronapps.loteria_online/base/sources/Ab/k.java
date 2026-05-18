package ab;

import ab.a;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class k implements l {
    public static final k a = new k();

    public /* bridge */ /* synthetic */ ab.a a() {
        return a.b(b());
    }

    public long b() {
        return i.a.d();
    }

    public String toString() {
        return i.a.toString();
    }

    public static final class a implements ab.a {
        public final long a;

        public /* synthetic */ a(long j) {
            this.a = j;
        }

        public static final /* synthetic */ a b(long j) {
            return new a(j);
        }

        public static long e(long j) {
            return i.a.c(j);
        }

        public static boolean f(long j, Object obj) {
            return (obj instanceof a) && j == ((a) obj).l();
        }

        public static int g(long j) {
            return Long.hashCode(j);
        }

        public static final long h(long j, long j2) {
            return i.a.b(j, j2);
        }

        public static long i(long j, ab.a other) {
            t.g(other, "other");
            if (other instanceof a) {
                return h(j, ((a) other).l());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + k(j) + " and " + other);
        }

        public static String k(long j) {
            return "ValueTimeMark(reading=" + j + ')';
        }

        public long a() {
            return e(this.a);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(ab.a aVar) {
            return a.a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return f(this.a, obj);
        }

        public int hashCode() {
            return g(this.a);
        }

        public long j(ab.a other) {
            t.g(other, "other");
            return i(this.a, other);
        }

        public final /* synthetic */ long l() {
            return this.a;
        }

        public String toString() {
            return k(this.a);
        }

        public static long d(long j) {
            return j;
        }
    }
}
