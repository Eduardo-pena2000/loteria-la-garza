package n0;

import Za.A;
import Za.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v {
    public final String a;
    public int b;

    public v(String str) {
        this.a = str;
    }

    public static /* synthetic */ void b(v vVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        vVar.a(i);
    }

    public final void a(int i) {
        this.b += i;
    }

    public final boolean c() {
        return this.b >= this.a.length();
    }

    public final char d() {
        return this.a.charAt(this.b);
    }

    public final void e(char c) {
        if (h(c)) {
            return;
        }
        m("expected " + c);
        throw new Ca.i();
    }

    public final String f() {
        return this.a;
    }

    public final int g() {
        return this.b;
    }

    public final boolean h(char c) {
        return this.b < this.a.length() && this.a.charAt(this.b) == c;
    }

    public final void i(String str) {
        while (this.b < this.a.length() && !E.S(str, this.a.charAt(this.b), false, 2, (Object) null)) {
            this.b++;
        }
    }

    public final int j(String str) {
        Integer p = A.p(k(str));
        if (p != null) {
            return p.intValue();
        }
        m("expected int");
        throw new Ca.i();
    }

    public final String k(String str) {
        int i = this.b;
        i(str);
        int i2 = this.b;
        if (i2 <= i) {
            return "";
        }
        String substring = this.a.substring(i, i2);
        kotlin.jvm.internal.t.f(substring, "substring(...)");
        return substring;
    }

    public final String l() {
        String str = this.a;
        String substring = str.substring(this.b, str.length());
        kotlin.jvm.internal.t.f(substring, "substring(...)");
        return substring;
    }

    public final Void m(String str) {
        int min = Math.min(this.b, this.a.length());
        StringBuilder sb = new StringBuilder();
        sb.append("Error while parsing source information: ");
        sb.append(str);
        sb.append(" at ");
        String substring = this.a.substring(0, min);
        kotlin.jvm.internal.t.f(substring, "substring(...)");
        sb.append(substring);
        sb.append('|');
        String substring2 = this.a.substring(min);
        kotlin.jvm.internal.t.f(substring2, "substring(...)");
        sb.append(substring2);
        throw new t(sb.toString());
    }
}
