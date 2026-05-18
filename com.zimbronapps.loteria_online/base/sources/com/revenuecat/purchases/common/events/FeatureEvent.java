package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.InternalRevenueCatAPI;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface FeatureEvent {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean isPriorityEvent(FeatureEvent featureEvent) {
            return FeatureEvent.access$isPriorityEvent$jd(featureEvent);
        }
    }

    static /* synthetic */ boolean access$isPriorityEvent$jd(FeatureEvent featureEvent) {
        return super.isPriorityEvent();
    }

    default boolean isPriorityEvent() {
        return false;
    }
}
