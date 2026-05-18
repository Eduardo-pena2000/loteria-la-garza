package com.revenuecat.purchases.subscriberattributes;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesManager$markAsSynced$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ List $attributeErrors$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$markAsSynced$$inlined$log$1(LogIntent logIntent, List list) {
        super(0);
        this.$intent = logIntent;
        this.$attributeErrors$inlined = list;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("There were some subscriber attributes errors: %s", Arrays.copyOf(new Object[]{this.$attributeErrors$inlined}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
