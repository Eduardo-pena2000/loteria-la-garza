package pa;

import android.util.Log;
import java.lang.ref.WeakReference;
import pa.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class l extends f.d {
    public final pa.a b;
    public final String c;
    public final j d;
    public M5.c e;
    public final i f;

    public static final class a extends M5.d implements M5.e {
        public final WeakReference a;

        public a(l lVar) {
            this.a = new WeakReference(lVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(M5.c cVar) {
            if (this.a.get() != null) {
                ((l) this.a.get()).g(cVar);
            }
        }

        public void onAdFailedToLoad(L5.n nVar) {
            if (this.a.get() != null) {
                ((l) this.a.get()).f(nVar);
            }
        }

        public void onAppEvent(String str, String str2) {
            if (this.a.get() != null) {
                ((l) this.a.get()).h(str, str2);
            }
        }
    }

    public l(int i, pa.a aVar, String str, j jVar, i iVar) {
        super(i);
        this.b = aVar;
        this.c = str;
        this.d = jVar;
        this.f = iVar;
    }

    public void a() {
        this.e = null;
    }

    public void c(boolean z) {
        M5.c cVar = this.e;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z);
        }
    }

    public void d() {
        if (this.e == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else if (this.b.f() == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.e.setFullScreenContentCallback(new t(this.b, this.a));
            this.e.show(this.b.f());
        }
    }

    public void e() {
        i iVar = this.f;
        String str = this.c;
        iVar.b(str, this.d.l(str), new a(this));
    }

    public void f(L5.n nVar) {
        this.b.k(this.a, new f.c(nVar));
    }

    public void g(M5.c cVar) {
        this.e = cVar;
        cVar.setAppEventListener(new a(this));
        cVar.setOnPaidEventListener(new B(this.b, this));
        this.b.m(this.a, cVar.getResponseInfo());
    }

    public void h(String str, String str2) {
        this.b.q(this.a, str, str2);
    }
}
