package com.revenuecat.purchases.google.usecase;

import Da.D;
import Qa.l;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ BillingResult $result$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1(LogIntent logIntent, BillingResult billingResult) {
        super(0);
        this.$intent = logIntent;
        this.$result$inlined = billingResult;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("BillingClient getBillingConfigAsync has returned more than once, with result: %s.", Arrays.copyOf(new Object[]{Integer.valueOf(this.$result$inlined.getResponseCode())}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
