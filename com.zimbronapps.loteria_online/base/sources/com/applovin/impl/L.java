package com.applovin.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.m;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.w;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {
    private com.applovin.impl.sdk.k a;
    private n b;
    private i8 c;
    private m d;
    private MaxAdView e;
    private MaxInterstitialAd f;
    private MaxAppOpenAd g;
    private MaxRewardedAd h;
    private MaxNativeAdView i;
    private MaxNativeAdLoader j;
    private MaxAd k;
    private r l;
    private List m;
    private ListView n;
    private View o;
    private AdControlButton p;
    private TextView q;
    private w r;

    public class a extends MaxNativeAdListener {
        public a() {
        }

        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.a(l.this) != null) {
                l.b(l.this).destroy(l.a(l.this));
            }
            l.a(l.this, maxAd);
            l.b(l.this).render(l.c(l.this), maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    public static /* synthetic */ MaxAd a(l lVar) {
        return lVar.k;
    }

    public static /* synthetic */ void b(r2 r2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        a(r2Var, nVar, oVar, kVar, maxDebuggerAdUnitDetailActivity);
    }

    public static /* synthetic */ void c(l lVar, com.applovin.impl.sdk.k kVar, n nVar, o oVar, j2 j2Var, r2 r2Var) {
        lVar.a(kVar, nVar, oVar, j2Var, r2Var);
    }

    public static /* synthetic */ void d(l lVar, DialogInterface dialogInterface) {
        lVar.a(dialogInterface);
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(n nVar, o oVar, i8 i8Var, com.applovin.impl.sdk.k kVar) {
        List a2;
        this.a = kVar;
        this.b = nVar;
        this.c = i8Var;
        this.m = kVar.s0().b();
        m mVar = new m(nVar, oVar, i8Var, this);
        this.d = mVar;
        mVar.a(new A2(this, kVar, nVar, oVar));
        b();
        if (nVar.f().f()) {
            if ((i8Var != null && !i8Var.b().d().C()) || (a2 = kVar.U().a(nVar.c())) == null || a2.isEmpty()) {
                return;
            }
            this.r = new w(a2, nVar.a(), getApplicationContext(), this);
        }
    }

    public void onAdClicked(MaxAd maxAd) {
        n7.a("onAdClicked", maxAd, (Context) this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, (Context) this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.p.setControlState(AdControlButton.b.a);
        this.q.setText("");
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
        this.p.setControlState(AdControlButton.b.a);
        this.q.setText("");
        if (204 == maxError.getCode()) {
            n7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", (Context) this);
            return;
        }
        n7.a("", "Failed to load with error code: " + maxError.getCode(), (Context) this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        this.q.setText(maxAd.getNetworkName() + " ad loaded");
        this.p.setControlState(AdControlButton.b.c);
        if (maxAd.getFormat().isAdViewAd()) {
            a((ViewGroup) this.e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a((ViewGroup) this.i, MaxAdFormat.MREC.getSize());
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, (Context) this);
    }

    public void onClick(AdControlButton adControlButton) {
        if (this.a.s0().c()) {
            n7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", (Context) this);
            return;
        }
        if (this.d.j() != this.b.f()) {
            n7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", (Context) this);
            return;
        }
        MaxAdFormat a2 = this.b.a();
        AdControlButton.b bVar = AdControlButton.b.a;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.b);
            w wVar = this.r;
            if (wVar != null) {
                wVar.a();
                return;
            } else {
                a(a2);
                return;
            }
        }
        if (AdControlButton.b.c == adControlButton.getControlState()) {
            if (!a2.isAdViewAd() && a2 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(a2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.d.k());
        this.n = findViewById(R.id.listView);
        this.o = findViewById(R.id.ad_presenter_view);
        this.p = findViewById(R.id.ad_control_button);
        this.q = findViewById(R.id.status_textview);
        this.n.setAdapter(this.d);
        this.q.setText(a());
        this.q.setTypeface(Typeface.DEFAULT_BOLD);
        this.p.setOnClickListener(this);
        Drawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.o.setBackground(layerDrawable);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.c != null) {
            this.a.s0().a(this.m);
        }
        MaxAdView maxAdView = this.e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.j.destroy();
        }
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, (Context) this);
    }

    public static /* synthetic */ MaxAd a(l lVar, MaxAd maxAd) {
        lVar.k = maxAd;
        return maxAd;
    }

    public static /* synthetic */ MaxNativeAdLoader b(l lVar) {
        return lVar.j;
    }

    public static /* synthetic */ MaxNativeAdView c(l lVar) {
        return lVar.i;
    }

    private /* synthetic */ void a(com.applovin.impl.sdk.k kVar, n nVar, o oVar, j2 j2Var, r2 r2Var) {
        if (r2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new B2(r2Var, nVar, oVar, kVar));
        }
    }

    private void b() {
        String c = this.b.c();
        if (this.b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(c, this.b.a());
            this.e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.e.setExtraParameter("disable_auto_retries", "true");
            this.e.setExtraParameter("disable_precache", "true");
            this.e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.e.stopAutoRefresh();
            this.e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(c);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(c);
            this.g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(c);
            this.h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.b.a()) {
            this.i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(c);
            this.j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.j.setNativeAdListener(new a());
            this.j.setRevenueListener(this);
        }
    }

    private static /* synthetic */ void a(r2 r2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) r2Var).v(), kVar);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.c;
        sb.append(i8Var != null ? i8Var.b().a() : this.d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.c != null) {
            this.a.s0().a(this.c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.e.setPlacement("[Mediation Debugger Live Ad]");
            this.e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            this.h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            this.j.setPlacement("[Mediation Debugger Live Ad]");
            this.j.loadAd();
        } else {
            n7.a("Live ads currently unavailable for ad format", (Context) this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.l = rVar;
        rVar.setOnDismissListener(new Z1(this));
        this.l.show();
    }

    private /* synthetic */ void a(DialogInterface dialogInterface) {
        this.l = null;
    }

    private String a() {
        if (this.a.s0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.d.j() != this.b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        i8 i8Var = this.c;
        sb.append(i8Var != null ? i8Var.b().a() : this.d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            a((ViewGroup) this.e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.b.a()) {
            this.h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a((ViewGroup) this.i, MaxAdFormat.MREC.getSize());
        }
    }
}
