package okhttp3.internal.ws;

import kotlin.jvm.internal.t;
import xb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebSocketProtocol {
    public static final WebSocketProtocol a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public final String a(int i) {
        if (i < 1000 || i >= 5000) {
            return t.o("Code must be in range [1000,5000): ", Integer.valueOf(i));
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    public final void b(e.a cursor, byte[] key) {
        t.g(cursor, "cursor");
        t.g(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.e;
            int i2 = cursor.f;
            int i3 = cursor.g;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (cursor.b() != -1);
    }

    public final void c(int i) {
        String a2 = a(i);
        if (a2 == null) {
            return;
        }
        t.d(a2);
        throw new IllegalArgumentException(a2.toString());
    }
}
