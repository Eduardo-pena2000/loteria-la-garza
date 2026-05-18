package com.applovin.mediation;

import L5.b;
import L5.h;
import L5.p;
import L5.y;
import android.content.Context;
import android.os.Bundle;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";
    public static final String ERROR_MSG_CHILD_USER = "MobileAds.getRequestConfiguration() indicates the user is a child. AppLovin SDK 13.0.0 or higher does not support child users.";
    public static final String ERROR_MSG_REASON_PREFIX = "AppLovin SDK returned a load failure callback with reason: ";

    public static class ServerParameterKeys {
        public static final String AD_UNIT_ID = "ad_unit_id";
        public static final String SDK_KEY = "sdkKey";
        public static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    public static AppLovinAdSize appLovinAdSizeFromAdMobAdSize(Context context, h hVar) {
        ArrayList arrayList = new ArrayList();
        h hVar2 = h.i;
        arrayList.add(hVar2);
        h hVar3 = h.l;
        arrayList.add(hVar3);
        h a = p.a(context, hVar, arrayList);
        if (hVar2.equals(a)) {
            return AppLovinAdSize.BANNER;
        }
        if (hVar3.equals(a)) {
            return AppLovinAdSize.LEADER;
        }
        return null;
    }

    public static b getAdError(int i) {
        String str = "AppLovin error code " + i;
        if (i == -8) {
            str = "INVALID_AD_TOKEN";
        } else if (i == -7) {
            str = "INVALID_ZONE";
        } else if (i != -6) {
            switch (i) {
                case -1009:
                    str = "NO_NETWORK";
                    break;
                case -1001:
                    str = "FETCH_AD_TIMEOUT";
                    break;
                case -900:
                    str = "INVALID_URL";
                    break;
                case -800:
                    str = "INVALID_RESPONSE";
                    break;
                case -600:
                    str = "INCENTIVIZED_USER_CLOSED_VIDEO";
                    break;
                case -500:
                    str = "INCENTIVIZED_SERVER_TIMEOUT";
                    break;
                case -400:
                    str = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                    break;
                case -300:
                    str = "INCENTIVIZED_NO_AD_PRELOADED";
                    break;
                case -22:
                    str = "SDK_DISABLED";
                    break;
                case -1:
                    str = "UNSPECIFIED_ERROR";
                    break;
                case 204:
                    str = "NO_FILL";
                    break;
                default:
                    switch (i) {
                        case -202:
                            str = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                            break;
                        case -201:
                            str = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                            break;
                        case -200:
                            str = "UNABLE_TO_PRECACHE_RESOURCES";
                            break;
                    }
            }
        } else {
            str = "UNABLE_TO_RENDER_AD";
        }
        return new b(i, "AppLovin SDK returned a load failure callback with reason: " + str, "com.applovin.sdk");
    }

    public static b getChildUserError() {
        return new b(112, "MobileAds.getRequestConfiguration() indicates the user is a child. AppLovin SDK 13.0.0 or higher does not support child users.", "com.google.ads.mediation.applovin");
    }

    public static boolean isChildUser() {
        y requestConfiguration = MobileAds.getRequestConfiguration();
        return requestConfiguration.c() == 1 || requestConfiguration.d() == 1;
    }

    public static boolean isMultiAdsEnabled() {
        return true;
    }

    public static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey("zone_id") ? bundle.getString("zone_id") : "";
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean("mute_audio");
    }
}
