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
import cb.c1;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateNetworkError$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, e eVar) {
        super(2, eVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateNetworkError$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        InitializeStateNetworkError initializeStateNetworkError;
        Object f = c.f();
        int i = this.label;
        try {
            if (i == 0) {
                t.b(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                s.a aVar = s.b;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                InitializeStateNetworkError.access$setMaximumConnectedEvents$p(initializeStateNetworkError2, params.getConfig().getMaximumConnectedEvents());
                InitializeStateNetworkError.access$setConnectedEventThreshold$p(initializeStateNetworkError2, params.getConfig().getConnectedEventThreshold());
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object d = c1.d(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (d == f) {
                    return f;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = d;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                t.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        if (((I) obj) == null) {
            ConnectivityMonitor.removeListener(initializeStateNetworkError);
            throw new Exception("No connected events within the timeout!");
        }
        b = s.b(I.a);
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
