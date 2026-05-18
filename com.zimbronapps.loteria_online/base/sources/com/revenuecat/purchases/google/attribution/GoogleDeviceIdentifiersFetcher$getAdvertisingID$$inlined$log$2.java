package com.revenuecat.purchases.google.attribution;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v6.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ i $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2(LogIntent logIntent, i iVar) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = iVar;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("GooglePlayServices is not installed. Couldn't get advertising identifier. Message: %s", Arrays.copyOf(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
