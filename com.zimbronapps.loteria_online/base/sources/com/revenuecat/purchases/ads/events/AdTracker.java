package com.revenuecat.purchases.ads.events;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.ads.events.AdEvent;
import com.revenuecat.purchases.ads.events.types.AdDisplayedData;
import com.revenuecat.purchases.ads.events.types.AdFailedToLoadData;
import com.revenuecat.purchases.ads.events.types.AdLoadedData;
import com.revenuecat.purchases.ads.events.types.AdOpenedData;
import com.revenuecat.purchases.ads.events.types.AdRevenueData;
import com.revenuecat.purchases.common.events.EventsManager;
import kotlin.jvm.internal.t;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AdTracker {
    private final EventsManager eventsManager;

    public AdTracker(EventsManager eventsManager) {
        t.g(eventsManager, "eventsManager");
        this.eventsManager = eventsManager;
    }

    public final void trackAdDisplayed(AdDisplayedData adDisplayedData) {
        t.g(adDisplayedData, "data");
        this.eventsManager.track(new AdEvent.Displayed(null, 0, null, 0L, adDisplayedData.getNetworkName(), adDisplayedData.getMediatorName-GyoM_N4(), adDisplayedData.getAdFormat-y0COY5Q(), adDisplayedData.getPlacement(), adDisplayedData.getAdUnitId(), adDisplayedData.getImpressionId(), 15, null));
    }

    public final void trackAdFailedToLoad(AdFailedToLoadData adFailedToLoadData) {
        t.g(adFailedToLoadData, "data");
        this.eventsManager.track(new AdEvent.FailedToLoad(null, 0, null, 0L, adFailedToLoadData.getMediatorName-GyoM_N4(), adFailedToLoadData.getAdFormat-y0COY5Q(), adFailedToLoadData.getPlacement(), adFailedToLoadData.getAdUnitId(), null, adFailedToLoadData.getMediatorErrorCode(), 15, null));
    }

    public final void trackAdLoaded(AdLoadedData adLoadedData) {
        t.g(adLoadedData, "data");
        this.eventsManager.track(new AdEvent.Loaded(null, 0, null, 0L, adLoadedData.getNetworkName(), adLoadedData.getMediatorName-GyoM_N4(), adLoadedData.getAdFormat-y0COY5Q(), adLoadedData.getPlacement(), adLoadedData.getAdUnitId(), adLoadedData.getImpressionId(), 15, null));
    }

    public final void trackAdOpened(AdOpenedData adOpenedData) {
        t.g(adOpenedData, "data");
        this.eventsManager.track(new AdEvent.Open(null, 0, null, 0L, adOpenedData.getNetworkName(), adOpenedData.getMediatorName-GyoM_N4(), adOpenedData.getAdFormat-y0COY5Q(), adOpenedData.getPlacement(), adOpenedData.getAdUnitId(), adOpenedData.getImpressionId(), 15, null));
    }

    public final void trackAdRevenue(AdRevenueData adRevenueData) {
        t.g(adRevenueData, "data");
        this.eventsManager.track(new AdEvent.Revenue(null, 0, null, 0L, adRevenueData.getNetworkName(), adRevenueData.getMediatorName-GyoM_N4(), adRevenueData.getAdFormat-y0COY5Q(), adRevenueData.getPlacement(), adRevenueData.getAdUnitId(), adRevenueData.getImpressionId(), adRevenueData.getRevenueMicros(), adRevenueData.getCurrency(), adRevenueData.getPrecision-rAcPn4k(), 15, null));
    }
}
