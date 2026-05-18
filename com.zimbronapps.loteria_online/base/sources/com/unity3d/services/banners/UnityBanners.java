package com.unity3d.services.banners;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.properties.BannerRefreshInfo;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityBanners {
    private static UnityBanners instance;
    private IUnityBannerListener _bannerListener;
    private BannerPosition _currentBannerPosition = BannerPosition.NONE;
    private BannerWrapper _currentBannerWrapper;

    public class 1 extends BannerView.Listener {
        final /* synthetic */ BannerWrapper val$bannerWrapper;
        final /* synthetic */ UnityBanners val$self;

        public 1(UnityBanners unityBanners, BannerWrapper bannerWrapper) {
            this.val$self = unityBanners;
            this.val$bannerWrapper = bannerWrapper;
        }

        public void onBannerClick(BannerView bannerView) {
            if (UnityBanners.access$000(this.val$self) != null) {
                UnityBanners.access$000(this.val$self).onUnityBannerClick(bannerView.getPlacementId());
            }
        }

        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            if (UnityBanners.access$000(this.val$self) != null) {
                UnityBanners.access$000(this.val$self).onUnityBannerError(bannerView.getPlacementId() + " " + bannerErrorInfo.errorMessage);
            }
        }

        public void onBannerLoaded(BannerView bannerView) {
            if (UnityBanners.access$000(this.val$self) != null) {
                UnityBanners.access$000(this.val$self).onUnityBannerLoaded(bannerView.getPlacementId(), this.val$bannerWrapper);
            }
        }

        public void onBannerShown(BannerView bannerView) {
            if (UnityBanners.access$000(this.val$self) != null) {
                UnityBanners.access$000(this.val$self).onUnityBannerShow(bannerView.getPlacementId());
            }
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ String val$message;

        public 2(String str) {
            this.val$message = str;
        }

        public void run() {
            IUnityBannerListener bannerListener = UnityBanners.getBannerListener();
            if (bannerListener != null) {
                bannerListener.onUnityBannerError(this.val$message);
            }
        }
    }

    public class BannerAdRefreshView extends RelativeLayout {
        private BannerView bannerView;
        private boolean didLoad;
        private boolean didShow;
        private boolean didSubscribeToLifecycle;
        private LifecycleListener lifecycleListener;
        private String placementId;
        private Handler refreshHandler;
        private long refreshRate;
        private long refreshTime;
        private Runnable reloadRunnable;

        public class 1 implements Runnable {
            final /* synthetic */ BannerAdRefreshView val$self;
            final /* synthetic */ UnityBanners val$this$0;

            public 1(UnityBanners unityBanners, BannerAdRefreshView bannerAdRefreshView) {
                this.val$this$0 = unityBanners;
                this.val$self = bannerAdRefreshView;
            }

            public void run() {
                BannerAdRefreshView.access$100(this.val$self);
            }
        }

        public class 2 implements Runnable {
            final /* synthetic */ BannerAdRefreshView val$self;

            public 2(BannerAdRefreshView bannerAdRefreshView) {
                this.val$self = bannerAdRefreshView;
            }

            public void run() {
                this.val$self.removeAllViews();
            }
        }

        public class 3 extends LifecycleListener {
            final /* synthetic */ BannerAdRefreshView val$self;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(BannerAdRefreshView bannerAdRefreshView) {
                super(BannerAdRefreshView.this, null);
                this.val$self = bannerAdRefreshView;
            }

            public void onActivityDestroyed(Activity activity) {
                BannerAdRefreshView.access$300(this.val$self);
            }

            public void onActivityPaused(Activity activity) {
                BannerAdRefreshView.access$300(this.val$self);
            }

            public void onActivityResumed(Activity activity) {
                BannerAdRefreshView.access$400(this.val$self);
            }

            public void onActivityStopped(Activity activity) {
                BannerAdRefreshView.access$300(this.val$self);
            }
        }

        @TargetApi(14)
        public class LifecycleListener implements Application.ActivityLifecycleCallbacks {
            private LifecycleListener() {
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
            }

            public void onActivityResumed(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public /* synthetic */ LifecycleListener(BannerAdRefreshView bannerAdRefreshView, 1 r2) {
                this();
            }
        }

        public BannerAdRefreshView(Activity activity, String str, UnityBannerSize unityBannerSize) {
            super(activity);
            this.didLoad = false;
            this.refreshRate = 30L;
            this.didShow = false;
            this.didSubscribeToLifecycle = false;
            this.placementId = str;
            this.refreshHandler = new Handler();
            this.reloadRunnable = new 1(UnityBanners.this, this);
            setupLayoutParams();
            setBackgroundColor(0);
            BannerView bannerView = new BannerView(activity, str, unityBannerSize);
            this.bannerView = bannerView;
            addView(bannerView);
        }

        public static /* synthetic */ void access$100(BannerAdRefreshView bannerAdRefreshView) {
            bannerAdRefreshView.reload();
        }

        public static /* synthetic */ void access$300(BannerAdRefreshView bannerAdRefreshView) {
            bannerAdRefreshView.stopReloadTask();
        }

        public static /* synthetic */ void access$400(BannerAdRefreshView bannerAdRefreshView) {
            bannerAdRefreshView.startReloadTask();
        }

        private void reload() {
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(UUID.randomUUID().toString());
            this.bannerView.load(unityAdsLoadOptions);
            long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.SECONDS.toMillis(this.refreshRate);
            this.refreshTime = uptimeMillis;
            this.refreshHandler.postAtTime(this.reloadRunnable, uptimeMillis);
        }

        private void setupLayoutParams() {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        }

        private void startReloadTask() {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.refreshTime;
            if (uptimeMillis < j) {
                this.refreshHandler.postAtTime(this.reloadRunnable, j);
            } else {
                reload();
            }
        }

        private void stopReloadTask() {
            Runnable runnable;
            Handler handler = this.refreshHandler;
            if (handler == null || (runnable = this.reloadRunnable) == null) {
                return;
            }
            handler.removeCallbacks(runnable);
        }

        private void subscribeToLifecycle() {
            if (this.didSubscribeToLifecycle || ClientProperties.getApplication() == null) {
                return;
            }
            this.lifecycleListener = new 3(this);
            this.didSubscribeToLifecycle = true;
            ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.lifecycleListener);
        }

        private void unsubscribeFromLifecycle() {
            if (!this.didSubscribeToLifecycle || this.lifecycleListener == null || ClientProperties.getApplication() == null) {
                return;
            }
            this.didSubscribeToLifecycle = false;
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.lifecycleListener);
        }

        public void destroy() {
            stopReloadTask();
            this.bannerView.destroy();
            Utilities.runOnUiThread(new 2(this));
            this.bannerView = null;
        }

        public BannerView.IListener getListener() {
            return this.bannerView.getListener();
        }

        public String getPlacementId() {
            return this.bannerView.getPlacementId();
        }

        public UnityBannerSize getSize() {
            return this.bannerView.getSize();
        }

        public void load() {
            if (this.didLoad) {
                return;
            }
            this.didLoad = true;
            Integer refreshRate = BannerRefreshInfo.getInstance().getRefreshRate(this.placementId);
            if (refreshRate != null) {
                this.refreshRate = refreshRate.longValue();
            }
            reload();
        }

        public void onAttachedToWindow() {
            super/*android.view.View*/.onAttachedToWindow();
            subscribeToLifecycle();
            if (this.didShow) {
                startReloadTask();
            } else {
                this.didShow = true;
            }
        }

        public void onDetachedFromWindow() {
            super/*android.view.View*/.onDetachedFromWindow();
            stopReloadTask();
            unsubscribeFromLifecycle();
        }

        public void setListener(BannerView.IListener iListener) {
            this.bannerView.setListener(iListener);
        }
    }

    public class BannerWrapper extends FrameLayout {
        private BannerAdRefreshView _bannerAdRefreshView;
        private BannerPosition _bannerPosition;

        public class 1 implements Runnable {
            final /* synthetic */ BannerWrapper val$bannerWrapper;

            public 1(BannerWrapper bannerWrapper) {
                this.val$bannerWrapper = bannerWrapper;
            }

            public void run() {
                this.val$bannerWrapper.removeAllViews();
                ViewUtilities.removeViewFromParent(this.val$bannerWrapper);
            }
        }

        public BannerWrapper(Context context, BannerAdRefreshView bannerAdRefreshView) {
            super(context);
            this._bannerPosition = BannerPosition.NONE;
            this._bannerAdRefreshView = bannerAdRefreshView;
            addView(bannerAdRefreshView);
            setupLayoutConstraints();
            setBackgroundColor(0);
        }

        private void setupLayoutConstraints() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this._bannerPosition.getGravity();
            setLayoutParams(layoutParams);
        }

        public void destroy() {
            Utilities.runOnUiThread(new 1(this));
            BannerAdRefreshView bannerAdRefreshView = this._bannerAdRefreshView;
            if (bannerAdRefreshView != null) {
                bannerAdRefreshView.destroy();
                this._bannerAdRefreshView = null;
            }
        }

        public void setBannerPosition(BannerPosition bannerPosition) {
            this._bannerPosition = bannerPosition;
            setupLayoutConstraints();
        }
    }

    private UnityBanners() {
    }

    private void _destroy() {
        BannerWrapper bannerWrapper = this._currentBannerWrapper;
        if (bannerWrapper != null) {
            bannerWrapper.destroy();
            this._currentBannerWrapper = null;
        }
    }

    private void _loadBanner(Activity activity, String str) {
        if (this._currentBannerWrapper != null) {
            sendError("A Banner is already in use, please call destroy before loading another banner!");
            return;
        }
        BannerAdRefreshView bannerAdRefreshView = new BannerAdRefreshView(activity, str, new UnityBannerSize(320, 50));
        BannerWrapper bannerWrapper = new BannerWrapper(activity, bannerAdRefreshView);
        bannerWrapper.setBannerPosition(this._currentBannerPosition);
        this._currentBannerWrapper = bannerWrapper;
        bannerAdRefreshView.setListener(new 1(this, bannerWrapper));
        bannerAdRefreshView.load();
    }

    public static /* synthetic */ IUnityBannerListener access$000(UnityBanners unityBanners) {
        return unityBanners._bannerListener;
    }

    @Deprecated
    public static void destroy() {
        getInstance()._destroy();
    }

    @Deprecated
    public static IUnityBannerListener getBannerListener() {
        return getInstance()._bannerListener;
    }

    private static UnityBanners getInstance() {
        if (instance == null) {
            instance = new UnityBanners();
        }
        return instance;
    }

    @Deprecated
    public static void loadBanner(Activity activity, String str) {
        DeviceLog.entered();
        if (!UnityAds.isSupported()) {
            sendError("Unity Ads is not supported on this device.");
        }
        if (!UnityAds.isInitialized()) {
            sendError("UnityAds is not initialized.");
        } else {
            ClientProperties.setActivity(activity);
            getInstance()._loadBanner(activity, str);
        }
    }

    private static void sendError(String str) {
        Utilities.runOnUiThread(new 2(str));
    }

    @Deprecated
    public static void setBannerListener(IUnityBannerListener iUnityBannerListener) {
        getInstance()._bannerListener = iUnityBannerListener;
    }

    @Deprecated
    public static void setBannerPosition(BannerPosition bannerPosition) {
        getInstance()._currentBannerPosition = bannerPosition;
    }
}
