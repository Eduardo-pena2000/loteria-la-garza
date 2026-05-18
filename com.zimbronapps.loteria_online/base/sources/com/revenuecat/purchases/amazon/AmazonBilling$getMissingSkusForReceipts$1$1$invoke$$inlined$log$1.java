package com.revenuecat.purchases.amazon;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ JSONObject $response$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1(LogIntent logIntent, JSONObject jSONObject) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = jSONObject;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Received receipt data: \n %s", Arrays.copyOf(new Object[]{this.$response$inlined.toString()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
