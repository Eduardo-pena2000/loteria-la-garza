package com.revenuecat.purchases.paywalls.components;

import Ca.o;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TimelineIconAlignmentDeserializer extends EnumDeserializerWithDefault {
    public static final TimelineIconAlignmentDeserializer INSTANCE = new TimelineIconAlignmentDeserializer();

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TimelineComponent.IconAlignment.values().length];
                try {
                    iArr[TimelineComponent.IconAlignment.Title.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TimelineComponent.IconAlignment.TitleAndDescription.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public 1() {
            super(1);
        }

        public final String invoke(TimelineComponent.IconAlignment iconAlignment) {
            t.g(iconAlignment, "value");
            int i = WhenMappings.$EnumSwitchMapping$0[iconAlignment.ordinal()];
            if (i == 1) {
                return "title";
            }
            if (i == 2) {
                return "title_and_description";
            }
            throw new o();
        }
    }

    private TimelineIconAlignmentDeserializer() {
        super(TimelineComponent.IconAlignment.Title, 1.INSTANCE);
    }
}
