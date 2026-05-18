package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a0 {
    public static final int c = d0.c.d;
    public final d0.c a;
    public final Qa.a b;

    public a0(d0.c cVar, Qa.a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    public final void a(int i, Object obj) {
        this.a.a(i, obj);
        this.b.invoke();
    }

    public final void b() {
        this.a.h();
        this.b.invoke();
    }

    public final d0.c c() {
        return this.a;
    }

    public final Object d(int i) {
        Object u = this.a.u(i);
        this.b.invoke();
        return u;
    }
}
