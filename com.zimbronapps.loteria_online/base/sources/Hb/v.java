package hb;

import cb.V;
import cb.Y;
import cb.g0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class v extends cb.K implements Y {
    public final /* synthetic */ Y b;
    public final cb.K c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public v(cb.K k, String str) {
        Y y = k instanceof Y ? (Y) k : null;
        this.b = y == null ? V.a() : y;
        this.c = k;
        this.d = str;
    }

    public void m(long j, cb.n nVar) {
        this.b.m(j, nVar);
    }

    public String toString() {
        return this.d;
    }

    public g0 v(long j, Runnable runnable, Ga.i iVar) {
        return this.b.v(j, runnable, iVar);
    }

    public void x(Ga.i iVar, Runnable runnable) {
        this.c.x(iVar, runnable);
    }

    public void y(Ga.i iVar, Runnable runnable) {
        this.c.y(iVar, runnable);
    }

    public boolean z(Ga.i iVar) {
        return this.c.z(iVar);
    }
}
