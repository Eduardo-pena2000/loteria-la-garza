package com.revenuecat.purchases.ads.events.types;

import Za.E;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AdRevenuePrecision {
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final String EXACT = constructor-impl("exact");
    private static final String PUBLISHER_DEFINED = constructor-impl("publisher_defined");
    private static final String ESTIMATED = constructor-impl("estimated");
    private static final String UNKNOWN = constructor-impl("unknown");

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
        public final String fromString-QAIqrgA(String str) {
            t.g(str, "value");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            t.f(lowerCase, "toLowerCase(...)");
            String obj = E.j1(lowerCase).toString();
            switch (obj.hashCode()) {
                case -623607748:
                    if (obj.equals("estimated")) {
                        return getESTIMATED-rAcPn4k();
                    }
                    break;
                case -284840886:
                    if (obj.equals("unknown")) {
                        return getUNKNOWN-rAcPn4k();
                    }
                    break;
                case 96946943:
                    if (obj.equals("exact")) {
                        return getEXACT-rAcPn4k();
                    }
                    break;
                case 655944390:
                    if (obj.equals("publisher_defined")) {
                        return getPUBLISHER_DEFINED-rAcPn4k();
                    }
                    break;
            }
            return AdRevenuePrecision.constructor-impl(str);
        }

        public final String getESTIMATED-rAcPn4k() {
            return AdRevenuePrecision.access$getESTIMATED$cp();
        }

        public final String getEXACT-rAcPn4k() {
            return AdRevenuePrecision.access$getEXACT$cp();
        }

        public final String getPUBLISHER_DEFINED-rAcPn4k() {
            return AdRevenuePrecision.access$getPUBLISHER_DEFINED$cp();
        }

        public final String getUNKNOWN-rAcPn4k() {
            return AdRevenuePrecision.access$getUNKNOWN$cp();
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdRevenuePrecision(String str) {
        this.value = str;
    }

    public static final /* synthetic */ String access$getESTIMATED$cp() {
        return ESTIMATED;
    }

    public static final /* synthetic */ String access$getEXACT$cp() {
        return EXACT;
    }

    public static final /* synthetic */ String access$getPUBLISHER_DEFINED$cp() {
        return PUBLISHER_DEFINED;
    }

    public static final /* synthetic */ String access$getUNKNOWN$cp() {
        return UNKNOWN;
    }

    public static final /* synthetic */ AdRevenuePrecision box-impl(String str) {
        return new AdRevenuePrecision(str);
    }

    public static String constructor-impl(String str) {
        t.g(str, "value");
        return str;
    }

    public static boolean equals-impl(String str, Object obj) {
        return (obj instanceof AdRevenuePrecision) && t.c(str, ((AdRevenuePrecision) obj).unbox-impl());
    }

    public static final boolean equals-impl0(String str, String str2) {
        return t.c(str, str2);
    }

    public static int hashCode-impl(String str) {
        return str.hashCode();
    }

    public static String toString-impl(String str) {
        return "AdRevenuePrecision(value=" + str + ')';
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
