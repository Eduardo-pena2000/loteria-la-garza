package com.revenuecat.purchases.subscriberattributes.caching;

import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import Da.w;
import Wa.n;
import Za.E;
import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        LinkedHashMap linkedHashMap;
        Map h;
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            try {
                t.g(subscriberAttributesCache, "<this>");
                String legacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
                Iterable<String> findKeysThatStartWith$purchases_defaultsBc8Release = subscriberAttributesCache.getDeviceCache$purchases_defaultsBc8Release().findKeysThatStartWith$purchases_defaultsBc8Release(legacySubscriberAttributesCacheKey);
                linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(findKeysThatStartWith$purchases_defaultsBc8Release, 10)), 16));
                for (String str : findKeysThatStartWith$purchases_defaultsBc8Release) {
                    String str2 = (String) E.M0(str, new String[]{legacySubscriberAttributesCacheKey}, false, 0, 6, (Object) null).get(1);
                    JSONObject jSONObjectOrNull$purchases_defaultsBc8Release = subscriberAttributesCache.getDeviceCache$purchases_defaultsBc8Release().getJSONObjectOrNull$purchases_defaultsBc8Release(str);
                    if (jSONObjectOrNull$purchases_defaultsBc8Release == null || (h = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull$purchases_defaultsBc8Release)) == null) {
                        h = S.h();
                    }
                    q a = x.a(str2, h);
                    linkedHashMap.put(a.c(), a.d());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String str) {
        t.g(subscriberAttributesCache, "<this>");
        t.g(str, "appUserID");
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsBc8Release() + '.' + str;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map map, SharedPreferences.Editor editor) {
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            try {
                t.g(subscriberAttributesCache, "<this>");
                t.g(map, "legacySubscriberAttributesForAppUserID");
                t.g(editor, "cacheEditor");
                Map allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
                Map C = S.C(allStoredSubscriberAttributes);
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    Map map3 = (Map) allStoredSubscriberAttributes.get(str);
                    if (map3 == null) {
                        map3 = S.h();
                    }
                    C.put(str, S.r(map2, map3));
                    editor.remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, str));
                }
                editor.putString(subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsBc8Release(), CachingHelpersKt.toJSONObject(C).toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache, SharedPreferences.Editor editor) {
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            t.g(subscriberAttributesCache, "<this>");
            t.g(editor, "cacheEditor");
            Map allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
            if (allLegacyStoredSubscriberAttributes.isEmpty()) {
                allLegacyStoredSubscriberAttributes = null;
            }
            if (allLegacyStoredSubscriberAttributes != null) {
                migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes, editor);
            }
        }
    }
}
