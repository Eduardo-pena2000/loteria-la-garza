package L3;

import java.util.Objects;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface s {

    public interface a {
        public static final a a = new a();

        public class a implements a {
            public boolean a(M2.q qVar) {
                return false;
            }

            public s b(M2.q qVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            public int c(M2.q qVar) {
                return 1;
            }
        }

        boolean a(M2.q qVar);

        s b(M2.q qVar);

        int c(M2.q qVar);
    }

    public static class b {
        public static final b c = new b(-9223372036854775807L, false);
        public final long a;
        public final boolean b;

        public b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public static /* synthetic */ b a() {
            return c;
        }

        public static b b() {
            return c;
        }

        public static b c(long j) {
            return new b(j, true);
        }
    }

    default k a(byte[] bArr, int i, int i2) {
        r.a j = t7.r.j();
        b a2 = b.a();
        Objects.requireNonNull(j);
        b(bArr, i, i2, a2, new r(j));
        return new g(j.k());
    }

    void b(byte[] bArr, int i, int i2, b bVar, P2.g gVar);

    int c();

    default void reset() {
    }
}
