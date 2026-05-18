package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.Q;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.p;
import Qa.q;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import fb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {61}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidShow this$0;

        @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class 2 extends l implements p {
            final /* synthetic */ AdObject $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, e eVar) {
                super(2, eVar);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$showOptions = unityAdsShowOptions;
            }

            public final e create(Object obj, e eVar) {
                return new 2(this.$ad, this.this$0, this.$adObject, this.$showOptions, eVar);
            }

            public final Object invoke(fb.f fVar, e eVar) {
                return ((2) create(fVar, eVar)).invokeSuspend(I.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    Ha.c.f()
                    int r0 = r13.label
                    if (r0 != 0) goto Lba
                    Ca.t.b(r14)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.core.domain.AndroidShow r0 = r13.this$0
                    com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                    com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                    java.lang.String r2 = r0.getKey()
                    java.lang.Object r1 = r1.get(r2)
                    java.lang.String r2 = "get(key)"
                    r3 = 0
                    if (r1 == 0) goto L2e
                    kotlin.jvm.internal.t.f(r1, r2)
                    boolean r4 = r1 instanceof java.lang.String
                    if (r4 == 0) goto L2b
                    goto L2c
                L2b:
                    r1 = r3
                L2c:
                    if (r1 != 0) goto L2f
                L2e:
                    r1 = r3
                L2f:
                    com.unity3d.services.core.misc.JsonStorage r4 = r0.getJsonStorage()
                    java.lang.String r5 = r0.getKey()
                    java.lang.Object r4 = r4.get(r5)
                    if (r4 == 0) goto L4b
                    kotlin.jvm.internal.t.f(r4, r2)
                    com.unity3d.services.core.misc.JsonStorage r2 = r0.getJsonStorage()
                    java.lang.String r0 = r0.getKey()
                    r2.delete(r0)
                L4b:
                    java.lang.String r1 = (java.lang.String) r1
                    r14.setPlayerServerId(r1)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$adObject
                    fb.z r14 = r14.getState()
                    com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
                    r14.setValue(r0)
                    com.unity3d.ads.core.domain.AndroidShow r14 = r13.this$0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = com.unity3d.ads.core.domain.AndroidShow.access$getSendDiagnosticEvent$p(r14)
                    com.unity3d.ads.core.data.model.AdObject r9 = r13.$adObject
                    r11 = 46
                    r12 = 0
                    java.lang.String r5 = "native_show_event_flow_started"
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r10 = 0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.adplayer.AdPlayer r14 = r14.getAdPlayer()
                    com.unity3d.ads.UnityAdsShowOptions r0 = r13.$showOptions
                    if (r0 == 0) goto L83
                    org.json.JSONObject r0 = r0.getData()
                    if (r0 == 0) goto L83
                    java.util.Map r3 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
                L83:
                    r5 = r3
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r7 = r0.isScarAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r9 = r0.getScarAdString()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r8 = r0.getScarQueryId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r10 = r0.getScarAdUnitId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r11 = r0.isOfferwallAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r12 = r0.getOfferwallPlacementName()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r6 = r0.getPlacementId()
                    com.unity3d.ads.adplayer.AndroidShowOptions r0 = new com.unity3d.ads.adplayer.AndroidShowOptions
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                    r14.show(r0)
                    Ca.I r14 = Ca.I.a
                    return r14
                Lba:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.invoke.1.2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class 3 extends l implements q {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(AndroidShow androidShow, AdObject adObject, ByteString byteString, e eVar) {
                super(3, eVar);
                this.this$0 = androidShow;
                this.$adObject = adObject;
                this.$opportunityId = byteString;
            }

            public final Object invoke(fb.f fVar, Throwable th, e eVar) {
                return new 3(this.this$0, this.$adObject, this.$opportunityId, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                c.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidShow.access$getSendDiagnosticEvent$p(this.this$0), "native_show_event_flow_completed", null, null, null, this.$adObject, null, 46, null);
                this.$adObject.getState().setValue(AdObjectState.COMPLETED);
                AndroidShow.access$getAdRepository$p(this.this$0).removeAd(this.$opportunityId);
                return I.a;
            }
        }

        @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {58}, m = "invokeSuspend")
        public static final class 4 extends l implements q {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public 4(e eVar) {
                super(3, eVar);
            }

            public final Object invoke(fb.f fVar, ShowEvent showEvent, e eVar) {
                4 r0 = new 4(eVar);
                r0.L$0 = fVar;
                r0.L$1 = showEvent;
                return r0.invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                ShowEvent showEvent;
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    fb.f fVar = (fb.f) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (fVar.emit(showEvent2, this) == f) {
                        return f;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    t.b(obj);
                }
                return b.a(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }
        }

        public static final class 5 implements fb.f {
            final /* synthetic */ fb.f $$this$flow;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ AndroidShow this$0;

            public 5(AndroidShow androidShow, AdObject adObject, fb.f fVar) {
                this.this$0 = androidShow;
                this.$adObject = adObject;
                this.$$this$flow = fVar;
            }

            public final Object emit(ShowEvent showEvent, e eVar) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidShow.access$getSendDiagnosticEvent$p(this.this$0), "native_show_event_flow_collected", null, Q.f(x.a("event", showEvent.getClass().getSimpleName())), null, this.$adObject, null, 42, null);
                Object emit = this.$$this$flow.emit(showEvent, eVar);
                return emit == c.f() ? emit : I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, e eVar) {
            super(2, eVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        public final e create(Object obj, e eVar) {
            1 r0 = new 1(this.$adObject, this.this$0, this.$showOptions, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(fb.f fVar, e eVar) {
            return ((1) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.f fVar = (fb.f) this.L$0;
                if (this.$adObject.getOpportunityId().isEmpty()) {
                    throw new IllegalArgumentException("No opportunityId");
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad = AndroidShow.access$getAdRepository$p(this.this$0).getAd(opportunityId);
                if (ad == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidShow.access$getSendDiagnosticEvent$p(this.this$0), "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                fb.e L = g.L(g.B(g.D(adPlayer.getOnShowEvent(), new 2(ad, this.this$0, this.$adObject, this.$showOptions, null)), new 3(this.this$0, this.$adObject, opportunityId, null)), new 4(null));
                5 r5 = new 5(this.this$0, this.$adObject, fVar);
                this.label = 1;
                if (L.collect(r5, this) == f) {
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

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.t.g(adRepository, "adRepository");
        kotlin.jvm.internal.t.g(gameServerIdReader, "gameServerIdReader");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static final /* synthetic */ AdRepository access$getAdRepository$p(AndroidShow androidShow) {
        return androidShow.adRepository;
    }

    public static final /* synthetic */ GameServerIdReader access$getGameServerIdReader$p(AndroidShow androidShow) {
        return androidShow.gameServerIdReader;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(AndroidShow androidShow) {
        return androidShow.sendDiagnosticEvent;
    }

    public fb.e invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        kotlin.jvm.internal.t.g(adObject, "adObject");
        return g.v(new 1(adObject, this, unityAdsShowOptions, null));
    }

    public Object terminate(AdObject adObject, e eVar) {
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null) {
            return I.a;
        }
        Object destroy = adPlayer.destroy(eVar);
        return destroy == c.f() ? destroy : I.a;
    }
}
