package com.unity3d.services;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;

@f(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {170}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends l implements p {
    final /* synthetic */ Ca.l $getHeaderBiddingToken$delegate;
    final /* synthetic */ Ca.l $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$token$1(Ca.l lVar, Ca.l lVar2, e eVar) {
        super(2, eVar);
        this.$getHeaderBiddingToken$delegate = lVar;
        this.$tokenNumberProvider$delegate = lVar2;
    }

    public final e create(Object obj, e eVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            GetHeaderBiddingToken access$fetchToken$lambda$10 = UnityAdsSDK.access$fetchToken$lambda$10(this.$getHeaderBiddingToken$delegate);
            int invoke = UnityAdsSDK.access$fetchToken$lambda$9(this.$tokenNumberProvider$delegate).invoke();
            this.label = 1;
            obj = GetHeaderBiddingToken.DefaultImpls.invoke$default(access$fetchToken$lambda$10, invoke, null, this, 2, null);
            if (obj == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return obj;
    }
}
