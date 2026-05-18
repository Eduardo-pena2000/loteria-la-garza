package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$size$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$size$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final Size invoke() {
        PartialTextComponent partial;
        Size size;
        LocalizedTextPartial access$getPresentedPartial = TextComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (size = partial.getSize()) == null) ? TextComponentState.access$getStyle$p(this.this$0).getSize() : size;
    }
}
