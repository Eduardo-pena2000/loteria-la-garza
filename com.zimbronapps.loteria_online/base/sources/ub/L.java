package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class l {
    public final Da.m a = new Da.m();
    public int b;

    public final void a(char[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        synchronized (this) {
            try {
                if (this.b + array.length < j.a()) {
                    this.b += array.length;
                    this.a.addLast(array);
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] b(int i) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.a.s();
            if (cArr != null) {
                this.b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
