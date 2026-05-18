package com.unity3d.services;

import Ca.I;
import Ca.m;
import Ca.n;
import Ca.s;
import Ca.t;
import Ca.x;
import Da.Q;
import Da.S;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.p;
import ab.k;
import android.content.Context;
import cb.A;
import cb.B0;
import cb.E0;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private final IServiceProvider serviceProvider;

    @f(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", l = {202}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Ca.l $getAdObject$delegate;
        final /* synthetic */ Ca.l $omFinishSession$delegate;
        final /* synthetic */ O $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, O o, Ca.l lVar, Ca.l lVar2, e eVar) {
            super(2, eVar);
            this.$opportunityId = str;
            this.$omidScope = o;
            this.$getAdObject$delegate = lVar;
            this.$omFinishSession$delegate = lVar2;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                AdObject invoke = UnityAdsSDK.access$finishOMIDSession$lambda$18(this.$getAdObject$delegate).invoke(this.$opportunityId);
                if (invoke != null) {
                    OmFinishSession access$finishOMIDSession$lambda$19 = UnityAdsSDK.access$finishOMIDSession$lambda$19(this.$omFinishSession$delegate);
                    this.label = 1;
                    if (access$finishOMIDSession$lambda$19.invoke(invoke, this) == f) {
                        return f;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            P.d(this.$omidScope, null, 1, null);
            return I.a;
        }
    }

    @f(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {130}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return UnityAdsSDK.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
                this.label = 1;
                obj = UnityAdsSDK.access$fetchToken(unityAdsSDK, "true", this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return obj;
        }
    }

    @f(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {146}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Ca.l $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ O $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ Ca.l $tokenNumberProvider$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, O o, Ca.l lVar, Ca.l lVar2, e eVar) {
            super(2, eVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = o;
            this.$getAsyncHeaderBiddingToken$delegate = lVar;
            this.$tokenNumberProvider$delegate = lVar2;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                GetAsyncHeaderBiddingToken access$getToken$lambda$8 = UnityAdsSDK.access$getToken$lambda$8(this.$getAsyncHeaderBiddingToken$delegate);
                int invoke = UnityAdsSDK.access$getToken$lambda$7(this.$tokenNumberProvider$delegate).invoke();
                TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                if (access$getToken$lambda$8.invoke(invoke, tokenConfiguration, iUnityAdsTokenListener, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            P.d(this.$getTokenScope, null, 1, null);
            return I.a;
        }
    }

    @f(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", l = {87, 89}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Ca.l $alternativeFlowReader$delegate;
        final /* synthetic */ O $initScope;
        final /* synthetic */ Ca.l $initializeBoldSDK$delegate;
        final /* synthetic */ Ca.l $initializeSDK$delegate;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, O o, Ca.l lVar, Ca.l lVar2, Ca.l lVar3, e eVar) {
            super(2, eVar);
            this.$source = str;
            this.$initScope = o;
            this.$alternativeFlowReader$delegate = lVar;
            this.$initializeBoldSDK$delegate = lVar2;
            this.$initializeSDK$delegate = lVar3;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$source, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                if (UnityAdsSDK.access$initialize$lambda$1(this.$alternativeFlowReader$delegate).invoke()) {
                    InitializeBoldSDK access$initialize$lambda$3 = UnityAdsSDK.access$initialize$lambda$3(this.$initializeBoldSDK$delegate);
                    String str = this.$source;
                    this.label = 1;
                    if (access$initialize$lambda$3.invoke(str, this) == f) {
                        return f;
                    }
                } else {
                    InitializeSDK access$initialize$lambda$2 = UnityAdsSDK.access$initialize$lambda$2(this.$initializeSDK$delegate);
                    EmptyParams emptyParams = EmptyParams.INSTANCE;
                    this.label = 2;
                    if (access$initialize$lambda$2.invoke-gIAlu-s(emptyParams, this) == f) {
                        return f;
                    }
                }
            } else if (i == 1) {
                t.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                ((s) obj).j();
            }
            P.d(this.$initScope, null, 1, null);
            return I.a;
        }
    }

    @f(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {110}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ Ca.l $context$delegate;
        final /* synthetic */ IUnityAdsLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ O $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, O o, Ca.l lVar, e eVar) {
            super(2, eVar);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = o;
            this.$context$delegate = lVar;
        }

        public final e create(Object obj, e eVar) {
            return UnityAdsSDK.this.new 1(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.P.b(LegacyLoadUseCase.class));
                Context access$load$lambda$5 = UnityAdsSDK.access$load$lambda$5(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                if (legacyLoadUseCase.invoke(access$load$lambda$5, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            P.d(this.$loadScope, null, 1, null);
            return I.a;
        }
    }

    @f(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {120}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ O $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(LegacyShowUseCase legacyShowUseCase, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, O o, e eVar) {
            super(2, eVar);
            this.$showBoldSDK = legacyShowUseCase;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = o;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                if (legacyShowUseCase.invoke(str, unityAdsShowOptions, listeners, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            P.d(this.$showScope, null, 1, null);
            return I.a;
        }
    }

    public UnityAdsSDK() {
        this(null, 1, null);
    }

    public static final /* synthetic */ Object access$fetchToken(UnityAdsSDK unityAdsSDK, String str, e eVar) {
        return unityAdsSDK.fetchToken(str, eVar);
    }

    public static final /* synthetic */ GetHeaderBiddingToken access$fetchToken$lambda$10(Ca.l lVar) {
        return fetchToken$lambda$10(lVar);
    }

    public static final /* synthetic */ TokenNumberProvider access$fetchToken$lambda$9(Ca.l lVar) {
        return fetchToken$lambda$9(lVar);
    }

    public static final /* synthetic */ GetAdObject access$finishOMIDSession$lambda$18(Ca.l lVar) {
        return finishOMIDSession$lambda$18(lVar);
    }

    public static final /* synthetic */ OmFinishSession access$finishOMIDSession$lambda$19(Ca.l lVar) {
        return finishOMIDSession$lambda$19(lVar);
    }

    public static final /* synthetic */ TokenNumberProvider access$getToken$lambda$7(Ca.l lVar) {
        return getToken$lambda$7(lVar);
    }

    public static final /* synthetic */ GetAsyncHeaderBiddingToken access$getToken$lambda$8(Ca.l lVar) {
        return getToken$lambda$8(lVar);
    }

    public static final /* synthetic */ AlternativeFlowReader access$initialize$lambda$1(Ca.l lVar) {
        return initialize$lambda$1(lVar);
    }

    public static final /* synthetic */ InitializeSDK access$initialize$lambda$2(Ca.l lVar) {
        return initialize$lambda$2(lVar);
    }

    public static final /* synthetic */ InitializeBoldSDK access$initialize$lambda$3(Ca.l lVar) {
        return initialize$lambda$3(lVar);
    }

    public static final /* synthetic */ Context access$load$lambda$5(Ca.l lVar) {
        return load$lambda$5(lVar);
    }

    private final Object fetchToken(String str, e eVar) {
        String str2;
        String str3;
        String str4;
        n nVar = n.c;
        Ca.l a = m.a(nVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, ""));
        Ca.l a2 = m.a(nVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, ""));
        Ca.l a3 = m.a(nVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, ""));
        Ca.l a4 = m.a(nVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$4(this, ""));
        long b = k.a.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$12(a4), "native_gateway_token_started", null, S.l(x.a("sync", str), x.a("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(a3), false, 1, null).toString())), null, null, null, 58, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(a3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) i.f(null, new UnityAdsSDK$fetchToken$token$1(a2, a, null), 1, null);
                str2 = null;
                str3 = null;
            } catch (Exception e) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent fetchToken$lambda$12 = fetchToken$lambda$12(a4);
        String str5 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double b2 = b.b(TimeExtensionsKt.elapsedMillis(k.a.b(b)));
        Map c = Q.c();
        c.put("sync", str);
        c.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(a3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            c.put("reason_debug", str3);
        }
        I i = I.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$12, str5, b2, Q.b(c), null, null, b.d(fetchToken$lambda$9(a).invoke()), 24, null);
        return str4;
    }

    private static final GetHeaderBiddingToken fetchToken$lambda$10(Ca.l lVar) {
        return (GetHeaderBiddingToken) lVar.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$11(Ca.l lVar) {
        return (GetInitializationState) lVar.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$12(Ca.l lVar) {
        return (SendDiagnosticEvent) lVar.getValue();
    }

    private static final TokenNumberProvider fetchToken$lambda$9(Ca.l lVar) {
        return (TokenNumberProvider) lVar.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$16(Ca.l lVar) {
        return (AlternativeFlowReader) lVar.getValue();
    }

    private static final GetAdObject finishOMIDSession$lambda$18(Ca.l lVar) {
        return (GetAdObject) lVar.getValue();
    }

    private static final OmFinishSession finishOMIDSession$lambda$19(Ca.l lVar) {
        return (OmFinishSession) lVar.getValue();
    }

    private static final GetGameId getToken$lambda$6(Ca.l lVar) {
        return (GetGameId) lVar.getValue();
    }

    private static final TokenNumberProvider getToken$lambda$7(Ca.l lVar) {
        return (TokenNumberProvider) lVar.getValue();
    }

    private static final GetAsyncHeaderBiddingToken getToken$lambda$8(Ca.l lVar) {
        return (GetAsyncHeaderBiddingToken) lVar.getValue();
    }

    public static /* synthetic */ B0 initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$0(Ca.l lVar) {
        return (ShouldAllowInitialization) lVar.getValue();
    }

    private static final AlternativeFlowReader initialize$lambda$1(Ca.l lVar) {
        return (AlternativeFlowReader) lVar.getValue();
    }

    private static final InitializeSDK initialize$lambda$2(Ca.l lVar) {
        return (InitializeSDK) lVar.getValue();
    }

    private static final InitializeBoldSDK initialize$lambda$3(Ca.l lVar) {
        return (InitializeBoldSDK) lVar.getValue();
    }

    public static /* synthetic */ B0 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$4(Ca.l lVar) {
        return (GetGameId) lVar.getValue();
    }

    private static final Context load$lambda$5(Ca.l lVar) {
        return (Context) lVar.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$20(Ca.l lVar) {
        return (AlternativeFlowReader) lVar.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$21(Ca.l lVar) {
        return (SendDiagnosticEvent) lVar.getValue();
    }

    public final B0 finishOMIDSession(String opportunityId) {
        kotlin.jvm.internal.t.g(opportunityId, "opportunityId");
        n nVar = n.c;
        if (!finishOMIDSession$lambda$16(m.a(nVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, ""))).invoke()) {
            A b = E0.b(null, 1, null);
            b.a();
            return b;
        }
        Ca.l a = m.a(nVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, ""));
        Ca.l a2 = m.a(nVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, ""));
        O o = (O) getServiceProvider().getRegistry().getService("omid_scope", kotlin.jvm.internal.P.b(O.class));
        return i.d(o, null, null, new 2(opportunityId, o, a, a2, null), 3, null);
    }

    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        return (String) i.f(null, new 1(null), 1, null);
    }

    public final synchronized B0 initialize(String str, String source) {
        kotlin.jvm.internal.t.g(source, "source");
        n nVar = n.c;
        if (!initialize$lambda$0(m.a(nVar, new UnityAdsSDK$initialize$$inlined$inject$default$1(this, ""))).invoke(str)) {
            return E0.b(null, 1, null);
        }
        Ca.l a = m.a(nVar, new UnityAdsSDK$initialize$$inlined$inject$default$2(this, ""));
        Ca.l a2 = m.a(nVar, new UnityAdsSDK$initialize$$inlined$inject$default$3(this, ""));
        Ca.l a3 = m.a(nVar, new UnityAdsSDK$initialize$$inlined$inject$default$4(this, ""));
        O o = (O) getServiceProvider().getRegistry().getService("init_scope", kotlin.jvm.internal.P.b(O.class));
        return i.d(o, null, null, new 1(source, o, a, a3, a2, null), 3, null);
    }

    public final B0 load(String str, UnityAdsLoadOptions loadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize) {
        kotlin.jvm.internal.t.g(loadOptions, "loadOptions");
        n nVar = n.c;
        initialize(load$lambda$4(m.a(nVar, new UnityAdsSDK$load$$inlined$inject$default$1(this, ""))).invoke(), "load");
        O o = (O) getServiceProvider().getRegistry().getService("load_scope", kotlin.jvm.internal.P.b(O.class));
        return i.d(o, null, null, new 1(str, loadOptions, iUnityAdsLoadListener, unityBannerSize, o, m.a(nVar, new UnityAdsSDK$load$$inlined$inject$default$2(this, "")), null), 3, null);
    }

    public final void sendBannerDestroyed() {
        n nVar = n.c;
        if (sendBannerDestroyed$lambda$20(m.a(nVar, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1(this, ""))).invoke()) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$21(m.a(nVar, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2(this, ""))), "native_banner_destroyed", null, null, null, null, null, 62, null);
        }
    }

    public final B0 show(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listener) {
        kotlin.jvm.internal.t.g(listener, "listener");
        O o = (O) getServiceProvider().getRegistry().getService("show_scope", kotlin.jvm.internal.P.b(O.class));
        return i.d(o, null, null, new 1((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.P.b(LegacyShowUseCase.class)), str, unityAdsShowOptions, listener, o, null), 3, null);
    }

    public UnityAdsSDK(IServiceProvider serviceProvider) {
        kotlin.jvm.internal.t.g(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    public final B0 getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        return getToken(null, iUnityAdsTokenListener);
    }

    public final B0 getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        n nVar = n.c;
        initialize(getToken$lambda$6(m.a(nVar, new UnityAdsSDK$getToken$$inlined$inject$default$1(this, ""))).invoke(), "get_token");
        Ca.l a = m.a(nVar, new UnityAdsSDK$getToken$$inlined$inject$default$2(this, ""));
        Ca.l a2 = m.a(nVar, new UnityAdsSDK$getToken$$inlined$inject$default$3(this, ""));
        O o = (O) getServiceProvider().getRegistry().getService("get_token_scope", kotlin.jvm.internal.P.b(O.class));
        return i.d(o, null, null, new 2(tokenConfiguration, iUnityAdsTokenListener, o, a2, a, null), 3, null);
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }
}
