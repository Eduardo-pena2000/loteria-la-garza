package com.revenuecat.purchases.common.caching;

import Ca.l;
import Ca.m;
import Da.D;
import Da.Q;
import Da.S;
import Da.Y;
import Da.w;
import Wa.n;
import Za.B;
import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.CustomerInfoOriginalSource;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.j;
import org.json.JSONException;
import org.json.JSONObject;
import tb.b;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_ORIGINAL_SOURCE_KEY = "customer_info_original_source";
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    private static final Companion Companion = new Companion(null);
    private final String apiKey;
    private final l apiKeyPrefix$delegate;
    private final l appUserIDCacheKey$delegate;
    private final String attributionCacheKey;
    private final l customerInfoCachesLastUpdatedCacheBaseKey$delegate;
    private final DateProvider dateProvider;
    private final l legacyAppUserIDCacheKey$delegate;
    private final l legacyTokensCacheKey$delegate;
    private final l offeringsResponseCacheKey$delegate;
    private final SharedPreferences preferences;
    private final l productEntitlementMappingCacheKey$delegate;
    private final l productEntitlementMappingLastUpdatedCacheKey$delegate;
    private final l storefrontCacheKey$delegate;
    private Map tokenMapCache;
    private final l tokensCacheKey$delegate;
    private final l virtualCurrenciesCacheBaseKey$delegate;
    private final l virtualCurrenciesLastUpdatedCacheBaseKey$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider) {
        t.g(sharedPreferences, "preferences");
        t.g(str, "apiKey");
        t.g(dateProvider, "dateProvider");
        this.preferences = sharedPreferences;
        this.apiKey = str;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix$delegate = m.b(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey$delegate = m.b(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey$delegate = m.b(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.legacyTokensCacheKey$delegate = m.b(new DeviceCache$legacyTokensCacheKey$2(this));
        this.tokensCacheKey$delegate = m.b(new DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey$delegate = m.b(DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey$delegate = m.b(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey$delegate = m.b(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey$delegate = m.b(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.virtualCurrenciesCacheBaseKey$delegate = m.b(new DeviceCache$virtualCurrenciesCacheBaseKey$2(this));
        this.virtualCurrenciesLastUpdatedCacheBaseKey$delegate = m.b(new DeviceCache$virtualCurrenciesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey$delegate = m.b(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    public static final /* synthetic */ String access$getApiKey$p(DeviceCache deviceCache) {
        return deviceCache.apiKey;
    }

    public static final /* synthetic */ String access$getApiKeyPrefix(DeviceCache deviceCache) {
        return deviceCache.getApiKeyPrefix();
    }

    public static /* synthetic */ void addSuccessfullyPostedToken$default(DeviceCache deviceCache, String str, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSuccessfullyPostedToken");
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        deviceCache.addSuccessfullyPostedToken(str, bool);
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey$purchases_defaultsBc8Release());
        editor.remove(getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID$purchases_defaultsBc8Release = getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release));
        }
        String legacyCachedAppUserID$purchases_defaultsBc8Release = getLegacyCachedAppUserID$purchases_defaultsBc8Release();
        if (legacyCachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsBc8Release(legacyCachedAppUserID$purchases_defaultsBc8Release));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(str));
        return editor;
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCache(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(str));
        String cachedAppUserID$purchases_defaultsBc8Release = getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release));
        }
        String legacyCachedAppUserID$purchases_defaultsBc8Release = getLegacyCachedAppUserID$purchases_defaultsBc8Release();
        if (legacyCachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(legacyCachedAppUserID$purchases_defaultsBc8Release));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(str));
        String cachedAppUserID$purchases_defaultsBc8Release = getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release));
        }
        String legacyCachedAppUserID$purchases_defaultsBc8Release = getLegacyCachedAppUserID$purchases_defaultsBc8Release();
        if (legacyCachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(legacyCachedAppUserID$purchases_defaultsBc8Release));
        }
        return editor;
    }

    private final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix$delegate.getValue();
    }

    public static /* synthetic */ void getAppUserIDCacheKey$purchases_defaultsBc8Release$annotations() {
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String str) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(str), 0L));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey$delegate.getValue();
    }

    public static /* synthetic */ void getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release$annotations() {
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey$delegate.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey$delegate.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey$delegate.getValue();
    }

    public static /* synthetic */ void getStorefrontCacheKey$purchases_defaultsBc8Release$annotations() {
    }

    private final synchronized Map getTokenMap() {
        Map map = this.tokenMapCache;
        if (map != null) {
            return map;
        }
        Map loadTokenMapFromPreferences = loadTokenMapFromPreferences();
        this.tokenMapCache = loadTokenMapFromPreferences;
        return loadTokenMapFromPreferences;
    }

    private final String getVirtualCurrenciesCacheBaseKey() {
        return (String) this.virtualCurrenciesCacheBaseKey$delegate.getValue();
    }

    private final synchronized Date getVirtualCurrenciesCacheLastUpdated(String str) {
        return new Date(this.preferences.getLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(str), 0L));
    }

    private final String getVirtualCurrenciesLastUpdatedCacheBaseKey() {
        return (String) this.virtualCurrenciesLastUpdatedCacheBaseKey$delegate.getValue();
    }

    private final Map loadTokenMapFromPreferences() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        String string = this.preferences.getString(getTokensCacheKey$purchases_defaultsBc8Release(), (String) null);
        if (string != null) {
            try {
                return (Map) b.d.d(DeviceCacheKt.access$getTokenMapSerializer$p(), string);
            } catch (IllegalArgumentException unused) {
                return S.h();
            } catch (j unused2) {
                return S.h();
            }
        }
        try {
            Iterable stringSet = this.preferences.getStringSet(getLegacyTokensCacheKey$purchases_defaultsBc8Release(), (Set) null);
            Set Q0 = stringSet != null ? D.Q0(stringSet) : null;
            if (Q0 == null) {
                return S.h();
            }
            Iterable iterable = (Iterable) Q0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(iterable, 10)), 16));
            for (Object obj : iterable) {
                linkedHashMap.put(obj, new TokenCacheEntry((Boolean) null, 1, (k) null));
            }
            saveTokenMap(linkedHashMap);
            this.preferences.edit().remove(getLegacyTokensCacheKey$purchases_defaultsBc8Release()).apply();
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$loadTokenMapFromPreferences$$inlined$log$1 deviceCache$loadTokenMapFromPreferences$$inlined$log$1 = new DeviceCache$loadTokenMapFromPreferences$$inlined$log$1(logIntent, linkedHashMap);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                        return linkedHashMap;
                    }
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    return linkedHashMap;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
                        return linkedHashMap;
                    }
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    return linkedHashMap;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) > 0) {
                        return linkedHashMap;
                    }
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    return linkedHashMap;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) > 0) {
                        return linkedHashMap;
                    }
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    return linkedHashMap;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) > 0) {
                        return linkedHashMap;
                    }
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    return linkedHashMap;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) > 0) {
                        return linkedHashMap;
                    }
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) > 0) {
                        return linkedHashMap;
                    }
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) > 0) {
                        return linkedHashMap;
                    }
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    return linkedHashMap;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) > 0) {
                        return linkedHashMap;
                    }
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    return linkedHashMap;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    return linkedHashMap;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) > 0) {
                        return linkedHashMap;
                    }
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    return linkedHashMap;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    return linkedHashMap;
                default:
                    return linkedHashMap;
            }
            currentLogHandler.d(str, str2);
            return linkedHashMap;
        } catch (ClassCastException unused3) {
            return S.h();
        }
    }

    private final synchronized void saveTokenMap(Map map) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$saveTokenMap$$inlined$log$1 deviceCache$saveTokenMap$$inlined$log$1 = new DeviceCache$saveTokenMap$$inlined$log$1(logIntent, map);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
            }
            putString$purchases_defaultsBc8Release(getTokensCacheKey$purchases_defaultsBc8Release(), b.d.b(DeviceCacheKt.access$getTokenMapSerializer$p(), map));
            this.tokenMapCache = map;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestamp(String str, Date date) {
        this.preferences.edit().putLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(str), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestampToNow(String str) {
        setVirtualCurrenciesCacheTimestamp(str, this.dateProvider.getNow());
    }

    @InternalRevenueCatAPI
    public final synchronized void addSuccessfullyPostedToken(String str, Boolean bool) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        try {
            t.g(str, "token");
            String sha1 = UtilsKt.sha1(str);
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$addSuccessfullyPostedToken$$inlined$log$1 deviceCache$addSuccessfullyPostedToken$$inlined$log$1 = new DeviceCache$addSuccessfullyPostedToken$$inlined$log$1(logIntent, str, sha1);
            int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
            }
            Map C = S.C(getTokenMap());
            DeviceCache$addSuccessfullyPostedToken$$inlined$log$2 deviceCache$addSuccessfullyPostedToken$$inlined$log$2 = new DeviceCache$addSuccessfullyPostedToken$$inlined$log$2(logIntent, C);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
            }
            TokenCacheEntry tokenCacheEntry = (TokenCacheEntry) C.get(sha1);
            if (tokenCacheEntry == null) {
                C.put(sha1, new TokenCacheEntry(bool));
                saveTokenMap(C);
            } else if (bool != null && !t.c(tokenCacheEntry.isAutoRenewing(), bool)) {
                C.put(sha1, tokenCacheEntry.copy(bool));
                saveTokenMap(C);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void cacheAppUserID$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        t.f(edit, "preferences.edit()");
        cacheAppUserID$purchases_defaultsBc8Release(str, edit).apply();
    }

    public final synchronized void cacheCustomerInfo$purchases_defaultsBc8Release(String str, CustomerInfo customerInfo) {
        t.g(str, "appUserID");
        t.g(customerInfo, "info");
        JSONObject rawData = customerInfo.getRawData();
        rawData.put("schema_version", 3);
        rawData.put("verification_result", customerInfo.getEntitlements().getVerification().name());
        rawData.put("customer_info_request_date", customerInfo.getRequestDate().getTime());
        rawData.put("customer_info_original_source", customerInfo.getOriginalSource$purchases_defaultsBc8Release().name());
        this.preferences.edit().putString(customerInfoCacheKey$purchases_defaultsBc8Release(str), rawData.toString()).apply();
        setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release(str);
    }

    public final synchronized void cacheOfferingsResponse$purchases_defaultsBc8Release(JSONObject jSONObject) {
        t.g(jSONObject, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), jSONObject.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping$purchases_defaultsBc8Release(ProductEntitlementMapping productEntitlementMapping) {
        t.g(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson$purchases_defaultsBc8Release().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsBc8Release();
    }

    public final synchronized void cacheVirtualCurrencies$purchases_defaultsBc8Release(String str, VirtualCurrencies virtualCurrencies) {
        t.g(str, "appUserID");
        t.g(virtualCurrencies, "virtualCurrencies");
        this.preferences.edit().putString(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(str), b.d.b(VirtualCurrencies.Companion.serializer(), virtualCurrencies)).apply();
        setVirtualCurrenciesCacheTimestampToNow(str);
    }

    public final synchronized void cleanPreviouslySentTokens$purchases_defaultsBc8Release(Set set) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            t.g(set, "hashedTokens");
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$cleanPreviouslySentTokens$$inlined$log$1 deviceCache$cleanPreviouslySentTokens$$inlined$log$1 = new DeviceCache$cleanPreviouslySentTokens$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
            }
            Map tokenMap = getTokenMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : tokenMap.entrySet()) {
                if (set.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            saveTokenMap(linkedHashMap);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void cleanupOldAttributionData$purchases_defaultsBc8Release() {
        try {
            SharedPreferences.Editor edit = this.preferences.edit();
            for (String str : this.preferences.getAll().keySet()) {
                if (str != null && B.N(str, this.attributionCacheKey, false, 2, (Object) null)) {
                    edit.remove(str);
                }
            }
            edit.apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearCachesForAppUserID$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        t.f(edit, "preferences.edit()");
        clearVirtualCurrenciesCache(clearVirtualCurrenciesCacheTimestamp(clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(edit)), str), str), str).apply();
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        t.f(edit, "editor");
        clearCustomerInfoCache$purchases_defaultsBc8Release(str, edit);
        edit.apply();
    }

    public final synchronized void clearCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        t.f(edit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(edit, str).apply();
    }

    public final synchronized void clearOfferingsResponseCache$purchases_defaultsBc8Release() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        t.f(edit, "editor");
        clearVirtualCurrenciesCache$purchases_defaultsBc8Release(str, edit);
        edit.apply();
    }

    public final String customerInfoCacheKey$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        return getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release() + '.' + str;
    }

    public final String customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + str;
    }

    public final Set findKeysThatStartWith$purchases_defaultsBc8Release(String str) {
        t.g(str, "cacheKey");
        try {
            Map all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : all.entrySet()) {
                    String str2 = (String) entry.getKey();
                    t.f(str2, "it");
                    if (B.N(str2, str, false, 2, (Object) null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap.keySet();
                if (keySet != null) {
                    return keySet;
                }
            }
            return Y.b();
        } catch (NullPointerException unused) {
            return Y.b();
        }
    }

    public final synchronized List getActivePurchasesNotInCache$purchases_defaultsBc8Release(Map map) {
        t.g(map, "hashedTokens");
        return D.L0(S.m(map, getPreviouslySentHashedTokens$purchases_defaultsBc8Release()).values());
    }

    public final String getAppUserIDCacheKey$purchases_defaultsBc8Release() {
        return (String) this.appUserIDCacheKey$delegate.getValue();
    }

    public final String getAttributionCacheKey$purchases_defaultsBc8Release() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID$purchases_defaultsBc8Release() {
        return this.preferences.getString(getAppUserIDCacheKey$purchases_defaultsBc8Release(), (String) null);
    }

    public final CustomerInfo getCachedCustomerInfo$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey$purchases_defaultsBc8Release(str), (String) null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            int optInt = jSONObject.optInt("schema_version");
            String string2 = jSONObject.has("verification_result") ? jSONObject.getString("verification_result") : "NOT_REQUESTED";
            Number valueOf = Long.valueOf(jSONObject.optLong("customer_info_request_date"));
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            Date date = valueOf != null ? new Date(valueOf.longValue()) : null;
            CustomerInfoOriginalSource fromString = CustomerInfoOriginalSource.Companion.fromString(JSONObjectExtensionsKt.optNullableString(jSONObject, "customer_info_original_source"));
            jSONObject.remove("verification_result");
            jSONObject.remove("customer_info_request_date");
            jSONObject.remove("customer_info_original_source");
            t.f(string2, "verificationResultString");
            VerificationResult valueOf2 = VerificationResult.valueOf(string2);
            if (optInt == 3) {
                return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, valueOf2, fromString, true);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final synchronized VirtualCurrencies getCachedVirtualCurrencies$purchases_defaultsBc8Release(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "appUserID");
        String string = this.preferences.getString(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(str), (String) null);
        if (string != null) {
            try {
                return VirtualCurrenciesFactory.INSTANCE.buildVirtualCurrencies(string);
            } catch (j e) {
                LogIntent logIntent = LogIntent.WARNING;
                DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2(logIntent, e);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                }
            } catch (JSONException e2) {
                LogIntent logIntent2 = LogIntent.WARNING;
                DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1(logIntent2, e2);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel11 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            str2 = "[Purchases] - " + logLevel11.name();
                            str3 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel12 = LogLevel.WARN;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel13 = LogLevel.INFO;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel14 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            str2 = "[Purchases] - " + logLevel14.name();
                            str3 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel15 = LogLevel.INFO;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            str2 = "[Purchases] - " + logLevel16.name();
                            str3 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel17 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            str2 = "[Purchases] - " + logLevel17.name();
                            str3 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel19 = LogLevel.WARN;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel20 = LogLevel.WARN;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                }
            } catch (IllegalArgumentException e3) {
                LogIntent logIntent3 = LogIntent.WARNING;
                DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3(logIntent3, e3);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                    case 1:
                        LogLevel logLevel21 = LogLevel.DEBUG;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                            currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel22 = LogLevel.WARN;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                            currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel23 = LogLevel.INFO;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                            currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel24 = LogLevel.DEBUG;
                        LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                            currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel25 = LogLevel.INFO;
                        LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                            currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel26 = LogLevel.DEBUG;
                        LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                            currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel27 = LogLevel.DEBUG;
                        LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                            currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel28 = LogLevel.WARN;
                        LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                            currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel29 = LogLevel.WARN;
                        LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                            currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel30 = LogLevel.WARN;
                        LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                            currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                }
            }
        }
        return null;
    }

    public JSONObject getJSONObjectOrNull$purchases_defaultsBc8Release(String str) {
        t.g(str, "key");
        String string = this.preferences.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release() {
        return (String) this.legacyAppUserIDCacheKey$delegate.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID$purchases_defaultsBc8Release() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release(), (String) null);
    }

    public final String getLegacyTokensCacheKey$purchases_defaultsBc8Release() {
        return (String) this.legacyTokensCacheKey$delegate.getValue();
    }

    public final synchronized JSONObject getOfferingsResponseCache$purchases_defaultsBc8Release() {
        return getJSONObjectOrNull$purchases_defaultsBc8Release(getOfferingsResponseCacheKey());
    }

    public final synchronized Set getPreviouslySentHashedTokens$purchases_defaultsBc8Release() {
        Set keySet;
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            keySet = getTokenMap().keySet();
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 = new DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1(logIntent, keySet);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
            }
        } finally {
        }
        return keySet;
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping$purchases_defaultsBc8Release() {
        ProductEntitlementMapping productEntitlementMapping = null;
        String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), (String) null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMapping = ProductEntitlementMapping.Companion.fromJson$purchases_defaultsBc8Release(new JSONObject(string), true);
        } catch (JSONException e) {
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Error parsing cached product entitlement mapping: %s", Arrays.copyOf(new Object[]{string}, 1));
            t.f(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, e);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMapping;
    }

    public final synchronized List getPurchasesWithAutoRenewingChange$purchases_defaultsBc8Release(Map map) {
        LinkedHashMap linkedHashMap;
        try {
            t.g(map, "hashedTokens");
            Map tokenMap = getTokenMap();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                StoreTransaction storeTransaction = (StoreTransaction) entry.getValue();
                TokenCacheEntry tokenCacheEntry = (TokenCacheEntry) tokenMap.get(str);
                if (tokenCacheEntry != null && tokenCacheEntry.isAutoRenewing() != null && storeTransaction.isAutoRenewing() != null && !t.c(storeTransaction.isAutoRenewing(), tokenCacheEntry.isAutoRenewing())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return D.L0(linkedHashMap.values());
    }

    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey$purchases_defaultsBc8Release(), (String) null);
        if (string == null) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Getting storefront from cache was null.");
            }
        }
        return string;
    }

    public final String getStorefrontCacheKey$purchases_defaultsBc8Release() {
        return (String) this.storefrontCacheKey$delegate.getValue();
    }

    public final String getTokensCacheKey$purchases_defaultsBc8Release() {
        return (String) this.tokensCacheKey$delegate.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale$purchases_defaultsBc8Release(String str, boolean z) {
        t.g(str, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(str), z, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale$purchases_defaultsBc8Release() {
        return DateExtensionsKt.isCacheStale-8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.access$getPRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD$p(), this.dateProvider);
    }

    public final synchronized boolean isVirtualCurrenciesCacheStale$purchases_defaultsBc8Release(String str, boolean z) {
        t.g(str, "appUserID");
        return DateExtensionsKt.isCacheStale(getVirtualCurrenciesCacheLastUpdated(str), z, this.dateProvider);
    }

    public final String newKey$purchases_defaultsBc8Release(String str) {
        t.g(str, "key");
        return getApiKeyPrefix() + '.' + str;
    }

    public void putString$purchases_defaultsBc8Release(String str, String str2) {
        t.g(str, "cacheKey");
        t.g(str2, "value");
        this.preferences.edit().putString(str, str2).apply();
    }

    public final void remove$purchases_defaultsBc8Release(String str) {
        t.g(str, "cacheKey");
        this.preferences.edit().remove(str).apply();
    }

    public final synchronized void saveAutoRenewingStatus$purchases_defaultsBc8Release(Map map) {
        try {
            t.g(map, "hashedTokens");
            Map C = S.C(getTokenMap());
            boolean z = false;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                StoreTransaction storeTransaction = (StoreTransaction) entry.getValue();
                TokenCacheEntry tokenCacheEntry = (TokenCacheEntry) C.get(str);
                if (tokenCacheEntry != null && storeTransaction.isAutoRenewing() != null && !t.c(tokenCacheEntry.isAutoRenewing(), storeTransaction.isAutoRenewing())) {
                    C.put(str, tokenCacheEntry.copy(storeTransaction.isAutoRenewing()));
                    z = true;
                }
            }
            if (z) {
                saveTokenMap(C);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void setCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(String str, Date date) {
        t.g(str, "appUserID");
        t.g(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(str), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        setCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(str, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsBc8Release() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront$purchases_defaultsBc8Release(String str) {
        try {
            t.g(str, "countryCode");
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                String str2 = "[Purchases] - " + logLevel.name();
                String format = String.format("Setting storefront cache to %s", Arrays.copyOf(new Object[]{str}, 1));
                t.f(format, "format(...)");
                currentLogHandler.v(str2, format);
            }
            this.preferences.edit().putString(getStorefrontCacheKey$purchases_defaultsBc8Release(), str).apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final SharedPreferences.Editor startEditing$purchases_defaultsBc8Release() {
        SharedPreferences.Editor edit = this.preferences.edit();
        t.f(edit, "preferences.edit()");
        return edit;
    }

    public final String virtualCurrenciesCacheKey$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        return getVirtualCurrenciesCacheBaseKey() + '.' + str;
    }

    public final String virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(String str) {
        t.g(str, "appUserID");
        return getVirtualCurrenciesLastUpdatedCacheBaseKey() + '.' + str;
    }

    public final synchronized SharedPreferences.Editor cacheAppUserID$purchases_defaultsBc8Release(String str, SharedPreferences.Editor editor) {
        SharedPreferences.Editor putString;
        t.g(str, "appUserID");
        t.g(editor, "cacheEditor");
        putString = editor.putString(getAppUserIDCacheKey$purchases_defaultsBc8Release(), str);
        t.f(putString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return putString;
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsBc8Release(String str, SharedPreferences.Editor editor) {
        t.g(str, "appUserID");
        t.g(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, str);
        editor.remove(customerInfoCacheKey$purchases_defaultsBc8Release(str));
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsBc8Release(String str, SharedPreferences.Editor editor) {
        t.g(str, "appUserID");
        t.g(editor, "editor");
        clearVirtualCurrenciesCacheTimestamp(editor, str);
        clearVirtualCurrenciesCache(editor, str);
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider, int i, k kVar) {
        this(sharedPreferences, str, (i & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
