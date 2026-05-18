package f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k extends a {
    public final Object c;

    public k(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    public Object next() {
        a();
        g(e() + 1);
        return this.c;
    }

    public Object previous() {
        b();
        g(e() - 1);
        return this.c;
    }
}
