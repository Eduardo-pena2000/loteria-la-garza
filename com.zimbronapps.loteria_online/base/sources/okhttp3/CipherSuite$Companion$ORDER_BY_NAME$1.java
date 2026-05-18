package okhttp3;

import java.util.Comparator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(String a, String b) {
        t.g(a, "a");
        t.g(b, "b");
        int min = Math.min(a.length(), b.length());
        for (int i = 4; i < min; i++) {
            char charAt = a.charAt(i);
            char charAt2 = b.charAt(i);
            if (charAt != charAt2) {
                return t.h(charAt, charAt2) < 0 ? -1 : 1;
            }
        }
        int length = a.length();
        int length2 = b.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
