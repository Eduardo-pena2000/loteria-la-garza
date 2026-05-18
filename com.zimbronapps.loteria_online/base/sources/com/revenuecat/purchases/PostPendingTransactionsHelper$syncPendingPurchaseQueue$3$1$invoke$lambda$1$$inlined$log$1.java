package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ String $hash$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ StoreTransaction $purchase$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1(LogIntent logIntent, StoreTransaction storeTransaction, String str) {
        super(0);
        this.$intent = logIntent;
        this.$purchase$inlined = storeTransaction;
        this.$hash$inlined = str;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Purchase of type %s with hash %s", Arrays.copyOf(new Object[]{this.$purchase$inlined.getType(), this.$hash$inlined}, 2));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
