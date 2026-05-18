package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import Qa.p;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TierSwitcherKt$TierSwitcher$3 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $backgroundSelectedColor;
    final /* synthetic */ long $foregroundColor;
    final /* synthetic */ long $foregroundSelectedColor;
    final /* synthetic */ l $onTierSelected;
    final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
    final /* synthetic */ List $tiers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TierSwitcherKt$TierSwitcher$3(List list, TemplateConfiguration.TierInfo tierInfo, l lVar, long j, long j2, long j3, long j4, int i) {
        super(2);
        this.$tiers = list;
        this.$selectedTier = tierInfo;
        this.$onTierSelected = lVar;
        this.$backgroundColor = j;
        this.$backgroundSelectedColor = j2;
        this.$foregroundColor = j3;
        this.$foregroundSelectedColor = j4;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        TierSwitcherKt.TierSwitcher-UFBoNtE(this.$tiers, this.$selectedTier, this.$onTierSelected, this.$backgroundColor, this.$backgroundSelectedColor, this.$foregroundColor, this.$foregroundSelectedColor, mVar, g1.a(this.$$changed | 1));
    }
}
