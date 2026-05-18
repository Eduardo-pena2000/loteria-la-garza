package com.revenuecat.purchases.ui.revenuecatui.components.text;

import F.L;
import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$padding$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$padding$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final L invoke() {
        PartialTextComponent partial;
        Padding padding;
        L paddingValues;
        LocalizedTextPartial access$getPresentedPartial = TextComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (padding = partial.getPadding()) == null || (paddingValues = PaddingKt.toPaddingValues(padding)) == null) ? TextComponentState.access$getStyle$p(this.this$0).getPadding() : paddingValues;
    }
}
