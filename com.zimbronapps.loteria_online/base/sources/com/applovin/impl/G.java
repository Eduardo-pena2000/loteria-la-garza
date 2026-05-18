package com.applovin.impl;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.k kVar) {
        String b = d.b(appLovinFullscreenActivity);
        String a = d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z = false;
        boolean z2 = StringUtils.isValidString(b) && !b.equals(packageName);
        if (StringUtils.isValidString(a) && !a.equals(packageName)) {
            z = true;
        }
        if (z2 || z) {
            Map a2 = f2.a((AppLovinAdImpl) bVar);
            a2.put("activity_task_affinity_mismatch", String.valueOf(z2));
            a2.put("base_activity_task_affinity_mismatch", String.valueOf(z));
            kVar.D().a(d2.E0, "taskAffinityMismatch", a2);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.k kVar) {
        if (bVar == null) {
            return;
        }
        boolean a = s.a((View) bVar);
        boolean a2 = a(bVar.getContext());
        if (a2 || a) {
            Map a3 = f2.a((AppLovinAdImpl) bVar.getCurrentAd());
            a3.put("can_draw_overlays", String.valueOf(a2));
            a3.put("is_ad_view_overlaid", String.valueOf(a));
            kVar.D().a(d2.E0, "overlayViolation", a3);
        }
    }

    private static boolean a(Context context) {
        if (o0.e()) {
            return Settings.canDrawOverlays(context);
        }
        return o0.a("android.permission.SYSTEM_ALERT_WINDOW", context);
    }
}
