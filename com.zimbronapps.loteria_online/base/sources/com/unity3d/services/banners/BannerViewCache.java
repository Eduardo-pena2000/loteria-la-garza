package com.unity3d.services.banners;

import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import v9.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BannerViewCache {
    private static BannerViewCache instance;
    private HashMap _bannerViews = new HashMap();
    private final HashMap _deletedViewsFifo = new 1();

    public class 1 extends LinkedHashMap {
        public 1() {
        }

        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ BannerView val$bannerView;
        final /* synthetic */ BannerView.IListener val$listener;

        public 2(BannerView.IListener iListener, BannerView bannerView) {
            this.val$listener = iListener;
            this.val$bannerView = bannerView;
        }

        public void run() {
            BannerView.IListener iListener = this.val$listener;
            if (iListener != null) {
                iListener.onBannerLoaded(this.val$bannerView);
            }
        }
    }

    public class 3 implements Runnable {
        final /* synthetic */ BannerView val$bannerView;
        final /* synthetic */ BannerView.IListener val$listener;

        public 3(BannerView.IListener iListener, BannerView bannerView) {
            this.val$listener = iListener;
            this.val$bannerView = bannerView;
        }

        public void run() {
            BannerView.IListener iListener = this.val$listener;
            if (iListener != null) {
                iListener.onBannerShown(this.val$bannerView);
            }
        }
    }

    public class 4 implements Runnable {
        final /* synthetic */ BannerView val$bannerView;
        final /* synthetic */ BannerView.IListener val$listener;

        public 4(BannerView.IListener iListener, BannerView bannerView) {
            this.val$listener = iListener;
            this.val$bannerView = bannerView;
        }

        public void run() {
            BannerView.IListener iListener = this.val$listener;
            if (iListener != null) {
                iListener.onBannerClick(this.val$bannerView);
            }
        }
    }

    public class 5 implements Runnable {
        final /* synthetic */ BannerView val$bannerView;
        final /* synthetic */ BannerView.IListener val$listener;

        public 5(BannerView.IListener iListener, BannerView bannerView) {
            this.val$listener = iListener;
            this.val$bannerView = bannerView;
        }

        public void run() {
            BannerView.IListener iListener = this.val$listener;
            if (iListener != null) {
                iListener.onBannerLeftApplication(this.val$bannerView);
            }
        }
    }

    public static BannerViewCache getInstance() {
        if (instance == null) {
            instance = new BannerViewCache();
        }
        return instance;
    }

    public synchronized String addBannerView(BannerView bannerView) {
        this._bannerViews.put(bannerView.getViewId(), new WeakReference(bannerView));
        return bannerView.getViewId();
    }

    public synchronized void addScarContainer(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null) {
            bannerView.addScarContainer();
        }
    }

    public synchronized BannerView getBannerView(String str) {
        WeakReference weakReference = (WeakReference) this._bannerViews.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (BannerView) weakReference.get();
    }

    public synchronized boolean isBannerViewDeleted(String str) {
        Boolean bool = (Boolean) this._deletedViewsFifo.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public synchronized void loadBanner(LoadBannerOperationState loadBannerOperationState) {
        try {
            String id = loadBannerOperationState.getId();
            UnityBannerSize size = loadBannerOperationState.getSize();
            if (loadBannerOperationState.isScarAd()) {
                loadScarPlayer(id, loadBannerOperationState.getScarAdMetadata(), size);
            } else if (loadWebPlayer(id, size)) {
                BannerBridge.didLoad(id);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void loadScarPlayer(String str, c cVar, UnityBannerSize unityBannerSize) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null) {
            bannerView.loadScarPlayer(str, cVar, unityBannerSize);
        }
    }

    public synchronized boolean loadWebPlayer(String str, UnityBannerSize unityBannerSize) {
        BannerView bannerView = getBannerView(str);
        if (bannerView == null) {
            return false;
        }
        bannerView.loadWebPlayer(unityBannerSize);
        return true;
    }

    public synchronized void removeBannerView(String str) {
        this._deletedViewsFifo.put(str, Boolean.TRUE);
        this._bannerViews.remove(str);
    }

    public synchronized void triggerBannerClickEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            Utilities.runOnUiThread(new 4(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerErrorEvent(String str, BannerErrorInfo bannerErrorInfo) {
        LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, bannerErrorInfo.toLoadError(), bannerErrorInfo.errorMessage);
    }

    public synchronized void triggerBannerLeftApplicationEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            Utilities.runOnUiThread(new 5(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerLoadEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            LoadBannerModule.getInstance().onUnityAdsAdLoaded(str);
            Utilities.runOnUiThread(new 2(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerShowEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            Utilities.runOnUiThread(new 3(bannerView.getListener(), bannerView));
        }
    }
}
