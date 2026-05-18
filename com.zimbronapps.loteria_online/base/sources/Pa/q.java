package pa;

import N5.a;
import android.util.Log;
import java.lang.ref.WeakReference;
import pa.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class q extends f.d {
    public final pa.a b;
    public final String c;
    public final m d;
    public final j e;
    public N5.a f;
    public final i g;

    public static final class a extends a.a {
        public final WeakReference a;

        public a(q qVar) {
            this.a = new WeakReference(qVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(N5.a aVar) {
            if (this.a.get() != null) {
                q.e((q) this.a.get(), aVar);
            }
        }

        public void onAdFailedToLoad(L5.n nVar) {
            if (this.a.get() != null) {
                q.f((q) this.a.get(), nVar);
            }
        }
    }

    public q(int i, pa.a aVar, String str, m mVar, j jVar, i iVar) {
        super(i);
        Aa.c.b((mVar == null && jVar == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.b = aVar;
        this.c = str;
        this.d = mVar;
        this.e = jVar;
        this.g = iVar;
    }

    public static /* synthetic */ void e(q qVar, N5.a aVar) {
        qVar.i(aVar);
    }

    public static /* synthetic */ void f(q qVar, L5.n nVar) {
        qVar.h(nVar);
    }

    private void h(L5.n nVar) {
        this.b.k(this.a, new f.c(nVar));
    }

    public void a() {
        this.f = null;
    }

    public void c(boolean z) {
        N5.a aVar = this.f;
        if (aVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            aVar.setImmersiveMode(z);
        }
    }

    public void d() {
        if (this.f == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
        } else if (this.b.f() == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.f.setFullScreenContentCallback(new t(this.b, this.a));
            this.f.show(this.b.f());
        }
    }

    public void g() {
        m mVar = this.d;
        if (mVar != null) {
            i iVar = this.g;
            String str = this.c;
            iVar.f(str, mVar.b(str), new a(this));
        } else {
            j jVar = this.e;
            if (jVar != null) {
                i iVar2 = this.g;
                String str2 = this.c;
                iVar2.a(str2, jVar.l(str2), new a(this));
            }
        }
    }

    public final void i(N5.a aVar) {
        this.f = aVar;
        aVar.setOnPaidEventListener(new B(this.b, this));
        this.b.m(this.a, aVar.getResponseInfo());
    }
}
