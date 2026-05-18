package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import ob.b;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum FlexDistribution {
    START,
    END,
    CENTER,
    SPACE_BETWEEN,
    SPACE_AROUND,
    SPACE_EVENLY;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return FlexDistributionDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
