package com.revenuecat.purchases.common.caching;

import Da.D;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DeviceCache$addSuccessfullyPostedToken$$inlined$log$1 extends u implements a {
    final /* synthetic */ String $hashedToken$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $token$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$addSuccessfullyPostedToken$$inlined$log$1(LogIntent logIntent, String str, String str2) {
        super(0);
        this.$intent = logIntent;
        this.$token$inlined = str;
        this.$hashedToken$inlined = str2;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Saving token %s with hash %s", Arrays.copyOf(new Object[]{this.$token$inlined, this.$hashedToken$inlined}, 2));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
