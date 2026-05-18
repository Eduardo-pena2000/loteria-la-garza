package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FontKt;
import d1.L;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$fontWeight$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$fontWeight$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final L invoke() {
        PartialTextComponent partial;
        L fontWeight;
        LocalizedTextPartial access$getPresentedPartial = TextComponentState.access$getPresentedPartial(this.this$0);
        if (access$getPresentedPartial != null && (partial = access$getPresentedPartial.getPartial()) != null) {
            Integer fontWeightInt = partial.getFontWeightInt();
            if (fontWeightInt != null) {
                fontWeight = new L(fontWeightInt.intValue());
            } else {
                FontWeight fontWeight2 = partial.getFontWeight();
                fontWeight = fontWeight2 != null ? FontKt.toFontWeight(fontWeight2) : null;
            }
            if (fontWeight != null) {
                return fontWeight;
            }
        }
        return TextComponentState.access$getStyle$p(this.this$0).getFontWeight();
    }
}
