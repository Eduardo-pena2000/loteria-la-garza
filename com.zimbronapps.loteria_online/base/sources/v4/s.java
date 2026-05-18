package V4;

import V4.p;
import kotlin.jvm.internal.t;
import xb.C;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s extends p {
    public final p.a a;
    public boolean b;
    public xb.g c;
    public Qa.a d;
    public C e;

    public s(xb.g gVar, Qa.a aVar, p.a aVar2) {
        super(null);
        this.a = aVar2;
        this.c = gVar;
        this.d = aVar;
    }

    private final void c() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
    }

    public p.a a() {
        return this.a;
    }

    public synchronized xb.g b() {
        c();
        xb.g gVar = this.c;
        if (gVar != null) {
            return gVar;
        }
        xb.l d = d();
        C c = this.e;
        t.d(c);
        xb.g d2 = x.d(d.q(c));
        this.c = d2;
        return d2;
    }

    public synchronized void close() {
        try {
            this.b = true;
            xb.g gVar = this.c;
            if (gVar != null) {
                j5.j.d(gVar);
            }
            C c = this.e;
            if (c != null) {
                d().h(c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public xb.l d() {
        return xb.l.b;
    }
}
