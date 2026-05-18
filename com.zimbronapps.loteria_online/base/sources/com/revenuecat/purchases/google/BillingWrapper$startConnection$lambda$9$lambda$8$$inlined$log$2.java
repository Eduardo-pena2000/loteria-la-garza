package com.revenuecat.purchases.google;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ IllegalStateException $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2(LogIntent logIntent, IllegalStateException illegalStateException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = illegalStateException;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("There was an IllegalStateException when connecting to BillingClient. This has been reported to occur on Samsung devices in unknown circumstances.\nException: %s", Arrays.copyOf(new Object[]{this.$e$inlined}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
