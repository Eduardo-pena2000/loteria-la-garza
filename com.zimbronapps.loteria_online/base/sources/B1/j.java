package b1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements f {
    public final CharSequence a;
    public final i b;

    public j(CharSequence charSequence, i iVar) {
        this.a = charSequence;
        this.b = iVar;
    }

    public int a(int i) {
        do {
            i = this.b.p(i);
            if (i == -1 || i == this.a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }

    public int b(int i) {
        do {
            i = this.b.q(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }

    public int c(int i) {
        do {
            i = this.b.p(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    public int d(int i) {
        do {
            i = this.b.q(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }
}
