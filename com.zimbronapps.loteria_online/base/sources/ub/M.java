package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class m {
    public static final m a;
    public static final char[] b;
    public static final byte[] c;

    static {
        m mVar = new m();
        a = mVar;
        b = new char[117];
        c = new byte[126];
        mVar.f();
        mVar.e();
    }

    public final void a(char c2, char c3) {
        b(c2, c3);
    }

    public final void b(int i, char c2) {
        if (c2 != 'u') {
            b[c2] = (char) i;
        }
    }

    public final void c(char c2, byte b2) {
        d(c2, b2);
    }

    public final void d(int i, byte b2) {
        c[i] = b2;
    }

    public final void e() {
        for (int i = 0; i < 33; i++) {
            d(i, Byte.MAX_VALUE);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    public final void f() {
        for (int i = 0; i < 32; i++) {
            b(i, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
