package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$text$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$text$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final String invoke() {
        NonEmptyMap texts;
        String str;
        LocalizedTextPartial access$getPresentedPartial = TextComponentState.access$getPresentedPartial(this.this$0);
        if (access$getPresentedPartial != null && (texts = access$getPresentedPartial.getTexts()) != null && (str = (String) texts.getOrDefault(LocaleId.box-impl(TextComponentState.access$getLocaleId-uqtKvyA(this.this$0)), texts.getEntry().getValue())) != null) {
            return str;
        }
        NonEmptyMap texts2 = TextComponentState.access$getStyle$p(this.this$0).getTexts();
        return (String) texts2.getOrDefault(LocaleId.box-impl(TextComponentState.access$getLocaleId-uqtKvyA(this.this$0)), texts2.getEntry().getValue());
    }
}
