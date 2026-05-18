package com.revenuecat.purchases.subscriberattributes;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesManager$markAsSynced$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ String $appUserID$inlined;
    final /* synthetic */ Map $attributesToMarkAsSynced$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$markAsSynced$$inlined$log$2(LogIntent logIntent, String str, Map map) {
        super(0);
        this.$intent = logIntent;
        this.$appUserID$inlined = str;
        this.$attributesToMarkAsSynced$inlined = map;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder();
        String format = String.format("Marking the following attributes as synced for App User ID: %s", Arrays.copyOf(new Object[]{this.$appUserID$inlined}, 1));
        t.f(format, "format(...)");
        sb2.append(format);
        sb2.append(D.n0(this.$attributesToMarkAsSynced$inlined.values(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(sb2.toString());
        return sb.toString();
    }
}
