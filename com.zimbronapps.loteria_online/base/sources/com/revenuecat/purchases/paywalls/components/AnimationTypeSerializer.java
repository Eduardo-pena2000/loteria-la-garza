package com.revenuecat.purchases.paywalls.components;

import Ca.o;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.PaywallAnimation;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AnimationTypeSerializer extends EnumDeserializerWithDefault {
    public static final AnimationTypeSerializer INSTANCE = new AnimationTypeSerializer();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaywallAnimation.AnimationType.values().length];
                try {
                    iArr[PaywallAnimation.AnimationType.EASE_IN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaywallAnimation.AnimationType.EASE_OUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PaywallAnimation.AnimationType.EASE_IN_OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PaywallAnimation.AnimationType.LINEAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public 1() {
            super(1);
        }

        public final String invoke(PaywallAnimation.AnimationType animationType) {
            t.g(animationType, "value");
            int i = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
            if (i == 1) {
                return "ease_in";
            }
            if (i == 2) {
                return "ease_out";
            }
            if (i == 3) {
                return "ease_in_out";
            }
            if (i == 4) {
                return "linear";
            }
            throw new o();
        }
    }

    private AnimationTypeSerializer() {
        super(PaywallAnimation.AnimationType.EASE_IN_OUT, 1.INSTANCE);
    }
}
