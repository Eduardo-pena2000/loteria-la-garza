package com.revenuecat.purchases.common.caching;

import Da.D;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DateExtensionsKt$isCacheStale$lambda$1$$inlined$log$1 extends u implements a {
    final /* synthetic */ boolean $appInBackground$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateExtensionsKt$isCacheStale$lambda$1$$inlined$log$1(LogIntent logIntent, boolean z) {
        super(0);
        this.$intent = logIntent;
        this.$appInBackground$inlined = z;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Checking if cache is stale AppInBackground %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.$appInBackground$inlined)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
