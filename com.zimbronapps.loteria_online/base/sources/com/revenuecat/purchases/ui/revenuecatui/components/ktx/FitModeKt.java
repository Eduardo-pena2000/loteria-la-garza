package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Ca.o;
import M0.f;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class FitModeKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FitMode.values().length];
            try {
                iArr[FitMode.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FitMode.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ f toContentScale(FitMode fitMode) {
        t.g(fitMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[fitMode.ordinal()];
        if (i == 1) {
            return f.a.b();
        }
        if (i == 2) {
            return f.a.a();
        }
        throw new o();
    }
}
