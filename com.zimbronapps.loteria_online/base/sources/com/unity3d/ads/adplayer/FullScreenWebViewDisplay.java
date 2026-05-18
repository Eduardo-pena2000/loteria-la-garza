package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.l;
import Ca.m;
import Ca.n;
import Ca.s;
import Ca.t;
import Ca.x;
import Da.Q;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.h;
import Qa.p;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.lifecycle.s;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import d.j;
import fb.g;
import fb.y;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FullScreenWebViewDisplay extends j implements IServiceComponent {
    private final l adObject$delegate;
    private final l dispatchers$delegate;
    private String opportunityId = "";
    private final l sendDiagnosticEvent$delegate;
    private Map showOptions;

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ WebView $webView;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1", f = "FullScreenWebViewDisplay.kt", l = {125}, m = "invokeSuspend")
        public static final class 1 extends Ia.l implements p {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(FullScreenWebViewDisplay fullScreenWebViewDisplay, e eVar) {
                super(2, eVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            public final e create(Object obj, e eVar) {
                return new 1(this.this$0, eVar);
            }

            public final Object invoke(O o, e eVar) {
                return ((1) create(o, eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(FullScreenWebViewDisplay.access$getOpportunityId$p(this.this$0), FullScreenWebViewDisplay.access$getShowOptions$p(this.this$0));
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == f) {
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

        @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2", f = "FullScreenWebViewDisplay.kt", l = {131}, m = "invokeSuspend")
        public static final class 2 extends Ia.l implements p {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(FullScreenWebViewDisplay fullScreenWebViewDisplay, e eVar) {
                super(2, eVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            public final e create(Object obj, e eVar) {
                return new 2(this.this$0, eVar);
            }

            public final Object invoke(O o, e eVar) {
                return ((2) create(o, eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.access$getOpportunityId$p(this.this$0), "WebView failed to attach to FullScreenWebViewDisplay.");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == f) {
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
        public 1(WebView webView, FullScreenWebViewDisplay fullScreenWebViewDisplay, e eVar) {
            super(2, eVar);
            this.$webView = webView;
            this.this$0 = fullScreenWebViewDisplay;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$webView, this.this$0, eVar);
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
            try {
                ViewGroup parent = this.$webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.$webView);
                }
                this.this$0.setContentView(this.$webView);
                i.d(P.a(FullScreenWebViewDisplay.access$getDispatchers(this.this$0).getDefault()), null, null, new 1(this.this$0, null), 3, null);
            } catch (Throwable th) {
                if (th instanceof CancellationException) {
                    return I.a;
                }
                i.d(P.a(FullScreenWebViewDisplay.access$getDispatchers(this.this$0).getDefault()), null, null, new 2(this.this$0, null), 3, null);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.access$getSendDiagnosticEvent(this.this$0), "native_show_ad_viewer_fullscreen_intent_failed_to_attach_webview", null, Q.f(x.a("reason", message)), null, FullScreenWebViewDisplay.access$getAdObject(this.this$0), null, 42, null);
                this.this$0.setResult(0);
                this.this$0.finish();
            }
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1", f = "FullScreenWebViewDisplay.kt", l = {62}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.access$getOpportunityId$p(FullScreenWebViewDisplay.this), "Opportunity ID not found");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2", f = "FullScreenWebViewDisplay.kt", l = {75}, m = "invokeSuspend")
    public static final class 2 extends Ia.l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.access$getOpportunityId$p(FullScreenWebViewDisplay.this), "AdPlayer is not active. Could be because show was called while the app was in background.");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6", f = "FullScreenWebViewDisplay.kt", l = {93}, m = "invokeSuspend")
    public static final class 6 extends Ia.l implements p {
        int label;

        public 6(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 6(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((6) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                FullScreenWebViewDisplay fullScreenWebViewDisplay = FullScreenWebViewDisplay.this;
                this.label = 1;
                if (FullScreenWebViewDisplay.access$listenToAdPlayerEvents(fullScreenWebViewDisplay, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.access$getSendDiagnosticEvent(FullScreenWebViewDisplay.this), "native_show_ad_viewer_fullscreen_intent_creation_success_time", null, null, null, FullScreenWebViewDisplay.access$getAdObject(FullScreenWebViewDisplay.this), null, 46, null);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1", f = "FullScreenWebViewDisplay.kt", l = {174}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.access$getOpportunityId$p(FullScreenWebViewDisplay.this));
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1", f = "FullScreenWebViewDisplay.kt", l = {158}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.access$getOpportunityId$p(FullScreenWebViewDisplay.this), false);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2", f = "FullScreenWebViewDisplay.kt", l = {163}, m = "invokeSuspend")
    public static final class 2 extends Ia.l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.access$getOpportunityId$p(FullScreenWebViewDisplay.this));
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1", f = "FullScreenWebViewDisplay.kt", l = {150}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.access$getOpportunityId$p(FullScreenWebViewDisplay.this), true);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1", f = "FullScreenWebViewDisplay.kt", l = {186}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ boolean $hasFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(boolean z, e eVar) {
            super(2, eVar);
            this.$hasFocus = z;
        }

        public final e create(Object obj, e eVar) {
            return FullScreenWebViewDisplay.this.new 1(this.$hasFocus, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.FocusChanged focusChanged = new DisplayMessage.FocusChanged(FullScreenWebViewDisplay.access$getOpportunityId$p(FullScreenWebViewDisplay.this), this.$hasFocus);
                this.label = 1;
                if (displayMessages.emit(focusChanged, this) == f) {
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

    public FullScreenWebViewDisplay() {
        n nVar = n.c;
        this.sendDiagnosticEvent$delegate = m.a(nVar, new FullScreenWebViewDisplay$special$$inlined$inject$default$1(this, ""));
        this.adObject$delegate = m.b(new FullScreenWebViewDisplay$adObject$2(this));
        this.dispatchers$delegate = m.a(nVar, new FullScreenWebViewDisplay$special$$inlined$inject$default$2(this, ""));
    }

    public static final /* synthetic */ AdObject access$getAdObject(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.getAdObject();
    }

    public static final /* synthetic */ ISDKDispatchers access$getDispatchers(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.getDispatchers();
    }

    public static final /* synthetic */ String access$getOpportunityId$p(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.opportunityId;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.getSendDiagnosticEvent();
    }

    public static final /* synthetic */ Map access$getShowOptions$p(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.showOptions;
    }

    public static final /* synthetic */ Object access$listenToAdPlayerEvents(FullScreenWebViewDisplay fullScreenWebViewDisplay, e eVar) {
        return fullScreenWebViewDisplay.listenToAdPlayerEvents(eVar);
    }

    public static final /* synthetic */ void access$loadWebView(FullScreenWebViewDisplay fullScreenWebViewDisplay, WebView webView) {
        fullScreenWebViewDisplay.loadWebView(webView);
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    private final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers$delegate.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    private final Object listenToAdPlayerEvents(e eVar) {
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        g.z(g.C(new FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1(g.E(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, pVar, null)), this), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), s.a(this));
        Object w = pVar.w();
        if (w == c.f()) {
            h.c(eVar);
        }
        return w == c.f() ? w : I.a;
    }

    private final void loadWebView(WebView webView) {
        i.d(P.a(getDispatchers().getMain()), null, null, new 1(webView, this, null), 3, null);
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public void onCreate(Bundle bundle) {
        O scope;
        Object b;
        Map map;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_starts", null, Q.f(x.a("intentOpportunityId", this.opportunityId)), null, getAdObject(), null, 42, null);
        if (kotlin.jvm.internal.t.c(this.opportunityId, "not_provided")) {
            setResult(0);
            i.d(P.a(getDispatchers().getDefault()), null, null, new 1(null), 3, null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_fails", null, Q.f(x.a("reason_debug", "no_opportunity_id")), null, null, null, 58, null);
            finish();
            return;
        }
        AdObject adObject = getAdObject();
        AdPlayer adPlayer = adObject != null ? adObject.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !P.g(scope)) {
            setResult(0);
            i.d(P.a(getDispatchers().getDefault()), null, null, new 2(null), 3, null);
            finish();
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_creation_fails", null, Q.f(x.a("reason_debug", "ad_player_scope_not_active")), null, null, null, 58, null);
            return;
        }
        boolean hasExtra = getIntent().hasExtra("orientation");
        Boolean valueOf = Boolean.valueOf(hasExtra);
        if (!hasExtra) {
            valueOf = null;
        }
        if (valueOf != null) {
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                s.a aVar = Ca.s.b;
                b = Ca.s.b(JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2)));
            } catch (Throwable th) {
                s.a aVar2 = Ca.s.b;
                b = Ca.s.b(t.a(th));
            }
            if (Ca.s.g(b)) {
                b = null;
            }
            map = (Map) b;
        } else {
            map = null;
        }
        this.showOptions = map;
        i.d(androidx.lifecycle.s.a(this), null, null, new 6(null), 3, null);
    }

    public void onDestroy() {
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_destroyed", null, null, null, getAdObject(), null, 46, null);
        if (isFinishing()) {
            i.d(P.a(getDispatchers().getDefault()), null, null, new 1(null), 3, null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_finishing_on_destroy", null, null, null, getAdObject(), null, 46, null);
        }
        super/*android.app.Activity*/.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 4;
    }

    public void onPause() {
        super/*android.app.Activity*/.onPause();
        i.d(P.a(getDispatchers().getDefault()), null, null, new 1(null), 3, null);
        if (isFinishing()) {
            i.d(P.a(getDispatchers().getDefault()), null, null, new 2(null), 3, null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_show_ad_viewer_fullscreen_intent_finishing_on_pause", null, null, null, getAdObject(), null, 46, null);
        }
    }

    public void onResume() {
        super/*android.app.Activity*/.onResume();
        i.d(P.a(getDispatchers().getDefault()), null, null, new 1(null), 3, null);
    }

    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        i.d(P.a(getDispatchers().getDefault()), null, null, new 1(z, null), 3, null);
    }
}
