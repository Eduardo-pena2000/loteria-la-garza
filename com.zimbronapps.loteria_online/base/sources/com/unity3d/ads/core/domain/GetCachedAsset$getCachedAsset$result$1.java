package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.ads.core.data.repository.CacheRepository;

@f(c = "com.unity3d.ads.core.domain.GetCachedAsset$getCachedAsset$result$1", f = "GetCachedAsset.kt", l = {39}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetCachedAsset$getCachedAsset$result$1 extends l implements p {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, e eVar) {
        super(2, eVar);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    public final e create(Object obj, e eVar) {
        return new GetCachedAsset$getCachedAsset$result$1(this.this$0, this.$fileName, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((GetCachedAsset$getCachedAsset$result$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            CacheRepository access$getCacheRepository$p = GetCachedAsset.access$getCacheRepository$p(this.this$0);
            String str = this.$fileName;
            this.label = 1;
            obj = access$getCacheRepository$p.retrieveFile(str, this);
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
