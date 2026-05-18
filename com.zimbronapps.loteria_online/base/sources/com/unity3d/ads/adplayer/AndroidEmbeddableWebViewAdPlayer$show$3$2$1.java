package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;

@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {106}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$3$2$1 extends l implements p {
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, e eVar) {
        super(2, eVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$2$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidEmbeddableWebViewAdPlayer.destroy(this) == f) {
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
