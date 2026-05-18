package com.revenuecat.purchases.google;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$withConnectedClient$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$withConnectedClient$$inlined$log$1(LogIntent logIntent, BillingWrapper billingWrapper) {
        super(0);
        this.$intent = logIntent;
        this.this$0 = billingWrapper;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Billing is disconnected and purchase methods won't work. Stacktrace: %s", Arrays.copyOf(new Object[]{BillingWrapper.access$getStackTrace(this.this$0)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
