package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.content.Context;
import cb.O;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.RefactoredOkHttp3Client;
import okhttp3.OkHttpClient;

@f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$2$httpClient$client$1", f = "AndroidHttpClientProvider.kt", l = {83}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHttpClientProvider$invoke$2$httpClient$client$1 extends l implements p {
    final /* synthetic */ boolean $usingRefactoredGatewayClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$2$httpClient$client$1(boolean z, AndroidHttpClientProvider androidHttpClientProvider, e eVar) {
        super(2, eVar);
        this.$usingRefactoredGatewayClient = z;
        this.this$0 = androidHttpClientProvider;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidHttpClientProvider$invoke$2$httpClient$client$1(this.$usingRefactoredGatewayClient, this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidHttpClientProvider$invoke$2$httpClient$client$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            if (this.$usingRefactoredGatewayClient) {
                return new RefactoredOkHttp3Client(AndroidHttpClientProvider.access$getDispatchers$p(this.this$0), new OkHttpClient());
            }
            AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            Context access$getContext$p = AndroidHttpClientProvider.access$getContext$p(androidHttpClientProvider);
            ISDKDispatchers access$getDispatchers$p = AndroidHttpClientProvider.access$getDispatchers$p(this.this$0);
            this.label = 1;
            obj = AndroidHttpClientProvider.access$buildNetworkClient(androidHttpClientProvider, access$getContext$p, access$getDispatchers$p, this);
            if (obj == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return (HttpClient) obj;
    }
}
