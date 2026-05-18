package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");
    public static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final g f;

    public interface a {
        boolean isInRange(int i);
    }

    public interface b extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        b mutableCopyWithCapacity(int i);
    }

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = g.i(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i, int i2) {
        int g = g(i2, bArr, i, i2);
        if (g == 0) {
            return 1;
        }
        return g;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int g(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
