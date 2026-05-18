package com.applovin.sdk;

import android.content.Intent;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface AppLovinEventService {
    void trackCheckout(String str, Map map);

    void trackEvent(String str);

    void trackEvent(String str, Map map);

    void trackEvent(String str, Map map, Map map2);

    void trackInAppPurchase(Intent intent, Map map);
}
