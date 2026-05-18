package com.revenuecat.purchases.common.offerings;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ boolean $appInBackground$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2(LogIntent logIntent, boolean z) {
        super(0);
        this.$intent = logIntent;
        this.$appInBackground$inlined = z;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        sb.append(this.$appInBackground$inlined ? "Offerings cache is stale, updating from network in background" : "Offerings cache is stale, updating from network in foreground");
        return sb.toString();
    }
}
