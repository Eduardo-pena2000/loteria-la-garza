package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d1 {
    public static final b1 a(int i, int i2, int i3, boolean z, w0.c cVar) {
        return O.a(i, i2, i3, z, cVar);
    }

    public static /* synthetic */ b1 b(int i, int i2, int i3, boolean z, w0.c cVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = c1.b.b();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            cVar = w0.k.a.G();
        }
        return a(i, i2, i3, z, cVar);
    }
}
