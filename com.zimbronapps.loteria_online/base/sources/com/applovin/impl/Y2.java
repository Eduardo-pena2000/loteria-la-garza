package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class y2 extends k3 implements MaxAd {
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private final a3 m;
    protected com.applovin.impl.mediation.h n;
    private final String o;
    private MaxAdWaterfallInfo p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private String x;
    private String y;

    public y2(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var.e(), jSONObject, jSONObject2, kVar);
        this.k = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.m = a3Var;
        this.n = hVar;
        this.o = hVar != null ? hVar.b() : null;
    }

    private long J() {
        return a("load_started_time_ms", 0L);
    }

    public static y2 a(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new b3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new d3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new c3(a3Var, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    private static /* synthetic */ JSONObject b(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("ad_values", new JSONObject()));
    }

    private /* synthetic */ Bundle c(h5 h5Var) {
        JSONObject a;
        if (h5Var.a("credentials")) {
            a = h5Var.a("credentials", new JSONObject());
        } else {
            a = h5Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", R());
        }
        return JsonUtils.toBundle(a);
    }

    private static /* synthetic */ JSONObject d(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("publisher_extra_info", new JSONObject()));
    }

    private static /* synthetic */ Double e(h5 h5Var) {
        return Double.valueOf(JsonUtils.getDouble(h5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    private static /* synthetic */ JSONObject f(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("revenue_parameters", new JSONObject()));
    }

    private static /* synthetic */ String g(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public static /* synthetic */ JSONObject t(h5 h5Var) {
        return f(h5Var);
    }

    public static /* synthetic */ JSONObject u(h5 h5Var) {
        return b(h5Var);
    }

    public static /* synthetic */ String v(h5 h5Var) {
        return g(h5Var);
    }

    public static /* synthetic */ Bundle w(y2 y2Var, h5 h5Var) {
        return y2Var.c(h5Var);
    }

    public static /* synthetic */ Double x(h5 h5Var) {
        return e(h5Var);
    }

    public static /* synthetic */ JSONObject y(h5 h5Var) {
        return d(h5Var);
    }

    public com.applovin.impl.mediation.h A() {
        return this.n;
    }

    public String B() {
        return a("bcode", "");
    }

    public long C() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String D() {
        return a("bid_response", (String) null);
    }

    public Bundle E() {
        JSONObject a;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return (Bundle) h5Var.a(new Z6(this));
        }
        if (c("credentials")) {
            a = a("credentials", new JSONObject());
        } else {
            a = a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", R());
        }
        return JsonUtils.toBundle(a);
    }

    public long F() {
        return this.w;
    }

    public long G() {
        if (J() > 0) {
            return I() - J();
        }
        return -1L;
    }

    public long H() {
        return this.u;
    }

    public long I() {
        return a("load_completed_time_ms", 0L);
    }

    public String K() {
        return this.x;
    }

    public int L() {
        return a("mspc", ((Integer) this.a.a(r3.g8)).intValue());
    }

    public JSONObject M() {
        h5 h5Var = this.h;
        return h5Var != null ? (JSONObject) h5Var.a(new Y6()) : a("publisher_extra_info", new JSONObject());
    }

    public a3 N() {
        return this.m;
    }

    public String O() {
        return JsonUtils.getString(P(), "revenue_event", "");
    }

    public JSONObject P() {
        h5 h5Var = this.h;
        return h5Var != null ? (JSONObject) h5Var.a(new W6()) : a("revenue_parameters", new JSONObject());
    }

    public String Q() {
        return b("event_id", "");
    }

    public String R() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public long S() {
        return this.v;
    }

    public List T() {
        return b("mwf_info_urls");
    }

    public String U() {
        return b("waterfall_name", "");
    }

    public String V() {
        return b("waterfall_test_name", "");
    }

    public boolean W() {
        return StringUtils.isValidString(D());
    }

    public boolean X() {
        com.applovin.impl.mediation.h hVar = this.n;
        return hVar != null && hVar.k() && this.n.j();
    }

    public boolean Y() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean Z() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public abstract y2 a(com.applovin.impl.mediation.h hVar);

    public void a0() {
        this.w = SystemClock.elapsedRealtime() - this.s;
    }

    public void b0() {
        this.r = SystemClock.elapsedRealtime();
        this.t = this.a.m0().getTotalBackgroundDurationMillis();
    }

    public void c0() {
        long totalBackgroundDurationMillis = this.a.m0().getTotalBackgroundDurationMillis() - this.t;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.r;
        this.v = elapsedRealtime;
        this.u = elapsedRealtime - totalBackgroundDurationMillis;
    }

    public void d0() {
        this.s = SystemClock.elapsedRealtime();
    }

    public void e0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void f0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean g0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    public String getAdReviewCreativeId() {
        return this.y;
    }

    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.n;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    public String getNetworkName() {
        return a("network_name", "");
    }

    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(R());
    }

    public long getRequestLatencyMillis() {
        return this.q;
    }

    public double getRevenue() {
        if (!((Boolean) this.a.a(r3.l8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            h5 h5Var = this.h;
            return h5Var != null ? ((Double) h5Var.a(new B7())).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.a.O();
        if (!com.applovin.impl.sdk.o.a()) {
            return 0.0d;
        }
        this.a.O().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    public String getRevenuePrecision() {
        h5 h5Var = this.h;
        return h5Var != null ? (String) h5Var.a(new A7()) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public AppLovinSdkUtils.Size getSize() {
        int a = a("ad_width", -3);
        int a2 = a("ad_height", -3);
        return (a == -3 || a2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(a, a2);
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return this.p;
    }

    public void h(String str) {
        this.y = str;
    }

    public Boolean h0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public void i(String str) {
        this.x = str;
    }

    public Boolean i0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + R() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public String z() {
        return this.o;
    }

    public String getAdValue(String str, String str2) {
        JSONObject x = x();
        if (x.has(str)) {
            return JsonUtils.getString(x, str, str2);
        }
        Bundle l = l();
        if (l.containsKey(str)) {
            return l.getString(str);
        }
        JSONObject M = M();
        return M.has(str) ? JsonUtils.getString(M, str, str2) : a(str, str2);
    }

    public void t() {
        this.n = null;
        this.p = null;
    }

    public AtomicBoolean u() {
        return this.k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.l;
    }

    public JSONObject x() {
        h5 h5Var = this.h;
        return h5Var != null ? (JSONObject) h5Var.a(new X6()) : a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.h hVar;
        if (!X() || (hVar = this.n) == null) {
            return null;
        }
        return hVar.d();
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.p = maxAdWaterfallInfo;
    }

    public void a(long j) {
        this.q = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject M = M();
        JsonUtils.putAll(M, jSONObject);
        a("publisher_extra_info", (Object) M);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
