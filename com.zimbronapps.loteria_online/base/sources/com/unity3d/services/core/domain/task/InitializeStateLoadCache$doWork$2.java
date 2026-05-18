package com.unity3d.services.core.domain.task;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateLoadCache$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, e eVar) {
        super(2, eVar);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateLoadCache$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        InitializeStateLoadCache initializeStateLoadCache = this.this$0;
        InitializeStateLoadCache.Params params = this.$params;
        try {
            s.a aVar = s.b;
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            byte[] access$getWebViewData = InitializeStateLoadCache.access$getWebViewData(initializeStateLoadCache);
            boolean z = true;
            if (access$getWebViewData == null) {
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
            } else {
                String Sha256 = Utilities.Sha256(access$getWebViewData);
                Charset forName = Charset.forName("UTF-8");
                kotlin.jvm.internal.t.f(forName, "forName(\"UTF-8\")");
                String str = new String(access$getWebViewData, forName);
                if (Sha256 != null && kotlin.jvm.internal.t.c(Sha256, params.getConfig().getWebViewHash())) {
                    z = false;
                }
                if (!z) {
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                }
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(z, str);
            }
            b = s.b(loadCacheResult);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        if (s.h(b)) {
            b = s.b(b);
        } else {
            Throwable e2 = s.e(b);
            if (e2 != null) {
                b = s.b(t.a(e2));
            }
        }
        return s.a(b);
    }
}
