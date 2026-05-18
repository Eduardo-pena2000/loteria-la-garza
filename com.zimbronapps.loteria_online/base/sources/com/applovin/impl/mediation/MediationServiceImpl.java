package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.b6;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.d2;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.h3;
import com.applovin.impl.i5;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n6;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final b5 c;
    private final AtomicReference d = new AtomicReference();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.a {
        private final y2 a;
        private a.a b;

        public b(y2 y2Var, a.a aVar) {
            this.a = y2Var;
            this.b = aVar;
        }

        public static /* synthetic */ void a(b bVar, MaxAd maxAd) {
            bVar.a(maxAd);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            t2.b(this.b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            this.a.b0();
            MediationServiceImpl.b(MediationServiceImpl.this);
            if (com.applovin.impl.sdk.o.a()) {
                MediationServiceImpl.b(MediationServiceImpl.this).a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.a, this.b);
            if (!((Boolean) MediationServiceImpl.a(MediationServiceImpl.this).a(r3.w8)).booleanValue() || this.a.u().compareAndSet(false, true)) {
                MediationServiceImpl.a(MediationServiceImpl.this).l().a(this.a, g.c.d);
                MediationServiceImpl.a(MediationServiceImpl.this).t().b(this.a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.a(MediationServiceImpl.this).H().a(this.a);
                }
                t2.c(this.b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            t2.d(this.b, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            this.a.c0();
            MediationServiceImpl.a(MediationServiceImpl.this).l().a(this.a, g.c.e);
            MediationServiceImpl.b(MediationServiceImpl.this, this.a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new q(this, maxAd), maxAd instanceof c3 ? ((c3) maxAd).l0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            this.a.e0();
            MediationServiceImpl.a(MediationServiceImpl.this).l().a(this.a, g.c.c);
            MediationServiceImpl.a(MediationServiceImpl.this, this.a);
            t2.f(this.b, maxAd);
        }

        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.a.e0();
            MediationServiceImpl.a(MediationServiceImpl.this, this.a, maxError, this.b);
        }

        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(a.a aVar) {
            this.b = aVar;
        }

        private /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.a(MediationServiceImpl.this).H().b(maxAd);
            }
            t2.e(this.b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            MediationServiceImpl.a(MediationServiceImpl.this).l().a(this.a, g.c.f);
            MediationServiceImpl.a(MediationServiceImpl.this, this.a, this.b);
            t2.a((MaxAdListener) this.b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.a.a(bundle);
            this.a.a0();
            MediationServiceImpl.b(MediationServiceImpl.this, this.a, maxError, this.b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof c3)) {
                ((c3) maxAd).j0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.a.a(bundle);
            t2.a(this.b, maxAd, maxReward);
            MediationServiceImpl.a(MediationServiceImpl.this).q0().a((i5) new n6((c3) maxAd, MediationServiceImpl.a(MediationServiceImpl.this)), d6.b.OTHER);
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = new b5(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public static /* synthetic */ void a(MediationServiceImpl mediationServiceImpl, h hVar, s4 s4Var, String str) {
        mediationServiceImpl.a(hVar, s4Var, str);
    }

    public static /* synthetic */ void b(MediationServiceImpl mediationServiceImpl, c3 c3Var, Long l, MaxAdListener maxAdListener) {
        mediationServiceImpl.a(c3Var, l, maxAdListener);
    }

    public static /* synthetic */ void c(MediationServiceImpl mediationServiceImpl, c3 c3Var, h hVar, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity, a.a aVar) {
        mediationServiceImpl.a(c3Var, hVar, viewGroup, kVar, activity, aVar);
    }

    public static /* synthetic */ void d(MediationServiceImpl mediationServiceImpl, h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, a.a aVar) {
        mediationServiceImpl.a(hVar, str, maxAdapterParametersImpl, y2Var, activity, aVar);
    }

    public static /* synthetic */ void e(MediationServiceImpl mediationServiceImpl, c3 c3Var, h hVar, Activity activity, a.a aVar) {
        mediationServiceImpl.a(c3Var, hVar, activity, aVar);
    }

    public static /* synthetic */ void f(MediationServiceImpl mediationServiceImpl, long j, h hVar, String str, d5 d5Var, MaxAdFormat maxAdFormat, c5.a aVar, boolean z, String str2, MaxError maxError) {
        mediationServiceImpl.a(j, hVar, str, d5Var, maxAdFormat, aVar, z, str2, maxError);
    }

    public static /* synthetic */ void g(MediationServiceImpl mediationServiceImpl, s4 s4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, d5 d5Var, Activity activity) {
        mediationServiceImpl.a(s4Var, hVar, maxAdapterParametersImpl, d5Var, activity);
    }

    public static /* synthetic */ void h(MediationServiceImpl mediationServiceImpl, y2 y2Var, a.a aVar, String str) {
        mediationServiceImpl.a(y2Var, aVar, str);
    }

    public void collectSignal(d5 d5Var, Context context, c5.a aVar) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        a3 u = d5Var.u();
        String b2 = u.b();
        MaxAdFormat a2 = u.a();
        c5 b3 = this.c.b(d5Var, b2, a2);
        if (b3 != null) {
            aVar.a(c5.a(b3));
            return;
        }
        h a3 = this.a.T().a(d5Var, d5Var.A());
        if (a3 == null) {
            aVar.a(c5.a(d5Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        s4 s4Var = new s4("SignalCollection:" + d5Var.c());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = s4.j;
        s4Var.a(executor, new k(this, elapsedRealtime, a3, b2, d5Var, a2, aVar));
        i6.a(d5Var.m(), s4Var, new MaxErrorImpl(-5210, "The adapter (" + d5Var.c() + ") timed out collecting signal"), "MediationService", this.a);
        Activity u0 = context instanceof Activity ? (Activity) context : this.a.u0();
        MaxAdapterParametersImpl a4 = MaxAdapterParametersImpl.a(d5Var, b2, a2);
        if (d5Var.w()) {
            s4 a5 = this.a.S().a(d5Var, u0);
            a5.a(executor, new l(this, s4Var, a3, a4, d5Var, u0));
            a5.a(executor, new m(this, a3, s4Var));
            return;
        }
        if (d5Var.x()) {
            s4 a6 = this.a.S().a(d5Var, u0);
            if (a6.e() && !d5Var.z()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + a3.g());
                }
                s4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) a6.b())));
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("MediationService", "Collecting signal for adapter: " + a3.g());
        }
        a3.a(a4, d5Var, u0, s4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof y2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.d("MediationService", "Destroying " + maxAd);
            }
            y2 y2Var = (y2) maxAd;
            h A = y2Var.A();
            if (A != null) {
                A.a();
                y2Var.t();
            }
            this.a.j().c(y2Var.Q());
            this.a.l().a(y2Var, g.c.g);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.d.getAndSet((Object) null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.a aVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.a.V())) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.a.B0()) {
            com.applovin.impl.sdk.o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List adUnitIds = this.a.J() != null ? this.a.J().getAdUnitIds() : null;
        boolean startsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !startsWith) {
            if (n7.c(this.a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init";
                if (((Boolean) this.a.a(x4.B6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.b("MediationService", str3);
                }
            }
            this.a.D().a(d2.S0, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
        }
        this.a.c();
        if (str.length() != 16 && !startsWith && !this.a.i0().startsWith("05TMD")) {
            com.applovin.impl.sdk.o.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (!this.a.a(maxAdFormat)) {
            this.a.U0();
            t2.a((MaxAdRequestListener) aVar, str, true);
            if (this.a.R() != null) {
                this.a.R().a(str, str2, maxAdFormat, iVar, map, map2, context, aVar);
                return;
            } else {
                this.a.Q().a(str, str2, maxAdFormat, iVar, map, map2, context, aVar);
                return;
            }
        }
        com.applovin.impl.sdk.o.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
        t2.a(aVar, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
    }

    public void loadThirdPartyMediatedAd(String str, y2 y2Var, Activity activity, a.a aVar) {
        s4 s4Var;
        if (y2Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("MediationService", "Loading " + y2Var + "...");
        }
        this.a.P().a(d2.k0, y2Var);
        this.a.l().a(y2Var, g.c.b);
        this.a.t().b(y2Var, "WILL_LOAD");
        h a2 = this.a.T().a(y2Var);
        if (a2 == null) {
            String str2 = "Failed to load " + y2Var + ": adapter not loaded";
            com.applovin.impl.sdk.o.h("MediationService", str2);
            b(y2Var, new MaxErrorImpl(-5001, str2), aVar);
            return;
        }
        MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(y2Var);
        if (y2Var.Y()) {
            s4Var = this.a.S().a(y2Var, activity);
        } else {
            if (y2Var.Z()) {
                this.a.S().a(y2Var, activity);
            }
            s4Var = null;
        }
        s4 s4Var2 = s4Var;
        y2 a4 = y2Var.a(a2);
        a2.a(str, a4);
        a4.f0();
        if (s4Var2 == null) {
            a2.a(str, a3, a4, activity, new b(a4, aVar));
            return;
        }
        Executor executor = s4.j;
        s4Var2.a(executor, new n(this, y2Var, aVar));
        s4Var2.a(executor, new o(this, a2, str, a3, a4, activity, aVar));
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.a.b(z4.R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (a(JsonUtils.getLong(jsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l = (Long) this.a.b(z4.S);
            String l2 = l != null ? l.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jsonObjectFromJsonString, "ad_info");
            Map tryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", l2, tryToStringMap);
            this.a.D().d(d2.I0, tryToStringMap);
            List list = JsonUtils.getList(jsonObjectFromJsonString, "app_killed_urls", Collections.emptyList());
            if (CollectionUtils.isEmpty((Collection) list)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jsonObjectFromJsonString, "user_info");
                Map tryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : w3.c(this.a);
                tryToStringMap2.put("{IMP_DURATION_MS}", l2);
                a("mappk", list, tryToStringMap2, null, null, null, true);
            }
        }
    }

    public void onReceive(Intent intent, Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object a2 = this.a.H().a();
            if (a2 instanceof y2) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (y2) a2, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, y2 y2Var) {
        a(maxError, y2Var, false);
    }

    public void processAdapterInitializationPostback(k3 k3Var, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        a("minit", (Map) hashMap, (MaxError) new MaxErrorImpl(str), k3Var);
        Map a2 = f2.a(k3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), a2);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j), a2);
        switch (a.a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.a.P().d(d2.d0, a2);
                break;
            case 4:
                this.a.P().d(d2.e0, a2);
                break;
            case 5:
            case 6:
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.a.D().a(d2.d, "adapterNotInitializedForPostback", a2);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(y2 y2Var, a.a aVar) {
        if (y2Var.O().endsWith("cimp")) {
            this.a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) aVar, (MaxAd) y2Var);
        }
        HashMap hashMap = new HashMap(2);
        if (y2Var instanceof c3) {
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.a.w0().e());
        if (!((Boolean) this.a.a(x4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", (Map) hashMap, (k3) y2Var);
        this.a.P().a(d2.p0, y2Var);
    }

    public void processRawAdImpression(y2 y2Var, a.a aVar) {
        this.a.t().b(y2Var, "WILL_DISPLAY");
        if (y2Var.O().endsWith("mimp")) {
            this.a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) aVar, (MaxAd) y2Var);
        }
        if (((Boolean) this.a.a(x4.M4)).booleanValue()) {
            this.a.Y().a(s3.g, t3.a(y2Var), Long.valueOf(System.currentTimeMillis() - this.a.K()));
        }
        HashMap hashMap = new HashMap(3);
        if (y2Var instanceof c3) {
            c3 c3Var = (c3) y2Var;
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(c3Var.p0()));
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(c3Var.u0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.a.w0().e());
        if (!((Boolean) this.a.a(x4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", (Map) hashMap, (k3) y2Var);
        this.a.P().a(d2.o0, y2Var);
    }

    public void processViewabilityAdImpressionPostback(h3 h3Var, long j, a.a aVar) {
        if (h3Var.O().endsWith("vimp")) {
            this.a.t().b(h3Var);
            t2.a((MaxAdRevenueListener) aVar, (MaxAd) h3Var);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(h3Var.q0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.a.w0().e());
        if (!((Boolean) this.a.a(x4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", (Map) hashMap, (k3) h3Var);
        this.a.P().a(d2.q0, h3Var);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, MaxError maxError, long j, long j2) {
        a3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String b2 = requestParameters.b();
        MaxAdFormat a2 = requestParameters.a();
        Map hashMap = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", a2.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", b2, hashMap);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j2), hashMap);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), hashMap);
        if (maxError != null) {
            hashMap.putAll(f2.a(maxError));
        }
        this.a.P().d(d2.n0, hashMap);
        if (CollectionUtils.isEmpty((Collection) maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap hashMap2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap2);
        CollectionUtils.putStringIfValid("ad_unit_id", b2, hashMap2);
        CollectionUtils.putStringIfValid("ad_format", a2.getLabel(), hashMap2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), hashMap2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j2), hashMap2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j), hashMap2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), hashMap2);
        hashMap2.put("arn_info", requestParameters.f().e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap hashMap3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), hashMap3);
            hashMap3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), hashMap3);
            hashMap3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                hashMap4.put("error_message", maxErrorImpl.getMessage());
                hashMap4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                hashMap4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                hashMap3.put("error_info", hashMap4);
            }
            arrayList.add(hashMap3);
        }
        hashMap2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, hashMap2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.d.set(jSONObject);
    }

    public void showFullscreenAd(c3 c3Var, Activity activity, Map map, Map map2, a.a aVar) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != c3Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.a.H().a(true);
        h b2 = b(c3Var);
        long r0 = c3Var.r0();
        if (((Boolean) this.a.a(r3.f8)).booleanValue() && this.a.R() == null && this.a.Q().a((MaxAd) c3Var)) {
            this.a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, map, map2, (Context) activity, (a.a) null);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + r0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new i(this, c3Var, b2, activity, aVar), r0);
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(MediationServiceImpl mediationServiceImpl) {
        return mediationServiceImpl.a;
    }

    public static /* synthetic */ com.applovin.impl.sdk.o b(MediationServiceImpl mediationServiceImpl) {
        return mediationServiceImpl.b;
    }

    public static /* synthetic */ void a(MediationServiceImpl mediationServiceImpl, y2 y2Var) {
        mediationServiceImpl.b(y2Var);
    }

    public static /* synthetic */ void b(MediationServiceImpl mediationServiceImpl, y2 y2Var) {
        mediationServiceImpl.a(y2Var);
    }

    public static /* synthetic */ void a(MediationServiceImpl mediationServiceImpl, y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        mediationServiceImpl.b(y2Var, maxError, maxAdListener);
    }

    public static /* synthetic */ void b(MediationServiceImpl mediationServiceImpl, y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        mediationServiceImpl.a(y2Var, maxError, maxAdListener);
    }

    public static /* synthetic */ void a(MediationServiceImpl mediationServiceImpl, y2 y2Var, a.a aVar) {
        mediationServiceImpl.a(y2Var, aVar);
    }

    private h b(c3 c3Var) {
        h A = c3Var.A();
        if (A != null) {
            return A;
        }
        this.a.H().a(false);
        if (com.applovin.impl.sdk.o.a()) {
            this.b.k("MediationService", "Failed to show " + c3Var + ": adapter not found");
        }
        com.applovin.impl.sdk.o.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + c3Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    private /* synthetic */ void a(c3 c3Var, h hVar, Activity activity, a.a aVar) {
        a(c3Var);
        hVar.b(c3Var, activity);
        a(c3Var, aVar);
    }

    private /* synthetic */ void a(c3 c3Var, h hVar, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity, a.a aVar) {
        a(c3Var);
        hVar.a(c3Var, viewGroup, kVar, activity);
        a(c3Var, aVar);
    }

    private void b(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, y2Var);
        destroyAd(y2Var);
        t2.a(maxAdListener, y2Var.getAdUnitId(), maxError);
    }

    private void a(c3 c3Var) {
        if (c3Var.getFormat() == MaxAdFormat.REWARDED) {
            this.a.q0().a((i5) new u6(c3Var, this.a), d6.b.OTHER);
        }
    }

    public void showFullscreenAd(c3 c3Var, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity, Map map, Map map2, a.a aVar) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.a.H().a(true);
            h b2 = b(c3Var);
            long r0 = c3Var.r0();
            if (((Boolean) this.a.a(r3.f8)).booleanValue() && this.a.R() == null && this.a.Q().a((MaxAd) c3Var)) {
                this.a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, map, map2, (Context) activity, (a.a) null);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + r0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new p(this, c3Var, b2, viewGroup, kVar, activity, aVar), r0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void b(y2 y2Var) {
        this.a.t().b(y2Var, "DID_LOAD");
        if (y2Var.O().endsWith("load")) {
            this.a.t().b(y2Var);
        }
        HashMap hashMap = new HashMap(3);
        long G = y2Var.G();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(G));
        if (y2Var.getFormat().isFullscreenAd()) {
            n.a b2 = this.a.H().b(y2Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
        }
        a("load", (Map) hashMap, (k3) y2Var);
        Map a2 = f2.a(y2Var);
        a2.put("duration_ms", String.valueOf(G));
        this.a.P().d(d2.l0, a2);
    }

    private void a(c3 c3Var, a.a aVar) {
        this.a.H().a(false);
        a(c3Var, (MaxAdListener) aVar);
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(c3Var, aVar);
    }

    private /* synthetic */ void a(y2 y2Var, a.a aVar, String str) {
        String str2 = "Failed to load " + y2Var + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.o.a()) {
            this.b.k("MediationService", str2);
        }
        b(y2Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), aVar);
    }

    private /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, a.a aVar) {
        hVar.a(str, maxAdapterParametersImpl, y2Var, activity, new b(y2Var, aVar));
    }

    private /* synthetic */ void a(long j, h hVar, String str, d5 d5Var, MaxAdFormat maxAdFormat, c5.a aVar, boolean z, String str2, MaxError maxError) {
        c5 a2;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (z) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("MediationService", "Signal collection successful from: " + hVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
            }
            a2 = c5.a(d5Var, hVar, str2, j, elapsedRealtime);
            this.c.a(a2, d5Var, str, maxAdFormat);
            Map hashMap = new HashMap();
            CollectionUtils.putStringIfValid("network_name", d5Var.c(), hashMap);
            CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), hashMap);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), hashMap);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(elapsedRealtime), hashMap);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
            this.a.P().d(d2.f0, hashMap);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            a2 = c5.a(d5Var, hVar, maxError, j, elapsedRealtime);
            a(a2, d5Var, hVar);
        }
        aVar.a(a2);
        hVar.a();
    }

    private /* synthetic */ void a(s4 s4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, d5 d5Var, Activity activity) {
        if (s4Var.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, d5Var, activity, s4Var);
    }

    private /* synthetic */ void a(h hVar, s4 s4Var, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        s4Var.a(new MaxErrorImpl(-5204, "Could not initialize adapter: " + str));
    }

    private void a(c3 c3Var, MaxAdListener maxAdListener) {
        Long l = (Long) this.a.a(r3.U7);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new j(this, c3Var, l, maxAdListener), l.longValue());
    }

    private /* synthetic */ void a(c3 c3Var, Long l, MaxAdListener maxAdListener) {
        if (c3Var.u().get()) {
            return;
        }
        String str = "Ad (" + c3Var.k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        com.applovin.impl.sdk.o.h("MediationService", str);
        a(c3Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.a.H().b(c3Var);
    }

    private void a(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.a.l().a(y2Var, g.c.h);
        this.a.t().b(y2Var, "DID_FAIL_DISPLAY");
        a(maxError, y2Var, true);
        if (y2Var.u().compareAndSet(false, true)) {
            t2.a(maxAdListener, y2Var, maxError);
        }
    }

    private void a(MaxError maxError, y2 y2Var) {
        HashMap hashMap = new HashMap(3);
        long G = y2Var.G();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(G));
        if (y2Var.getFormat().isFullscreenAd()) {
            n.a b2 = this.a.H().b(y2Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
        }
        a("mlerr", (Map) hashMap, maxError, (k3) y2Var);
        Map a2 = f2.a(y2Var);
        a2.putAll(f2.a(maxError));
        a2.put("duration_ms", String.valueOf(G));
        this.a.P().d(d2.m0, a2);
    }

    private void a(y2 y2Var) {
        this.a.t().b(y2Var, "DID_HIDE");
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.a.w0().e());
        if (!((Boolean) this.a.a(x4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclose", (Map) hashMap, (k3) y2Var);
        long S = y2Var.S();
        long H = y2Var.H();
        Map map = CollectionUtils.map("duration_ms", String.valueOf(S));
        map.put("details", "foreground_duration_ms = " + H);
        this.a.P().a(d2.s0, y2Var, map);
    }

    private void a(y2 y2Var, a.a aVar) {
        this.a.t().b(y2Var, "DID_CLICKED");
        this.a.t().b(y2Var, "DID_CLICK");
        if (y2Var.O().endsWith("click")) {
            this.a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) aVar, (MaxAd) y2Var);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.a.w0().e());
        if (!((Boolean) this.a.a(x4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", (Map) hashMap, (k3) y2Var);
    }

    private void a(MaxError maxError, y2 y2Var, boolean z) {
        HashMap hashMap = new HashMap(1);
        if (y2Var instanceof c3) {
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        a("mierr", (Map) hashMap, maxError, (k3) y2Var, z);
        if (!z || y2Var == null) {
            return;
        }
        this.a.P().a(d2.r0, y2Var, maxError, CollectionUtils.map("duration_ms", String.valueOf(y2Var.F())));
    }

    private void a(c5 c5Var, d5 d5Var, h hVar) {
        long b2 = c5Var.b();
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(b2));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), hashMap);
        a("serr", (Map) hashMap, c5Var.c(), (k3) d5Var);
        Map a2 = f2.a(c5Var.c());
        CollectionUtils.putStringIfValid("network_name", d5Var.c(), a2);
        CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), a2);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), a2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(b2), a2);
        this.a.P().d(d2.g0, a2);
    }

    private void a(String str, Map map, k3 k3Var) {
        a(str, map, (MaxError) null, k3Var);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var) {
        a(str, map, maxError, k3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var, boolean z) {
        String str2;
        Map map2 = CollectionUtils.map(map);
        String str3 = "";
        map2.put("{PLACEMENT}", z ? StringUtils.emptyIfNull(k3Var.getPlacement()) : "");
        if (!z) {
            str2 = "";
        } else {
            str2 = StringUtils.emptyIfNull(k3Var.e());
        }
        map2.put("{CUSTOM_DATA}", str2);
        if (k3Var instanceof y2) {
            y2 y2Var = (y2) k3Var;
            if (z) {
                str3 = StringUtils.emptyIfNull(y2Var.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", str3);
        }
        a(str, null, map2, null, maxError, k3Var, z);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, k3 k3Var, boolean z) {
        this.a.q0().a((i5) new b6(str, list, map, map2, maxError, k3Var, this.a, z), d6.b.OTHER);
    }

    private boolean a(long j) {
        return System.currentTimeMillis() - j <= ((Long) this.a.a(x4.E2)).longValue();
    }
}
