package com.revenuecat.purchases;

import Ca.I;
import Ca.s;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1 extends u implements Qa.l {
    final /* synthetic */ Ga.e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1(Ga.e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.a;
    }

    public final void invoke(boolean z) {
        Ga.e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(new CreateSupportTicketResult(z)));
    }
}
