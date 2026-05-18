package com.unity3d.services.banners;

import android.content.Context;
import android.view.ViewManager;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import java.util.UUID;
import org.json.JSONObject;
import v9.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BannerView extends RelativeLayout {
    private BannerWebPlayerContainer bannerWebPlayerContainer;
    private final GMAScarAdapterBridge gmaScarAdapterBridge;
    private IInitializationListener initializationListener;
    private IListener listener;
    private String placementId;
    private ScarBannerContainer scarBannerContainer;
    private UnityBannerSize size;
    private String viewId;

    public class 1 implements Runnable {
        final /* synthetic */ BannerView val$self;

        public 1(BannerView bannerView) {
            this.val$self = bannerView;
        }

        public void run() {
            ViewManager parent = this.val$self.getParent();
            if (parent == null || !(parent instanceof ViewManager)) {
                return;
            }
            parent.removeView(this.val$self);
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ BannerView val$self;
        final /* synthetic */ UnityBannerSize val$unityBannerSize;

        public 2(BannerView bannerView, UnityBannerSize unityBannerSize) {
            this.val$self = bannerView;
            this.val$unityBannerSize = unityBannerSize;
        }

        public void run() {
            JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(BannerView.access$000(this.val$self));
            JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(BannerView.access$000(this.val$self));
            JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(BannerView.access$000(this.val$self));
            if (BannerView.access$100(this.val$self) != null) {
                BannerView.access$100(this.val$self).setWebPlayerSettings(webSettings, webPlayerSettings);
                BannerView.access$100(this.val$self).setWebPlayerEventSettings(webPlayerEventSettings);
            } else {
                BannerView.access$102(this.val$self, new BannerWebPlayerContainer(this.val$self.getContext(), BannerView.access$000(this.val$self), webSettings, webPlayerSettings, webPlayerEventSettings, this.val$unityBannerSize));
                BannerView bannerView = this.val$self;
                bannerView.addView(BannerView.access$100(bannerView));
            }
        }
    }

    public class 3 implements IInitializationListener {
        final /* synthetic */ BannerView val$bannerView;

        public 3(BannerView bannerView) {
            this.val$bannerView = bannerView;
        }

        public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
            BannerView.access$200(this.val$bannerView);
            if (this.val$bannerView.getListener() != null) {
                this.val$bannerView.getListener().onBannerFailedToLoad(this.val$bannerView, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
            }
        }

        public void onSdkInitialized() {
            BannerView.access$200(this.val$bannerView);
            BannerView.access$300(this.val$bannerView);
        }
    }

    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);

        void onBannerShown(BannerView bannerView);
    }

    public static abstract class Listener implements IListener {
        public void onBannerClick(BannerView bannerView) {
        }

        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        public void onBannerLeftApplication(BannerView bannerView) {
        }

        public void onBannerLoaded(BannerView bannerView) {
        }

        public void onBannerShown(BannerView bannerView) {
        }
    }

    public BannerView(Context context, String str, UnityBannerSize unityBannerSize) {
        super(context);
        this.gmaScarAdapterBridge = GMA.getInstance().getBridge();
        this.viewId = UUID.randomUUID().toString();
        this.placementId = str;
        this.size = unityBannerSize;
        setupLayoutParams();
        setBackgroundColor(0);
        BannerViewCache.getInstance().addBannerView(this);
    }

    public static /* synthetic */ void a(BannerView bannerView) {
        bannerView.lambda$addScarContainer$0();
    }

    public static /* synthetic */ String access$000(BannerView bannerView) {
        return bannerView.viewId;
    }

    public static /* synthetic */ BannerWebPlayerContainer access$100(BannerView bannerView) {
        return bannerView.bannerWebPlayerContainer;
    }

    public static /* synthetic */ BannerWebPlayerContainer access$102(BannerView bannerView, BannerWebPlayerContainer bannerWebPlayerContainer) {
        bannerView.bannerWebPlayerContainer = bannerWebPlayerContainer;
        return bannerWebPlayerContainer;
    }

    public static /* synthetic */ void access$200(BannerView bannerView) {
        bannerView.unregisterInitializeListener();
    }

    public static /* synthetic */ void access$300(BannerView bannerView) {
        bannerView.bridgeLoad();
    }

    private void bridgeLoad() {
        BannerBridge.load(this.placementId, this.viewId, this.size, new UnityAdsLoadOptions());
    }

    private /* synthetic */ void lambda$addScarContainer$0() {
        addView(this.scarBannerContainer);
    }

    private void registerInitializeListener() {
        unregisterInitializeListener();
        this.initializationListener = new 3(this);
        InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    private void unregisterInitializeListener() {
        if (this.initializationListener != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }

    public void addScarContainer() {
        this.scarBannerContainer = new ScarBannerContainer(getContext(), this.viewId);
        Utilities.runOnUiThread(new a(this));
    }

    public void destroy() {
        UnityAdsSDK unityAdsSDK = new UnityAdsSDK();
        unityAdsSDK.sendBannerDestroyed();
        BannerViewCache.getInstance().removeBannerView(this.viewId);
        unregisterInitializeListener();
        unityAdsSDK.finishOMIDSession(this.viewId);
        BannerBridge.destroy(this.placementId);
        Utilities.runOnUiThread(new 1(this));
        BannerWebPlayerContainer bannerWebPlayerContainer = this.bannerWebPlayerContainer;
        if (bannerWebPlayerContainer != null) {
            bannerWebPlayerContainer.destroy();
        }
        ScarBannerContainer scarBannerContainer = this.scarBannerContainer;
        if (scarBannerContainer != null) {
            scarBannerContainer.destroy();
        }
        DeviceLog.info("Banner [" + this.placementId + "] was destroyed");
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    public IListener getListener() {
        return this.listener;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public UnityBannerSize getSize() {
        return this.size;
    }

    public String getViewId() {
        return this.viewId;
    }

    public void load() {
        bridgeLoad();
    }

    public void loadScarPlayer(String str, c cVar, UnityBannerSize unityBannerSize) {
        this.gmaScarAdapterBridge.loadBanner(getContext(), this, str, cVar, unityBannerSize);
    }

    public void loadWebPlayer(UnityBannerSize unityBannerSize) {
        Utilities.runOnUiThread(new 2(this, unityBannerSize));
    }

    public void setListener(IListener iListener) {
        this.listener = iListener;
    }

    private void bridgeLoad(UnityAdsLoadOptions unityAdsLoadOptions) {
        String objectId;
        if (unityAdsLoadOptions != null && (objectId = unityAdsLoadOptions.getObjectId()) != null) {
            BannerViewCache bannerViewCache = BannerViewCache.getInstance();
            bannerViewCache.removeBannerView(this.viewId);
            this.viewId = objectId;
            bannerViewCache.addBannerView(this);
        }
        BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions);
    }

    public void load(UnityAdsLoadOptions unityAdsLoadOptions) {
        bridgeLoad(unityAdsLoadOptions);
    }
}
