package com.revenuecat.purchases.common.caching;

import Da.D;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DeviceCache$cleanPreviouslySentTokens$$inlined$log$1 extends u implements a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$cleanPreviouslySentTokens$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    public final String invoke() {
        return D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + " Cleaning previously sent tokens";
    }
}
