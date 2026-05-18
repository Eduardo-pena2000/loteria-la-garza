package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ E0 b;

    public d0(E0 e0, long j) {
        this.a = j;
        Objects.requireNonNull(e0);
        this.b = e0;
    }

    public final void run() {
        this.b.n(this.a);
    }
}
