package androidx.compose.ui.platform;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends androidx.compose.ui.platform.a {
    public static final a c = new a(null);
    public static final int d = 8;
    public static e e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final e a() {
            if (e.g() == null) {
                e.h(new e(null));
            }
            e g = e.g();
            t.e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return g;
        }

        public a() {
        }
    }

    public /* synthetic */ e(kotlin.jvm.internal.k kVar) {
        this();
    }

    public static final /* synthetic */ e g() {
        return e;
    }

    public static final /* synthetic */ void h(e eVar) {
        e = eVar;
    }

    public int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && d().charAt(i) == '\n' && !j(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !i(i2)) {
            i2++;
        }
        return c(i, i2);
    }

    public int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && d().charAt(i - 1) == '\n' && !i(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !j(i2)) {
            i2--;
        }
        return c(i2, i);
    }

    public final boolean i(int i) {
        return i > 0 && d().charAt(i + (-1)) != '\n' && (i == d().length() || d().charAt(i) == '\n');
    }

    public final boolean j(int i) {
        return d().charAt(i) != '\n' && (i == 0 || d().charAt(i - 1) == '\n');
    }

    public e() {
    }
}
