package com.revenuecat.purchases.ui.revenuecatui.composables;

import Qa.a;
import b0.C0;
import kotlin.jvm.internal.u;
import l0.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1 extends u implements a {
    final /* synthetic */ C0 $maxSize$delegate;
    final /* synthetic */ E $viewSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1(E e, C0 c0) {
        super(0);
        this.$viewSizes = e;
        this.$maxSize$delegate = c0;
    }

    public final Integer invoke() {
        int size = this.$viewSizes.size();
        for (int i = 0; i < size; i++) {
            if (((Number) this.$viewSizes.get(i)).intValue() <= AdaptiveComposableKt.access$AdaptiveComposable$lambda$1(this.$maxSize$delegate)) {
                return Integer.valueOf(i);
            }
        }
        return 0;
    }
}
