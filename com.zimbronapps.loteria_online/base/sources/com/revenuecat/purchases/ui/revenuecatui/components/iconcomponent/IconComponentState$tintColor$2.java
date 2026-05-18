package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentState$tintColor$2 extends u implements a {
    final /* synthetic */ IconComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentState$tintColor$2(IconComponentState iconComponentState) {
        super(0);
        this.this$0 = iconComponentState;
    }

    public final ColorStyles invoke() {
        ColorStyles colorStyles;
        PresentedIconPartial access$getPresentedPartial = IconComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (colorStyles = access$getPresentedPartial.getColorStyles()) == null) ? IconComponentState.access$getStyle$p(this.this$0).getColor() : colorStyles;
    }
}
