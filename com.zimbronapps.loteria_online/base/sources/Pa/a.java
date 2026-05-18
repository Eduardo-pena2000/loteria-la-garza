package pa;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import pa.E;
import pa.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public Activity a;
    public final Map b = new HashMap();
    public final da.j c;

    public class a implements Runnable {
        public final /* synthetic */ Map a;

        public a(Map map) {
            this.a = map;
        }

        public void run() {
            a.a(a.this).c("onAdEvent", this.a);
        }
    }

    public a(da.j jVar) {
        this.c = jVar;
    }

    public static /* synthetic */ da.j a(a aVar) {
        return aVar.c;
    }

    public f b(int i) {
        return (f) this.b.get(Integer.valueOf(i));
    }

    public Integer c(f fVar) {
        for (Integer num : this.b.keySet()) {
            if (this.b.get(num) == fVar) {
                return num;
            }
        }
        return null;
    }

    public void d(int i) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            f fVar = (f) this.b.get(Integer.valueOf(i));
            if (fVar != null) {
                fVar.a();
            }
            this.b.remove(Integer.valueOf(i));
        }
    }

    public void e() {
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getValue() != null) {
                ((f) entry.getValue()).a();
            }
        }
        this.b.clear();
    }

    public Activity f() {
        return this.a;
    }

    public final void g(Map map) {
        new Handler(Looper.getMainLooper()).post(new a(map));
    }

    public void h(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClicked");
        g(hashMap);
    }

    public void i(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClosed");
        g(hashMap);
    }

    public void j(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdDismissedFullScreenContent");
        g(hashMap);
    }

    public void k(int i, f.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdFailedToLoad");
        hashMap.put("loadAdError", cVar);
        g(hashMap);
    }

    public void l(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdImpression");
        g(hashMap);
    }

    public void m(int i, L5.z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdLoaded");
        hashMap.put("responseInfo", zVar == null ? null : new f.e(zVar));
        g(hashMap);
    }

    public void n(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdMetadataChanged");
        g(hashMap);
    }

    public void o(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdOpened");
        g(hashMap);
    }

    public void p(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdShowedFullScreenContent");
        g(hashMap);
    }

    public void q(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAppEvent");
        hashMap.put("name", str);
        hashMap.put("data", str2);
        g(hashMap);
    }

    public void r(int i, L5.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFailedToShowFullScreenContent");
        hashMap.put("error", new f.a(bVar));
        g(hashMap);
    }

    public void s(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i2));
        g(hashMap);
    }

    public void t(f fVar, o oVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", c(fVar));
        hashMap.put("eventName", "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(oVar.c));
        hashMap.put("precision", Integer.valueOf(oVar.a));
        hashMap.put("currencyCode", oVar.b);
        g(hashMap);
    }

    public void u(int i, E.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", bVar);
        g(hashMap);
    }

    public void v(Activity activity) {
        this.a = activity;
    }

    public boolean w(int i) {
        f.d dVar = (f.d) b(i);
        if (dVar == null) {
            return false;
        }
        dVar.d();
        return true;
    }

    public void x(f fVar, int i) {
        if (this.b.get(Integer.valueOf(i)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", new Object[]{Integer.valueOf(i)}));
        }
        this.b.put(Integer.valueOf(i), fVar);
    }
}
