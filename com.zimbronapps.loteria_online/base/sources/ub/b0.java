package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b0 extends a {
    public final String e;

    public b0(String source) {
        kotlin.jvm.internal.t.g(source, "source");
        this.e = source;
    }

    public String E(String keyToMatch, boolean z) {
        kotlin.jvm.internal.t.g(keyToMatch, "keyToMatch");
        int i = this.a;
        try {
            if (j() == 6 && kotlin.jvm.internal.t.c(G(z), keyToMatch)) {
                t();
                if (j() == 5) {
                    return G(z);
                }
            }
            return null;
        } finally {
            this.a = i;
            t();
        }
    }

    public int H(int i) {
        if (i < C().length()) {
            return i;
        }
        return -1;
    }

    public int J() {
        char charAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        String C = C();
        while (i < C.length() && ((charAt = C.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.a = i;
        return i;
    }

    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.e;
    }

    public boolean e() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        String C = C();
        while (i < C.length()) {
            char charAt = C.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i;
                return D(charAt);
            }
            i++;
        }
        this.a = i;
        return false;
    }

    public String i() {
        l('\"');
        int i = this.a;
        int e0 = Za.E.e0(C(), '\"', i, false, 4, null);
        if (e0 == -1) {
            q();
            y((byte) 1, false);
            throw new Ca.i();
        }
        for (int i2 = i; i2 < e0; i2++) {
            if (C().charAt(i2) == '\\') {
                return p(C(), this.a, i2);
            }
        }
        this.a = e0 + 1;
        String substring = C().substring(i, e0);
        kotlin.jvm.internal.t.f(substring, "substring(...)");
        return substring;
    }

    public byte j() {
        String C = C();
        int i = this.a;
        while (i != -1 && i < C.length()) {
            int i2 = i + 1;
            char charAt = C.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i2;
                return b.a(charAt);
            }
            i = i2;
        }
        this.a = C.length();
        return (byte) 10;
    }

    public void l(char c) {
        if (this.a == -1) {
            P(c);
        }
        String C = C();
        int i = this.a;
        while (i < C.length()) {
            int i2 = i + 1;
            char charAt = C.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i2;
                if (charAt == c) {
                    return;
                } else {
                    P(c);
                }
            }
            i = i2;
        }
        this.a = -1;
        P(c);
    }
}
