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
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.concurrent.CancellationException;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateCreate$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, e eVar) {
        super(2, eVar);
        this.$params = params;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateCreate$doWork$2(this.$params, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateCreate$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        Configuration config;
        ErrorState create;
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        InitializeStateCreate.Params params = this.$params;
        try {
            s.a aVar = s.b;
            DeviceLog.debug("Unity Ads init: creating webapp");
            config = params.getConfig();
            config.setWebViewData(params.getWebViewData());
            try {
                create = WebViewApp.create(config, false);
            } catch (IllegalThreadStateException e) {
                DeviceLog.exception("Illegal Thread", e);
                throw new InitializationException(ErrorState.CreateWebApp, e, config);
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        if (create != null) {
            String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
            DeviceLog.error(webAppFailureMessage);
            throw new InitializationException(create, new Exception(webAppFailureMessage), config);
        }
        b = s.b(config);
        if (s.h(b)) {
            b = s.b(b);
        } else {
            Throwable e3 = s.e(b);
            if (e3 != null) {
                b = s.b(t.a(e3));
            }
        }
        return s.a(b);
    }
}
