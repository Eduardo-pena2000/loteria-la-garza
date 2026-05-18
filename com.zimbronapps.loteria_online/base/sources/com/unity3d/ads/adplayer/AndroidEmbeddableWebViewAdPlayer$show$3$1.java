package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.i;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import fb.N;
import java.util.Map;

@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {97, 98}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$3$1 extends l implements p {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public static final class 1 implements fb.f {
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        public 1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
            return emit(((Boolean) obj).booleanValue(), eVar);
        }

        public final Object emit(boolean z, e eVar) {
            Object sendFocusChange = AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0).sendFocusChange(z, eVar);
            return sendFocusChange == c.f() ? sendFocusChange : I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, e eVar) {
        super(2, eVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            WebViewAdPlayer access$getWebViewAdPlayer$p = AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0);
            Map unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
            this.label = 1;
            if (access$getWebViewAdPlayer$p.requestShow(unityAdsShowOptions, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                throw new i();
            }
            t.b(obj);
        }
        N appActive = AndroidEmbeddableWebViewAdPlayer.access$getLifecycleDataSource$p(this.this$0).getAppActive();
        1 r1 = new 1(this.this$0);
        this.label = 2;
        if (appActive.collect(r1, this) == f) {
            return f;
        }
        throw new i();
    }
}
