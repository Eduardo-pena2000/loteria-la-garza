package pa;

import pa.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g extends L5.e {
    public final int a;
    public final a b;

    public g(int i, a aVar) {
        this.a = i;
        this.b = aVar;
    }

    public void onAdClicked() {
        this.b.h(this.a);
    }

    public void onAdClosed() {
        this.b.i(this.a);
    }

    public void onAdFailedToLoad(L5.n nVar) {
        this.b.k(this.a, new f.c(nVar));
    }

    public void onAdImpression() {
        this.b.l(this.a);
    }

    public void onAdOpened() {
        this.b.o(this.a);
    }
}
