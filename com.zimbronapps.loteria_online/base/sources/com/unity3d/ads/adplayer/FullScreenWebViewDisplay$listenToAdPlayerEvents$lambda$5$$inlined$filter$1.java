package com.unity3d.ads.adplayer;

import Ca.I;
import Ha.c;
import Ia.d;
import fb.e;
import fb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1 implements e {
    final /* synthetic */ e $this_unsafeTransform$inlined;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    public static final class 2 implements f {
        final /* synthetic */ f $this_unsafeFlow;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        @Ia.f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {223}, m = "emit")
        public static final class 1 extends d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public 1(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return 2.this.emit(null, this);
            }
        }

        public 2(f fVar, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
            this.$this_unsafeFlow = fVar;
            this.this$0 = fullScreenWebViewDisplay;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, Ga.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$.inlined.filter.1.2.1
                if (r0 == 0) goto L13
                r0 = r7
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$.inlined.filter.1.2.1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r7)
                goto L52
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Ca.t.b(r7)
                fb.f r7 = r5.$this_unsafeFlow
                r2 = r6
                com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                java.lang.String r2 = r2.getOpportunityId()
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r5.this$0
                java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
                boolean r2 = kotlin.jvm.internal.t.c(r2, r4)
                if (r2 == 0) goto L52
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L52
                return r1
            L52:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.2.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1(e eVar, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        this.$this_unsafeTransform$inlined = eVar;
        this.this$0 = fullScreenWebViewDisplay;
    }

    public Object collect(f fVar, Ga.e eVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new 2(fVar, this.this$0), eVar);
        return collect == c.f() ? collect : I.a;
    }
}
