package r9;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface n {

    public class a implements j {
        public final /* synthetic */ i a;

        public a(i iVar) {
            this.a = iVar;
        }

        public int a() {
            return this.a.c;
        }

        public boolean b() {
            return this.a.F();
        }
    }

    static n a(String str, int i, int i2) {
        return i == 1 ? new r(str, i2) : new p(str, i, i2);
    }

    default void b(i iVar, Runnable runnable) {
        d(new k(iVar == null ? null : new a(iVar), runnable));
    }

    void c();

    void d(k kVar);

    void start();
}
