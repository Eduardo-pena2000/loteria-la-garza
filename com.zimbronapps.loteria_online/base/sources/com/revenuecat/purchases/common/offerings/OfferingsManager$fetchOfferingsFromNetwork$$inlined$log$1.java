package com.revenuecat.purchases.common.offerings;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ DiagnosticsTracker.CacheStatus $cacheStatus$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(LogIntent logIntent, DiagnosticsTracker.CacheStatus cacheStatus) {
        super(0);
        this.$intent = logIntent;
        this.$cacheStatus$inlined = cacheStatus;
    }

    public final String invoke() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        int i = OfferingsManager.WhenMappings.$EnumSwitchMapping$0[this.$cacheStatus$inlined.ordinal()];
        if (i == 1) {
            str = "Latest Offerings requested, fetching from network";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected cache status for fetch: " + this.$cacheStatus$inlined);
            }
            str = "No cached Offerings, fetching from network";
        }
        sb.append(str);
        return sb.toString();
    }
}
