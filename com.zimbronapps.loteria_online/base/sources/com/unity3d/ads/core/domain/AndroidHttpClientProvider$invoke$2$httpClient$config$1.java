package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;

@f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$2$httpClient$config$1", f = "AndroidHttpClientProvider.kt", l = {104}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHttpClientProvider$invoke$2$httpClient$config$1 extends l implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$2$httpClient$config$1(AndroidHttpClientProvider androidHttpClientProvider, e eVar) {
        super(2, eVar);
        this.this$0 = androidHttpClientProvider;
    }

    public final e create(Object obj, e eVar) {
        AndroidHttpClientProvider$invoke$2$httpClient$config$1 androidHttpClientProvider$invoke$2$httpClient$config$1 = new AndroidHttpClientProvider$invoke$2$httpClient$config$1(this.this$0, eVar);
        androidHttpClientProvider$invoke$2$httpClient$config$1.L$0 = obj;
        return androidHttpClientProvider$invoke$2$httpClient$config$1;
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidHttpClientProvider$invoke$2$httpClient$config$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        Object obj2;
        Object f = c.f();
        int i = this.label;
        try {
            if (i == 0) {
                t.b(obj);
                AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
                s.a aVar = s.b;
                ConfigFileFromLocalStorage access$getConfigFileFromLocalStorage$p = AndroidHttpClientProvider.access$getConfigFileFromLocalStorage$p(androidHttpClientProvider);
                ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.label = 1;
                obj2 = access$getConfigFileFromLocalStorage$p.invoke-gIAlu-s(params, this);
                if (obj2 == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                obj2 = ((s) obj).j();
            }
            b = s.b(s.a(obj2));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        if (s.g(b)) {
            b = null;
        }
        s sVar = (s) b;
        if (sVar == null) {
            return null;
        }
        Object j = sVar.j();
        return (Configuration) (s.g(j) ? null : j);
    }
}
