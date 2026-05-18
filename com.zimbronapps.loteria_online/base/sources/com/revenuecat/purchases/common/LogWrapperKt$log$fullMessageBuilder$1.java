package com.revenuecat.purchases.common;

import Da.D;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LogWrapperKt$log$fullMessageBuilder$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Qa.a $messageBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogWrapperKt$log$fullMessageBuilder$1(LogIntent logIntent, Qa.a aVar) {
        super(0);
        this.$intent = logIntent;
        this.$messageBuilder = aVar;
    }

    public final String invoke() {
        return D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ' ' + ((String) this.$messageBuilder.invoke());
    }
}
