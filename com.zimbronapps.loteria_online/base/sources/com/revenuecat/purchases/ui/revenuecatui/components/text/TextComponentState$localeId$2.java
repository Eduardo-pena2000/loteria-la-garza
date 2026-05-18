package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import h1.d;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$localeId$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$localeId$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return LocaleId.box-impl(invoke-uqtKvyA());
    }

    public final String invoke-uqtKvyA() {
        return LocalizationKt.toLocaleId((d) TextComponentState.access$getLocaleProvider$p(this.this$0).invoke());
    }
}
