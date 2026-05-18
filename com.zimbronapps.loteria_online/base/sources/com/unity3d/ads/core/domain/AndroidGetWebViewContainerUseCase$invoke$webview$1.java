package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.webkit.WebSettings;
import android.webkit.WebView;
import cb.O;

@f(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1", f = "AndroidGetWebViewContainerUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetWebViewContainerUseCase$invoke$webview$1 extends l implements p {
    int label;
    final /* synthetic */ AndroidGetWebViewContainerUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetWebViewContainerUseCase$invoke$webview$1(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, e eVar) {
        super(2, eVar);
        this.this$0 = androidGetWebViewContainerUseCase;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidGetWebViewContainerUseCase$invoke$webview$1(this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidGetWebViewContainerUseCase$invoke$webview$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        WebView webView = new WebView(AndroidGetWebViewContainerUseCase.access$getContext$p(this.this$0));
        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = this.this$0;
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(-1);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setWebViewClient(AndroidGetWebViewContainerUseCase.access$getAndroidWebViewClient$p(androidGetWebViewContainerUseCase));
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setInitialScale(0);
        webView.setBackgroundColor(0);
        webView.setBackgroundResource(0);
        return webView;
    }
}
