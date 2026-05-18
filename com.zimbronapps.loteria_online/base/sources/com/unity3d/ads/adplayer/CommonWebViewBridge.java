package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.S;
import Da.Y;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.N;
import cb.O;
import cb.P;
import cb.W;
import cb.i;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.log.DeviceLog;
import fb.D;
import fb.F;
import fb.g;
import fb.y;
import fb.z;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final y _onInvocation;
    private final z callbacks;
    private final D onInvocation;
    private final O scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {33}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return CommonWebViewBridge.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                WebViewContainer access$getWebViewContainer$p = CommonWebViewBridge.access$getWebViewContainer$p(CommonWebViewBridge.this);
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (access$getWebViewContainer$p.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {127, 129, 130, 131, 132, 139}, m = "invokeSuspend")
    public static final class 7 extends l implements p {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ JSONArray $parameters;
        Object L$0;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", l = {129}, m = "invokeSuspend")
        public static final class 1 extends l implements p {
            final /* synthetic */ Invocation $invocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Invocation invocation, e eVar) {
                super(2, eVar);
                this.$invocation = invocation;
            }

            public final e create(Object obj, e eVar) {
                return new 1(this.$invocation, eVar);
            }

            public final Object invoke(O o, e eVar) {
                return ((1) create(o, eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    W isHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (isHandled.await(this) == f) {
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
        public 7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, e eVar) {
            super(2, eVar);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        public final e create(Object obj, e eVar) {
            return new 7(this.$location, this.$parameters, this.this$0, this.$callback, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((7) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:10:0x0017, B:11:0x001f, B:12:0x0075, B:14:0x0079, B:17:0x0087, B:21:0x0027, B:22:0x0069, B:26:0x0056), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: Exception -> 0x001c, TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:10:0x0017, B:11:0x001f, B:12:0x0075, B:14:0x0079, B:17:0x0087, B:21:0x0027, B:22:0x0069, B:26:0x0056), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocation.7.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {66, 68}, m = "request")
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
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(K dispatcher, WebViewContainer webViewContainer, O adPlayerScope, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.t.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.t.g(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.t.g(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        O h = P.h(P.h(adPlayerScope, dispatcher), new N("CommonWebViewBridge"));
        this.scope = h;
        this.callbacks = fb.P.a(Y.b());
        y b = F.b(0, 64, null, 5, null);
        this._onInvocation = b;
        this.onInvocation = g.a(b);
        i.d(h, null, null, new 1(null), 3, null);
    }

    public static final /* synthetic */ Object access$execute(CommonWebViewBridge commonWebViewBridge, HandlerType handlerType, String str, e eVar) {
        return commonWebViewBridge.execute(handlerType, str, eVar);
    }

    public static final /* synthetic */ WebViewContainer access$getWebViewContainer$p(CommonWebViewBridge commonWebViewBridge) {
        return commonWebViewBridge.webViewContainer;
    }

    public static final /* synthetic */ y access$get_onInvocation$p(CommonWebViewBridge commonWebViewBridge) {
        return commonWebViewBridge._onInvocation;
    }

    public static final /* synthetic */ Object access$respond(CommonWebViewBridge commonWebViewBridge, String str, String str2, Object[] objArr, e eVar) {
        return commonWebViewBridge.respond(str, str2, objArr, eVar);
    }

    private final Object execute(HandlerType handlerType, String str, e eVar) {
        Object evaluateJavascript = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", eVar);
        return evaluateJavascript == c.f() ? evaluateJavascript : I.a;
    }

    private final Object respond(String str, String str2, Object[] objArr, e eVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        HandlerType handlerType = HandlerType.CALLBACK;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(jSONArray);
        sb.append(']');
        Object execute = execute(handlerType, sb.toString(), eVar);
        return execute == c.f() ? execute : I.a;
    }

    public D getOnInvocation() {
        return this.onInvocation;
    }

    public final O getScope() {
        return this.scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleCallback(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "callbackId"
            kotlin.jvm.internal.t.g(r1, r4)
            java.lang.String r4 = "callbackStatus"
            kotlin.jvm.internal.t.g(r2, r4)
            java.lang.String r4 = "rawParameters"
            kotlin.jvm.internal.t.g(r3, r4)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r3)
            java.lang.Object[] r3 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r4)
            fb.z r4 = r0.callbacks
            java.lang.Object r4 = r4.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L2c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()
            r6 = r5
            Ca.q r6 = (Ca.q) r6
            java.lang.Object r6 = r6.a()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = kotlin.jvm.internal.t.c(r6, r1)
            if (r6 == 0) goto L2c
            goto L47
        L46:
            r5 = 0
        L47:
            Ca.q r5 = (Ca.q) r5
            if (r5 != 0) goto L4c
            return
        L4c:
            java.lang.Object r1 = r5.b()
            cb.x r1 = (cb.x) r1
            java.lang.String r4 = "success"
            java.lang.String r6 = "error"
            java.lang.String[] r7 = new java.lang.String[]{r4, r6}
            java.util.Set r7 = Da.Y.e(r7)
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L74
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            r15 = 62
            r16 = 0
            java.lang.String r9 = "old_callback_status"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L74:
            int r7 = r19.hashCode()
            r8 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r7 == r8) goto Lb8
            r4 = 2524(0x9dc, float:3.537E-42)
            if (r7 == r4) goto Laf
            r4 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r7 == r4) goto L93
            r4 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r7 == r4) goto L8c
            goto Lc2
        L8c:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L9c
            goto Lc2
        L93:
            java.lang.String r4 = "ERROR"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L9c
            goto Lc2
        L9c:
            java.lang.Exception r2 = new java.lang.Exception
            r4 = 0
            r3 = r3[r4]
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.t.e(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            r1.b(r2)
            goto Lc2
        Laf:
            java.lang.String r4 = "OK"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lbf
            goto Lc2
        Lb8:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lbf
            goto Lc2
        Lbf:
            r1.o(r3)
        Lc2:
            fb.z r1 = r0.callbacks
        Lc4:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.Set r3 = Da.Z.h(r3, r5)
            boolean r2 = r1.e(r2, r3)
            if (r2 == 0) goto Lc4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void handleInvocation(String message) {
        kotlin.jvm.internal.t.g(message, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    DeviceLog.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    i.d(this.scope, null, null, new 7(str4, jSONArray3, this, str3, null), 3, null);
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + message, e);
            }
        } catch (Exception e2) {
            DeviceLog.error("Error handling invocation from webview (" + message + ')');
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = e2.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, S.l(x.a("reason_debug", message2), x.a("webview_invocation", message)), null, null, null, 58, null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: " + message, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object request(java.lang.String r11, java.lang.String r12, java.lang.Object[] r13, Ga.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.request.1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge.request.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            Ca.t.b(r14)
            goto L9f
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.Object r11 = r0.L$0
            cb.x r11 = (cb.x) r11
            Ca.t.b(r14)
            goto L94
        L3d:
            Ca.t.b(r14)
            cb.x r14 = cb.z.b(r4, r5, r4)
            int r2 = r14.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            fb.z r6 = r10.callbacks
        L4e:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            Ca.q r9 = Ca.x.a(r2, r14)
            java.util.Set r8 = Da.Z.j(r8, r9)
            boolean r7 = r6.e(r7, r8)
            if (r7 == 0) goto L4e
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r11)
            r6.put(r12)
            r6.put(r2)
            int r11 = r13.length
            r12 = 0
        L73:
            if (r12 >= r11) goto L7d
            r2 = r13[r12]
            r6.put(r2)
            int r12 = r12 + 1
            goto L73
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            java.lang.String r12 = r6.toString()
            java.lang.String r13 = "arguments.toString()"
            kotlin.jvm.internal.t.f(r12, r13)
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r11 = r10.execute(r11, r12, r0)
            if (r11 != r1) goto L93
            return r1
        L93:
            r11 = r14
        L94:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r14 = r11.await(r0)
            if (r14 != r1) goto L9f
            return r1
        L9f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], Ga.e):java.lang.Object");
    }

    public Object sendEvent(WebViewEvent webViewEvent, e eVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        HandlerType handlerType = HandlerType.EVENT;
        String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.t.f(jSONArray2, "arguments.toString()");
        Object execute = execute(handlerType, jSONArray2, eVar);
        return execute == c.f() ? execute : I.a;
    }
}
