package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.revenuecat.purchases.Offerings;

@f(c = "com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt$mapAsync$1$map$1", f = "OfferingsMapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsMapperKt$mapAsync$1$map$1 extends l implements p {
    final /* synthetic */ Offerings $this_mapAsync;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsMapperKt$mapAsync$1$map$1(Offerings offerings, e eVar) {
        super(2, eVar);
        this.$this_mapAsync = offerings;
    }

    public final e create(Object obj, e eVar) {
        return new OfferingsMapperKt$mapAsync$1$map$1(this.$this_mapAsync, eVar);
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
        return OfferingsMapperKt.access$map(this.$this_mapAsync);
    }
}
