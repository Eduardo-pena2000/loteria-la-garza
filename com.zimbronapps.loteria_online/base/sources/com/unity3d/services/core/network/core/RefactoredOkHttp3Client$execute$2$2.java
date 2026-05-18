package com.unity3d.services.core.network.core;

import Ca.s;
import cb.n;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.network.model.HttpResponse;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RefactoredOkHttp3Client$execute$2$2 implements Callback {
    final /* synthetic */ n $continuation;

    public RefactoredOkHttp3Client$execute$2$2(n nVar) {
        this.$continuation = nVar;
    }

    public void onFailure(Call call, IOException e) {
        t.g(call, "call");
        t.g(e, "e");
        n nVar = this.$continuation;
        s.a aVar = s.b;
        nVar.resumeWith(s.b(Ca.t.a(e)));
    }

    public void onResponse(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
        if (!response.s()) {
            n nVar = this.$continuation;
            s.a aVar = s.b;
            nVar.resumeWith(s.b(Ca.t.a(new UnityAdsNetworkException("Network request failed with code " + response.f(), null, Integer.valueOf(response.f()), null, null, null, "refactored-okhttp", 58, null))));
            return;
        }
        try {
            ResponseBody a = response.a();
            if (a == null) {
                n nVar2 = this.$continuation;
                s.a aVar2 = s.b;
                nVar2.resumeWith(s.b(Ca.t.a(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(response.f()), null, null, null, "refactored-okhttp", 58, null))));
                return;
            }
            n nVar3 = this.$continuation;
            int f = response.f();
            Map g = response.r().g();
            String httpUrl = response.A().j().toString();
            byte[] readByteArray = a.d().readByteArray();
            String protocol = response.y().toString();
            t.f(readByteArray, "readByteArray()");
            t.f(g, "toMultimap()");
            t.f(httpUrl, "toString()");
            t.f(protocol, "toString()");
            nVar3.resumeWith(s.b(new HttpResponse(readByteArray, f, g, httpUrl, protocol, "refactored-okhttp", 0L, 64, null)));
        } catch (Exception e) {
            n nVar4 = this.$continuation;
            s.a aVar3 = s.b;
            nVar4.resumeWith(s.b(Ca.t.a(e)));
        }
    }
}
