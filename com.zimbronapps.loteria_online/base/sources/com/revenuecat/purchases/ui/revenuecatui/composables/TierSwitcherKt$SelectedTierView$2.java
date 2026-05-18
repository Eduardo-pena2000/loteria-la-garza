package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TierSwitcherKt$SelectedTierView$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundSelectedColor;
    final /* synthetic */ long $foregroundSelectedColor;
    final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TierSwitcherKt$SelectedTierView$2(TemplateConfiguration.TierInfo tierInfo, long j, long j2, int i) {
        super(2);
        this.$selectedTier = tierInfo;
        this.$backgroundSelectedColor = j;
        this.$foregroundSelectedColor = j2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        TierSwitcherKt.SelectedTierView-1wkBAMs(this.$selectedTier, this.$backgroundSelectedColor, this.$foregroundSelectedColor, mVar, g1.a(this.$$changed | 1));
    }
}
