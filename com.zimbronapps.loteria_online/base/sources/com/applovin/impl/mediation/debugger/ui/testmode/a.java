package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.e3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.n3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {
    private e3 a;
    private k b;
    private MaxAdView c;
    private MaxAdView d;
    private MaxInterstitialAd e;
    private MaxAppOpenAd f;
    private MaxRewardedAd g;
    private MaxAd h;
    private MaxNativeAdLoader i;
    private List j;
    private String k;
    private AdControlButton l;
    private AdControlButton m;
    private AdControlButton n;
    private AdControlButton o;
    private AdControlButton p;
    private AdControlButton q;
    private Button r;
    private Button s;
    private FrameLayout t;
    private FrameLayout u;
    private Switch v;
    private Switch w;
    private Map x;

    public class a extends MaxNativeAdListener {
        final /* synthetic */ MaxNativeAdView a;

        public a(MaxNativeAdView maxNativeAdView) {
            this.a = maxNativeAdView;
        }

        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.a(a.this) != null) {
                a.b(a.this).destroy(a.a(a.this));
            }
            a.a(a.this, maxAd);
            a.b(a.this).render(this.a, maxAd);
            a.c(a.this).removeAllViews();
            a.c(a.this).addView(this.a);
            a.this.onAdLoaded(maxAd);
        }
    }

    public static /* synthetic */ void a(a aVar, View view) {
        aVar.d(view);
    }

    public static /* synthetic */ void b(a aVar, View view) {
        aVar.c(view);
    }

    public static /* synthetic */ void c(a aVar, View view) {
        aVar.b(view);
    }

    public static /* synthetic */ void d(a aVar, View view) {
        aVar.a(view);
    }

    private void e() {
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!r.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.a.m();
        this.k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.b.y0(), this);
        this.g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.g.setListener(this);
        AdControlButton findViewById = findViewById(R.id.rewarded_control_button);
        this.p = findViewById;
        findViewById.setOnClickListener(this);
        this.p.setFormat(maxAdFormat);
    }

    public k getSdk() {
        return this.b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.a.x() == null || !this.a.x().containsKey(maxAdFormat)) ? this.a.m() : (String) this.a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.a = e3Var;
        this.b = e3Var.o();
    }

    public void onAdClicked(MaxAd maxAd) {
        n7.a("onAdClicked", maxAd, (Context) this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, (Context) this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), (Context) this);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, (Context) this);
    }

    public void onAdExpanded(MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, (Context) this);
    }

    public void onAdHidden(MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, (Context) this);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a2 = a(str);
        a2.setControlState(AdControlButton.b.LOAD);
        n7.a(maxError, a2.getFormat().getLabel(), (Context) this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton a2 = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a2.setControlState(AdControlButton.b.LOAD);
        } else {
            a2.setControlState(AdControlButton.b.SHOW);
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, (Context) this);
    }

    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.x.get(format)).a();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.a.g() + " Test Ads");
        this.j = this.b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.r = findViewById(R.id.show_mrec_button);
        this.s = findViewById(R.id.show_native_button);
        if (this.a.I() && this.a.r().contains(MaxAdFormat.MREC)) {
            this.u.setVisibility(8);
            this.r.setBackgroundColor(-1);
            this.s.setBackgroundColor(-3355444);
            this.r.setOnClickListener(new b(this));
            this.s.setOnClickListener(new c(this));
        } else {
            this.r.setVisibility(8);
            this.s.setVisibility(8);
        }
        this.v = findViewById(R.id.native_banner_switch);
        this.w = findViewById(R.id.native_mrec_switch);
        if (this.a.J()) {
            this.v.setOnClickListener(new d(this));
            this.w.setOnClickListener(new e(this));
        } else {
            this.v.setVisibility(8);
            this.w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.a.e()) || this.a.d() == null || this.a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap hashMap = new HashMap(this.a.d().size());
        for (MaxAdFormat maxAdFormat : this.a.d().keySet()) {
            hashMap.put(maxAdFormat, new w((x) this.a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.x = hashMap;
    }

    public void onDestroy() {
        super.onDestroy();
        this.b.s0().a(this.j);
        MaxAdView maxAdView = this.c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.i.destroy();
        }
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, (Context) this);
    }

    public static /* synthetic */ MaxAd a(a aVar) {
        return aVar.h;
    }

    public static /* synthetic */ MaxNativeAdLoader b(a aVar) {
        return aVar.i;
    }

    public static /* synthetic */ FrameLayout c(a aVar) {
        return aVar.u;
    }

    private /* synthetic */ void d(View view) {
        this.d.removeAllViews();
        this.m.setControlState(AdControlButton.b.LOAD);
    }

    public static /* synthetic */ MaxAd a(a aVar, MaxAd maxAd) {
        aVar.h = maxAd;
        return maxAd;
    }

    private /* synthetic */ void b(View view) {
        this.u.setVisibility(0);
        this.t.setVisibility(8);
        this.s.setBackgroundColor(-1);
        this.r.setBackgroundColor(-3355444);
    }

    private /* synthetic */ void c(View view) {
        this.c.removeAllViews();
        this.l.setControlState(AdControlButton.b.LOAD);
    }

    private /* synthetic */ void a(View view) {
        this.t.setVisibility(0);
        this.u.setVisibility(8);
        this.r.setBackgroundColor(-1);
        this.s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.u = findViewById(R.id.native_ad_view_container);
        if (this.a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), (Context) this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.i.setNativeAdListener(new a(maxNativeAdView));
            this.i.setRevenueListener(this);
            AdControlButton findViewById = findViewById(R.id.native_control_button);
            this.q = findViewById;
            findViewById.setOnClickListener(this);
            this.q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.u.setVisibility(8);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.t = findViewById(R.id.mrec_ad_view_container);
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.b.y0(), this);
            this.d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.d.setExtraParameter("disable_precache", "true");
            this.d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.d.stopAutoRefresh();
            this.d.setListener(this);
            this.t.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton findViewById = findViewById(R.id.mrec_control_button);
            this.m = findViewById;
            findViewById.setOnClickListener(this);
            this.m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.t.setVisibility(8);
    }

    private void b() {
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.b.y0(), this);
            this.e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.e.setListener(this);
            AdControlButton findViewById = findViewById(R.id.interstitial_control_button);
            this.n = findViewById;
            findViewById.setOnClickListener(this);
            this.n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout findViewById = findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            findViewById(R.id.banner_label).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.b.y0(), this);
            this.c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.c.setExtraParameter("disable_auto_retries", "true");
            this.c.setExtraParameter("disable_precache", "true");
            this.c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.c.stopAutoRefresh();
            this.c.setListener(this);
            findViewById.addView(this.c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton findViewById2 = findViewById(R.id.banner_control_button);
            this.l = findViewById2;
            findViewById2.setOnClickListener(this);
            this.l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        findViewById.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z = false;
        boolean z2 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.w.isChecked()) {
            z = true;
        }
        if (!z2 && !z) {
            this.b.s0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.b.s0().a(this.a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.d.loadAd();
            this.r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.i.loadAd();
            this.s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.o;
            }
            if (str.equals(this.k)) {
                return this.p;
            }
            if (str.equals("test_mode_native")) {
                return this.q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.l;
    }
}
