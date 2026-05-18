package com.revenuecat.purchases.blockstore;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;

@f(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1", f = "BlockstoreHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1 extends l implements p {
    final /* synthetic */ Qa.a $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1(Qa.a aVar, e eVar) {
        super(2, eVar);
        this.$callback = aVar;
    }

    public final e create(Object obj, e eVar) {
        return new BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1(this.$callback, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return create(o, eVar).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        this.$callback.invoke();
        return I.a;
    }
}
