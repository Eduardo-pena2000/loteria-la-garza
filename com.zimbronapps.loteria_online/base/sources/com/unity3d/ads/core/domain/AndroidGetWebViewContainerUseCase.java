package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import android.content.Context;
import cb.K;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final K defaultDispatcher;
    private final K mainDispatcher;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    @f(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", f = "AndroidGetWebViewContainerUseCase.kt", l = {24}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetWebViewContainerUseCase.this.invoke(null, this);
        }
    }

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, K mainDispatcher, K defaultDispatcher) {
        t.g(context, "context");
        t.g(androidWebViewClient, "androidWebViewClient");
        t.g(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        t.g(mainDispatcher, "mainDispatcher");
        t.g(defaultDispatcher, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = mainDispatcher;
        this.defaultDispatcher = defaultDispatcher;
    }

    public static final /* synthetic */ AndroidWebViewClient access$getAndroidWebViewClient$p(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase) {
        return androidGetWebViewContainerUseCase.androidWebViewClient;
    }

    public static final /* synthetic */ Context access$getContext$p(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase) {
        return androidGetWebViewContainerUseCase.context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(cb.O r11, Ga.e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.L$1
            cb.O r11 = (cb.O) r11
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) r0
            Ca.t.b(r12)
        L30:
            r8 = r11
            goto L54
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            Ca.t.b(r12)
            cb.K r12 = r10.mainDispatcher
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1 r2 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1
            r4 = 0
            r2.<init>(r10, r4)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r12 = cb.i.g(r12, r2, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            r0 = r10
            goto L30
        L54:
            r3 = r12
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            com.unity3d.ads.adplayer.AndroidWebViewContainer r11 = new com.unity3d.ads.adplayer.AndroidWebViewContainer
            com.unity3d.ads.adplayer.AndroidWebViewClient r4 = r0.androidWebViewClient
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r5 = r0.sendWebViewClientErrorDiagnostics
            cb.K r6 = r0.mainDispatcher
            cb.K r7 = r0.defaultDispatcher
            android.content.Context r9 = r0.context
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke(cb.O, Ga.e):java.lang.Object");
    }
}
