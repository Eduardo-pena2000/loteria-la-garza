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
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import java.util.concurrent.CancellationException;
import o2.i;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {26}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateComplete$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, InitializeStateComplete initializeStateComplete, e eVar) {
        super(2, eVar);
        this.$params = params;
        this.this$0 = initializeStateComplete;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateComplete$doWork$2(this.$params, this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateComplete$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        Object f = c.f();
        int i = this.label;
        try {
            if (i == 0) {
                t.b(obj);
                InitializeStateComplete.Params params = this.$params;
                InitializeStateComplete initializeStateComplete = this.this$0;
                s.a aVar = s.b;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                kotlin.jvm.internal.t.f(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        b.a(moduleConfiguration.initCompleteState(params.getConfig()));
                    }
                }
                i access$getDataStore$p = InitializeStateComplete.access$getDataStore$p(initializeStateComplete);
                InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(null);
                this.label = 1;
                if (access$getDataStore$p.a(initializeStateComplete$doWork$2$1$1, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
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
