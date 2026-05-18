package D9;

import L5.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class d extends b {
    public final com.unity3d.scar.adapter.common.g b;
    public final c c;
    public final L5.e d = new a();

    public class a extends L5.e {
        public a() {
        }

        public void onAdClicked() {
            super.onAdClicked();
            d.b(d.this).onAdClicked();
        }

        public void onAdClosed() {
            super.onAdClosed();
            d.b(d.this).onAdClosed();
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            d.c(d.this).e();
            d.b(d.this).onAdFailedToLoad(nVar.a(), nVar.c());
        }

        public void onAdImpression() {
            super.onAdImpression();
            d.b(d.this).onAdImpression();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            d.b(d.this).onAdLoaded();
        }

        public void onAdOpened() {
            super.onAdOpened();
            d.b(d.this).onAdOpened();
        }
    }

    public d(com.unity3d.scar.adapter.common.g gVar, c cVar) {
        this.b = gVar;
        this.c = cVar;
    }

    public static /* synthetic */ com.unity3d.scar.adapter.common.g b(d dVar) {
        return dVar.b;
    }

    public static /* synthetic */ c c(d dVar) {
        return dVar.c;
    }

    public L5.e d() {
        return this.d;
    }
}
