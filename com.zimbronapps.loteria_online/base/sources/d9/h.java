package D9;

import L5.m;
import L5.n;
import L5.u;
import com.unity3d.scar.adapter.common.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h extends D9.b {
    public final g b;
    public final i c;
    public final f6.d d = new a();
    public final u e = new b();
    public final m f = new c();

    public class a extends f6.d {
        public a() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(f6.c cVar) {
            super/*L5.f*/.onAdLoaded(cVar);
            h.b(h.this).onAdLoaded();
            cVar.setFullScreenContentCallback(h.c(h.this));
            h.d(h.this).d(cVar);
            v9.b bVar = h.this.a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(n nVar) {
            super/*L5.f*/.onAdFailedToLoad(nVar);
            h.b(h.this).onAdFailedToLoad(nVar.a(), nVar.toString());
        }
    }

    public class b implements u {
        public b() {
        }

        public void onUserEarnedReward(f6.b bVar) {
            h.b(h.this).onUserEarnedReward();
        }
    }

    public class c extends m {
        public c() {
        }

        public void a() {
            super.a();
            h.b(h.this).onAdClicked();
        }

        public void b() {
            super.b();
            h.b(h.this).onAdClosed();
        }

        public void c(L5.b bVar) {
            super.c(bVar);
            h.b(h.this).onAdFailedToShow(bVar.a(), bVar.toString());
        }

        public void d() {
            super.d();
            h.b(h.this).onAdImpression();
        }

        public void e() {
            super.e();
            h.b(h.this).onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    public static /* synthetic */ i b(h hVar) {
        return hVar.c;
    }

    public static /* synthetic */ m c(h hVar) {
        return hVar.f;
    }

    public static /* synthetic */ g d(h hVar) {
        return hVar.b;
    }

    public f6.d e() {
        return this.d;
    }

    public u f() {
        return this.e;
    }
}
