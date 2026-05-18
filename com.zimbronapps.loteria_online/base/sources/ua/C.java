package Ua;

import java.io.Serializable;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c {
    public static final a a = new a(null);
    public static final c b = Ka.b.a.b();

    public static final class a extends c implements Serializable {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public int b(int i) {
            return c.a().b(i);
        }

        public int c() {
            return c.a().c();
        }

        public int d(int i) {
            return c.a().d(i);
        }

        public long e() {
            return c.a().e();
        }

        public long f(long j, long j2) {
            return c.a().f(j, j2);
        }

        public a() {
        }
    }

    public static final /* synthetic */ c a() {
        return b;
    }

    public abstract int b(int i);

    public abstract int c();

    public abstract int d(int i);

    public abstract long e();

    public long f(long j, long j2) {
        long e;
        long j3;
        long j4;
        int c;
        d.b(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    c = b(d.c(i));
                } else if (i2 == 1) {
                    c = c();
                } else {
                    j4 = (b(d.c(i2)) << 32) + (c() & 4294967295L);
                }
                j4 = c & 4294967295L;
            } else {
                do {
                    e = e() >>> 1;
                    j3 = e % j5;
                } while ((e - j3) + (j5 - 1) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long e2 = e();
            if (j <= e2 && e2 < j2) {
                return e2;
            }
        }
    }
}
