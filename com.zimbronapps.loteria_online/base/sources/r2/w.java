package R2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w implements f {
    public final f a;
    public long b;
    public Uri c = Uri.EMPTY;
    public Map d = Collections.emptyMap();

    public w(f fVar) {
        this.a = (f) P2.a.e(fVar);
    }

    public void close() {
        this.a.close();
    }

    public Map e() {
        return this.a.e();
    }

    public long g(j jVar) {
        this.c = jVar.a;
        this.d = Collections.emptyMap();
        long g = this.a.g(jVar);
        this.c = (Uri) P2.a.e(o());
        this.d = e();
        return g;
    }

    public void l(x xVar) {
        P2.a.e(xVar);
        this.a.l(xVar);
    }

    public Uri o() {
        return this.a.o();
    }

    public long q() {
        return this.b;
    }

    public Uri r() {
        return this.c;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    public Map s() {
        return this.d;
    }

    public void t() {
        this.b = 0L;
    }
}
