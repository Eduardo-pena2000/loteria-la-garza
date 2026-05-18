package com.revenuecat.purchases.paywalls.components.common.serializers;

import Qa.l;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import java.util.Locale;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UpgradeReplacementModeDeserializer extends EnumDeserializerWithDefault {
    public static final UpgradeReplacementModeDeserializer INSTANCE = new UpgradeReplacementModeDeserializer();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final String invoke(GoogleReplacementMode googleReplacementMode) {
            t.g(googleReplacementMode, "value");
            String lowerCase = googleReplacementMode.name().toLowerCase(Locale.ROOT);
            t.f(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    private UpgradeReplacementModeDeserializer() {
        super(GoogleReplacementMode.CHARGE_PRORATED_PRICE, 1.INSTANCE);
    }
}
