package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class y implements Runnable {
    public final /* synthetic */ V3 a;
    public final /* synthetic */ z b;

    public y(z zVar, V3 v3) {
        this.a = v3;
        Objects.requireNonNull(zVar);
        this.b = zVar;
    }

    public final void run() {
        V3 v3 = this.a;
        v3.c();
        if (f.a()) {
            v3.b().t(this);
            return;
        }
        z zVar = this.b;
        boolean c = zVar.c();
        zVar.e(0L);
        if (c) {
            zVar.a();
        }
    }
}
