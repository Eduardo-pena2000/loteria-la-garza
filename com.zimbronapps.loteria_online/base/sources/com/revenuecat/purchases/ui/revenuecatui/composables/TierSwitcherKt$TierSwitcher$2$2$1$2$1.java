package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TierSwitcherKt$TierSwitcher$2$2$1$2$1 extends u implements a {
    final /* synthetic */ l $onTierSelected;
    final /* synthetic */ TemplateConfiguration.TierInfo $tier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TierSwitcherKt$TierSwitcher$2$2$1$2$1(l lVar, TemplateConfiguration.TierInfo tierInfo) {
        super(0);
        this.$onTierSelected = lVar;
        this.$tier = tierInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onTierSelected.invoke(this.$tier);
    }
}
