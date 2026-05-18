package com.revenuecat.purchases.subscriberattributes.caching;

import Da.D;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 extends u implements a {
    final /* synthetic */ String $appUserID$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Map $unsyncedAttributesByKey$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(LogIntent logIntent, Map map, String str) {
        super(0);
        this.$intent = logIntent;
        this.$unsyncedAttributesByKey$inlined = map;
        this.$appUserID$inlined = str;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder();
        String format = String.format("Found %d unsynced attributes for App User ID: %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.$unsyncedAttributesByKey$inlined.size()), this.$appUserID$inlined}, 2));
        t.f(format, "format(...)");
        sb2.append(format);
        sb2.append(!this.$unsyncedAttributesByKey$inlined.isEmpty() ? D.n0(this.$unsyncedAttributesByKey$inlined.values(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) : "");
        sb.append(sb2.toString());
        return sb.toString();
    }
}
