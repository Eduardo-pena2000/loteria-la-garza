package com.revenuecat.purchases.common;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.networking.Endpoint;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ Endpoint $endpoint$inlined;
    final /* synthetic */ URL $fallbackBaseURL$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1(LogIntent logIntent, Endpoint endpoint, URL url) {
        super(0);
        this.$intent = logIntent;
        this.$endpoint$inlined = endpoint;
        this.$fallbackBaseURL$inlined = url;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Retrying request %s using fallback URL %s", Arrays.copyOf(new Object[]{this.$endpoint$inlined.getPath(true), this.$fallbackBaseURL$inlined}, 2));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
