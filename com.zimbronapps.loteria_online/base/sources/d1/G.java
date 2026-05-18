package d1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements Z {
    public final int b;

    public g(int i) {
        this.b = i;
    }

    public L c(L l) {
        int i = this.b;
        return (i == 0 || i == Integer.MAX_VALUE) ? l : new L(Wa.n.m(l.o() + this.b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.b == ((g) obj).b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.b + ')';
    }
}
