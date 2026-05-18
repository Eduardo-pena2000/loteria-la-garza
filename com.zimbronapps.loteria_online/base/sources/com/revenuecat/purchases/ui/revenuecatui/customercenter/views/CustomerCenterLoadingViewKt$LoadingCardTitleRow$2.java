package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.p;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterLoadingViewKt$LoadingCardTitleRow$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Fade $fadeHighlight;
    final /* synthetic */ long $placeholderColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterLoadingViewKt$LoadingCardTitleRow$2(long j, Fade fade, int i) {
        super(2);
        this.$placeholderColor = j;
        this.$fadeHighlight = fade;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        CustomerCenterLoadingViewKt.access$LoadingCardTitleRow-Iv8Zu3U(this.$placeholderColor, this.$fadeHighlight, mVar, g1.a(this.$$changed | 1));
    }
}
