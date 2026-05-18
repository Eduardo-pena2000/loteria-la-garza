package com.revenuecat.purchases_flutter;

import Ca.H;
import Ca.I;
import Qa.l;
import Y9.a;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.hybridcommon.CommonKt;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import com.revenuecat.purchases.hybridcommon.OnNullableResult;
import com.revenuecat.purchases.hybridcommon.OnResult;
import com.revenuecat.purchases.hybridcommon.OnResultAny;
import com.revenuecat.purchases.hybridcommon.OnResultList;
import com.revenuecat.purchases.hybridcommon.SubscriberAttributesKt;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.models.InAppMessageType;
import da.i;
import da.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PurchasesFlutterPlugin implements Y9.a, j.c, Z9.a {
    private static final String CUSTOMER_INFO_UPDATED = "Purchases-CustomerInfoUpdated";
    private static final String INVALID_ARGS_ERROR_CODE = "invalidArgs";
    protected static final String LOG_HANDLER_EVENT = "Purchases-LogHandlerEvent";
    private static final String PLATFORM_NAME = "flutter";
    private static final String PLUGIN_VERSION = "9.15.0";
    private static final String TAG = "PurchasesFlutter";
    private Activity activity;
    private Context applicationContext;
    private j channel;
    private final Handler handler = new Handler(Looper.getMainLooper());

    public class 1 implements OnResultList {
        final /* synthetic */ j.d val$result;

        public 1(j.d dVar) {
            this.val$result = dVar;
        }

        public void onError(ErrorContainer errorContainer) {
            PurchasesFlutterPlugin.access$000(PurchasesFlutterPlugin.this, errorContainer, this.val$result);
        }

        public void onReceived(List list) {
            this.val$result.a(list);
        }
    }

    public class 2 implements l {
        final /* synthetic */ j.d val$result;

        public 2(j.d dVar) {
            this.val$result = dVar;
        }

        public I invoke(Map map) {
            this.val$result.a(map);
            return null;
        }
    }

    public class 3 implements OnResultAny {
        final /* synthetic */ j.d val$result;

        public 3(j.d dVar) {
            this.val$result = dVar;
        }

        public void onError(ErrorContainer errorContainer) {
            PurchasesFlutterPlugin.access$000(PurchasesFlutterPlugin.this, errorContainer, this.val$result);
        }

        public void onReceived(Boolean bool) {
            this.val$result.a(bool);
        }
    }

    public class 4 implements OnResult {
        final /* synthetic */ j.d val$result;

        public 4(j.d dVar) {
            this.val$result = dVar;
        }

        public void onError(ErrorContainer errorContainer) {
            PurchasesFlutterPlugin.access$000(PurchasesFlutterPlugin.this, errorContainer, this.val$result);
        }

        public void onReceived(Map map) {
            this.val$result.a(map);
        }
    }

    public class 5 implements OnNullableResult {
        final /* synthetic */ j.d val$result;

        public 5(j.d dVar) {
            this.val$result = dVar;
        }

        public void onError(ErrorContainer errorContainer) {
            PurchasesFlutterPlugin.access$000(PurchasesFlutterPlugin.this, errorContainer, this.val$result);
        }

        public void onReceived(Map map) {
            this.val$result.a(map);
        }
    }

    public static /* synthetic */ I a(PurchasesFlutterPlugin purchasesFlutterPlugin, Map map) {
        return purchasesFlutterPlugin.lambda$setLogHandler$2(map);
    }

    public static /* synthetic */ void access$000(PurchasesFlutterPlugin purchasesFlutterPlugin, ErrorContainer errorContainer, j.d dVar) {
        purchasesFlutterPlugin.reject(errorContainer, dVar);
    }

    public static /* synthetic */ void b(PurchasesFlutterPlugin purchasesFlutterPlugin, String str, Object obj) {
        purchasesFlutterPlugin.lambda$invokeChannelMethodOnUiThread$3(str, obj);
    }

    public static /* synthetic */ I c(PurchasesFlutterPlugin purchasesFlutterPlugin, Map map) {
        return purchasesFlutterPlugin.lambda$setUpdatedCustomerInfoListener$0(map);
    }

    private void canMakePayments(List list, j.d dVar) {
        CommonKt.canMakePayments(this.applicationContext, list, new 3(dVar));
    }

    private void checkTrialOrIntroductoryPriceEligibility(ArrayList arrayList, j.d dVar) {
        dVar.a(CommonKt.checkTrialOrIntroductoryPriceEligibility(arrayList));
    }

    private void close(j.d dVar) {
        try {
            Purchases.getSharedInstance().close();
        } catch (H unused) {
        }
        dVar.a(null);
    }

    private void collectDeviceIdentifiers(j.d dVar) {
        SubscriberAttributesKt.collectDeviceIdentifiers();
        dVar.a(null);
    }

    public static /* synthetic */ void d(PurchasesFlutterPlugin purchasesFlutterPlugin, CustomerInfo customerInfo) {
        purchasesFlutterPlugin.lambda$setUpdatedCustomerInfoListener$1(customerInfo);
    }

    private void getAppUserID(j.d dVar) {
        dVar.a(CommonKt.getAppUserID());
    }

    private void getCachedVirtualCurrencies(j.d dVar) {
        dVar.a(CommonKt.getCachedVirtualCurrencies());
    }

    private void getCurrentOfferingForPlacement(String str, j.d dVar) {
        CommonKt.getCurrentOfferingForPlacement(str, getOnNullableResult(dVar));
    }

    private void getCustomerInfo(j.d dVar) {
        CommonKt.getCustomerInfo(getOnResult(dVar));
    }

    private void getOfferings(j.d dVar) {
        CommonKt.getOfferings(getOnResult(dVar));
    }

    private OnNullableResult getOnNullableResult(j.d dVar) {
        return new 5(dVar);
    }

    private OnResult getOnResult(j.d dVar) {
        return new 4(dVar);
    }

    private void getProductInfo(ArrayList arrayList, String str, j.d dVar) {
        CommonKt.getProductInfo(arrayList, str, new 1(dVar));
    }

    private void getStorefront(j.d dVar) {
        CommonKt.getStorefront(new 2(dVar));
    }

    private void getVirtualCurrencies(j.d dVar) {
        CommonKt.getVirtualCurrencies(getOnResult(dVar));
    }

    private void invalidateCustomerInfoCache(j.d dVar) {
        CommonKt.invalidateCustomerInfoCache();
        dVar.a(null);
    }

    private void invalidateVirtualCurrenciesCache(j.d dVar) {
        CommonKt.invalidateVirtualCurrenciesCache();
        dVar.a(null);
    }

    private void invokeChannelMethodOnUiThread(String str, Object obj) {
        runOnUiThread(new c(this, str, obj));
    }

    private void isAnonymous(j.d dVar) {
        dVar.a(Boolean.valueOf(CommonKt.isAnonymous()));
    }

    private void isConfigured(j.d dVar) {
        dVar.a(Boolean.valueOf(Purchases.isConfigured()));
    }

    private void isWebPurchaseRedemptionURL(String str, j.d dVar) {
        if (str == null) {
            dVar.b("invalidArgs", "Missing urlString argument", null);
        } else {
            dVar.a(Boolean.valueOf(CommonKt.isWebPurchaseRedemptionURL(str)));
        }
    }

    private /* synthetic */ void lambda$invokeChannelMethodOnUiThread$3(String str, Object obj) {
        j jVar = this.channel;
        if (jVar != null) {
            jVar.c(str, obj);
        }
    }

    private /* synthetic */ I lambda$setLogHandler$2(Map map) {
        invokeChannelMethodOnUiThread("Purchases-LogHandlerEvent", map);
        return null;
    }

    private /* synthetic */ I lambda$setUpdatedCustomerInfoListener$0(Map map) {
        invokeChannelMethodOnUiThread("Purchases-CustomerInfoUpdated", map);
        return I.a;
    }

    private /* synthetic */ void lambda$setUpdatedCustomerInfoListener$1(CustomerInfo customerInfo) {
        CustomerInfoMapperKt.mapAsync(customerInfo, new b(this));
    }

    private void logIn(String str, j.d dVar) {
        CommonKt.logIn(str, getOnResult(dVar));
    }

    private void logOut(j.d dVar) {
        CommonKt.logOut(getOnResult(dVar));
    }

    private void overridePreferredUILocale(String str, j.d dVar) {
        CommonKt.overridePreferredLocale(str);
        dVar.a(null);
    }

    private void purchasePackage(String str, Map map, String str2, Integer num, Boolean bool, j.d dVar) {
        CommonKt.purchasePackage(this.activity, str, map, str2, num, bool, getOnResult(dVar));
    }

    private void purchaseProduct(String str, String str2, String str3, Integer num, Boolean bool, Map map, j.d dVar) {
        CommonKt.purchaseProduct(this.activity, str, str2, (String) null, str3, num, bool, map, getOnResult(dVar));
    }

    private void purchaseSubscriptionOption(String str, String str2, String str3, Integer num, Boolean bool, Map map, j.d dVar) {
        CommonKt.purchaseSubscriptionOption(this.activity, str, str2, str3, num, bool, map, getOnResult(dVar));
    }

    private void redeemWebPurchase(String str, j.d dVar) {
        if (str == null) {
            dVar.b("invalidArgs", "Missing redemptionLink argument", null);
        } else {
            CommonKt.redeemWebPurchase(str, getOnResult(dVar));
        }
    }

    private void reject(ErrorContainer errorContainer, j.d dVar) {
        dVar.b(String.valueOf(errorContainer.getCode()), errorContainer.getMessage(), errorContainer.getInfo());
    }

    private void restorePurchases(j.d dVar) {
        CommonKt.restorePurchases(getOnResult(dVar));
    }

    private void runOnUiThread(Runnable runnable) {
        this.handler.post(runnable);
    }

    private void setAd(String str, j.d dVar) {
        SubscriberAttributesKt.setAd(str);
        dVar.a(null);
    }

    private void setAdGroup(String str, j.d dVar) {
        SubscriberAttributesKt.setAdGroup(str);
        dVar.a(null);
    }

    private void setAdjustID(String str, j.d dVar) {
        SubscriberAttributesKt.setAdjustID(str);
        dVar.a(null);
    }

    private void setAirshipChannelID(String str, j.d dVar) {
        SubscriberAttributesKt.setAirshipChannelID(str);
        dVar.a(null);
    }

    private void setAllowSharingAppStoreAccount(Boolean bool, j.d dVar) {
        if (bool == null) {
            dVar.b("invalidArgs", "Missing allowSharing argument", null);
        } else {
            CommonKt.setAllowSharingAppStoreAccount(bool.booleanValue());
            dVar.a(null);
        }
    }

    private void setAppsflyerID(String str, j.d dVar) {
        SubscriberAttributesKt.setAppsflyerID(str);
        dVar.a(null);
    }

    private void setAppstackAttributionParams(Map map, j.d dVar) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    hashMap.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
        CommonKt.setAppstackAttributionParams(hashMap, getOnResult(dVar));
    }

    private void setAttributes(Map map, j.d dVar) {
        SubscriberAttributesKt.setAttributes(map);
        dVar.a(null);
    }

    private void setCampaign(String str, j.d dVar) {
        SubscriberAttributesKt.setCampaign(str);
        dVar.a(null);
    }

    private void setCleverTapID(String str, j.d dVar) {
        SubscriberAttributesKt.setCleverTapID(str);
        dVar.a(null);
    }

    private void setCreative(String str, j.d dVar) {
        SubscriberAttributesKt.setCreative(str);
        dVar.a(null);
    }

    private void setDebugLogsEnabled(boolean z, j.d dVar) {
        CommonKt.setLogLevel(z ? "DEBUG" : "INFO");
        dVar.a(null);
    }

    private void setDisplayName(String str, j.d dVar) {
        SubscriberAttributesKt.setDisplayName(str);
        dVar.a(null);
    }

    private void setEmail(String str, j.d dVar) {
        SubscriberAttributesKt.setEmail(str);
        dVar.a(null);
    }

    private void setFBAnonymousID(String str, j.d dVar) {
        SubscriberAttributesKt.setFBAnonymousID(str);
        dVar.a(null);
    }

    private void setFirebaseAppInstanceID(String str, j.d dVar) {
        SubscriberAttributesKt.setFirebaseAppInstanceID(str);
        dVar.a(null);
    }

    private void setKeyword(String str, j.d dVar) {
        SubscriberAttributesKt.setKeyword(str);
        dVar.a(null);
    }

    private void setLogHandler(j.d dVar) {
        CommonKt.setLogHandler(new a(this));
        dVar.a(null);
    }

    private void setLogLevel(String str, j.d dVar) {
        CommonKt.setLogLevel(str);
        dVar.a(null);
    }

    private void setMediaSource(String str, j.d dVar) {
        SubscriberAttributesKt.setMediaSource(str);
        dVar.a(null);
    }

    private void setMixpanelDistinctID(String str, j.d dVar) {
        SubscriberAttributesKt.setMixpanelDistinctID(str);
        dVar.a(null);
    }

    private void setMparticleID(String str, j.d dVar) {
        SubscriberAttributesKt.setMparticleID(str);
        dVar.a(null);
    }

    private void setOnesignalID(String str, j.d dVar) {
        SubscriberAttributesKt.setOnesignalID(str);
        dVar.a(null);
    }

    private void setPhoneNumber(String str, j.d dVar) {
        SubscriberAttributesKt.setPhoneNumber(str);
        dVar.a(null);
    }

    private void setPostHogUserID(String str, j.d dVar) {
        SubscriberAttributesKt.setPostHogUserID(str);
        dVar.a(null);
    }

    private void setProxyURLString(String str, j.d dVar) {
        CommonKt.setProxyURLString(str);
        dVar.a(null);
    }

    private void setPushToken(String str, j.d dVar) {
        SubscriberAttributesKt.setPushToken(str);
        dVar.a(null);
    }

    private void setTenjinAnalyticsInstallationID(String str, j.d dVar) {
        SubscriberAttributesKt.setTenjinAnalyticsInstallationID(str);
        dVar.a(null);
    }

    private void setUpdatedCustomerInfoListener() {
        Purchases.getSharedInstance().setUpdatedCustomerInfoListener(new d(this));
    }

    private void setupPurchases(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Boolean bool4, Boolean bool5, String str5, j.d dVar) {
        if (this.applicationContext == null) {
            dVar.b(String.valueOf(PurchasesErrorCode.UnknownError.getCode()), "Purchases can't be setup. There is no Application context", null);
            return;
        }
        PlatformInfo platformInfo = new PlatformInfo("flutter", "9.15.0");
        Store store = Store.PLAY_STORE;
        if (bool != null && bool.booleanValue()) {
            store = Store.AMAZON;
        }
        CommonKt.configure(this.applicationContext, str, str2, str3, platformInfo, store, new DangerousSettings(), bool2, str4, bool3, bool5, bool4, str5);
        setUpdatedCustomerInfoListener();
        dVar.a(null);
    }

    private void showInAppMessages(ArrayList arrayList, j.d dVar) {
        if (arrayList == null) {
            CommonKt.showInAppMessagesIfNeeded(this.activity);
        } else {
            ArrayList arrayList2 = new ArrayList();
            InAppMessageType[] values = InAppMessageType.values();
            for (int i = 0; i < arrayList.size(); i++) {
                int intValue = ((Integer) arrayList.get(i)).intValue();
                InAppMessageType inAppMessageType = intValue < values.length ? values[intValue] : null;
                if (inAppMessageType != null) {
                    arrayList2.add(inAppMessageType);
                } else {
                    Log.e("PurchasesFlutter", "Unsupported in-app message type: " + intValue);
                }
            }
            CommonKt.showInAppMessagesIfNeeded(this.activity, arrayList2);
        }
        dVar.a(null);
    }

    private void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d, Long l, j.d dVar) {
        if (l == null) {
            Purchases.getSharedInstance().syncAmazonPurchase(str, str2, str3, str4, d);
        } else {
            Purchases.getSharedInstance().syncAmazonPurchase(str, str2, str3, str4, d, l.longValue());
        }
        dVar.a(null);
    }

    private void syncAttributesAndOfferingsIfNeeded(j.d dVar) {
        CommonKt.syncAttributesAndOfferingsIfNeeded(getOnResult(dVar));
    }

    private void syncPurchases(j.d dVar) {
        CommonKt.syncPurchases();
        dVar.a(null);
    }

    private void trackCustomPaywallImpression(Map map, j.d dVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                hashMap.put((String) entry.getKey(), entry.getValue());
            }
        }
        CommonKt.trackCustomPaywallImpression(hashMap);
        dVar.a(null);
    }

    public void onAttachedToActivity(Z9.c cVar) {
        this.activity = cVar.getActivity();
    }

    public void onAttachedToEngine(a.b bVar) {
        onAttachedToEngine(bVar.b(), bVar.a());
    }

    public void onDetachedFromActivity() {
        this.activity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        j jVar = this.channel;
        if (jVar != null) {
            jVar.e(null);
        }
        this.channel = null;
        this.applicationContext = null;
    }

    public void onMethodCall(i iVar, j.d dVar) {
        String str = iVar.a;
        str.hashCode();
        switch (str) {
            case "setKeyword":
                setKeyword((String) iVar.a("keyword"), dVar);
                break;
            case "getProductInfo":
                getProductInfo((ArrayList) iVar.a("productIdentifiers"), (String) iVar.a("type"), dVar);
                break;
            case "restorePurchases":
                restorePurchases(dVar);
                break;
            case "invalidateCustomerInfoCache":
                invalidateCustomerInfoCache(dVar);
                break;
            case "checkTrialOrIntroductoryPriceEligibility":
                checkTrialOrIntroductoryPriceEligibility((ArrayList) iVar.a("productIdentifiers"), dVar);
                break;
            case "setOnesignalID":
                setOnesignalID((String) iVar.a("onesignalID"), dVar);
                break;
            case "getPromotionalOffer":
            case "purchaseProductWithWinBackOffer":
            case "beginRefundRequestForEntitlement":
            case "setSimulatesAskToBuyInSandbox":
            case "purchasePackageWithWinBackOffer":
            case "enableAdServicesAttributionTokenCollection":
            case "presentCodeRedemptionSheet":
            case "beginRefundRequestForProduct":
            case "eligibleWinBackOffersForProduct":
            case "beginRefundRequestForActiveEntitlement":
            case "recordPurchaseForProductID":
                dVar.a(null);
                break;
            case "purchasePackage":
                purchasePackage((String) iVar.a("packageIdentifier"), (Map) iVar.a("presentedOfferingContext"), (String) iVar.a("googleOldProductIdentifier"), (Integer) iVar.a("googleProrationMode"), (Boolean) iVar.a("googleIsPersonalizedPrice"), dVar);
                break;
            case "setFirebaseAppInstanceID":
                setFirebaseAppInstanceID((String) iVar.a("firebaseAppInstanceID"), dVar);
                break;
            case "getCustomerInfo":
                getCustomerInfo(dVar);
                break;
            case "showInAppMessages":
                showInAppMessages((ArrayList) iVar.a("types"), dVar);
                break;
            case "getCurrentOfferingForPlacement":
                getCurrentOfferingForPlacement((String) iVar.a("placementIdentifier"), dVar);
                break;
            case "redeemWebPurchase":
                redeemWebPurchase((String) iVar.a("redemptionLink"), dVar);
                break;
            case "purchaseProduct":
                purchaseProduct((String) iVar.a("productIdentifier"), (String) iVar.a("type"), (String) iVar.a("googleOldProductIdentifier"), (Integer) iVar.a("googleProrationMode"), (Boolean) iVar.a("googleIsPersonalizedPrice"), (Map) iVar.a("presentedOfferingContext"), dVar);
                break;
            case "isConfigured":
                isConfigured(dVar);
                break;
            case "logOut":
                logOut(dVar);
                break;
            case "purchaseSubscriptionOption":
                purchaseSubscriptionOption((String) iVar.a("productIdentifier"), (String) iVar.a("optionIdentifier"), (String) iVar.a("googleOldProductIdentifier"), (Integer) iVar.a("googleProrationMode"), (Boolean) iVar.a("googleIsPersonalizedPrice"), (Map) iVar.a("presentedOfferingContext"), dVar);
                break;
            case "setFBAnonymousID":
                setFBAnonymousID((String) iVar.a("fbAnonymousID"), dVar);
                break;
            case "isAnonymous":
                isAnonymous(dVar);
                break;
            case "setLogHandler":
                setLogHandler(dVar);
                break;
            case "setDisplayName":
                setDisplayName((String) iVar.a("displayName"), dVar);
                break;
            case "setMparticleID":
                setMparticleID((String) iVar.a("mparticleID"), dVar);
                break;
            case "setTenjinAnalyticsInstallationID":
                setTenjinAnalyticsInstallationID((String) iVar.a("tenjinAnalyticsInstallationID"), dVar);
                break;
            case "setDebugLogsEnabled":
                setDebugLogsEnabled(iVar.a("enabled") != null && ((Boolean) iVar.a("enabled")).booleanValue(), dVar);
                break;
            case "setCreative":
                setCreative((String) iVar.a("creative"), dVar);
                break;
            case "isWebPurchaseRedemptionURL":
                isWebPurchaseRedemptionURL((String) iVar.a("urlString"), dVar);
                break;
            case "setLogLevel":
                setLogLevel((String) iVar.a("level"), dVar);
                break;
            case "syncAmazonPurchase":
                String str2 = (String) iVar.a("productID");
                String str3 = (String) iVar.a("receiptID");
                String str4 = (String) iVar.a("amazonUserID");
                String str5 = (String) iVar.a("isoCurrencyCode");
                Double d = (Double) iVar.a("price");
                Integer num = (Integer) iVar.a("purchaseTime");
                syncAmazonPurchase(str2, str3, str4, str5, d, num != null ? Long.valueOf(num.longValue()) : null, dVar);
                break;
            case "setAllowSharingStoreAccount":
                setAllowSharingAppStoreAccount((Boolean) iVar.a("allowSharing"), dVar);
                break;
            case "close":
                close(dVar);
                break;
            case "setupPurchases":
                String str6 = (String) iVar.a("apiKey");
                String str7 = (String) iVar.a("appUserId");
                String str8 = (String) iVar.a("purchasesAreCompletedBy");
                Boolean bool = (Boolean) iVar.a("useAmazon");
                setupPurchases(str6, str7, str8, bool, (Boolean) iVar.a("shouldShowInAppMessagesAutomatically"), (String) iVar.a("entitlementVerificationMode"), (Boolean) iVar.a("pendingTransactionsForPrepaidPlansEnabled"), (Boolean) iVar.a("automaticDeviceIdentifierCollectionEnabled"), (Boolean) iVar.a("diagnosticsEnabled"), (String) iVar.a("preferredUILocaleOverride"), dVar);
                break;
            case "logIn":
                logIn((String) iVar.a("appUserID"), dVar);
                break;
            case "setAd":
                setAd((String) iVar.a("ad"), dVar);
                break;
            case "setAppsflyerID":
                setAppsflyerID((String) iVar.a("appsflyerID"), dVar);
                break;
            case "syncAttributesAndOfferingsIfNeeded":
                syncAttributesAndOfferingsIfNeeded(dVar);
                break;
            case "setCleverTapID":
                setCleverTapID((String) iVar.a("cleverTapID"), dVar);
                break;
            case "setProxyURLString":
                setProxyURLString((String) iVar.a("proxyURLString"), dVar);
                break;
            case "invalidateVirtualCurrenciesCache":
                invalidateVirtualCurrenciesCache(dVar);
                break;
            case "collectDeviceIdentifiers":
                collectDeviceIdentifiers(dVar);
                break;
            case "getStorefront":
                getStorefront(dVar);
                break;
            case "setAppstackAttributionParams":
                setAppstackAttributionParams((Map) iVar.a("data"), dVar);
                break;
            case "setPhoneNumber":
                setPhoneNumber((String) iVar.a("phoneNumber"), dVar);
                break;
            case "setPushToken":
                setPushToken((String) iVar.a("pushToken"), dVar);
                break;
            case "setPostHogUserID":
                setPostHogUserID((String) iVar.a("postHogUserID"), dVar);
                break;
            case "setAttributes":
                setAttributes((Map) iVar.a("attributes"), dVar);
                break;
            case "setAdjustID":
                setAdjustID((String) iVar.a("adjustID"), dVar);
                break;
            case "setAirshipChannelID":
                setAirshipChannelID((String) iVar.a("airshipChannelID"), dVar);
                break;
            case "trackCustomPaywallImpression":
                trackCustomPaywallImpression((Map) iVar.b(), dVar);
                break;
            case "syncPurchases":
                syncPurchases(dVar);
                break;
            case "getCachedVirtualCurrencies":
                getCachedVirtualCurrencies(dVar);
                break;
            case "setEmail":
                setEmail((String) iVar.a("email"), dVar);
                break;
            case "getVirtualCurrencies":
                getVirtualCurrencies(dVar);
                break;
            case "setMediaSource":
                setMediaSource((String) iVar.a("mediaSource"), dVar);
                break;
            case "getAppUserID":
                getAppUserID(dVar);
                break;
            case "setAdGroup":
                setAdGroup((String) iVar.a("adGroup"), dVar);
                break;
            case "setCampaign":
                setCampaign((String) iVar.a("campaign"), dVar);
                break;
            case "getOfferings":
                getOfferings(dVar);
                break;
            case "setMixpanelDistinctID":
                setMixpanelDistinctID((String) iVar.a("mixpanelDistinctID"), dVar);
                break;
            case "canMakePayments":
                canMakePayments((List) iVar.a("features"), dVar);
                break;
            case "overridePreferredUILocale":
                overridePreferredUILocale((String) iVar.a("locale"), dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    public void onReattachedToActivityForConfigChanges(Z9.c cVar) {
        onAttachedToActivity(cVar);
    }

    private void onAttachedToEngine(da.b bVar, Context context) {
        j jVar = new j(bVar, "purchases_flutter");
        this.channel = jVar;
        this.applicationContext = context;
        jVar.e(this);
    }
}
