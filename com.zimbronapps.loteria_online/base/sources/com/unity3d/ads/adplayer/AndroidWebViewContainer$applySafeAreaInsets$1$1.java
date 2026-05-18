package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.webkit.ValueCallback;
import cb.O;

@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidWebViewContainer$applySafeAreaInsets$1$1 extends l implements p {
    final /* synthetic */ String $js;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$applySafeAreaInsets$1$1(AndroidWebViewContainer androidWebViewContainer, String str, e eVar) {
        super(2, eVar);
        this.this$0 = androidWebViewContainer;
        this.$js = str;
    }

    public final e create(Object obj, e eVar) {
        AndroidWebViewContainer$applySafeAreaInsets$1$1 androidWebViewContainer$applySafeAreaInsets$1$1 = new AndroidWebViewContainer$applySafeAreaInsets$1$1(this.this$0, this.$js, eVar);
        androidWebViewContainer$applySafeAreaInsets$1$1.L$0 = obj;
        return androidWebViewContainer$applySafeAreaInsets$1$1;
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidWebViewContainer$applySafeAreaInsets$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        AndroidWebViewContainer androidWebViewContainer = this.this$0;
        String str = this.$js;
        try {
            s.a aVar = s.b;
            androidWebViewContainer.getWebView().evaluateJavascript(str, (ValueCallback) null);
            s.b(I.a);
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            s.b(t.a(th));
        }
        return I.a;
    }
}
