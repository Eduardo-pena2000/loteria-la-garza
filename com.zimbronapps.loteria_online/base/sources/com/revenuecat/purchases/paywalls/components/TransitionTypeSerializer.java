package com.revenuecat.purchases.paywalls.components;

import Ca.o;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TransitionTypeSerializer extends EnumDeserializerWithDefault {
    public static final TransitionTypeSerializer INSTANCE = new TransitionTypeSerializer();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaywallTransition.TransitionType.values().length];
                try {
                    iArr[PaywallTransition.TransitionType.FADE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaywallTransition.TransitionType.FADE_AND_SCALE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PaywallTransition.TransitionType.SCALE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PaywallTransition.TransitionType.SLIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public 1() {
            super(1);
        }

        public final String invoke(PaywallTransition.TransitionType transitionType) {
            t.g(transitionType, "value");
            int i = WhenMappings.$EnumSwitchMapping$0[transitionType.ordinal()];
            if (i == 1) {
                return "fade";
            }
            if (i == 2) {
                return "fade_and_scale";
            }
            if (i == 3) {
                return "scale";
            }
            if (i == 4) {
                return "slide";
            }
            throw new o();
        }
    }

    private TransitionTypeSerializer() {
        super(PaywallTransition.TransitionType.FADE, 1.INSTANCE);
    }
}
