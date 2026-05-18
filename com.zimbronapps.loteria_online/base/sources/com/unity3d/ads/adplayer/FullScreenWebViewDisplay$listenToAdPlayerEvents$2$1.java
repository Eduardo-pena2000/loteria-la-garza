package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.P;
import cb.i;
import cb.n;
import com.unity3d.ads.adplayer.DisplayMessage;
import fb.y;

@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends l implements p {
    final /* synthetic */ n $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {102}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ n $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(FullScreenWebViewDisplay fullScreenWebViewDisplay, n nVar, e eVar) {
            super(2, eVar);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = nVar;
        }

        public final e create(Object obj, e eVar) {
            1 r0 = new 1(this.this$0, this.$continuation, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            O o;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                O o2 = (O) this.L$0;
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(FullScreenWebViewDisplay.access$getOpportunityId$p(this.this$0));
                this.L$0 = o2;
                this.label = 1;
                if (displayMessages.emit(webViewInstanceRequest, this) == f) {
                    return f;
                }
                o = o2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o = (O) this.L$0;
                t.b(obj);
            }
            P.f(o);
            n nVar = this.$continuation;
            s.a aVar = s.b;
            I i2 = I.a;
            nVar.resumeWith(s.b(i2));
            return i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, n nVar, e eVar) {
        super(2, eVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = nVar;
    }

    public final e create(Object obj, e eVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, eVar);
    }

    public final Object invoke(fb.f fVar, e eVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(fVar, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        i.d(androidx.lifecycle.s.a(this.this$0), FullScreenWebViewDisplay.access$getDispatchers(this.this$0).getDefault(), null, new 1(this.this$0, this.$continuation, null), 2, null);
        return I.a;
    }
}
