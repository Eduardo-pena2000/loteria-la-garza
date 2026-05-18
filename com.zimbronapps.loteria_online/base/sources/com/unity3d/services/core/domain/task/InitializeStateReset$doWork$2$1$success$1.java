package com.unity3d.services.core.domain.task;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.i;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", l = {42}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateReset$doWork$2$1$success$1 extends l implements p {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    @f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ WebViewApp $currentApp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(WebViewApp webViewApp, e eVar) {
            super(2, eVar);
            this.$currentApp = webViewApp;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$currentApp, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            WebView webView = this.$currentApp.getWebView();
            if (webView != null) {
                webView.destroy();
            }
            this.$currentApp.setWebView(null);
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, e eVar) {
        super(2, eVar);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateReset$doWork$2$1$success$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            K main = InitializeStateReset.access$getDispatchers$p(this.this$0).getMain();
            1 r1 = new 1(this.$currentApp, null);
            this.label = 1;
            if (i.g(main, r1, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
