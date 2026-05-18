package com.revenuecat.purchases.google.usecase;

import Da.D;
import Qa.l;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Purchase $it$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1(LogIntent logIntent, Purchase purchase) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = purchase;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        t.f(this.$it$inlined, "it");
        String format = String.format("Purchase history retrieved %s", Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(this.$it$inlined)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
