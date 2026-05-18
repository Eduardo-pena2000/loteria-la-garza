package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f6 extends i5 {
    private static final AtomicBoolean o = new AtomicBoolean();
    private final a3 g;
    private final JSONObject h;
    private final List i;
    private final a.a j;
    private final WeakReference k;
    private final String l;
    private long m;
    private final List n;

    public class b extends i5 {
        private final long g;
        private final int h;
        private final y2 i;
        private final List j;

        public class a extends i3 {
            final /* synthetic */ MaxAdFormat b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.a aVar, MaxAdFormat maxAdFormat, String str) {
                super(aVar);
                this.b = maxAdFormat;
                this.c = str;
            }

            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.i(b.this);
                b.d(b.this);
                if (com.applovin.impl.sdk.o.a()) {
                    b.f(b.this).a(b.e(b.this), "Ad failed to load in " + elapsedRealtime + " ms for " + this.b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.a(b.this, "failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                b.a(bVar, b.g(bVar), MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (b.b(b.this) >= b.c(b.this).size() - 1) {
                    f6.a(f6.this, new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.h(b.this).q0().a((i5) new b(f6.this, b.b(bVar2) + 1, b.c(b.this), null), d6.b.MEDIATION);
                }
            }

            public void onAdLoaded(MaxAd maxAd) {
                b.a(b.this, "loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.i(b.this);
                b.j(b.this);
                if (com.applovin.impl.sdk.o.a()) {
                    b.a(b.this).a(b.k(b.this), "Ad loaded in " + elapsedRealtime + "ms for " + this.b.getLabel() + " ad unit " + this.c);
                }
                y2 y2Var = (y2) maxAd;
                b.a(b.this, y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                int b = b.b(b.this);
                while (true) {
                    b++;
                    if (b >= b.c(b.this).size()) {
                        f6.a(f6.this, y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        b.a(bVar, (y2) b.c(bVar).get(b), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        public /* synthetic */ b(f6 f6Var, int i, List list, a aVar) {
            this(i, list);
        }

        public static /* synthetic */ com.applovin.impl.sdk.o a(b bVar) {
            return bVar.c;
        }

        private void b(String str) {
        }

        public static /* synthetic */ List c(b bVar) {
            return bVar.j;
        }

        public static /* synthetic */ com.applovin.impl.sdk.o d(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ String e(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ com.applovin.impl.sdk.o f(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ y2 g(b bVar) {
            return bVar.i;
        }

        public static /* synthetic */ com.applovin.impl.sdk.k h(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ long i(b bVar) {
            return bVar.g;
        }

        public static /* synthetic */ com.applovin.impl.sdk.o j(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ String k(b bVar) {
            return bVar.b;
        }

        public void run() {
            String b = f6.d(f6.this).b();
            MaxAdFormat a2 = f6.d(f6.this).a();
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Loading ad " + (this.h + 1) + " of " + this.j.size() + " from " + this.i.c() + " for " + a2.getLabel() + " ad unit " + b);
            }
            b("started to load ad");
            Activity activity = (Context) f6.e(f6.this).get();
            Activity u0 = activity instanceof Activity ? activity : this.a.u0();
            this.a.a0().b(this.i);
            this.a.X().loadThirdPartyMediatedAd(b, this.i, u0, new a(f6.f(f6.this), a2, b));
        }

        private b(int i, List list) {
            super(f6.a(f6.this), f6.b(f6.this), f6.d(f6.this).b());
            this.g = SystemClock.elapsedRealtime();
            this.h = i;
            this.i = (y2) list.get(i);
            this.j = list;
        }

        public static /* synthetic */ void a(b bVar, y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            bVar.a(y2Var, adLoadState, j, maxError);
        }

        public static /* synthetic */ int b(b bVar) {
            return bVar.h;
        }

        public static /* synthetic */ void a(b bVar, String str) {
            bVar.b(str);
        }

        private void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            f6.c(f6.this).add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j, y2Var.B(), maxError));
        }
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.a aVar) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.g = a3Var;
        this.h = jSONObject;
        this.j = aVar;
        this.k = new WeakReference(context);
        this.l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.i = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, kVar));
        }
        this.n = new ArrayList(this.i.size());
    }

    public static /* synthetic */ String a(f6 f6Var) {
        return f6Var.b;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k b(f6 f6Var) {
        return f6Var.a;
    }

    public static /* synthetic */ List c(f6 f6Var) {
        return f6Var.n;
    }

    public static /* synthetic */ a3 d(f6 f6Var) {
        return f6Var.g;
    }

    public static /* synthetic */ void e(f6 f6Var, MaxError maxError) {
        f6Var.b(maxError);
    }

    public static /* synthetic */ a.a f(f6 f6Var) {
        return f6Var.j;
    }

    public static /* synthetic */ void g(f6 f6Var) {
        f6Var.e();
    }

    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.m = SystemClock.elapsedRealtime();
        if (this.h.optBoolean("is_testing", false) && !this.a.s0().c() && o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new C1(this));
        }
        String b2 = this.g.b();
        MaxAdFormat a2 = this.g.a();
        if (this.i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Starting waterfall for " + a2.getLabel() + " ad unit " + b2 + " with " + this.i.size() + " ad(s)...");
            }
            this.a.q0().a(new b(this, 0, this.i, null));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.k(this.b, "No ads were returned from the server for " + a2.getLabel() + " ad unit " + b2);
        }
        n7.a(b2, a2, this.h, this.a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.h, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.h, b2, this.a)) {
            maxErrorImpl = new MaxErrorImpl(-5603, "Ad Unit ID " + b2 + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (n7.c(this.a) && ((Boolean) this.a.a(x4.A6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        D1 d1 = new D1(this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            g0.a(millis, this.a, d1);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(d1, millis);
        }
    }

    public static /* synthetic */ void a(f6 f6Var, y2 y2Var) {
        f6Var.b(y2Var);
    }

    public static /* synthetic */ WeakReference e(f6 f6Var) {
        return f6Var.k;
    }

    public static /* synthetic */ void a(f6 f6Var, MaxError maxError) {
        f6Var.b(maxError);
    }

    private void b(y2 y2Var) {
        this.a.a0().c(y2Var);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d(this.b, "Waterfall loaded in " + elapsedRealtime + "ms from " + y2Var.c() + " for " + this.g.a().getLabel() + " ad unit " + this.g.b());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, elapsedRealtime, this.n, this.l));
        t2.f(this.j, y2Var);
    }

    private /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", (Context) this.a.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        String b2 = this.g.b();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d(this.b, "Waterfall failed in " + elapsedRealtime + "ms for " + this.g.a().getLabel() + " ad unit " + b2 + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.h, "waterfall_name", ""), JsonUtils.getString(this.h, "waterfall_test_name", ""), elapsedRealtime, this.n, this.g, JsonUtils.optList(JsonUtils.getJSONArray(this.h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.l, JsonUtils.getString(this.h, "event_id", "")));
        t2.a(this.j, b2, maxError);
    }
}
