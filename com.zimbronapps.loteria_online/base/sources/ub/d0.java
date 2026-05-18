package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d0 extends b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String source) {
        super(source);
        kotlin.jvm.internal.t.g(source, "source");
    }

    public byte F() {
        String C = C();
        int J = J();
        if (J >= C.length() || J == -1) {
            return (byte) 10;
        }
        this.a = J;
        return b.a(C.charAt(J));
    }

    public int J() {
        int i;
        int i2 = this.a;
        if (i2 == -1) {
            return i2;
        }
        String C = C();
        while (i2 < C.length()) {
            char charAt = C.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i = i2 + 1) >= C.length()) {
                    break;
                }
                char charAt2 = C.charAt(i);
                if (charAt2 == '*') {
                    int f0 = Za.E.f0(C, "*/", i2 + 2, false, 4, null);
                    if (f0 == -1) {
                        this.a = C.length();
                        a.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new Ca.i();
                    }
                    i2 = f0 + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i2 = Za.E.e0(C, '\n', i2 + 2, false, 4, null);
                    i2 = i2 == -1 ? C.length() : i2 + 1;
                }
            }
        }
        this.a = i2;
        return i2;
    }

    public boolean e() {
        int J = J();
        if (J >= C().length() || J == -1) {
            return false;
        }
        return D(C().charAt(J));
    }

    public byte j() {
        String C = C();
        int J = J();
        if (J >= C.length() || J == -1) {
            return (byte) 10;
        }
        this.a = J + 1;
        return b.a(C.charAt(J));
    }

    public void l(char c) {
        String C = C();
        int J = J();
        if (J >= C.length() || J == -1) {
            this.a = -1;
            P(c);
        }
        char charAt = C.charAt(J);
        this.a = J + 1;
        if (charAt == c) {
            return;
        }
        P(c);
    }
}
