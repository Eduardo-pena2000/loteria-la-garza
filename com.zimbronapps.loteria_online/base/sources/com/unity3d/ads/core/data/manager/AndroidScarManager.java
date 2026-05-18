package com.unity3d.ads.core.data.manager;

import Ca.I;
import Ca.s;
import Ca.t;
import Da.r;
import Da.v;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.h;
import Ia.l;
import Qa.p;
import Qa.q;
import android.content.Context;
import cb.O;
import cb.c1;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import fb.D;
import fb.g;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v9.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {134}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ List $adFormat;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(List list, AndroidScarManager androidScarManager, e eVar) {
            super(2, eVar);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$adFormat, this.this$0, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                List list = this.$adFormat;
                AndroidScarManager androidScarManager = this.this$0;
                this.L$0 = list;
                this.L$1 = androidScarManager;
                this.label = 1;
                cb.p pVar = new cb.p(Ha.b.c(this), 1);
                pVar.E();
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        d unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                        if (unityAdFormat == d.a) {
                            unityAdFormat = null;
                        }
                        if (unityAdFormat != null) {
                            arrayList.add(unityAdFormat);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    pVar.resumeWith(s.b(null));
                } else {
                    AndroidScarManager.access$getGmaBridge$p(androidScarManager).getSCARBiddingSignals((List) arrayList, new BiddingSignalsHandler(true, new AndroidScarManager$getSignals$2$1$1(pVar)));
                }
                obj = pVar.w();
                if (obj == c.f()) {
                    h.c(this);
                }
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

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
        public static final class 1 extends l implements p {
            int label;
            final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AndroidScarManager androidScarManager, e eVar) {
                super(2, eVar);
                this.this$0 = androidScarManager;
            }

            public final e create(Object obj, e eVar) {
                return new 1(this.this$0, eVar);
            }

            public final Object invoke(fb.f fVar, e eVar) {
                return ((1) create(fVar, eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                c.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                AndroidScarManager.access$getGmaBridge$p(this.this$0).getVersion();
                return I.a;
            }
        }

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidScarManager.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                D E = g.E(AndroidScarManager.access$getScarEventReceiver$p(AndroidScarManager.this).getVersionFlow(), new 1(AndroidScarManager.this, null));
                this.label = 1;
                obj = g.s(E, this);
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

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", l = {93}, m = "loadAd")
    public static final class 1 extends Ia.d {
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ String $adString;
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ boolean $canSkip;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        final /* synthetic */ int $videoLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z, String str, String str2, String str3, String str4, int i, e eVar) {
            super(2, eVar);
            this.$canSkip = z;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i;
        }

        public final e create(Object obj, e eVar) {
            return AndroidScarManager.this.new 2(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, eVar);
        }

        public final Object invoke(fb.f fVar, e eVar) {
            return ((2) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AndroidScarManager.access$getGmaBridge$p(AndroidScarManager.this).load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.access$getScarTimeHackFixer$p(AndroidScarManager.this).invoke(this.$videoLength));
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class 3 extends l implements p {
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(String str, e eVar) {
            super(2, eVar);
            this.$placementId = str;
        }

        public final e create(Object obj, e eVar) {
            3 r0 = new 3(this.$placementId, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(GmaEventData gmaEventData, e eVar) {
            return ((3) create(gmaEventData, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            return Ia.b.a((v.q(com.unity3d.scar.adapter.common.c.k, com.unity3d.scar.adapter.common.c.p).contains(gmaEventData.getGmaEvent()) && kotlin.jvm.internal.t.c(gmaEventData.getPlacementId(), this.$placementId)) || v.q(com.unity3d.scar.adapter.common.c.F, com.unity3d.scar.adapter.common.c.b, com.unity3d.scar.adapter.common.c.n).contains(gmaEventData.getGmaEvent()));
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ v9.c $scarAdMetadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context, BannerView bannerView, String str, v9.c cVar, UnityBannerSize unityBannerSize, e eVar) {
            super(2, eVar);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = cVar;
            this.$bannerSize = unityBannerSize;
        }

        public final e create(Object obj, e eVar) {
            return AndroidScarManager.this.new 1(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, eVar);
        }

        public final Object invoke(fb.f fVar, e eVar) {
            return ((1) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AndroidScarManager.access$getGmaBridge$p(AndroidScarManager.this).loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, String str2, e eVar) {
            super(2, eVar);
            this.$placementId = str;
            this.$queryId = str2;
        }

        public final e create(Object obj, e eVar) {
            return AndroidScarManager.this.new 1(this.$placementId, this.$queryId, eVar);
        }

        public final Object invoke(fb.f fVar, e eVar) {
            return ((1) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AndroidScarManager.access$getGmaBridge$p(AndroidScarManager.this).show(this.$placementId, this.$queryId);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {127}, m = "invokeSuspend")
    public static final class 2 extends l implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public 2(e eVar) {
            super(3, eVar);
        }

        public final Object invoke(fb.f fVar, GmaEventData gmaEventData, e eVar) {
            2 r0 = new 2(eVar);
            r0.L$0 = fVar;
            r0.L$1 = gmaEventData;
            return r0.invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            GmaEventData gmaEventData;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.f fVar = (fb.f) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (fVar.emit(gmaEventData2, this) == f) {
                    return f;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                t.b(obj);
            }
            return Ia.b.a(!r.O(new com.unity3d.scar.adapter.common.c[]{com.unity3d.scar.adapter.common.c.E, com.unity3d.scar.adapter.common.c.q, com.unity3d.scar.adapter.common.c.v, com.unity3d.scar.adapter.common.c.u}, gmaEventData.getGmaEvent()));
        }
    }

    public AndroidScarManager(CommonScarEventReceiver scarEventReceiver, GMAScarAdapterBridge gmaBridge, ScarTimeHackFixer scarTimeHackFixer) {
        kotlin.jvm.internal.t.g(scarEventReceiver, "scarEventReceiver");
        kotlin.jvm.internal.t.g(gmaBridge, "gmaBridge");
        kotlin.jvm.internal.t.g(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    public static final /* synthetic */ GMAScarAdapterBridge access$getGmaBridge$p(AndroidScarManager androidScarManager) {
        return androidScarManager.gmaBridge;
    }

    public static final /* synthetic */ CommonScarEventReceiver access$getScarEventReceiver$p(AndroidScarManager androidScarManager) {
        return androidScarManager.scarEventReceiver;
    }

    public static final /* synthetic */ ScarTimeHackFixer access$getScarTimeHackFixer$p(AndroidScarManager androidScarManager) {
        return androidScarManager.scarTimeHackFixer;
    }

    public Object getSignals(List list, e eVar) {
        return c1.d(50000L, new 2(list, this, null), eVar);
    }

    public Object getVersion(e eVar) {
        return c1.d(5000L, new 2(null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, Ga.e r23) {
        /*
            r16 = this;
            r9 = r16
            r0 = r23
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.1
            if (r1 == 0) goto L18
            r1 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = (com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.label = r2
        L16:
            r10 = r1
            goto L1e
        L18:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r10.result
            java.lang.Object r11 = Ha.c.f()
            int r1 = r10.label
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L38
            if (r1 != r13) goto L30
            Ca.t.b(r0)
            goto L74
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            Ca.t.b(r0)
            v9.d r0 = v9.d.b
            java.lang.String r0 = r0.toString()
            r1 = r17
            boolean r2 = Za.B.z(r1, r0, r13)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r9.scarEventReceiver
            fb.D r14 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r15 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r21
            r5 = r19
            r6 = r20
            r7 = r22
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            fb.D r0 = fb.g.E(r14, r15)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r2 = r18
            r1.<init>(r2, r12)
            r10.label = r13
            java.lang.Object r0 = fb.g.t(r0, r1, r10)
            if (r0 != r11) goto L74
            return r11
        L74:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.c r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.k
            if (r1 == r2) goto L80
            r12 = r0
        L80:
            com.unity3d.ads.core.domain.scar.GmaEventData r12 = (com.unity3d.ads.core.domain.scar.GmaEventData) r12
            if (r12 == 0) goto La6
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.append(r2)
            java.lang.String r2 = r12.getErrorMessage()
            if (r2 != 0) goto L9a
            com.unity3d.scar.adapter.common.c r2 = r12.getGmaEvent()
        L9a:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r2, r1)
            throw r0
        La6:
            Ca.I r0 = Ca.I.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, Ga.e):java.lang.Object");
    }

    public fb.e loadBannerAd(Context context, BannerView bannerView, v9.c scarAdMetadata, UnityBannerSize bannerSize, String opportunityId) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(bannerView, "bannerView");
        kotlin.jvm.internal.t.g(scarAdMetadata, "scarAdMetadata");
        kotlin.jvm.internal.t.g(bannerSize, "bannerSize");
        kotlin.jvm.internal.t.g(opportunityId, "opportunityId");
        return new AndroidScarManager$loadBannerAd$$inlined$filter$1(g.D(this.scarEventReceiver.getGmaEventFlow(), new 1(context, bannerView, opportunityId, scarAdMetadata, bannerSize, null)), opportunityId);
    }

    public fb.e show(String placementId, String queryId) {
        kotlin.jvm.internal.t.g(placementId, "placementId");
        kotlin.jvm.internal.t.g(queryId, "queryId");
        return g.L(g.E(this.scarEventReceiver.getGmaEventFlow(), new 1(placementId, queryId, null)), new 2(null));
    }
}
