package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import M0.p;
import Qa.l;
import b0.C0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdaptiveComposableKt$AdaptiveComposable$1$1 extends u implements l {
    final /* synthetic */ C0 $maxSize$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveComposableKt$AdaptiveComposable$1$1(C0 c0) {
        super(1);
        this.$maxSize$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((p) obj);
        return I.a;
    }

    public final void invoke(p coordinates) {
        t.g(coordinates, "coordinates");
        if (r.g(coordinates.a()) != AdaptiveComposableKt.access$AdaptiveComposable$lambda$1(this.$maxSize$delegate)) {
            AdaptiveComposableKt.access$AdaptiveComposable$lambda$2(this.$maxSize$delegate, r.g(coordinates.a()));
        }
    }
}
