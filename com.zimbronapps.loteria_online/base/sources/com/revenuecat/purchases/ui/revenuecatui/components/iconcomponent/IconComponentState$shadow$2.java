package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentState$shadow$2 extends u implements a {
    final /* synthetic */ IconComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentState$shadow$2(IconComponentState iconComponentState) {
        super(0);
        this.this$0 = iconComponentState;
    }

    public final ShadowStyles invoke() {
        IconComponentStyle.Background access$getIconBackground = IconComponentState.access$getIconBackground(this.this$0);
        if (access$getIconBackground != null) {
            return access$getIconBackground.getShadow();
        }
        return null;
    }
}
