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
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import java.util.concurrent.CancellationException;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {32}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateConfig$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, e eVar) {
        super(2, eVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateConfig$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        Configuration configuration;
        Object obj2;
        Object f = c.f();
        int i = this.label;
        try {
            if (i == 0) {
                t.b(obj);
                InitializeStateConfig.Params params = this.$params;
                InitializeStateConfig initializeStateConfig = this.this$0;
                s.a aVar = s.b;
                DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                try {
                    InitializeStateConfigWithLoader access$getInitializeStateConfigWithLoader$p = InitializeStateConfig.access$getInitializeStateConfigWithLoader$p(initializeStateConfig);
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    obj2 = access$getInitializeStateConfigWithLoader$p.invoke-gIAlu-s((BaseParams) params2, (e) this);
                    if (obj2 == f) {
                        return f;
                    }
                    configuration = configuration2;
                } catch (NetworkIOException e) {
                    e = e;
                    configuration = configuration2;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                configuration = (Configuration) this.L$0;
                try {
                    t.b(obj);
                    obj2 = ((s) obj).j();
                } catch (NetworkIOException e2) {
                    e = e2;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            }
            t.b(obj2);
            b = s.b((Configuration) obj2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        if (s.h(b)) {
            b = s.b(b);
        } else {
            Throwable e4 = s.e(b);
            if (e4 != null) {
                b = s.b(t.a(e4));
            }
        }
        return s.a(b);
    }
}
