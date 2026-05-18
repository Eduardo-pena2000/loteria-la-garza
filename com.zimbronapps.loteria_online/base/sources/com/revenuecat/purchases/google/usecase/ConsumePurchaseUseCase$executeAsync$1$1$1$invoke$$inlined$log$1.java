package com.revenuecat.purchases.google.usecase;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $underlyingErrorMessage$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1(LogIntent logIntent, String str) {
        super(0);
        this.$intent = logIntent;
        this.$underlyingErrorMessage$inlined = str;
    }

    public final String invoke() {
        return D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ' ' + this.$underlyingErrorMessage$inlined;
    }
}
