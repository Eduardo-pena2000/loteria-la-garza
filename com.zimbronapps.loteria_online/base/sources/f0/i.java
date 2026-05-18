package f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i extends a {
    public final Object[] c;
    public final m d;

    public i(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int d = n.d(i2);
        this.d = new m(objArr, Wa.n.i(i, d), d, i3);
    }

    public Object next() {
        a();
        if (this.d.hasNext()) {
            g(e() + 1);
            return this.d.next();
        }
        Object[] objArr = this.c;
        int e = e();
        g(e + 1);
        return objArr[e - this.d.f()];
    }

    public Object previous() {
        b();
        if (e() <= this.d.f()) {
            g(e() - 1);
            return this.d.previous();
        }
        Object[] objArr = this.c;
        g(e() - 1);
        return objArr[e() - this.d.f()];
    }
}
