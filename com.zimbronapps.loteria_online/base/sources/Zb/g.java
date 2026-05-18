package zb;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g {
    public static final char a = File.separatorChar;
    public static final byte[] b = new byte[0];
    public static final String c = System.lineSeparator();
    public static final String d = h.d.b();
    public static final String e = h.c.b();
    public static final ThreadLocal f = new f(new d());
    public static final byte[] g = d();
    public static final ThreadLocal h = new f(new e());
    public static final char[] i = f();

    public static /* synthetic */ OutputStream a(Eb.e eVar, Eb.d dVar) {
        return s(eVar, dVar);
    }

    public static /* synthetic */ void b(Eb.d dVar) {
        r(dVar);
    }

    public static /* synthetic */ char[] c() {
        return f();
    }

    public static byte[] d() {
        return e(8192);
    }

    public static byte[] e(int i2) {
        return new byte[i2];
    }

    public static char[] f() {
        return g(8192);
    }

    public static char[] g(int i2) {
        return new char[i2];
    }

    public static void h(Closeable closeable) {
        j(closeable, null);
    }

    public static void i(Closeable closeable) {
        j(closeable, null);
    }

    public static void j(Closeable closeable, Consumer consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                if (consumer != null) {
                    consumer.accept(e2);
                }
            }
        }
    }

    public static void k(InputStream inputStream) {
        h(inputStream);
    }

    public static void l(OutputStream outputStream) {
        h(outputStream);
    }

    public static void m(Reader reader) {
        h(reader);
    }

    public static int n(InputStream inputStream, OutputStream outputStream) {
        long p = p(inputStream, outputStream);
        if (p > 2147483647L) {
            return -1;
        }
        return (int) p;
    }

    public static long o(InputStream inputStream, OutputStream outputStream, int i2) {
        return q(inputStream, outputStream, e(i2));
    }

    public static long p(InputStream inputStream, OutputStream outputStream) {
        return o(inputStream, outputStream, 8192);
    }

    public static long q(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static /* synthetic */ void r(Eb.d dVar) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", new Object[]{Integer.MAX_VALUE}));
    }

    public static int t(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static byte[] u(InputStream inputStream) {
        Eb.e l = Eb.e.k().l();
        try {
            Eb.d dVar = new Eb.d(Integer.MAX_VALUE, new b(), new c(l));
            try {
                n(inputStream, dVar);
                byte[] b2 = l.b();
                dVar.close();
                l.close();
                return b2;
            } finally {
            }
        } catch (Throwable th) {
            if (l != null) {
                try {
                    l.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ OutputStream s(Eb.e eVar, Eb.d dVar) {
        return eVar;
    }
}
