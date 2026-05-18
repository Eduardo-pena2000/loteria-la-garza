package s7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class d implements n {

    public static abstract class a extends d {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    public static final class b extends a {
        public final char a;

        public b(char c) {
            this.a = c;
        }

        public boolean e(char c) {
            return c == this.a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.a(this.a) + "')";
        }
    }

    public static abstract class c extends a {
        public final String a;

        public c(String str) {
            this.a = (String) m.j(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    public static final class d extends c {
        public static final d b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        public int c(CharSequence charSequence, int i) {
            m.l(i, charSequence.length());
            return -1;
        }

        public boolean e(char c) {
            return false;
        }
    }

    public static /* synthetic */ String a(char c2) {
        return g(c2);
    }

    public static d d(char c2) {
        return new b(c2);
    }

    public static d f() {
        return d.b;
    }

    public static String g(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        m.l(i, length);
        while (i < length) {
            if (e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean e(char c2);
}
