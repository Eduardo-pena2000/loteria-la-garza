package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import androidx.compose.ui.graphics.d;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentViewKt$IconComponentView$colorFilter$2$1 extends u implements a {
    final /* synthetic */ ColorStyle $tintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentViewKt$IconComponentView$colorFilter$2$1(ColorStyle colorStyle) {
        super(0);
        this.$tintColor = colorStyle;
    }

    public final d invoke() {
        ColorStyle colorStyle = this.$tintColor;
        ColorStyle.Solid solid = colorStyle instanceof ColorStyle.Solid ? (ColorStyle.Solid) colorStyle : null;
        if (solid != null) {
            return d.a.b(d.b, solid.unbox-impl(), 0, 2, (Object) null);
        }
        return null;
    }
}
