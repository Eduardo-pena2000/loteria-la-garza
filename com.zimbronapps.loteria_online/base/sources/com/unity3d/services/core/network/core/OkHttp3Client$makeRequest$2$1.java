package com.unity3d.services.core.network.core;

import Ca.s;
import Ya.o;
import Ya.r;
import Za.E;
import cb.B0;
import cb.n;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.model.HttpRequest;
import fb.P;
import fb.g;
import fb.z;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xb.e;
import xb.f;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client$makeRequest$2$1 implements Callback {
    final /* synthetic */ n $continuation;
    final /* synthetic */ File $file;
    final /* synthetic */ HttpRequest $request;
    final /* synthetic */ OkHttp3Client this$0;

    public OkHttp3Client$makeRequest$2$1(n nVar, OkHttp3Client okHttp3Client, File file, HttpRequest httpRequest) {
        this.$continuation = nVar;
        this.this$0 = okHttp3Client;
        this.$file = file;
        this.$request = httpRequest;
    }

    public void onFailure(Call call, IOException e) {
        t.g(call, "call");
        t.g(e, "e");
        n nVar = this.$continuation;
        s.a aVar = s.b;
        nVar.resumeWith(s.b(Ca.t.a(e)));
    }

    public void onResponse(Call call, Response response) {
        f fVar;
        e buffer;
        fb.e l;
        fb.e C;
        t.g(call, "call");
        t.g(response, "response");
        if (!response.s()) {
            n nVar = this.$continuation;
            s.a aVar = s.b;
            nVar.resumeWith(s.b(Ca.t.a(new IOException("Network request failed with code " + response.f()))));
            return;
        }
        try {
            ResponseBody a = response.a();
            if (a == null) {
                n nVar2 = this.$continuation;
                s.a aVar2 = s.b;
                nVar2.resumeWith(s.b(new OkHttp3Client.RequestComplete(response, null, 2, null)));
                return;
            }
            long b = a.b();
            e eVar = new e();
            String k = response.k("Cache-Control");
            boolean z = false;
            if (k != null && !E.T(k, "no-cache", false, 2, null)) {
                z = true;
            }
            if ((z ? this : null) != null) {
                File file = this.$file;
                if (!file.exists()) {
                    file.createNewFile();
                }
                fVar = x.c(x.a(file));
            } else {
                fVar = null;
            }
            long j = 0;
            z a2 = fVar != null ? P.a(0L) : null;
            B0 z2 = (a2 == null || (l = g.l(a2, 1000L)) == null || (C = g.C(new OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1(new OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1(l), b), new OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3(this.$request, null))) == null) ? null : g.z(C, cb.P.a(OkHttp3Client.access$getDispatchers$p(this.this$0).getIo()));
            xb.g d = a.d();
            if (fVar == null || (buffer = fVar.buffer()) == null) {
                buffer = eVar.buffer();
            }
            Iterator it = r.E(o.h(new OkHttp3Client$makeRequest$2$1$onResponse$1(d, buffer)), OkHttp3Client$makeRequest$2$1$onResponse$2.INSTANCE).iterator();
            while (it.hasNext()) {
                j += ((Number) it.next()).longValue();
                if (fVar != null) {
                    fVar.emitCompleteSegments();
                }
                if (a2 != null) {
                    a2.b(Long.valueOf(j));
                }
            }
            eVar.close();
            if (fVar != null) {
                fVar.close();
            }
            if (z2 != null) {
                B0.a.b(z2, null, 1, null);
            }
            d.close();
            a.close();
            buffer.close();
            Object readByteArray = fVar != null ? this.$file : eVar.readByteArray();
            n nVar3 = this.$continuation;
            s.a aVar3 = s.b;
            nVar3.resumeWith(s.b(new OkHttp3Client.RequestComplete(response, readByteArray)));
        } catch (IOException e) {
            n nVar4 = this.$continuation;
            s.a aVar4 = s.b;
            nVar4.resumeWith(s.b(Ca.t.a(e)));
        }
    }
}
