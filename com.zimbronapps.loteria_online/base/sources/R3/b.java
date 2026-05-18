package R3;

import android.text.TextUtils;
import java.util.regex.Pattern;
import t7.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final t e = t.t("auto", "none");
    public static final t f = t.u("dot", "sesame", "circle");
    public static final t g = t.t("filled", "open");
    public static final t h = t.u("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e2 = s7.c.e(str.trim());
        if (e2.isEmpty()) {
            return null;
        }
        return b(t.n(TextUtils.split(e2, d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static R3.b b(t7.t r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.b(t7.t):R3.b");
    }
}
