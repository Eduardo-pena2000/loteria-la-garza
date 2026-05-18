package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentState$iconBackground$2 extends u implements a {
    final /* synthetic */ IconComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentState$iconBackground$2(IconComponentState iconComponentState) {
        super(0);
        this.this$0 = iconComponentState;
    }

    public final IconComponentStyle.Background invoke() {
        IconComponentStyle.Background background;
        PresentedIconPartial access$getPresentedPartial = IconComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (background = access$getPresentedPartial.getBackground()) == null) ? IconComponentState.access$getStyle$p(this.this$0).getIconBackground() : background;
    }
}
