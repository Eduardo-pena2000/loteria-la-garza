package com.unity3d.services.core.domain.task;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateError$doWork$2", f = "InitializeStateError.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateError$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateError.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$2(InitializeStateError.Params params, e eVar) {
        super(2, eVar);
        this.$params = params;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateError$doWork$2(this.$params, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateError$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        InitializeStateError.Params params = this.$params;
        try {
            s.a aVar = s.b;
            DeviceLog.error("Unity Ads init: halting init in " + params.getErrorState().getMetricName() + ": " + params.getException().getMessage());
            Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new Class[0];
            }
            for (Class cls : moduleConfigurationList) {
                IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    b.a(moduleConfiguration.initErrorState(params.getConfig(), params.getErrorState(), params.getException().getMessage()));
                }
            }
            b = s.b(I.a);
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
