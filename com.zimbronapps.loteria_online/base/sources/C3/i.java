package c3;

import P2.K;
import android.content.Context;
import c3.H;
import c3.b;
import c3.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements j.b {
    public final Context a;
    public int b = 0;
    public boolean c = true;

    public i(Context context) {
        this.a = context;
    }

    public j a(j.a aVar) {
        int i;
        if (K.a < 23 || !((i = this.b) == 1 || (i == 0 && b()))) {
            return new H.b().a(aVar);
        }
        int k = M2.y.k(aVar.c.n);
        P2.o.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + K.p0(k));
        b.b bVar = new b.b(k);
        bVar.e(this.c);
        return bVar.a(aVar);
    }

    public final boolean b() {
        int i = K.a;
        if (i >= 31) {
            return true;
        }
        Context context = this.a;
        return context != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
