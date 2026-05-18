package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template7Kt$Template7PortraitContent$2$1$1 extends u implements l {
    final /* synthetic */ l $onSelectTierChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template7Kt$Template7PortraitContent$2$1$1(l lVar) {
        super(1);
        this.$onSelectTierChange = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TemplateConfiguration.TierInfo) obj);
        return I.a;
    }

    public final void invoke(TemplateConfiguration.TierInfo it) {
        t.g(it, "it");
        this.$onSelectTierChange.invoke(it);
    }
}
