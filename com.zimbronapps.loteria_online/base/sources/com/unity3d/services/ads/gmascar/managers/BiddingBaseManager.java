package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider;
import com.unity3d.services.ads.gmascar.utils.ScarRequestHandler;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.ScarMetric;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class BiddingBaseManager implements IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final ScarRequestHandler _scarRequestHandler;
    protected final AtomicBoolean isUploadPermitted;
    private final IScarAdFormatProvider scarAdFormatProvider;
    private final AtomicReference signals;
    private final String tokenIdentifier;
    private final IUnityAdsTokenListener unityAdsTokenListener;

    public class 1 implements IBiddingSignalsListener {
        public 1() {
        }

        public void onSignalsFailure(String str) {
            BiddingBaseManager.this.sendFetchResult(str);
        }

        public void onSignalsReady(BiddingSignals biddingSignals) {
            BiddingBaseManager.this.onSignalsReady(biddingSignals);
            BiddingBaseManager.this.sendFetchResult("");
        }
    }

    public BiddingBaseManager(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(null, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    public static /* synthetic */ void a(BiddingBaseManager biddingBaseManager, BiddingSignals biddingSignals) {
        biddingBaseManager.lambda$uploadSignals$2(biddingSignals);
    }

    private synchronized void attemptUpload() {
        if (this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
            uploadSignals();
        }
    }

    public static /* synthetic */ void b(BiddingBaseManager biddingBaseManager, String str) {
        biddingBaseManager.lambda$onUnityAdsTokenReady$0(str);
    }

    public static /* synthetic */ void c(BiddingBaseManager biddingBaseManager) {
        biddingBaseManager.lambda$fetchSignals$1();
    }

    private /* synthetic */ void lambda$fetchSignals$1() {
        GMA.getInstance().getSCARBiddingSignals(this.scarAdFormatProvider.buildAdFormatList(), new 1());
    }

    private /* synthetic */ void lambda$onUnityAdsTokenReady$0(String str) {
        this.unityAdsTokenListener.onUnityAdsTokenReady(str);
    }

    private /* synthetic */ void lambda$uploadSignals$2(BiddingSignals biddingSignals) {
        try {
            this._scarRequestHandler.makeUploadRequest(this.tokenIdentifier, biddingSignals, new ConfigurationReader().getCurrentConfiguration().getScarBiddingUrl());
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadSuccess(this._isAsyncTokenCall));
        } catch (Exception e) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, e.getLocalizedMessage()));
        }
    }

    public void fetchSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new Thread(new b(this)).start();
    }

    public String getFormattedToken(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String tokenIdentifier = getTokenIdentifier();
        return (tokenIdentifier == null || tokenIdentifier.isEmpty()) ? str : String.format("%s:%s", new Object[]{tokenIdentifier, str});
    }

    public SDKMetricsSender getMetricSender() {
        return (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    }

    public String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    public void onSignalsReady(BiddingSignals biddingSignals) {
        this.signals.set(biddingSignals);
        attemptUpload();
    }

    public final void onUnityAdsTokenReady(String str) {
        if (this.unityAdsTokenListener != null) {
            Utilities.wrapCustomerListener(new c(this, str));
        }
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        attemptUpload();
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void sendFetchResult(String str) {
        if (str != "") {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, str));
        } else {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
        }
    }

    public abstract void start();

    public void uploadSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        BiddingSignals biddingSignals = (BiddingSignals) this.signals.get();
        if (biddingSignals == null || biddingSignals.isEmpty()) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
        } else {
            new Thread(new a(this, biddingSignals)).start();
        }
    }

    public BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(iScarAdFormatProvider, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    public BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener, ScarRequestHandler scarRequestHandler) {
        this.isUploadPermitted = new AtomicBoolean(false);
        this.signals = new AtomicReference();
        this.tokenIdentifier = UUID.randomUUID().toString();
        this.unityAdsTokenListener = iUnityAdsTokenListener;
        this._isAsyncTokenCall = iUnityAdsTokenListener != null;
        this._scarRequestHandler = scarRequestHandler;
        this.scarAdFormatProvider = iScarAdFormatProvider;
    }
}
