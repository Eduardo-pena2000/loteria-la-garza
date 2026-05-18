package k3;

import g3.r;
import g3.u;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface k {

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(int i) {
            if (i == 1) {
                if (this.a - this.b <= 1) {
                    return false;
                }
            } else if (this.c - this.d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            P2.a.a(j >= 0);
            this.a = i;
            this.b = j;
        }
    }

    public static final class c {
        public final r a;
        public final u b;
        public final IOException c;
        public final int d;

        public c(r rVar, u uVar, IOException iOException, int i) {
            this.a = rVar;
            this.b = uVar;
            this.c = iOException;
            this.d = i;
        }
    }

    b a(a aVar, c cVar);

    int b(int i);

    long c(c cVar);

    default void d(long j) {
    }
}
