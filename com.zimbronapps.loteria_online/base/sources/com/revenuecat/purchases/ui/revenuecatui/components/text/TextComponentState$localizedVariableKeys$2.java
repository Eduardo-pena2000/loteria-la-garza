package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$localizedVariableKeys$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$localizedVariableKeys$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final NonEmptyMap invoke() {
        NonEmptyMap variableLocalizations = TextComponentState.access$getStyle$p(this.this$0).getVariableLocalizations();
        NonEmptyMap nonEmptyMap = (NonEmptyMap) LocalizationKt.getBestMatch-64pKzr8(variableLocalizations, TextComponentState.access$getLocaleId-uqtKvyA(this.this$0));
        return nonEmptyMap == null ? (NonEmptyMap) variableLocalizations.getEntry().getValue() : nonEmptyMap;
    }
}
