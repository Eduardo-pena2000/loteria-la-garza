package com.revenuecat.purchases.common.offerings;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Set $missingProducts$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1(LogIntent logIntent, Set set) {
        super(0);
        this.$intent = logIntent;
        this.$missingProducts$inlined = set;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Could not find ProductDetails for %s \nThere is a problem with your configuration in Play Store Developer Console. More info here: https://errors.rev.cat/configuring-products", Arrays.copyOf(new Object[]{D.n0(this.$missingProducts$inlined, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
