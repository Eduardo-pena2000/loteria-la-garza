package com.revenuecat.purchases.common.events;

import Ca.o;
import com.revenuecat.purchases.ads.events.AdEvent;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.paywalls.events.CustomPaywallEvent;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventType;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendStoredEventKt {
    public static final BackendEvent toBackendEvent(BackendStoredEvent backendStoredEvent) {
        t.g(backendStoredEvent, "<this>");
        if (backendStoredEvent instanceof BackendStoredEvent.Paywalls) {
            return ((BackendStoredEvent.Paywalls) backendStoredEvent).getEvent();
        }
        if (backendStoredEvent instanceof BackendStoredEvent.CustomerCenter) {
            return ((BackendStoredEvent.CustomerCenter) backendStoredEvent).getEvent();
        }
        if (backendStoredEvent instanceof BackendStoredEvent.Ad) {
            return ((BackendStoredEvent.Ad) backendStoredEvent).getEvent();
        }
        if (backendStoredEvent instanceof BackendStoredEvent.CustomPaywall) {
            return ((BackendStoredEvent.CustomPaywall) backendStoredEvent).getEvent();
        }
        throw new o();
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(PaywallEvent paywallEvent, String str) {
        t.g(paywallEvent, "<this>");
        t.g(str, "appUserID");
        if (paywallEvent.getType() == PaywallEventType.PURCHASE_INITIATED || paywallEvent.getType() == PaywallEventType.PURCHASE_ERROR) {
            return null;
        }
        String uuid = paywallEvent.getCreationData().getId().toString();
        t.f(uuid, "creationData.id.toString()");
        String value = paywallEvent.getType().getValue();
        String uuid2 = paywallEvent.getData().getSessionIdentifier().toString();
        t.f(uuid2, "data.sessionIdentifier.toString()");
        String offeringIdentifier = paywallEvent.getData().getPresentedOfferingContext().getOfferingIdentifier();
        String paywallIdentifier = paywallEvent.getData().getPaywallIdentifier();
        int paywallRevision = paywallEvent.getData().getPaywallRevision();
        long time = paywallEvent.getCreationData().getDate().getTime();
        String displayMode = paywallEvent.getData().getDisplayMode();
        boolean darkMode = paywallEvent.getData().getDarkMode();
        String localeIdentifier = paywallEvent.getData().getLocaleIdentifier();
        ExitOfferType exitOfferType = paywallEvent.getData().getExitOfferType();
        return new BackendStoredEvent.Paywalls(new BackendEvent.Paywalls(uuid, 1, value, str, uuid2, offeringIdentifier, paywallIdentifier, paywallRevision, time, displayMode, darkMode, localeIdentifier, exitOfferType != null ? exitOfferType.getValue() : null, paywallEvent.getData().getExitOfferingIdentifier(), paywallEvent.getData().getPackageIdentifier(), paywallEvent.getData().getProductIdentifier(), paywallEvent.getData().getErrorCode(), paywallEvent.getData().getErrorMessage()));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(CustomerCenterImpressionEvent customerCenterImpressionEvent, String str, String str2) {
        t.g(customerCenterImpressionEvent, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        String uuid = customerCenterImpressionEvent.getCreationData().getId().toString();
        t.f(uuid, "creationData.id.toString()");
        return new BackendStoredEvent.CustomerCenter(new BackendEvent.CustomerCenter(uuid, customerCenterImpressionEvent.getData().getRevisionID(), customerCenterImpressionEvent.getData().getType(), str, str2, customerCenterImpressionEvent.getData().getTimestamp().getTime(), customerCenterImpressionEvent.getData().getDarkMode(), customerCenterImpressionEvent.getData().getLocale(), customerCenterImpressionEvent.getData().getDisplayMode(), null, null, null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent, String str, String str2) {
        t.g(customerCenterSurveyOptionChosenEvent, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        String uuid = customerCenterSurveyOptionChosenEvent.getCreationData().getId().toString();
        t.f(uuid, "creationData.id.toString()");
        return new BackendStoredEvent.CustomerCenter(new BackendEvent.CustomerCenter(uuid, customerCenterSurveyOptionChosenEvent.getData().getRevisionID(), customerCenterSurveyOptionChosenEvent.getData().getType(), str, str2, customerCenterSurveyOptionChosenEvent.getData().getTimestamp().getTime(), customerCenterSurveyOptionChosenEvent.getData().getDarkMode(), customerCenterSurveyOptionChosenEvent.getData().getLocale(), customerCenterSurveyOptionChosenEvent.getData().getDisplayMode(), customerCenterSurveyOptionChosenEvent.getData().getPath(), customerCenterSurveyOptionChosenEvent.getData().getUrl(), customerCenterSurveyOptionChosenEvent.getData().getSurveyOptionID()));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Open open, String str, String str2) {
        t.g(open, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(open.getId(), open.getEventVersion(), open.getType().getValue(), open.getTimestamp(), open.getNetworkName(), open.getMediatorName-GyoM_N4(), open.getAdFormat-y0COY5Q(), open.getPlacement(), open.getAdUnitId(), open.getImpressionId(), str, str2, (Long) null, (String) null, (String) null, (Integer) null, 61440, (k) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Displayed displayed, String str, String str2) {
        t.g(displayed, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(displayed.getId(), displayed.getEventVersion(), displayed.getType().getValue(), displayed.getTimestamp(), displayed.getNetworkName(), displayed.getMediatorName-GyoM_N4(), displayed.getAdFormat-y0COY5Q(), displayed.getPlacement(), displayed.getAdUnitId(), displayed.getImpressionId(), str, str2, (Long) null, (String) null, (String) null, (Integer) null, 61440, (k) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Revenue revenue, String str, String str2) {
        t.g(revenue, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(revenue.getId(), revenue.getEventVersion(), revenue.getType().getValue(), revenue.getTimestamp(), revenue.getNetworkName(), revenue.getMediatorName-GyoM_N4(), revenue.getAdFormat-y0COY5Q(), revenue.getPlacement(), revenue.getAdUnitId(), revenue.getImpressionId(), str, str2, Long.valueOf(revenue.getRevenueMicros()), revenue.getCurrency(), revenue.getPrecision-rAcPn4k(), (Integer) null, 32768, (k) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Loaded loaded, String str, String str2) {
        t.g(loaded, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(loaded.getId(), loaded.getEventVersion(), loaded.getType().getValue(), loaded.getTimestamp(), loaded.getNetworkName(), loaded.getMediatorName-GyoM_N4(), loaded.getAdFormat-y0COY5Q(), loaded.getPlacement(), loaded.getAdUnitId(), loaded.getImpressionId(), str, str2, (Long) null, (String) null, (String) null, (Integer) null, 61440, (k) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.FailedToLoad failedToLoad, String str, String str2) {
        t.g(failedToLoad, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(failedToLoad.getId(), failedToLoad.getEventVersion(), failedToLoad.getType().getValue(), failedToLoad.getTimestamp(), (String) null, failedToLoad.getMediatorName-GyoM_N4(), failedToLoad.getAdFormat-y0COY5Q(), failedToLoad.getPlacement(), failedToLoad.getAdUnitId(), failedToLoad.getImpressionId(), str, str2, (Long) null, (String) null, (String) null, failedToLoad.getMediatorErrorCode(), 28688, (k) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(CustomPaywallEvent.Impression impression, String str, String str2) {
        t.g(impression, "<this>");
        t.g(str, "appUserID");
        t.g(str2, "appSessionID");
        String uuid = impression.getCreationData().getId().toString();
        t.f(uuid, "creationData.id.toString()");
        return new BackendStoredEvent.CustomPaywall(new BackendEvent.CustomPaywall(uuid, 1, "custom_paywall_impression", str, str2, impression.getCreationData().getDate().getTime(), impression.getData().getPaywallId(), impression.getData().getOfferingId()));
    }
}
