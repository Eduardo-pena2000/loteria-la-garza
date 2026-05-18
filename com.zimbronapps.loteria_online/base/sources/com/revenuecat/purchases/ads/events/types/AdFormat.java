package com.revenuecat.purchases.ads.events.types;

import Za.E;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AdFormat {
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final String OTHER = constructor-impl("other");
    private static final String BANNER = constructor-impl("banner");
    private static final String INTERSTITIAL = constructor-impl("interstitial");
    private static final String REWARDED = constructor-impl("rewarded");
    private static final String REWARDED_INTERSTITIAL = constructor-impl("rewarded_interstitial");
    private static final String NATIVE = constructor-impl("native");
    private static final String APP_OPEN = constructor-impl("app_open");
    private static final String MREC = constructor-impl("mrec");

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:140)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:35)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:16)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:10)
         */
        public final String fromString-XxFlno4(String str) {
            t.g(str, "value");
            String obj = E.j1(str).toString();
            switch (obj.hashCode()) {
                case -1396342996:
                    if (obj.equals("banner")) {
                        return getBANNER-y0COY5Q();
                    }
                    break;
                case -1052618729:
                    if (obj.equals("native")) {
                        return getNATIVE-y0COY5Q();
                    }
                    break;
                case -239580146:
                    if (obj.equals("rewarded")) {
                        return getREWARDED-y0COY5Q();
                    }
                    break;
                case 3360003:
                    if (obj.equals("mrec")) {
                        return getMREC-y0COY5Q();
                    }
                    break;
                case 106069776:
                    if (obj.equals("other")) {
                        return getOTHER-y0COY5Q();
                    }
                    break;
                case 604727084:
                    if (obj.equals("interstitial")) {
                        return getINTERSTITIAL-y0COY5Q();
                    }
                    break;
                case 1167692200:
                    if (obj.equals("app_open")) {
                        return getAPP_OPEN-y0COY5Q();
                    }
                    break;
                case 1911491517:
                    if (obj.equals("rewarded_interstitial")) {
                        return getREWARDED_INTERSTITIAL-y0COY5Q();
                    }
                    break;
            }
            return AdFormat.constructor-impl(str);
        }

        public final String getAPP_OPEN-y0COY5Q() {
            return AdFormat.access$getAPP_OPEN$cp();
        }

        public final String getBANNER-y0COY5Q() {
            return AdFormat.access$getBANNER$cp();
        }

        public final String getINTERSTITIAL-y0COY5Q() {
            return AdFormat.access$getINTERSTITIAL$cp();
        }

        public final String getMREC-y0COY5Q() {
            return AdFormat.access$getMREC$cp();
        }

        public final String getNATIVE-y0COY5Q() {
            return AdFormat.access$getNATIVE$cp();
        }

        public final String getOTHER-y0COY5Q() {
            return AdFormat.access$getOTHER$cp();
        }

        public final String getREWARDED-y0COY5Q() {
            return AdFormat.access$getREWARDED$cp();
        }

        public final String getREWARDED_INTERSTITIAL-y0COY5Q() {
            return AdFormat.access$getREWARDED_INTERSTITIAL$cp();
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdFormat(String str) {
        this.value = str;
    }

    public static final /* synthetic */ String access$getAPP_OPEN$cp() {
        return APP_OPEN;
    }

    public static final /* synthetic */ String access$getBANNER$cp() {
        return BANNER;
    }

    public static final /* synthetic */ String access$getINTERSTITIAL$cp() {
        return INTERSTITIAL;
    }

    public static final /* synthetic */ String access$getMREC$cp() {
        return MREC;
    }

    public static final /* synthetic */ String access$getNATIVE$cp() {
        return NATIVE;
    }

    public static final /* synthetic */ String access$getOTHER$cp() {
        return OTHER;
    }

    public static final /* synthetic */ String access$getREWARDED$cp() {
        return REWARDED;
    }

    public static final /* synthetic */ String access$getREWARDED_INTERSTITIAL$cp() {
        return REWARDED_INTERSTITIAL;
    }

    public static final /* synthetic */ AdFormat box-impl(String str) {
        return new AdFormat(str);
    }

    public static String constructor-impl(String str) {
        t.g(str, "value");
        return str;
    }

    public static boolean equals-impl(String str, Object obj) {
        return (obj instanceof AdFormat) && t.c(str, ((AdFormat) obj).unbox-impl());
    }

    public static final boolean equals-impl0(String str, String str2) {
        return t.c(str, str2);
    }

    public static int hashCode-impl(String str) {
        return str.hashCode();
    }

    public static String toString-impl(String str) {
        return "AdFormat(value=" + str + ')';
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
