package V4;

import V4.p;
import java.io.Closeable;
import xb.C;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends p {
    public final C a;
    public final xb.l b;
    public final String c;
    public final Closeable d;
    public final p.a e;
    public boolean f;
    public xb.g g;

    public o(C c, xb.l lVar, String str, Closeable closeable, p.a aVar) {
        super(null);
        this.a = c;
        this.b = lVar;
        this.c = str;
        this.d = closeable;
        this.e = aVar;
    }

    public p.a a() {
        return this.e;
    }

    public synchronized xb.g b() {
        c();
        xb.g gVar = this.g;
        if (gVar != null) {
            return gVar;
        }
        xb.g d = x.d(f().q(this.a));
        this.g = d;
        return d;
    }

    public final void c() {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
    }

    public synchronized void close() {
        try {
            this.f = true;
            xb.g gVar = this.g;
            if (gVar != null) {
                j5.j.d(gVar);
            }
            Closeable closeable = this.d;
            if (closeable != null) {
                j5.j.d(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String d() {
        return this.c;
    }

    public xb.l f() {
        return this.b;
    }
}
