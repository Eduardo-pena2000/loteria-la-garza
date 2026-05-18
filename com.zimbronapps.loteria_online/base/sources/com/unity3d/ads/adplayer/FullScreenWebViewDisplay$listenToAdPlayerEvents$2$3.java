package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.unity3d.ads.adplayer.DisplayMessage;

@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends l implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, e eVar) {
        super(2, eVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    public final e create(Object obj, e eVar) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, eVar);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    public final Object invoke(DisplayMessage displayMessage, e eVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        DisplayMessage displayMessage = (DisplayMessage) this.L$0;
        if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
            this.this$0.finish();
        } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
            FullScreenWebViewDisplay.access$loadWebView(this.this$0, ((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
        } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
            this.this$0.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
        }
        return I.a;
    }
}
