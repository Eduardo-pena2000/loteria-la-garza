package com.unity3d.services.banners.bridge;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BannerBridge {

    public class 1 extends HashMap {
        final /* synthetic */ boolean val$isHB;

        public 1(boolean z) {
            this.val$isHB = z;
            put("is_header_bidding", String.valueOf(z));
        }
    }

    public class 2 implements IUnityAdsLoadListener {
        final /* synthetic */ String val$bannerAdId;
        final /* synthetic */ BannerView val$bannerAdView;
        final /* synthetic */ BannerView.IListener val$bannerListener;
        final /* synthetic */ boolean val$isAlternativeFlow;
        final /* synthetic */ UnityAdsLoadOptions val$loadOptions;
        final /* synthetic */ SDKMetricsSender val$sdkMetricsSender;
        final /* synthetic */ Map val$tags;

        public class 1 implements Listeners {
            public 1() {
            }

            public void onClick(String str) {
                2 r2 = 2.this;
                BannerView.IListener iListener = r2.val$bannerListener;
                if (iListener != null) {
                    iListener.onBannerClick(r2.val$bannerAdView);
                }
            }

            public void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            }

            public void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            }

            public void onLeftApplication(String str) {
                2 r2 = 2.this;
                BannerView.IListener iListener = r2.val$bannerListener;
                if (iListener != null) {
                    iListener.onBannerLeftApplication(r2.val$bannerAdView);
                }
            }

            public void onStart(String str) {
                2 r2 = 2.this;
                BannerView.IListener iListener = r2.val$bannerListener;
                if (iListener != null) {
                    iListener.onBannerShown(r2.val$bannerAdView);
                }
            }
        }

        public 2(BannerView.IListener iListener, SDKMetricsSender sDKMetricsSender, Map map, boolean z, BannerView bannerView, UnityAdsLoadOptions unityAdsLoadOptions, String str) {
            this.val$bannerListener = iListener;
            this.val$sdkMetricsSender = sDKMetricsSender;
            this.val$tags = map;
            this.val$isAlternativeFlow = z;
            this.val$bannerAdView = bannerView;
            this.val$loadOptions = unityAdsLoadOptions;
            this.val$bannerAdId = str;
        }

        public void onUnityAdsAdLoaded(String str) {
            if (this.val$bannerListener == null) {
                this.val$sdkMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_loaded_not_found", null, this.val$tags));
            }
            if (this.val$isAlternativeFlow) {
                BannerView.IListener iListener = this.val$bannerListener;
                if (iListener != null) {
                    iListener.onBannerLoaded(this.val$bannerAdView);
                }
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(this.val$loadOptions.getObjectId());
                new UnityAdsSDK().show(str, unityAdsShowOptions, new 1());
            }
        }

        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            BannerView bannerView = BannerViewCache.getInstance().getBannerView(this.val$bannerAdId);
            if (bannerView == null || bannerView.getListener() == null) {
                this.val$sdkMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", null, this.val$tags));
            } else {
                bannerView.getListener().onBannerFailedToLoad(bannerView, BannerErrorInfo.fromLoadError(unityAdsLoadError, str2));
            }
        }
    }

    public enum BannerEvent {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER,
        SCAR_BANNER_LOADED,
        SCAR_BANNER_LOAD_FAILED,
        SCAR_BANNER_ATTACHED,
        SCAR_BANNER_DETACHED,
        SCAR_BANNER_OPENED,
        SCAR_BANNER_CLOSED,
        SCAR_BANNER_IMPRESSION,
        SCAR_BANNER_CLICKED
    }

    public static void destroy(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROY_BANNER, str);
        }
    }

    public static void didAttach(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_ATTACHED, str);
        }
    }

    public static void didAttachScarBanner(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_ATTACHED, str);
        }
    }

    public static void didDestroy(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROYED, str);
        }
    }

    public static void didDetach(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DETACHED, str);
        }
    }

    public static void didDetachScarBanner(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_DETACHED, str);
        }
    }

    public static void didLoad(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOADED, str);
        }
    }

    private static boolean isHeaderBidding(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has("adMarkup");
    }

    public static void load(String str, String str2, UnityBannerSize unityBannerSize) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOAD_PLACEMENT, str, str2, Integer.valueOf(unityBannerSize.getWidth()), Integer.valueOf(unityBannerSize.getHeight()));
            return;
        }
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null || bannerView.getListener() == null) {
            return;
        }
        bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", BannerErrorCode.WEBVIEW_ERROR));
    }

    public static void resize(String str, int i, int i2, int i3, int i4, float f) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_RESIZED, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    public static void visibilityChanged(String str, int i) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_VISIBILITY_CHANGED, str, Integer.valueOf(i));
        }
    }

    public static void load(String str, String str2, UnityBannerSize unityBannerSize, UnityAdsLoadOptions unityAdsLoadOptions) {
        SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
        1 r3 = new 1(isHeaderBidding(unityAdsLoadOptions.getData()));
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null) {
            sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_load_not_found", null, r3));
            return;
        }
        boolean invoke = ((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke();
        boolean z = unityAdsLoadOptions.getObjectId() != null;
        if (invoke && !z) {
            unityAdsLoadOptions.setObjectId(str2);
        }
        2 r11 = new 2(bannerView.getListener(), sDKMetricsSender, r3, invoke, bannerView, unityAdsLoadOptions, str2);
        if (invoke) {
            new UnityAdsSDK().load(str, unityAdsLoadOptions, r11, unityBannerSize);
        } else {
            LoadBannerModule.getInstance().executeAdOperation(new WebViewBridgeInvoker(), new LoadBannerOperationState(str, str2, unityBannerSize, r11, unityAdsLoadOptions, new ConfigurationReader().getCurrentConfiguration()));
        }
    }
}
