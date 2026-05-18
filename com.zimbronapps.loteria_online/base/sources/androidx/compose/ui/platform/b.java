package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b extends androidx.compose.ui.platform.a {
    public static final a d = new a(null);
    public static final int e = 8;
    public static b f;
    public BreakIterator c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final b a(Locale locale) {
            if (b.g() == null) {
                b.h(new b(locale, null));
            }
            b g = b.g();
            t.e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return g;
        }

        public a() {
        }
    }

    public /* synthetic */ b(Locale locale, kotlin.jvm.internal.k kVar) {
        this(locale);
    }

    public static final /* synthetic */ b g() {
        return f;
    }

    public static final /* synthetic */ void h(b bVar) {
        f = bVar;
    }

    public int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                t.v("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    t.v("impl");
                    breakIterator2 = null;
                }
                int following = breakIterator2.following(i);
                if (following == -1) {
                    return null;
                }
                return c(i, following);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                t.v("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
    }

    public int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                t.v("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    t.v("impl");
                    breakIterator2 = null;
                }
                int preceding = breakIterator2.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                t.v("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
        return null;
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

    public final void i(Locale locale) {
        this.c = BreakIterator.getCharacterInstance(locale);
    }

    public b(Locale locale) {
        i(locale);
    }
}
