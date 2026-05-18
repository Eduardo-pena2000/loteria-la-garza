package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends androidx.compose.ui.platform.a {
    public static final a d = new a(null);
    public static final int e = 8;
    public static f f;
    public BreakIterator c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final f a(Locale locale) {
            if (f.g() == null) {
                f.h(new f(locale, null));
            }
            f g = f.g();
            t.e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return g;
        }

        public a() {
        }
    }

    public /* synthetic */ f(Locale locale, kotlin.jvm.internal.k kVar) {
        this(locale);
    }

    public static final /* synthetic */ f g() {
        return f;
    }

    public static final /* synthetic */ void h(f fVar) {
        f = fVar;
    }

    private final boolean i(int i) {
        return i > 0 && j(i + (-1)) && (i == d().length() || !j(i));
    }

    private final boolean k(int i) {
        return j(i) && (i == 0 || !j(i - 1));
    }

    private final void l(Locale locale) {
        this.c = BreakIterator.getWordInstance(locale);
    }

    public int[] a(int i) {
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!j(i) && !k(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                t.v("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            t.v("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i);
        if (following == -1 || !i(following)) {
            return null;
        }
        return c(i, following);
    }

    public int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !j(i - 1) && !i(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                t.v("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            t.v("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i);
        if (preceding == -1 || !k(preceding)) {
            return null;
        }
        return c(preceding, i);
    }

    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.c;
        if (breakIterator == null) {
            t.v("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    public final boolean j(int i) {
        if (i < 0 || i >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i));
    }

    public f(Locale locale) {
        l(locale);
    }
}
