package com.revenuecat.purchases.subscriberattributes.caching;

import Da.D;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1 extends u implements a {
    final /* synthetic */ String $currentAppUserID$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1(LogIntent logIntent, String str) {
        super(0);
        this.$intent = logIntent;
        this.$currentAppUserID$inlined = str;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Deleting old synced subscriber attributes that don't belong to %s", Arrays.copyOf(new Object[]{this.$currentAppUserID$inlined}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
