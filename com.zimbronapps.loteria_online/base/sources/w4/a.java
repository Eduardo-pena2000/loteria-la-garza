package W4;

import Wa.n;
import android.os.StatFs;
import cb.K;
import cb.e0;
import java.io.Closeable;
import java.io.File;
import xb.C;
import xb.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface a {

    public static final class a {
        public C a;
        public long f;
        public l b = l.b;
        public double c = 0.02d;
        public long d = 10485760;
        public long e = 262144000;
        public K g = e0.b();

        public final a a() {
            long j;
            C c = this.a;
            if (c == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.c > 0.0d) {
                try {
                    File m = c.m();
                    m.mkdir();
                    StatFs statFs = new StatFs(m.getAbsolutePath());
                    j = n.o((long) (this.c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.e);
                } catch (Exception unused) {
                    j = this.d;
                }
            } else {
                j = this.f;
            }
            return new d(j, c, this.b, this.g);
        }

        public final a b(File file) {
            return c(C.a.d(C.b, file, false, 1, (Object) null));
        }

        public final a c(C c) {
            this.a = c;
            return this;
        }

        public final a d(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.c = 0.0d;
            this.f = j;
            return this;
        }
    }

    public interface b {
        void abort();

        C e();

        c f();

        C getData();
    }

    public interface c extends Closeable {
        b c1();

        C e();

        C getData();
    }

    b a(String str);

    c b(String str);

    l c();
}
