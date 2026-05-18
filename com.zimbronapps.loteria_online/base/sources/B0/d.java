package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface d {
    Object a();

    void b(int i, int i2);

    default void c(Qa.p pVar, Object obj) {
        pVar.invoke(a(), obj);
    }

    void clear();

    void d(int i, int i2, int i3);

    void e(int i, Object obj);

    void g(int i, Object obj);

    void h(Object obj);

    void i();

    void k();

    default void f() {
    }

    default void j() {
    }
}
