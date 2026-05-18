package com.revenuecat.purchases.subscriberattributes.caching;

import Ca.l;
import Ca.m;
import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import android.content.SharedPreferences;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;
    private final l subscriberAttributesCacheKey$delegate;

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        t.g(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey$delegate = m.b(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String str, SharedPreferences.Editor editor) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        q a;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1 subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1 = new SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1(logIntent, str);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
            }
            Map allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
            for (Map.Entry entry : allStoredSubscriberAttributes.entrySet()) {
                String str4 = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                if (t.c(str, str4)) {
                    a = x.a(str4, map);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (!((SubscriberAttribute) entry2.getValue()).isSynced()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    a = x.a(str4, linkedHashMap);
                }
                arrayList.add(a);
            }
            Map x = S.x(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : x.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            editor.putString(getSubscriberAttributesCacheKey$purchases_defaultsBc8Release(), CachingHelpersKt.toJSONObject(linkedHashMap2).toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Map filterUnsynced(Map map, String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((SubscriberAttribute) entry.getValue()).isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 = new SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(logIntent, linkedHashMap, str);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return linkedHashMap;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return linkedHashMap;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return linkedHashMap;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return linkedHashMap;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            default:
                return linkedHashMap;
        }
    }

    private final void putAttributes(DeviceCache deviceCache, Map map) {
        DeviceCache deviceCache2 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_defaultsBc8Release = getSubscriberAttributesCacheKey$purchases_defaultsBc8Release();
        String jSONObject = CachingHelpersKt.toJSONObject(map).toString();
        t.f(jSONObject, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString$purchases_defaultsBc8Release(subscriberAttributesCacheKey$purchases_defaultsBc8Release, jSONObject);
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String str, SharedPreferences.Editor editor) {
        t.g(str, "currentAppUserID");
        t.g(editor, "cacheEditor");
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this, editor);
        deleteSyncedSubscriberAttributesForOtherUsers(str, editor);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        try {
            t.g(str, "appUserID");
            LogIntent logIntent = LogIntent.DEBUG;
            SubscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1 subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1 = new SubscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1(logIntent, str);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
            }
            Map C = S.C(getAllStoredSubscriberAttributes());
            C.remove(str);
            putAttributes(this.deviceCache, S.z(C));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String str) {
        t.g(str, "appUserID");
        if (getUnsyncedSubscriberAttributes(str).isEmpty()) {
            clearAllSubscriberAttributesFromUser(str);
        }
    }

    public final synchronized Map getAllStoredSubscriberAttributes() {
        Map h;
        try {
            JSONObject jSONObjectOrNull$purchases_defaultsBc8Release = this.deviceCache.getJSONObjectOrNull$purchases_defaultsBc8Release(getSubscriberAttributesCacheKey$purchases_defaultsBc8Release());
            if (jSONObjectOrNull$purchases_defaultsBc8Release == null || (h = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull$purchases_defaultsBc8Release)) == null) {
                h = S.h();
            }
        } finally {
        }
        return h;
    }

    public final DeviceCache getDeviceCache$purchases_defaultsBc8Release() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_defaultsBc8Release() {
        return (String) this.subscriberAttributesCacheKey$delegate.getValue();
    }

    public final synchronized Map getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        try {
            Map allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(Q.e(allStoredSubscriberAttributes.size()));
            for (Object obj : allStoredSubscriberAttributes.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }

    public final synchronized void setAttributes(String str, Map map) {
        try {
            t.g(str, "appUserID");
            t.g(map, "attributesToBeSet");
            Map allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            Map map2 = (Map) allStoredSubscriberAttributes.get(str);
            if (map2 == null) {
                map2 = S.h();
            }
            putAttributes(this.deviceCache, S.r(allStoredSubscriberAttributes, Q.f(x.a(str, S.r(map2, map)))));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map getAllStoredSubscriberAttributes(String str) {
        Map map;
        t.g(str, "appUserID");
        map = (Map) getAllStoredSubscriberAttributes().get(str);
        if (map == null) {
            map = S.h();
        }
        return map;
    }

    public final synchronized Map getUnsyncedSubscriberAttributes(String str) {
        t.g(str, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(str), str);
    }
}
