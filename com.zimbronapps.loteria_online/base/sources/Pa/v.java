package pa;

import android.util.Log;
import java.lang.ref.WeakReference;
import pa.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class v extends f.d {
    public final pa.a b;
    public final String c;
    public final m d;
    public X5.a e;
    public final i f;

    public static final class a extends X5.b {
        public final WeakReference a;

        public a(v vVar) {
            this.a = new WeakReference(vVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(X5.a aVar) {
            if (this.a.get() != null) {
                ((v) this.a.get()).g(aVar);
            }
        }

        public void onAdFailedToLoad(L5.n nVar) {
            if (this.a.get() != null) {
                ((v) this.a.get()).f(nVar);
            }
        }
    }

    public v(int i, pa.a aVar, String str, m mVar, i iVar) {
        super(i);
        this.b = aVar;
        this.c = str;
        this.d = mVar;
        this.f = iVar;
    }

    public void a() {
        this.e = null;
    }

    public void c(boolean z) {
        X5.a aVar = this.e;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z);
        }
    }

    public void d() {
        if (this.e == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.b.f() == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.e.setFullScreenContentCallback(new t(this.b, this.a));
            this.e.show(this.b.f());
        }
    }

    public void e() {
        String str;
        m mVar;
        if (this.b == null || (str = this.c) == null || (mVar = this.d) == null) {
            return;
        }
        this.f.g(str, mVar.b(str), new a(this));
    }

    public void f(L5.n nVar) {
        this.b.k(this.a, new f.c(nVar));
    }

    public void g(X5.a aVar) {
        this.e = aVar;
        aVar.setOnPaidEventListener(new B(this.b, this));
        this.b.m(this.a, aVar.getResponseInfo());
    }
}
