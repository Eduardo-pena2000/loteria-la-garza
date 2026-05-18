package com.unity3d.ads.core.domain;

import Ca.s;
import Ca.x;
import Da.Q;
import android.content.Context;
import cb.n;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import kotlin.jvm.internal.t;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHttpClientProvider$buildNetworkClient$2$1 implements OnCompleteListener {
    final /* synthetic */ Context $context;
    final /* synthetic */ n $continuation;
    final /* synthetic */ ISDKDispatchers $dispatchers;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    public AndroidHttpClientProvider$buildNetworkClient$2$1(AndroidHttpClientProvider androidHttpClientProvider, Context context, n nVar, ISDKDispatchers iSDKDispatchers) {
        this.this$0 = androidHttpClientProvider;
        this.$context = context;
        this.$continuation = nVar;
        this.$dispatchers = iSDKDispatchers;
    }

    public final void onComplete(Task it) {
        String str;
        String message;
        long j;
        t.g(it, "it");
        str = "Errored without message.";
        if (!it.isSuccessful()) {
            SendDiagnosticEvent access$getSendDiagnosticEvent$p = AndroidHttpClientProvider.access$getSendDiagnosticEvent$p(this.this$0);
            Exception exception = it.getException();
            if (exception != null && (message = exception.getMessage()) != null) {
                str = message;
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(access$getSendDiagnosticEvent$p, "native_cronet_install_error", null, Q.f(x.a("reason", str)), null, null, null, 58, null);
            n nVar = this.$continuation;
            s.a aVar = s.b;
            nVar.resumeWith(s.b(new OkHttp3Client(this.$dispatchers, new OkHttpClient(), this.$context, AndroidHttpClientProvider.access$getSessionRepository$p(this.this$0), AndroidHttpClientProvider.access$getCleanupDirectory$p(this.this$0), AndroidHttpClientProvider.access$getAlternativeFlowReader$p(this.this$0))));
            return;
        }
        if (AndroidHttpClientProvider.access$getSessionRepository$p(this.this$0).getNativeConfiguration().hasCachedAssetsConfiguration()) {
            long j2 = 1024;
            j = AndroidHttpClientProvider.access$getSessionRepository$p(this.this$0).getNativeConfiguration().getCachedAssetsConfiguration().getMaxCachedAssetSizeMb() * j2 * j2;
        } else {
            j = 20971520;
        }
        try {
            CronetEngine cronetEngine = AndroidHttpClientProvider.access$getCronetEngineBuilderFactory$p(this.this$0).createCronetEngineBuilder(this.$context).setStoragePath(AndroidHttpClientProvider.access$buildCronetCachePath(this.this$0, this.$context)).enableHttpCache(3, j).enableQuic(true).addQuicHint("gateway.unityads.unity3d.com", 443, 443).addQuicHint("cdn-creatives-cf-prd.acquire.unity3dusercontent.com", 443, 443).build();
            n nVar2 = this.$continuation;
            s.a aVar2 = s.b;
            t.f(cronetEngine, "cronetEngine");
            nVar2.resumeWith(s.b(new CronetClient(cronetEngine, this.$dispatchers)));
        } catch (Throwable th) {
            SendDiagnosticEvent access$getSendDiagnosticEvent$p2 = AndroidHttpClientProvider.access$getSendDiagnosticEvent$p(this.this$0);
            String message2 = th.getMessage();
            SendDiagnosticEvent.DefaultImpls.invoke$default(access$getSendDiagnosticEvent$p2, "native_cronet_engine_error", null, Q.f(x.a("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
            n nVar3 = this.$continuation;
            s.a aVar3 = s.b;
            nVar3.resumeWith(s.b(new OkHttp3Client(this.$dispatchers, new OkHttpClient(), this.$context, AndroidHttpClientProvider.access$getSessionRepository$p(this.this$0), AndroidHttpClientProvider.access$getCleanupDirectory$p(this.this$0), AndroidHttpClientProvider.access$getAlternativeFlowReader$p(this.this$0))));
        }
    }
}
