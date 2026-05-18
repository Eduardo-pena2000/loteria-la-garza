package com.unity3d.services.core.network.core;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;

@f(c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3", f = "OkHttp3Client.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 extends l implements p {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3(HttpRequest httpRequest, e eVar) {
        super(2, eVar);
        this.$request = httpRequest;
    }

    public final e create(Object obj, e eVar) {
        OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 = new OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3(this.$request, eVar);
        okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3.I$0 = ((Number) obj).intValue();
        return okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3;
    }

    public final Object invoke(int i, e eVar) {
        return ((OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3) create(Integer.valueOf(i), eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        DeviceLog.debug("Downloaded " + this.I$0 + "% of " + this.$request.getBaseURL());
        return I.a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (e) obj2);
    }
}
