package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TriggerInitializeListener {
    private final K coroutineDispatcher;

    @f(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ String $errorMsg;
        final /* synthetic */ UnityAds.UnityAdsInitializationError $unityAdsInitializationError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str, e eVar) {
            super(2, eVar);
            this.$unityAdsInitializationError = unityAdsInitializationError;
            this.$errorMsg = str;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$unityAdsInitializationError, this.$errorMsg, eVar);
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
            SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$success$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return new 1(eVar);
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
            SdkProperties.notifyInitializationComplete();
            return I.a;
        }
    }

    public TriggerInitializeListener(K coroutineDispatcher) {
        kotlin.jvm.internal.t.g(coroutineDispatcher, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final void error(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String errorMsg) {
        kotlin.jvm.internal.t.g(unityAdsInitializationError, "unityAdsInitializationError");
        kotlin.jvm.internal.t.g(errorMsg, "errorMsg");
        i.d(P.a(this.coroutineDispatcher), null, null, new 1(unityAdsInitializationError, errorMsg, null), 3, null);
    }

    public final void success() {
        i.d(P.a(this.coroutineDispatcher), null, null, new 1(null), 3, null);
    }
}
