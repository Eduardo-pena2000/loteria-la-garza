package com.unity3d.ads.core.data.manager;

import Ca.I;
import Ca.t;
import Da.r;
import Da.v;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import Qa.q;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import fb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidOfferwallManager implements OfferwallManager {
    private final OfferwallAdapterBridge offerwallBridge;

    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", l = {28}, m = "loadAd")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, e eVar) {
            super(2, eVar);
            this.$placementName = str;
        }

        public final e create(Object obj, e eVar) {
            return AndroidOfferwallManager.this.new 2(this.$placementName, eVar);
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
            AndroidOfferwallManager.access$getOfferwallBridge$p(AndroidOfferwallManager.this).loadAd(this.$placementName);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class 3 extends l implements p {
        final /* synthetic */ String $placementName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(String str, e eVar) {
            super(2, eVar);
            this.$placementName = str;
        }

        public final e create(Object obj, e eVar) {
            3 r0 = new 3(this.$placementName, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(OfferwallEventData offerwallEventData, e eVar) {
            return ((3) create(offerwallEventData, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            return Ia.b.a(v.q(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && kotlin.jvm.internal.t.c(offerwallEventData.getPlacementName(), this.$placementName));
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, e eVar) {
            super(2, eVar);
            this.$placementName = str;
        }

        public final e create(Object obj, e eVar) {
            return AndroidOfferwallManager.this.new 1(this.$placementName, eVar);
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
            AndroidOfferwallManager.access$getOfferwallBridge$p(AndroidOfferwallManager.this).showAd(this.$placementName);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {44}, m = "invokeSuspend")
    public static final class 2 extends l implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public 2(e eVar) {
            super(3, eVar);
        }

        public final Object invoke(fb.f fVar, OfferwallEventData offerwallEventData, e eVar) {
            2 r0 = new 2(eVar);
            r0.L$0 = fVar;
            r0.L$1 = offerwallEventData;
            return r0.invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            OfferwallEventData offerwallEventData;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.f fVar = (fb.f) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (fVar.emit(offerwallEventData2, this) == f) {
                    return f;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                t.b(obj);
            }
            return Ia.b.a(!r.O(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }
    }

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallBridge) {
        kotlin.jvm.internal.t.g(offerwallBridge, "offerwallBridge");
        this.offerwallBridge = offerwallBridge;
    }

    public static final /* synthetic */ OfferwallAdapterBridge access$getOfferwallBridge$p(AndroidOfferwallManager androidOfferwallManager) {
        return androidOfferwallManager.offerwallBridge;
    }

    public Object getVersion(e eVar) {
        return this.offerwallBridge.getVersion();
    }

    public Object isAdReady(String str, e eVar) {
        return Ia.b.a(this.offerwallBridge.isAdReady(str));
    }

    public Object isConnected(e eVar) {
        return Ia.b.a(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(java.lang.String r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            Ca.t.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            Ca.t.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Offerwall Manager - loadAd: "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r7)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r7 = r5.offerwallBridge
            fb.D r7 = r7.getOfferwallEventFlow()
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2
            r2.<init>(r6, r4)
            fb.D r7 = fb.g.E(r7, r2)
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = fb.g.t(r7, r2, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r6 = r7
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r6 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r6
            com.unity3d.services.ads.offerwall.OfferwallEvent r6 = r6.getOfferwallEvent()
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            if (r6 == r0) goto L72
            r4 = r7
        L72:
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r4
            if (r4 == 0) goto L98
            com.unity3d.ads.core.data.model.exception.LoadException r6 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Error loading offerwall ad: "
            r7.append(r0)
            java.lang.String r0 = r4.getErrorMessage()
            if (r0 != 0) goto L8c
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = r4.getOfferwallEvent()
        L8c:
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r0 = 0
            r6.<init>(r0, r7)
            throw r6
        L98:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd(java.lang.String, Ga.e):java.lang.Object");
    }

    public fb.e showAd(String placementName) {
        kotlin.jvm.internal.t.g(placementName, "placementName");
        DeviceLog.debug("Offerwall Manager - showAd: " + placementName);
        return g.L(g.E(this.offerwallBridge.getOfferwallEventFlow(), new 1(placementName, null)), new 2(null));
    }
}
