package com.revenuecat.purchases.ui.revenuecatui.extensions;

import C.q;
import Ca.o;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class OverflowExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackComponent.Overflow.values().length];
            try {
                iArr[StackComponent.Overflow.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackComponent.Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ q toOrientation(StackComponent.Overflow overflow, Dimension dimension) {
        t.g(overflow, "<this>");
        t.g(dimension, "dimension");
        int i = WhenMappings.$EnumSwitchMapping$0[overflow.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new o();
        }
        if (dimension instanceof Dimension.Horizontal) {
            return q.b;
        }
        if (dimension instanceof Dimension.Vertical) {
            return q.a;
        }
        if (dimension instanceof Dimension.ZLayer) {
            return null;
        }
        throw new o();
    }
}
