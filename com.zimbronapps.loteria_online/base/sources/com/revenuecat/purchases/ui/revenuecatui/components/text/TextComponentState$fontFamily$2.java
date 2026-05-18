package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpecKt;
import d1.H;
import d1.L;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$fontFamily$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$fontFamily$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final d1.u invoke() {
        FontSpec access$getFontSpec = TextComponentState.access$getFontSpec(this.this$0);
        if (access$getFontSpec == null) {
            return null;
        }
        L fontWeight = this.this$0.getFontWeight();
        if (fontWeight == null) {
            fontWeight = L.b.g();
        }
        return FontSpecKt.resolve-RetOiIg(access$getFontSpec, fontWeight, H.b.b());
    }
}
