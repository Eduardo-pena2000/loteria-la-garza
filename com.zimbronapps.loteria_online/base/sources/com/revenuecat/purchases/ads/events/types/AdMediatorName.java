package com.revenuecat.purchases.ads.events.types;

import Za.E;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AdMediatorName {
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final String AD_MOB = constructor-impl("AdMob");
    private static final String APP_LOVIN = constructor-impl("AppLovin");

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String fromString-CJOXPJU(String str) {
            t.g(str, "value");
            String obj = E.j1(str).toString();
            return t.c(obj, "AdMob") ? getAD_MOB-GyoM_N4() : t.c(obj, "AppLovin") ? getAPP_LOVIN-GyoM_N4() : AdMediatorName.constructor-impl(str);
        }

        public final String getAD_MOB-GyoM_N4() {
            return AdMediatorName.access$getAD_MOB$cp();
        }

        public final String getAPP_LOVIN-GyoM_N4() {
            return AdMediatorName.access$getAPP_LOVIN$cp();
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdMediatorName(String str) {
        this.value = str;
    }

    public static final /* synthetic */ String access$getAD_MOB$cp() {
        return AD_MOB;
    }

    public static final /* synthetic */ String access$getAPP_LOVIN$cp() {
        return APP_LOVIN;
    }

    public static final /* synthetic */ AdMediatorName box-impl(String str) {
        return new AdMediatorName(str);
    }

    public static String constructor-impl(String str) {
        t.g(str, "value");
        return str;
    }

    public static boolean equals-impl(String str, Object obj) {
        return (obj instanceof AdMediatorName) && t.c(str, ((AdMediatorName) obj).unbox-impl());
    }

    public static final boolean equals-impl0(String str, String str2) {
        return t.c(str, str2);
    }

    public static int hashCode-impl(String str) {
        return str.hashCode();
    }

    public static String toString-impl(String str) {
        return "AdMediatorName(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return equals-impl(this.value, obj);
    }

    public int hashCode() {
        return hashCode-impl(this.value);
    }

    public String toString() {
        return toString-impl(this.value);
    }

    public final /* synthetic */ String unbox-impl() {
        return this.value;
    }
}
