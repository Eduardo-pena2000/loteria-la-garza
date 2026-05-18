package com.revenuecat.purchases.google;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$consumeAndSave$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$consumeAndSave$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    public final String invoke() {
        return D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + " Not consuming in-app purchase according to server configuration. This is expected for non-consumable products. The user won't be able to purchase this product again.";
    }
}
