package z9;

import L5.m;
import L5.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f extends z9.b {
    public final e b;
    public final com.unity3d.scar.adapter.common.h c;
    public final X5.b d = new a();
    public final m e = new b();

    public class a extends X5.b {
        public a() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(X5.a aVar) {
            super/*L5.f*/.onAdLoaded(aVar);
            f.b(f.this).onAdLoaded();
            aVar.setFullScreenContentCallback(f.c(f.this));
            f.d(f.this).d(aVar);
            v9.b bVar = f.this.a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(n nVar) {
            super/*L5.f*/.onAdFailedToLoad(nVar);
            f.b(f.this).onAdFailedToLoad(nVar.a(), nVar.toString());
        }
    }

    public class b extends m {
        public b() {
        }

        public void a() {
            super.a();
            f.b(f.this).onAdClicked();
        }

        public void b() {
            super.b();
            f.b(f.this).onAdClosed();
        }

        public void c(L5.b bVar) {
            super.c(bVar);
            f.b(f.this).onAdFailedToShow(bVar.a(), bVar.toString());
        }

        public void d() {
            super.d();
            f.b(f.this).onAdImpression();
        }

        public void e() {
            super.e();
            f.b(f.this).onAdOpened();
        }
    }

    public f(com.unity3d.scar.adapter.common.h hVar, e eVar) {
        this.c = hVar;
        this.b = eVar;
    }

    public static /* synthetic */ com.unity3d.scar.adapter.common.h b(f fVar) {
        return fVar.c;
    }

    public static /* synthetic */ m c(f fVar) {
        return fVar.e;
    }

    public static /* synthetic */ e d(f fVar) {
        return fVar.b;
    }

    public X5.b e() {
        return this.d;
    }
}
