package o3;

import java.io.EOFException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static void a(boolean z, String str) {
        if (!z) {
            throw M2.z.a(str, null);
        }
    }

    public static boolean b(q qVar, byte[] bArr, int i, int i2, boolean z) {
        try {
            return qVar.d(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int c(q qVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int k = qVar.k(bArr, i + i3, i2 - i3);
            if (k == -1) {
                break;
            }
            i3 += k;
        }
        return i3;
    }

    public static boolean d(q qVar, byte[] bArr, int i, int i2) {
        try {
            qVar.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(q qVar, int i) {
        try {
            qVar.m(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
