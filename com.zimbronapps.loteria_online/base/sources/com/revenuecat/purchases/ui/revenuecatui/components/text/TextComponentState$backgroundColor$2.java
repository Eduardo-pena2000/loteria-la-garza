package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$backgroundColor$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$backgroundColor$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final ColorStyles invoke() {
        ColorStyles backgroundColor;
        LocalizedTextPartial access$getPresentedPartial = TextComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (backgroundColor = access$getPresentedPartial.getBackgroundColor()) == null) ? TextComponentState.access$getStyle$p(this.this$0).getBackgroundColor() : backgroundColor;
    }
}
