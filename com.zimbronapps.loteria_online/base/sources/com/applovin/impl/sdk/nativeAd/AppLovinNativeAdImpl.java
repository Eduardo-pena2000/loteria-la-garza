package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.e8;
import com.applovin.impl.g1;
import com.applovin.impl.g8;
import com.applovin.impl.h5;
import com.applovin.impl.i4;
import com.applovin.impl.k4;
import com.applovin.impl.k7;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd, View.OnClickListener, AppLovinTouchToClickListener.OnClickListener {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final i4 adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final List clickTrackingRequests;
    private final List clickTrackingUrls;
    private v.f customTabsSession;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List jsTrackers;
    private float mainImageAspectRatio;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final o7 vastAd;
    private View videoView;
    private final c viewableMRC100Callback;
    private g8 viewableMRC100Tracker;
    private final c viewableMRC50Callback;
    private g8 viewableMRC50Tracker;
    private c viewableVideoMRC50Callback;
    private g8 viewableVideoMRC50Tracker;

    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List clickTrackingRequests;
        private List clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List impressionRequests;
        private List jsTrackers;
        private float mainImageAspectRatio;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final com.applovin.impl.sdk.k sdk;
        private Double starRating;
        private String title;
        private o7 vastAd;
        private List viewableMRC100Requests;
        private List viewableMRC50Requests;
        private List viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = kVar;
        }

        public static /* synthetic */ JSONObject access$000(Builder builder) {
            return builder.adObject;
        }

        public static /* synthetic */ JSONObject access$100(Builder builder) {
            return builder.fullResponse;
        }

        public static /* synthetic */ Uri access$1000(Builder builder) {
            return builder.privacyIconUri;
        }

        public static /* synthetic */ o7 access$1100(Builder builder) {
            return builder.vastAd;
        }

        public static /* synthetic */ Uri access$1200(Builder builder) {
            return builder.clickDestinationUri;
        }

        public static /* synthetic */ Uri access$1300(Builder builder) {
            return builder.clickDestinationBackupUri;
        }

        public static /* synthetic */ List access$1400(Builder builder) {
            return builder.clickTrackingUrls;
        }

        public static /* synthetic */ List access$1500(Builder builder) {
            return builder.jsTrackers;
        }

        public static /* synthetic */ List access$1600(Builder builder) {
            return builder.clickTrackingRequests;
        }

        public static /* synthetic */ List access$1700(Builder builder) {
            return builder.impressionRequests;
        }

        public static /* synthetic */ Double access$1800(Builder builder) {
            return builder.starRating;
        }

        public static /* synthetic */ Uri access$1900(Builder builder) {
            return builder.privacyDestinationUri;
        }

        public static /* synthetic */ com.applovin.impl.sdk.k access$200(Builder builder) {
            return builder.sdk;
        }

        public static /* synthetic */ List access$2000(Builder builder) {
            return builder.viewableMRC50Requests;
        }

        public static /* synthetic */ List access$2100(Builder builder) {
            return builder.viewableMRC100Requests;
        }

        public static /* synthetic */ List access$2200(Builder builder) {
            return builder.viewableVideo50Requests;
        }

        public static /* synthetic */ String access$300(Builder builder) {
            return builder.title;
        }

        public static /* synthetic */ String access$400(Builder builder) {
            return builder.advertiser;
        }

        public static /* synthetic */ String access$500(Builder builder) {
            return builder.body;
        }

        public static /* synthetic */ String access$600(Builder builder) {
            return builder.callToAction;
        }

        public static /* synthetic */ Uri access$700(Builder builder) {
            return builder.iconUri;
        }

        public static /* synthetic */ Uri access$800(Builder builder) {
            return builder.mainImageUri;
        }

        public static /* synthetic */ float access$900(Builder builder) {
            return builder.mainImageAspectRatio;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this, null);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingRequests(List list) {
            this.clickTrackingRequests = list;
            return this;
        }

        public Builder setClickTrackingUrls(List list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.starRating = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(o7 o7Var) {
            this.vastAd = o7Var;
            return this;
        }

        public Builder setViewableMRC100Requests(List list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    public static class b implements View.OnAttachStateChangeListener {
        private final AppLovinNativeAdImpl a;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.a = appLovinNativeAdImpl;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a = a();
            AppLovinNativeAdImpl a2 = bVar.a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a = a();
            return (a == null ? 43 : a.hashCode()) + 59;
        }

        public void onViewAttachedToWindow(View view) {
            AppLovinNativeAdImpl.access$2400(this.a, view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }

        public AppLovinNativeAdImpl a() {
            return this.a;
        }
    }

    public class c implements g8.a {
        private final List a;

        public c(List list) {
            this.a = list;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a(this)) {
                return false;
            }
            List a = a();
            List a2 = cVar.a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            List a = a();
            return (a == null ? 43 : a.hashCode()) + 59;
        }

        public void onLogVisibilityImpression() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                AppLovinNativeAdImpl.access$2300(AppLovinNativeAdImpl.this).g0().dispatchPostbackRequest((com.applovin.impl.sdk.network.e) it.next(), null);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + a() + ")";
        }

        public List a() {
            return this.a;
        }
    }

    public /* synthetic */ AppLovinNativeAdImpl(Builder builder, a aVar) {
        this(builder);
    }

    public static /* synthetic */ List a(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getCustomTabsNavigationAbortedPostbacks$6(h5Var);
    }

    public static /* synthetic */ com.applovin.impl.sdk.k access$2300(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        return appLovinNativeAdImpl.sdk;
    }

    public static /* synthetic */ void access$2400(AppLovinNativeAdImpl appLovinNativeAdImpl, View view) {
        appLovinNativeAdImpl.maybeHandleOnAttachedToWindow(view);
    }

    public static /* synthetic */ List b(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getCustomTabsNavigationFinishedPostbacks$4(h5Var);
    }

    public static /* synthetic */ List c(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getCustomTabsTabHiddenPostbacks$8(h5Var);
    }

    public static /* synthetic */ List d(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getCustomTabsNavigationStartedPostbacks$3(h5Var);
    }

    public static /* synthetic */ List e(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getDirectClickTrackingPostbacks$9(h5Var);
    }

    public static /* synthetic */ Map f(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getCustomTabsHeaders$2(h5Var);
    }

    public static /* synthetic */ void g(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        appLovinNativeAdImpl.lambda$unregisterViewsForInteraction$0();
    }

    private List getDirectClickTrackingPostbacks() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new f(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return a2;
    }

    public static /* synthetic */ List h(t.a aVar, h5 h5Var) {
        return lambda$getOpenMeasurementVerificationScriptResources$11(aVar, h5Var);
    }

    private boolean isDspAd() {
        return "ortb".equalsIgnoreCase(getType());
    }

    private /* synthetic */ Map lambda$getCustomTabsHeaders$2(h5 h5Var) {
        try {
            return JsonUtils.toStringMap(h5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a("AppLovinNativeAd", "Failed to retrieve http headers for Custom Tabs", e);
            }
            return new HashMap();
        }
    }

    private /* synthetic */ List lambda$getCustomTabsNavigationAbortedPostbacks$6(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List lambda$getCustomTabsNavigationFailedPostbacks$5(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List lambda$getCustomTabsNavigationFinishedPostbacks$4(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List lambda$getCustomTabsNavigationStartedPostbacks$3(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private static /* synthetic */ g1 lambda$getCustomTabsSettings$1(h5 h5Var) {
        JSONObject a2 = h5Var.a("custom_tabs_settings", (JSONObject) null);
        if (a2 != null) {
            return new g1(a2);
        }
        return null;
    }

    private /* synthetic */ List lambda$getCustomTabsTabHiddenPostbacks$8(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List lambda$getCustomTabsTabShownPostbacks$7(h5 h5Var) {
        return n7.a(h5Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private /* synthetic */ List lambda$getDirectClickTrackingPostbacks$9(h5 h5Var) {
        return n7.a(h5Var.a("click_tracking_urls", new JSONObject()), getClCode(), h5Var.a("click_tracking_url", (String) null), this.sdk);
    }

    private /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$10(JSONArray jSONArray) {
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
                    this.sdk.O().a(this.tag, "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    private static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$11(t.a aVar, h5 h5Var) {
        return (List) aVar.apply(h5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    private /* synthetic */ void lambda$unregisterViewsForInteraction$0() {
        for (View view : this.registeredViews) {
            view.setOnTouchListener((View.OnTouchListener) null);
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a(this.tag, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        g8 g8Var = this.viewableMRC50Tracker;
        if (g8Var != null) {
            g8Var.b();
        }
        g8 g8Var2 = this.viewableMRC100Tracker;
        if (g8Var2 != null) {
            g8Var2.b();
        }
        g8 g8Var3 = this.viewableVideoMRC50Tracker;
        if (g8Var3 != null) {
            g8Var3.b();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    private void launchUri(Uri uri, Uri uri2, Context context) {
        if (isCustomTabsEnabled() && this.sdk.z().a(uri, this, this.sdk.u0())) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a(this.tag, "Opening URL in Custom Tab: " + uri);
                return;
            }
            return;
        }
        if (isCustomTabsEnabled() && uri2 != null && this.sdk.z().a(uri2, this, this.sdk.u0())) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a(this.tag, "Opening backup URL in Custom Tab: " + uri2);
                return;
            }
            return;
        }
        if (k7.a(uri, context, this.sdk)) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a(this.tag, "Opening URL: " + uri);
                return;
            }
            return;
        }
        if (uri2 == null || !k7.a(uri2, context, this.sdk)) {
            return;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a(this.tag, "Opening backup URL: " + uri2);
        }
    }

    private void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            g8 g8Var = new g8(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = g8Var;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            g8Var.a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            g8 g8Var2 = new g8(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = g8Var2;
            g8Var2.a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            o7 o7Var = this.vastAd;
            if (o7Var != null && o7Var.hasVideoUrl()) {
                g8 g8Var3 = new g8(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = g8Var3;
                g8Var3.a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            List list = this.jsTrackers;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.sdk.x0().b((String) it.next());
                }
            }
            Iterator it2 = this.impressionRequests.iterator();
            while (it2.hasNext()) {
                this.sdk.g0().dispatchPostbackRequest((com.applovin.impl.sdk.network.e) it2.next(), null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.g();
        }
    }

    public static /* synthetic */ g1 t(h5 h5Var) {
        return lambda$getCustomTabsSettings$1(h5Var);
    }

    public static /* synthetic */ List u(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getCustomTabsTabShownPostbacks$7(h5Var);
    }

    public static /* synthetic */ List v(AppLovinNativeAdImpl appLovinNativeAdImpl, h5 h5Var) {
        return appLovinNativeAdImpl.lambda$getCustomTabsNavigationFailedPostbacks$5(h5Var);
    }

    public static /* synthetic */ List w(AppLovinNativeAdImpl appLovinNativeAdImpl, JSONArray jSONArray) {
        return appLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$10(jSONArray);
    }

    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.f();
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public String getAdvertiser() {
        return this.advertiser;
    }

    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public Bundle getCustomTabsHeaders() {
        Map hashMap;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            hashMap = (Map) h5Var.a(new j(this));
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a("AppLovinNativeAd", "Failed to retrieve http headers for Custom Tabs", e);
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
            return (List) h5Var.a(new com.applovin.impl.sdk.nativeAd.c(this));
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
            return (List) h5Var.a(new i(this));
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
            return (List) h5Var.a(new g(this));
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
            return (List) h5Var.a(new m(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public v.f getCustomTabsSession() {
        return this.customTabsSession;
    }

    public g1 getCustomTabsSettings() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (g1) h5Var.a(new n());
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
            return (List) h5Var.a(new l(this));
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
            return (List) h5Var.a(new k(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public Uri getIconUri() {
        return this.iconUri;
    }

    public float getMainImageAspectRatio() {
        return this.mainImageAspectRatio;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        if (this.sdk.e0().e()) {
            return Collections.singletonList(VerificationScriptResource.createVerificationScriptResourceWithParameters(k4.c(), k4.b(), k4.a()));
        }
        d dVar = new d(this);
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new e(dVar));
        }
        synchronized (this.adObjectLock) {
            list = (List) dVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    public Double getStarRating() {
        return this.starRating;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public o7 getVastAd() {
        return this.vastAd;
    }

    public void handleNativeAdClick(Uri uri, Uri uri2, Context context) {
        if (this.clickTrackingRequests.size() > 0) {
            Iterator it = this.clickTrackingRequests.iterator();
            while (it.hasNext()) {
                this.sdk.g0().dispatchPostbackRequest((com.applovin.impl.sdk.network.e) it.next(), null);
            }
        } else {
            Iterator it2 = this.clickTrackingUrls.iterator();
            while (it2.hasNext()) {
                this.sdk.g0().dispatchPostbackAsync((String) it2.next(), null);
            }
        }
        t2.b(this.eventListener, this);
        launchUri(uri, uri2, context);
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.e0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public void onClick(View view) {
        Context context;
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a(this.tag, "Handle view clicked");
        }
        this.sdk.k().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(x4.w)).booleanValue()) {
            context = e8.b(this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    public void registerViewsForInteraction(List list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a(this.tag, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.hasOnClickListeners()) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().k(this.tag, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().k(this.tag, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().b(this.tag, "View is not enabled - " + view);
                }
            }
            if (view instanceof Button) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a(this.tag, "Registering click for button: " + view);
                }
            } else {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a(this.tag, "Registering click for view: " + view);
                }
            }
            if (((Boolean) this.sdk.a(x4.F2)).booleanValue()) {
                view.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, x4.g0, viewGroup.getContext(), this));
            } else {
                view.setOnClickListener(this);
            }
            this.registeredViews.add(view);
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a(this.tag, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageAspectRatio(float f) {
        this.mainImageAspectRatio = f;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        o7 o7Var = this.vastAd;
        if (o7Var == null || !o7Var.hasVideoUrl()) {
            this.mediaView = new AppLovinMediaView(this, this.sdk, com.applovin.impl.sdk.k.o());
        } else {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, com.applovin.impl.sdk.k.o());
            } catch (Throwable th) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().d(this.tag, "Failed to create MediaPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.D().a("AppLovinNativeAd", "createMediaPlayerVASTMediaView", th);
                this.mediaView = new AppLovinMediaView(this, this.sdk, com.applovin.impl.sdk.k.o());
            }
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, com.applovin.impl.sdk.k.o());
            return;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    public void unregisterViewsForInteraction() {
        AppLovinSdkUtils.runOnUiThread(new h(this));
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(Builder.access$000(builder), Builder.access$100(builder), Builder.access$200(builder));
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.onAttachStateChangeHandler = new b(this);
        this.adEventTracker = new i4(this);
        this.title = Builder.access$300(builder);
        this.advertiser = Builder.access$400(builder);
        this.body = Builder.access$500(builder);
        this.callToAction = Builder.access$600(builder);
        this.iconUri = Builder.access$700(builder);
        this.mainImageUri = Builder.access$800(builder);
        this.mainImageAspectRatio = Builder.access$900(builder);
        this.privacyIconUri = Builder.access$1000(builder);
        o7 access$1100 = Builder.access$1100(builder);
        this.vastAd = access$1100;
        this.clickDestinationUri = Builder.access$1200(builder);
        this.clickDestinationBackupUri = Builder.access$1300(builder);
        this.clickTrackingUrls = Builder.access$1400(builder);
        this.jsTrackers = Builder.access$1500(builder);
        this.clickTrackingRequests = Builder.access$1600(builder);
        this.impressionRequests = Builder.access$1700(builder);
        Double access$1800 = Builder.access$1800(builder);
        this.starRating = (access$1800 == null || access$1800.doubleValue() < 3.0d) ? null : access$1800;
        if (Builder.access$1900(builder) != null) {
            this.privacyDestinationUri = Builder.access$1900(builder);
        } else if (!isDspAd() || getSdk().s0().c()) {
            this.privacyDestinationUri = Uri.parse("https://www.applovin.com/privacy/");
        }
        this.viewableMRC50Callback = new c(Builder.access$2000(builder));
        this.viewableMRC100Callback = new c(Builder.access$2100(builder));
        if (isCustomTabsEnabled()) {
            this.customTabsSession = this.sdk.z().a(this);
            this.sdk.z().b(getCustomTabsWarmupUrls(), this.customTabsSession);
        }
        if (access$1100 != null && access$1100.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new c(Builder.access$2200(builder));
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    public i4 getAdEventTracker() {
        return this.adEventTracker;
    }

    public void onClick(View view, MotionEvent motionEvent) {
        Context context;
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a(this.tag, "Handle view clicked");
        }
        this.sdk.k().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(x4.w)).booleanValue()) {
            context = e8.b(this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }
}
