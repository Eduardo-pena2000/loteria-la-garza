package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Qa.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.services.core.device.StorageEventInfo;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewAdPlayer$storageEventCallback$1 extends u implements l {
    final /* synthetic */ WebViewAdPlayer this$0;

    @f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {67}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ StorageEventInfo $it;
        int label;
        final /* synthetic */ WebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, e eVar) {
            super(2, eVar);
            this.this$0 = webViewAdPlayer;
            this.$it = storageEventInfo;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.this$0, this.$it, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                WebViewBridge access$getBridge$p = WebViewAdPlayer.access$getBridge$p(this.this$0);
                OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                this.label = 1;
                if (access$getBridge$p.sendEvent(onStorageEvent, this) == f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$storageEventCallback$1(WebViewAdPlayer webViewAdPlayer) {
        super(1);
        this.this$0 = webViewAdPlayer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StorageEventInfo) obj);
        return I.a;
    }

    public final void invoke(StorageEventInfo it) {
        kotlin.jvm.internal.t.g(it, "it");
        i.d(this.this$0.getScope(), null, null, new 1(this.this$0, it, null), 3, null);
    }
}
