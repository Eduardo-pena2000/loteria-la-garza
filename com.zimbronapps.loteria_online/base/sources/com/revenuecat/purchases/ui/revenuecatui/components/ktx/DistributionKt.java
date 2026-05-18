package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Ca.o;
import F.c;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import kotlin.jvm.internal.t;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class DistributionKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlexDistribution.values().length];
            try {
                iArr[FlexDistribution.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlexDistribution.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlexDistribution.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlexDistribution.SPACE_BETWEEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlexDistribution.SPACE_AROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlexDistribution.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ c.e toHorizontalArrangement-3ABfNKs(FlexDistribution toHorizontalArrangement, float f) {
        t.g(toHorizontalArrangement, "$this$toHorizontalArrangement");
        switch (WhenMappings.$EnumSwitchMapping$0[toHorizontalArrangement.ordinal()]) {
            case 1:
                return c.a.p(f, e.a.k());
            case 2:
                return c.a.p(f, e.a.j());
            case 3:
                return c.a.p(f, e.a.g());
            case 4:
            case 5:
            case 6:
                return c.a.g();
            default:
                throw new o();
        }
    }

    public static final /* synthetic */ c.m toVerticalArrangement-3ABfNKs(FlexDistribution toVerticalArrangement, float f) {
        t.g(toVerticalArrangement, "$this$toVerticalArrangement");
        switch (WhenMappings.$EnumSwitchMapping$0[toVerticalArrangement.ordinal()]) {
            case 1:
                return c.a.q(f, e.a.l());
            case 2:
                return c.a.q(f, e.a.a());
            case 3:
                return c.a.q(f, e.a.i());
            case 4:
            case 5:
            case 6:
                return c.a.h();
            default:
                throw new o();
        }
    }
}
