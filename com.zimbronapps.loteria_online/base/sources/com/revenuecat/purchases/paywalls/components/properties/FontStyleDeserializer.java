package com.revenuecat.purchases.paywalls.components.properties;

import Ca.o;
import Qa.l;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FontStyleDeserializer extends EnumDeserializerWithDefault {
    public static final FontStyleDeserializer INSTANCE = new FontStyleDeserializer();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FontStyle.values().length];
                try {
                    iArr[FontStyle.NORMAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FontStyle.ITALIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public 1() {
            super(1);
        }

        public final String invoke(FontStyle fontStyle) {
            t.g(fontStyle, "value");
            int i = WhenMappings.$EnumSwitchMapping$0[fontStyle.ordinal()];
            if (i == 1) {
                return "normal";
            }
            if (i == 2) {
                return "italic";
            }
            throw new o();
        }
    }

    private FontStyleDeserializer() {
        super(FontStyle.NORMAL, 1.INSTANCE);
    }
}
