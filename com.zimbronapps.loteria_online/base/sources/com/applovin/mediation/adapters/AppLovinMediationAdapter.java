package com.applovin.mediation.adapters;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.k;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.AppLovinAppOpenAd;
import com.applovin.impl.m2;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxAppOpenAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    protected AppLovinAdView loadedAdView;
    protected AppLovinAd loadedAppOpenAd;
    protected AppLovinAd loadedInterstitialAd;
    protected AppLovinNativeAd loadedNativeAd;
    protected AppLovinAd loadedRewardedAd;

    public class 1 implements AppLovinBidTokenCollectionListener {
        final /* synthetic */ MaxSignalCollectionListener val$callback;

        public 1(MaxSignalCollectionListener maxSignalCollectionListener) {
            this.val$callback = maxSignalCollectionListener;
        }

        public void onBidTokenCollected(String str) {
            AppLovinMediationAdapter.this.log("Signal collection successful");
            this.val$callback.onSignalCollected(str);
        }

        public void onBidTokenCollectionFailed(String str) {
            AppLovinMediationAdapter.this.log("Signal collection failed with error: " + str);
            this.val$callback.onSignalCollectionFailed(str);
        }
    }

    public AppLovinMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private void loadFullscreenAd(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Object obj) {
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), (m2) obj);
            return;
        }
        if (!StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            log("Loading mediated " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(str, (m2) obj);
            return;
        }
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
        getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, (m2) obj);
    }

    public static MaxAdapterError toMaxError(AppLovinError appLovinError) {
        MaxAdapterError maxAdapterError = appLovinError.getCode() == -1009 ? MaxAdapterError.NO_CONNECTION : appLovinError.getCode() == 204 ? MaxAdapterError.NO_FILL : appLovinError.getCode() == -1 ? MaxAdapterError.INTERNAL_ERROR : appLovinError.getCode() >= 500 ? MaxAdapterError.SERVER_ERROR : MaxAdapterError.UNSPECIFIED;
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), appLovinError.getCode(), appLovinError.getMessage());
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        if (((Boolean) getWrappingSdk().a().a(r3.u8)).booleanValue()) {
            getWrappingSdk().getAdService().collectBidToken(new 1(maxSignalCollectionListener));
        } else {
            maxSignalCollectionListener.onSignalCollected(getWrappingSdk().getAdService().getBidToken());
        }
    }

    public String getAdapterVersion() {
        return getSdkVersion();
    }

    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        AppLovinAdapterAdViewListener appLovinAdapterAdViewListener = new AppLovinAdapterAdViewListener(this, maxAdFormat, maxAdViewAdapterListener);
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), appLovinAdapterAdViewListener);
            return;
        }
        if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, appLovinAdapterAdViewListener);
            return;
        }
        AppLovinAdSize appLovinAdSize = maxAdFormat == MaxAdFormat.BANNER ? AppLovinAdSize.BANNER : maxAdFormat == MaxAdFormat.MREC ? AppLovinAdSize.MREC : maxAdFormat == MaxAdFormat.LEADER ? AppLovinAdSize.LEADER : null;
        if (appLovinAdSize == null) {
            log("Failed to load ad for format: " + maxAdFormat);
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INTERNAL_ERROR);
            return;
        }
        log("Loading regular " + maxAdFormat.getLabel() + " ad...");
        getWrappingSdk().getAdService().loadNextAd(appLovinAdSize, appLovinAdapterAdViewListener);
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        loadFullscreenAd("inter_appopen", maxAdapterResponseParameters, MaxAdFormat.APP_OPEN, new AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        loadFullscreenAd("inter_regular", maxAdapterResponseParameters, MaxAdFormat.INTERSTITIAL, new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener));
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
        } else {
            d("Loading bidding native ad...");
            getWrappingSdk().a().b0().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), new AppLovinAdapterNativeListener(maxAdapterResponseParameters, this, maxNativeAdAdapterListener));
        }
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        loadFullscreenAd("inter_videoa", maxAdapterResponseParameters, MaxAdFormat.REWARDED, new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener));
    }

    public void onDestroy() {
        this.loadedInterstitialAd = null;
        this.loadedAppOpenAd = null;
        this.loadedRewardedAd = null;
        AppLovinAdView appLovinAdView = this.loadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.loadedAdView = null;
        }
        AppLovinNativeAd appLovinNativeAd = this.loadedNativeAd;
        if (appLovinNativeAd instanceof AppLovinNativeAdImpl) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.loadedNativeAd = null;
        }
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        log("Showing app open ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AppLovinAppOpenAd appLovinAppOpenAd = new AppLovinAppOpenAd();
        AppLovinAdapterAppOpenListener appLovinAdapterAppOpenListener = new AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener);
        appLovinAppOpenAd.setAdDisplayListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.setAdClickListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.show(this.loadedAppOpenAd);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create();
        AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        create.setAdDisplayListener(appLovinAdapterInterstitialListener);
        create.setAdClickListener(appLovinAdapterInterstitialListener);
        create.showAndRender(this.loadedInterstitialAd);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = new AppLovinIncentivizedInterstitial();
        AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        appLovinIncentivizedInterstitial.show(this.loadedRewardedAd, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, k kVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = new AppLovinIncentivizedInterstitial();
        AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        appLovinIncentivizedInterstitial.show(this.loadedRewardedAd, viewGroup, kVar, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, k kVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create();
        AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        create.setAdDisplayListener(appLovinAdapterInterstitialListener);
        create.setAdClickListener(appLovinAdapterInterstitialListener);
        create.showAndRender(this.loadedInterstitialAd, viewGroup, kVar);
    }
}
