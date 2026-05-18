package com.revenuecat.purchases.identity;

import Ca.I;
import Ca.s;
import Ga.e;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class IdentityManager$aliasCurrentUserIdTo$2$2 extends u implements l {
    final /* synthetic */ e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$aliasCurrentUserIdTo$2$2(e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Ca.t.a(new PurchasesException(purchasesError))));
    }
}
