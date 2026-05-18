package k3;

import M2.z;
import R2.s;
import java.io.FileNotFoundException;
import java.io.IOException;
import k3.k;
import k3.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class j implements k {
    public final int a;

    public j() {
        this(-1);
    }

    public k.b a(k.a aVar, k.c cVar) {
        if (!e(cVar.c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new k.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new k.b(2, 60000L);
        }
        return null;
    }

    public int b(int i) {
        int i2 = this.a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public long c(k.c cVar) {
        IOException iOException = cVar.c;
        if ((iOException instanceof z) || (iOException instanceof FileNotFoundException) || (iOException instanceof R2.p) || (iOException instanceof l.h) || R2.g.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.d - 1) * 1000, 5000);
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof s)) {
            return false;
        }
        int i = ((s) iOException).d;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    public j(int i) {
        this.a = i;
    }
}
