package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;

@f(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {33, 34, 39}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends l implements p {
    final /* synthetic */ AdObject $adObject;
    int label;

    @f(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {41}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(AdObject adObject, e eVar) {
            super(2, eVar);
            this.$adObject = adObject;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$adObject, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                this.$adObject.getState().setValue(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                this.label = 1;
                if (adPlayer.destroy(this) == f) {
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
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, e eVar) {
        super(2, eVar);
        this.$adObject = adObject;
    }

    public final e create(Object obj, e eVar) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(o, eVar)).invokeSuspend(I.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = Ha.c.f()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            Ca.t.b(r7)
            goto L7b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            Ca.t.b(r7)
            goto L5a
        L21:
            Ca.t.b(r7)
            goto L4e
        L25:
            Ca.t.b(r7)
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            fb.z r7 = r7.getTtl()
            java.lang.Object r7 = r7.getValue()
            ab.b r7 = (ab.b) r7
            if (r7 == 0) goto L3b
        L36:
            long r4 = r7.M()
            goto L51
        L3b:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            fb.z r7 = r7.getTtl()
            fb.e r7 = fb.g.r(r7)
            r6.label = r4
            java.lang.Object r7 = fb.g.s(r7, r6)
            if (r7 != r0) goto L4e
            return r0
        L4e:
            ab.b r7 = (ab.b) r7
            goto L36
        L51:
            r6.label = r3
            java.lang.Object r7 = cb.Z.b(r4, r6)
            if (r7 != r0) goto L5a
            return r0
        L5a:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            fb.z r7 = r7.getState()
            java.lang.Object r7 = r7.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r7 == r1) goto L7b
            cb.N0 r7 = cb.N0.a
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r1 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r3 = r6.$adObject
            r4 = 0
            r1.<init>(r3, r4)
            r6.label = r2
            java.lang.Object r7 = cb.i.g(r7, r1, r6)
            if (r7 != r0) goto L7b
            return r0
        L7b:
            Ca.I r7 = Ca.I.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
