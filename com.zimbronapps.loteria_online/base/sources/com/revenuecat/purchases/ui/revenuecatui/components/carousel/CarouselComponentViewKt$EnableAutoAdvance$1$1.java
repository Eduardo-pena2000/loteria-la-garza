package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Ca.I;
import Ga.e;
import Ia.f;
import Ia.l;
import J.C;
import Qa.p;
import cb.O;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$EnableAutoAdvance$1$1", f = "CarouselComponentView.kt", l = {293, 301}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$EnableAutoAdvance$1$1 extends l implements p {
    final /* synthetic */ CarouselComponent.AutoAdvancePages $autoAdvance;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ C $pagerState;
    final /* synthetic */ boolean $shouldLoop;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$EnableAutoAdvance$1$1(CarouselComponent.AutoAdvancePages autoAdvancePages, C c, boolean z, int i, e eVar) {
        super(2, eVar);
        this.$autoAdvance = autoAdvancePages;
        this.$pagerState = c;
        this.$shouldLoop = z;
        this.$pageCount = i;
    }

    public final e create(Object obj, e eVar) {
        return new CarouselComponentViewKt$EnableAutoAdvance$1$1(this.$autoAdvance, this.$pagerState, this.$shouldLoop, this.$pageCount, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((CarouselComponentViewKt$EnableAutoAdvance$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    /*  JADX ERROR: iliLiI1iLLIL in pass: RegionMakerVisitor
        LI11I1ll1Ii11.iliLiI1iLLIL: Regions count limit reached
        	at LL11ILIl1lL1ii.LiiI1lLILii.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
        	at LL11ILIl1lL1ii.LiiI1lLILii.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0037 -> B:10:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:10:0x0021). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = Ha.c.f()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            Ca.t.b(r12)     // Catch: java.util.concurrent.CancellationException -> L21
            goto L21
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            Ca.t.b(r12)
            goto L31
        L1e:
            Ca.t.b(r12)
        L21:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r12 = r11.$autoAdvance
            int r12 = r12.getMsTimePerPage()
            long r4 = (long) r12
            r11.label = r3
            java.lang.Object r12 = cb.Z.a(r4, r11)
            if (r12 != r0) goto L31
            return r0
        L31:
            J.C r12 = r11.$pagerState
            boolean r12 = r12.a()
            if (r12 != 0) goto L21
            boolean r12 = r11.$shouldLoop
            if (r12 == 0) goto L46
            J.C r12 = r11.$pagerState
            int r12 = r12.v()
            int r12 = r12 + r3
        L44:
            r5 = r12
            goto L51
        L46:
            J.C r12 = r11.$pagerState
            int r12 = r12.v()
            int r12 = r12 + r3
            int r1 = r11.$pageCount
            int r12 = r12 % r1
            goto L44
        L51:
            J.C r4 = r11.$pagerState     // Catch: java.util.concurrent.CancellationException -> L21
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r12 = r11.$autoAdvance     // Catch: java.util.concurrent.CancellationException -> L21
            int r12 = r12.getMsTransitionTime()     // Catch: java.util.concurrent.CancellationException -> L21
            r1 = 0
            r6 = 6
            r7 = 0
            z.r0 r7 = z.j.j(r12, r1, r7, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L21
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L21
            r6 = 0
            r9 = 2
            r10 = 0
            r8 = r11
            java.lang.Object r12 = J.C.n(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L21
            if (r12 != r0) goto L21
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$EnableAutoAdvance$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
