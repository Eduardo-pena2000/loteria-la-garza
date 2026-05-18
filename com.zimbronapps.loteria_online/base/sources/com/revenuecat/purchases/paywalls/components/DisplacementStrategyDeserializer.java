package com.revenuecat.purchases.paywalls.components;

import Ca.o;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DisplacementStrategyDeserializer extends EnumDeserializerWithDefault {
    public static final DisplacementStrategyDeserializer INSTANCE = new DisplacementStrategyDeserializer();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaywallTransition.DisplacementStrategy.values().length];
                try {
                    iArr[PaywallTransition.DisplacementStrategy.GREEDY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaywallTransition.DisplacementStrategy.LAZY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public 1() {
            super(1);
        }

        public final String invoke(PaywallTransition.DisplacementStrategy displacementStrategy) {
            t.g(displacementStrategy, "value");
            int i = WhenMappings.$EnumSwitchMapping$0[displacementStrategy.ordinal()];
            if (i == 1) {
                return "greedy";
            }
            if (i == 2) {
                return "lazy";
            }
            throw new o();
        }
    }

    private DisplacementStrategyDeserializer() {
        super(PaywallTransition.DisplacementStrategy.GREEDY, 1.INSTANCE);
    }
}
