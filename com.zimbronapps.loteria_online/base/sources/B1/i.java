package b1;

import a1.I;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public static final a e = new a(null);
    public static final int f = 8;
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final boolean a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public a() {
        }
    }

    public i(CharSequence charSequence, int i, int i2, Locale locale) {
        this.a = charSequence;
        if (!(i >= 0 && i <= charSequence.length())) {
            g1.a.a("input start index is outside the CharSequence");
        }
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            g1.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, i - 50);
        this.c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new I(charSequence, i, i2));
    }

    public final void a(int i) {
        int i2 = this.b;
        boolean z = false;
        if (i <= this.c && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        g1.a.a("Invalid offset: " + i + ". Valid range is [" + this.b + " , " + this.c + ']');
    }

    public final int b(int i, boolean z) {
        a(i);
        if (l(i)) {
            return (!j(i) || (h(i) && z)) ? q(i) : i;
        }
        if (h(i)) {
            return q(i);
        }
        return -1;
    }

    public final int c(int i, boolean z) {
        a(i);
        if (h(i)) {
            return (!j(i) || (l(i) && z)) ? p(i) : i;
        }
        if (l(i)) {
            return p(i);
        }
        return -1;
    }

    public final int d(int i) {
        return c(i, true);
    }

    public final int e(int i) {
        return b(i, true);
    }

    public final int f(int i) {
        a(i);
        while (i != -1 && !o(i)) {
            i = q(i);
        }
        return i;
    }

    public final int g(int i) {
        a(i);
        while (i != -1 && !n(i)) {
            i = p(i);
        }
        return i;
    }

    public final boolean h(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.a, i))) {
            return true;
        }
        int i3 = i - 1;
        if (Character.isSurrogate(this.a.charAt(i3))) {
            return true;
        }
        if (!androidx.emoji2.text.c.k()) {
            return false;
        }
        androidx.emoji2.text.c c = androidx.emoji2.text.c.c();
        return c.g() == 1 && c.f(this.a, i3) != -1;
    }

    public final boolean i(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return e.a(Character.codePointBefore(this.a, i));
    }

    public final boolean j(int i) {
        a(i);
        if (this.d.isBoundary(i) && (!l(i) || !l(i - 1) || !l(i + 1))) {
            if (i <= 0 || i >= this.a.length() - 1) {
                return true;
            }
            if (!k(i) && !k(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(int i) {
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(this.a.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        return (t.c(of, unicodeBlock) && t.c(Character.UnicodeBlock.of(this.a.charAt(i)), Character.UnicodeBlock.KATAKANA)) || (t.c(Character.UnicodeBlock.of(this.a.charAt(i)), unicodeBlock) && t.c(Character.UnicodeBlock.of(this.a.charAt(i2)), Character.UnicodeBlock.KATAKANA));
    }

    public final boolean l(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.a, i)) || Character.isSurrogate(this.a.charAt(i))) {
            return true;
        }
        if (!androidx.emoji2.text.c.k()) {
            return false;
        }
        androidx.emoji2.text.c c = androidx.emoji2.text.c.c();
        return c.g() == 1 && c.f(this.a, i) != -1;
    }

    public final boolean m(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return e.a(Character.codePointAt(this.a, i));
    }

    public final boolean n(int i) {
        return !m(i) && i(i);
    }

    public final boolean o(int i) {
        return m(i) && !i(i);
    }

    public final int p(int i) {
        a(i);
        int following = this.d.following(i);
        return (l(following + (-1)) && l(following) && !k(following)) ? p(following) : following;
    }

    public final int q(int i) {
        a(i);
        int preceding = this.d.preceding(i);
        return (l(preceding) && h(preceding) && !k(preceding)) ? q(preceding) : preceding;
    }
}
