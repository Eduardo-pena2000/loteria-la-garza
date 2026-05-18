package com.revenuecat.purchases.paywalls.components.properties;

import Ca.o;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BadgeStyleSerializer extends EnumDeserializerWithDefault {
    public static final BadgeStyleSerializer INSTANCE = new BadgeStyleSerializer();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Badge.Style.values().length];
                try {
                    iArr[Badge.Style.Overlay.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Badge.Style.EdgeToEdge.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Badge.Style.Nested.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public 1() {
            super(1);
        }

        public final String invoke(Badge.Style style) {
            t.g(style, "style");
            int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 1) {
                return "overlay";
            }
            if (i == 2) {
                return "edge_to_edge";
            }
            if (i == 3) {
                return "nested";
            }
            throw new o();
        }
    }

    private BadgeStyleSerializer() {
        super(Badge.Style.Overlay, 1.INSTANCE);
    }
}
