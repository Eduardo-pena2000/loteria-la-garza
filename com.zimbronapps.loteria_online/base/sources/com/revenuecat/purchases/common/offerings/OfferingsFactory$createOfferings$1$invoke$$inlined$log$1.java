package com.revenuecat.purchases.common.offerings;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsFactory$createOfferings$1$invoke$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ Exception $error$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$createOfferings$1$invoke$$inlined$log$1(LogIntent logIntent, Exception exc) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = exc;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("JSONException when building Offerings object. Message: %s", Arrays.copyOf(new Object[]{this.$error$inlined.getLocalizedMessage()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
