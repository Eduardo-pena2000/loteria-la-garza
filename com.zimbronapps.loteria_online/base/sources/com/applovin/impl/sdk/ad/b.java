package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.applovin.impl.d8;
import com.applovin.impl.f4;
import com.applovin.impl.g1;
import com.applovin.impl.h5;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.o0;
import com.applovin.impl.o4;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class b extends AppLovinAdImpl implements q4 {
    private final Map d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final AtomicReference g;
    private final Bundle h;
    private String i;
    private long j;
    private int k;
    private String l;
    private d m;

    public enum b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        private d() {
            this.a = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), b.this.o());
            this.b = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), b.this.q());
            this.c = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), b.this.m());
            this.d = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), ((Integer) b.a(b.this).a(x4.j1)).intValue());
            this.e = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.k.o(), ((Integer) b.b(b.this).a(x4.i1)).intValue());
        }
    }

    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.d = Collections.synchronizedMap(new HashMap());
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        this.g = new AtomicReference();
        this.h = new Bundle();
    }

    public static /* synthetic */ List A(b bVar, h5 h5Var) {
        return bVar.p(h5Var);
    }

    public static /* synthetic */ List B(b bVar, JSONArray jSONArray) {
        return bVar.a(jSONArray);
    }

    public static /* synthetic */ Map C(b bVar, h5 h5Var) {
        return bVar.c(h5Var);
    }

    public static /* synthetic */ g1 D(h5 h5Var) {
        return h(h5Var);
    }

    public static /* synthetic */ List E(b bVar, h5 h5Var) {
        return bVar.j(h5Var);
    }

    public static /* synthetic */ List F(b bVar, h5 h5Var) {
        return bVar.f(h5Var);
    }

    public static /* synthetic */ List G(b bVar, h5 h5Var) {
        return bVar.k(h5Var);
    }

    public static /* synthetic */ List H(b bVar, h5 h5Var) {
        return bVar.b(h5Var);
    }

    public static /* synthetic */ List I(b bVar, MotionEvent motionEvent, boolean z, h5 h5Var) {
        return bVar.a(motionEvent, z, h5Var);
    }

    public static /* synthetic */ String J(h5 h5Var) {
        return m(h5Var);
    }

    public static /* synthetic */ List K(b bVar, h5 h5Var) {
        return bVar.e(h5Var);
    }

    public static /* synthetic */ d8 L(b bVar, h5 h5Var) {
        return bVar.o(h5Var);
    }

    public static /* synthetic */ List M(b bVar, h5 h5Var) {
        return bVar.d(h5Var);
    }

    public static /* synthetic */ Map N(h5 h5Var) {
        return l(h5Var);
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(b bVar) {
        return bVar.sdk;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k b(b bVar) {
        return bVar.sdk;
    }

    public static /* synthetic */ List c(t.a aVar, h5 h5Var) {
        return a(aVar, h5Var);
    }

    public static /* synthetic */ List d(b bVar, h5 h5Var) {
        return bVar.i(h5Var);
    }

    private String h0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private /* synthetic */ List i(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List k(h5 h5Var) {
        return n7.a(h5Var.a("imp_urls", new JSONObject()), getClCode(), null, null, J(), N0(), this.sdk);
    }

    private static /* synthetic */ String n(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    private /* synthetic */ d8 o(h5 h5Var) {
        return new d8(h5Var.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    public static /* synthetic */ String t(h5 h5Var) {
        return n(h5Var);
    }

    public static /* synthetic */ com.applovin.impl.adview.m u(h5 h5Var) {
        return q(h5Var);
    }

    public static /* synthetic */ void v(String str, h5 h5Var) {
        a(str, h5Var);
    }

    public static /* synthetic */ List w(b bVar, h5 h5Var) {
        return bVar.g(h5Var);
    }

    public static /* synthetic */ List x(b bVar, MotionEvent motionEvent, h5 h5Var) {
        return bVar.a(motionEvent, h5Var);
    }

    public static /* synthetic */ List y(b bVar, h5 h5Var) {
        return bVar.a(h5Var);
    }

    public static /* synthetic */ Boolean z(h5 h5Var) {
        return r(h5Var);
    }

    public boolean A0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(x4.Y1));
    }

    public boolean B0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public abstract boolean C0();

    public boolean D0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(n7.j(com.applovin.impl.sdk.k.o()) || n7.h(com.applovin.impl.sdk.k.o()) || ((Boolean) this.sdk.a(x4.z6)).booleanValue()));
    }

    public abstract void E0();

    public boolean F0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.a(x4.w2));
    }

    public boolean G0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.a(x4.g1));
    }

    public boolean H0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public abstract String I();

    public boolean I0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(x4.D6));
    }

    public boolean J0() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? ((Boolean) h5Var.a(new p())).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public boolean K0() {
        return this.f.get();
    }

    public boolean L0() {
        return U0() || S0() || T0();
    }

    public boolean M0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(x4.R0));
    }

    public boolean N0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public long O() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean O0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public int P() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean P0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public List Q() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean Q0() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    public int R() {
        return this.k;
    }

    public boolean R0() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public List S() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.c(x4.F0));
        if (n7.j(com.applovin.impl.sdk.k.o())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean S0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(x4.v2)).contains("navigation");
    }

    public List T() {
        return getStringListFromAdObject("rea", Q());
    }

    public boolean T0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(x4.v2)).contains("none");
    }

    public e.a U() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? p() : a(intFromAdObject);
    }

    public boolean U0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(x4.v2)).contains("status");
    }

    public List V() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean V0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public c W() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? c.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean W0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public String X() {
        return this.l;
    }

    public boolean X0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public Uri Y() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean Y0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public String Z() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? (String) h5Var.a(new h()) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public boolean Z0() {
        return g() >= 0;
    }

    public String a0() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? (String) h5Var.a(new j()) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public boolean a1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public d8 b0() {
        h5 h5Var = this.synchronizedAdObject;
        return h5Var != null ? (d8) h5Var.a(new com.applovin.impl.sdk.ad.e(this)) : new d8(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean b1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public abstract Uri c0();

    public boolean c1() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.a(x4.N6));
    }

    public long d0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public boolean d1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public List e() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new f(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public long e0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public long f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public int f0() {
        return n7.c(getIntFromAdObject("video_completion_percent", -1));
    }

    public long g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    public List g0() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new x(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), h0(), this.sdk);
        }
        return a2;
    }

    public abstract f4 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public Bundle getCustomTabsHeaders() {
        Map hashMap;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            hashMap = (Map) h5Var.a(new z(this));
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e2) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
                }
                hashMap = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", n8.a());
        }
        return bundle;
    }

    public List getCustomTabsNavigationAbortedPostbacks() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new i(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsNavigationFailedPostbacks() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new n(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsNavigationFinishedPostbacks() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new s(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsNavigationStartedPostbacks() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new k(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public g1 getCustomTabsSettings() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (g1) h5Var.a(new w());
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new g1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List getCustomTabsTabHiddenPostbacks() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new g(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsTabShownPostbacks() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new t(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        u uVar = new u(this);
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new v(uVar));
        }
        synchronized (this.adObjectLock) {
            list = (List) uVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public Bundle h() {
        return this.h;
    }

    public e i0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? e.TOP : "bottom".equals(stringFromAdObject) ? e.BOTTOM : "left".equals(stringFromAdObject) ? e.LEFT : "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public abstract boolean isOpenMeasurementEnabled();

    public List j() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new o(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public int j0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean k0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public Map l() {
        return this.d;
    }

    public abstract Uri l0();

    public int m() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(x4.M1)).intValue());
    }

    public int m0() {
        return getIntFromAdObject("whalt", n7.a(getSize()) ? 1 : ((Boolean) this.sdk.a(x4.a6)).booleanValue() ? 0 : -1);
    }

    public com.applovin.impl.adview.m n0() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (com.applovin.impl.adview.m) h5Var.a(new A());
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.adview.m(jsonObjectFromAdObject);
        }
        return null;
    }

    public List o0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public e.a p() {
        List E = E();
        int intFromAdObject = getIntFromAdObject("close_style", (E == null || E.size() <= 0) ? -1 : ((Integer) E.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public List p0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public int q() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(x4.O1)).intValue());
    }

    public void q0() {
        this.k++;
    }

    public long r() {
        List F = F();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (F == null || F.size() <= 0) ? 0L : ((Integer) F.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public boolean r0() {
        return getBooleanFromAdObject("aocve", (Boolean) this.sdk.a(x4.u6));
    }

    public int s() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public boolean s0() {
        return this.k > 0;
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public boolean t0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(x4.h6));
    }

    public boolean u0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(x4.L1));
    }

    public boolean v0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean w0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean x0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public abstract boolean y0();

    public AtomicBoolean z0() {
        return this.e;
    }

    private List E() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private /* synthetic */ List d(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List f(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List g(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private static /* synthetic */ g1 h(h5 h5Var) {
        JSONObject a2 = h5Var.a("custom_tabs_settings", (JSONObject) null);
        if (a2 != null) {
            return new g1(a2);
        }
        return null;
    }

    private static /* synthetic */ Map l(h5 h5Var) {
        try {
            return JsonUtils.toStringMap(h5Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static /* synthetic */ String m(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    private static /* synthetic */ com.applovin.impl.adview.m q(h5 h5Var) {
        JSONObject a2 = h5Var.a("web_view_settings", (JSONObject) null);
        if (a2 != null) {
            return new com.applovin.impl.adview.m(a2);
        }
        return null;
    }

    public List A() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new m(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, J(), N0(), this.sdk);
        }
        return a2;
    }

    public int B() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(x4.S0)).intValue());
    }

    public boolean C() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public List D() {
        List E = E();
        if (E == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(E.size());
        Iterator it = E.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public List F() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public Uri G() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public List H() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public Map J() {
        HashMap hashMap = new HashMap();
        try {
            h5 h5Var = this.synchronizedAdObject;
            hashMap.putAll(h5Var != null ? (Map) h5Var.a(new q()) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e2) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put("User-Agent", n8.a());
        }
        return hashMap;
    }

    public b K() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return b.DO_NOT_DISMISS;
            }
        }
        return b.UNSPECIFIED;
    }

    public int L() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public long M() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public List N() {
        return getStringListFromAdObject("pbpn", this.sdk.c(x4.O6));
    }

    public void a(String str) {
        this.i = str;
    }

    public void b(String str) {
        this.l = str;
    }

    public void c(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.a(new r(str));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public int t() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public boolean u() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public String v() {
        return this.i;
    }

    public int w() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int x() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int y() {
        return n7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public long z() {
        return this.j;
    }

    public void a(long j) {
        this.j = j;
    }

    public void b(boolean z) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.a("html_resources_cached", z);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z);
        }
    }

    public o4 i() {
        return (o4) this.g.getAndSet((Object) null);
    }

    public String k() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public d n() {
        if (this.m == null) {
            this.m = new d(this, null);
        }
        return this.m;
    }

    public int o() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(x4.N1)).intValue());
    }

    private /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    private static /* synthetic */ Boolean r(h5 h5Var) {
        return JsonUtils.getBoolean(h5Var.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    public void d() {
        this.f.set(true);
    }

    private /* synthetic */ List p(h5 h5Var) {
        return n7.a(h5Var.a("video_end_urls", new JSONObject()), getClCode(), h0(), this.sdk);
    }

    private /* synthetic */ List e(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List j(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List b(h5 h5Var) {
        return n7.a(h5Var.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public long c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    private String c(MotionEvent motionEvent, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map a2 = a(motionEvent, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, a2);
        }
        return null;
    }

    private List b(MotionEvent motionEvent, boolean z) {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new y(this, motionEvent, z));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z), c(motionEvent, z), J(), N0(), this.sdk);
        }
        return a2;
    }

    private /* synthetic */ Map c(h5 h5Var) {
        try {
            return JsonUtils.toStringMap(h5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e2) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new HashMap();
        }
    }

    private static /* synthetic */ List a(t.a aVar, h5 h5Var) {
        return (List) aVar.apply(h5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void a(String str, String str2) {
        this.d.put(str, str2);
    }

    private static /* synthetic */ void a(String str, h5 h5Var) {
        JsonUtils.putString(h5Var.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    private /* synthetic */ List a(h5 h5Var) {
        return n7.a(h5Var.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List b(MotionEvent motionEvent) {
        List a2;
        List list;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            list = (List) h5Var.a(new l(this, motionEvent));
        } else {
            synchronized (this.adObjectLock) {
                a2 = n7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, J(), N0(), this.sdk);
            }
            list = a2;
        }
        return list.isEmpty() ? b(motionEvent, true) : list;
    }

    public List a(MotionEvent motionEvent) {
        return b(motionEvent, false);
    }

    private /* synthetic */ List a(MotionEvent motionEvent, boolean z, h5 h5Var) {
        return n7.a(h5Var.a("click_tracking_urls", new JSONObject()), a(motionEvent, z), c(motionEvent, z), J(), N0(), this.sdk);
    }

    private /* synthetic */ List a(MotionEvent motionEvent, h5 h5Var) {
        return n7.a(h5Var.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, J(), N0(), this.sdk);
    }

    public void b(Uri uri) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    private Map a(MotionEvent motionEvent, boolean z) {
        Point b2 = o0.b(com.applovin.impl.sdk.k.o());
        HashMap hashMap = new HashMap(7);
        hashMap.put("{CLCODE}", getClCode());
        hashMap.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        hashMap.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(b2.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(b2.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z));
        return hashMap;
    }

    public void a(Uri uri) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public void a(o4 o4Var) {
        this.g.set(o4Var);
    }

    private e.a a(boolean z) {
        return z ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    public e.a a(int i) {
        if (i == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return e.a.INVISIBLE;
        }
        if (i == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
