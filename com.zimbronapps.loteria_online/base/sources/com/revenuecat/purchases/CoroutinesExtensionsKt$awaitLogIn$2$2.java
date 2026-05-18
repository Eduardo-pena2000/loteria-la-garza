package com.revenuecat.purchases;

import Ca.I;
import Ca.s;
import Qa.p;
import com.revenuecat.purchases.data.LogInResult;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsKt$awaitLogIn$2$2 extends u implements p {
    final /* synthetic */ Ga.e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$awaitLogIn$2$2(Ga.e eVar) {
        super(2);
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
        return I.a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z) {
        t.g(customerInfo, "customerInfo");
        Ga.e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(new LogInResult(customerInfo, z)));
    }
}
