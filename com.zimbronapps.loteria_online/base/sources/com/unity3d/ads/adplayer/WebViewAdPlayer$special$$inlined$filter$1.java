package com.unity3d.ads.adplayer;

import Ca.I;
import Ha.c;
import Ia.d;
import fb.e;
import fb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewAdPlayer$special$$inlined$filter$1 implements e {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public static final class 2 implements f {
        final /* synthetic */ f $this_unsafeFlow;

        @Ia.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
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

        public 2(f fVar) {
            this.$this_unsafeFlow = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, Ga.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$.inlined.filter.1.2.1
                if (r0 == 0) goto L13
                r0 = r7
                com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$.inlined.filter.1.2.1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
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
                com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                java.lang.String[] r4 = new java.lang.String[]{r4}
                java.lang.String r2 = r2.getLocation()
                boolean r2 = Da.r.O(r4, r2)
                if (r2 == 0) goto L52
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L52
                return r1
            L52:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.2.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public WebViewAdPlayer$special$$inlined$filter$1(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(f fVar, Ga.e eVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new 2(fVar), eVar);
        return collect == c.f() ? collect : I.a;
    }
}
