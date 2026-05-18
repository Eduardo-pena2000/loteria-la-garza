package com.revenuecat.purchases.google;

import Da.D;
import Qa.l;
import com.android.billingclient.api.BillingClient;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ BillingClient $it$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1(LogIntent logIntent, BillingClient billingClient) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = billingClient;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Ending connection for %s", Arrays.copyOf(new Object[]{this.$it$inlined}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
