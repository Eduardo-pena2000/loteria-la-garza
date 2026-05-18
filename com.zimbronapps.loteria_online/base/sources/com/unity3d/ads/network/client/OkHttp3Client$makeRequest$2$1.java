package com.unity3d.ads.network.client;

import Ca.s;
import cb.n;
import java.io.IOException;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client$makeRequest$2$1 implements Callback {
    final /* synthetic */ n $continuation;

    public OkHttp3Client$makeRequest$2$1(n nVar) {
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
        this.$continuation.resumeWith(s.b(response));
    }
}
