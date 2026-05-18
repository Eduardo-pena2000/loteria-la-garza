package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import T1.A0;
import T1.Z;
import Za.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import cb.K;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import fb.N;
import fb.g;
import fb.z;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidWebViewContainer implements WebViewContainer {
    private final z _lastInputEvent;
    private final Context context;
    private final N lastInputEvent;
    private final O scope;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {42}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidWebViewContainer.this.new 2(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (AndroidWebViewContainer.access$onRenderProcessGone(androidWebViewContainer, this) == f) {
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

        public final Object invoke(boolean z, e eVar) {
            return ((2) create(Boolean.valueOf(z), eVar)).invokeSuspend(I.a);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {98}, m = "addJavascriptInterface")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ String $name;
        final /* synthetic */ WebViewBridge $webViewBridgeInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, WebViewBridge webViewBridge, e eVar) {
            super(2, eVar);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        public final e create(Object obj, e eVar) {
            return AndroidWebViewContainer.this.new 2(this.$name, this.$webViewBridgeInterface, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AndroidWebViewContainer.this.getWebView().addJavascriptInterface(new AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1(this.$webViewBridgeInterface), this.$name);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {116}, m = "destroy")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.destroy(this);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidWebViewContainer.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            ViewGroup parent = AndroidWebViewContainer.this.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(AndroidWebViewContainer.this.getWebView());
            }
            AndroidWebViewContainer.this.getWebView().destroy();
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {88}, m = "evaluateJavascript")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.evaluateJavascript(null, this);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ String $script;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, e eVar) {
            super(2, eVar);
            this.$script = str;
        }

        public final e create(Object obj, e eVar) {
            return AndroidWebViewContainer.this.new 2(this.$script, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AndroidWebViewContainer.this.getWebView().evaluateJavascript("javascript:" + this.$script, (ValueCallback) null);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {74, 78, 80}, m = "loadUrl")
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
            return AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, e eVar) {
            super(2, eVar);
            this.$url = str;
        }

        public final e create(Object obj, e eVar) {
            return AndroidWebViewContainer.this.new 2(this.$url, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {62}, m = "onRenderProcessGone")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.access$onRenderProcessGone(AndroidWebViewContainer.this, this);
        }
    }

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient webViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, K mainDispatcher, K defaultDispatcher, O adPlayerScope, Context context) {
        kotlin.jvm.internal.t.g(webView, "webView");
        kotlin.jvm.internal.t.g(webViewClient, "webViewClient");
        kotlin.jvm.internal.t.g(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        kotlin.jvm.internal.t.g(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.g(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.t.g(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.t.g(context, "context");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        O h = P.h(P.h(adPlayerScope, mainDispatcher), new cb.N("AndroidWebViewContainer"));
        this.scope = h;
        z a = fb.P.a(null);
        this._lastInputEvent = a;
        this.lastInputEvent = g.b(a);
        g.z(g.C(new AndroidWebViewContainer$special$$inlined$filter$1(webViewClient.isRenderProcessGone()), new 2(null)), P.h(h, defaultDispatcher));
        webView.setOnTouchListener(new a(this));
        applySafeAreaInsets();
    }

    private static final boolean _init_$lambda$1(AndroidWebViewContainer this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        this$0._lastInputEvent.setValue(motionEvent);
        return false;
    }

    public static /* synthetic */ boolean a(AndroidWebViewContainer androidWebViewContainer, View view, MotionEvent motionEvent) {
        return _init_$lambda$1(androidWebViewContainer, view, motionEvent);
    }

    public static final /* synthetic */ Object access$onRenderProcessGone(AndroidWebViewContainer androidWebViewContainer, e eVar) {
        return androidWebViewContainer.onRenderProcessGone(eVar);
    }

    private final void applySafeAreaInsets() {
        Z.g0(this.webView, new b(this));
    }

    private static final A0 applySafeAreaInsets$lambda$3(AndroidWebViewContainer this$0, View v, A0 insets) {
        Object b;
        kotlin.jvm.internal.t.g(this$0, "this$0");
        kotlin.jvm.internal.t.g(v, "v");
        kotlin.jvm.internal.t.g(insets, "insets");
        K1.b f = insets.f(A0.l.i());
        kotlin.jvm.internal.t.f(f, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        K1.b f2 = insets.f(A0.l.c());
        kotlin.jvm.internal.t.f(f2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            s.a aVar = s.b;
            b = s.b(Float.valueOf(this$0.context.getResources().getDisplayMetrics().density));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        Float valueOf = Float.valueOf(1.0f);
        if (s.g(b)) {
            b = valueOf;
        }
        float floatValue = ((Number) b).floatValue();
        int applySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(f.a, f2.a), floatValue);
        int applySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(f.b, f2.b), floatValue);
        i.d(this$0.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(this$0, u.j("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + applySafeAreaInsets$lambda$3$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(f.c, f2.c), floatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + applySafeAreaInsets$lambda$3$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(f.d, f2.d), floatValue) + "px');\n                })();\n            "), null), 3, null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i, float f) {
        return (int) (i / f);
    }

    public static /* synthetic */ A0 b(AndroidWebViewContainer androidWebViewContainer, View view, A0 a0) {
        return applySafeAreaInsets$lambda$3(androidWebViewContainer, view, a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object onRenderProcessGone(Ga.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone.1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            Ca.t.b(r8)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            Ca.t.b(r8)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.destroy(r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            r0 = r7
        L44:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r8 = r0.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.adplayer.model.WebViewClientError r6 = new com.unity3d.ads.adplayer.model.WebViewClientError
            com.unity3d.ads.adplayer.model.ErrorReason r2 = com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Render process gone"
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = Da.u.e(r6)
            r8.invoke(r0)
            Ca.I r8 = Ca.I.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge r6, java.lang.String r7, Ga.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r8)     // Catch: java.util.concurrent.CancellationException -> L49
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Ca.t.b(r8)
            cb.O r8 = r5.scope     // Catch: java.util.concurrent.CancellationException -> L49
            Ga.i r8 = r8.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L49
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2     // Catch: java.util.concurrent.CancellationException -> L49
            r4 = 0
            r2.<init>(r7, r6, r4)     // Catch: java.util.concurrent.CancellationException -> L49
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r6 = cb.i.g(r8, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r6 != r1) goto L49
            return r1
        L49:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge, java.lang.String, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            Ca.t.b(r6)
            goto L56
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            Ca.t.b(r6)
            cb.O r6 = r5.scope
            Ga.i r6 = r6.getCoroutineContext()
            cb.N0 r2 = cb.N0.a
            Ga.i r6 = r6.plus(r2)
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2
            r2.<init>(r3)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = cb.i.g(r6, r2, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            r0 = r5
        L56:
            cb.O r6 = r0.scope
            cb.P.d(r6, r3, r4, r3)
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evaluateJavascript(java.lang.String r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r7)     // Catch: java.util.concurrent.CancellationException -> L49
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Ca.t.b(r7)
            cb.O r7 = r5.scope     // Catch: java.util.concurrent.CancellationException -> L49
            Ga.i r7 = r7.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L49
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2     // Catch: java.util.concurrent.CancellationException -> L49
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.util.concurrent.CancellationException -> L49
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r6 = cb.i.g(r7, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r6 != r1) goto L49
            return r1
        L49:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(java.lang.String, Ga.e):java.lang.Object");
    }

    public N getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final O getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final z get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadUrl(java.lang.String r8, Ga.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            Ca.t.b(r9)
            goto L92
        L3f:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            Ca.t.b(r9)
            goto L7b
        L47:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            Ca.t.b(r9)
            goto L6a
        L4f:
            Ca.t.b(r9)
            cb.O r9 = r7.scope
            Ga.i r9 = r9.getCoroutineContext()
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2
            r6 = 0
            r2.<init>(r8, r6)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = cb.i.g(r9, r2, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r8 = r7
        L6a:
            com.unity3d.ads.adplayer.AndroidWebViewClient r9 = r8.webViewClient
            cb.W r9 = r9.getOnLoadFinished()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.await(r0)
            if (r9 != r1) goto L7b
            return r1
        L7b:
            java.util.List r9 = (java.util.List) r9
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L9d
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r8.destroy(r0)
            if (r0 != r1) goto L90
            return r1
        L90:
            r0 = r8
            r8 = r9
        L92:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r9 = r0.sendWebViewClientErrorDiagnostics
            r9.invoke(r8)
            com.unity3d.ads.adplayer.LoadWebViewError r9 = new com.unity3d.ads.adplayer.LoadWebViewError
            r9.<init>(r8)
            throw r9
        L9d:
            Ca.I r8 = Ca.I.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl(java.lang.String, Ga.e):java.lang.Object");
    }
}
