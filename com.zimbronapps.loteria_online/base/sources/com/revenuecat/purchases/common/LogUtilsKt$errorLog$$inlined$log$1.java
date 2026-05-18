package com.revenuecat.purchases.common;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LogUtilsKt$errorLog$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogUtilsKt$errorLog$$inlined$log$1(LogIntent logIntent, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = purchasesError;
    }

    public final String invoke() {
        return D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ' ' + this.$error$inlined.toString();
    }
}
