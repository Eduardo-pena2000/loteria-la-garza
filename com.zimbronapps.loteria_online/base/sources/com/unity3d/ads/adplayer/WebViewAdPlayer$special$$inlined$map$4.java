package com.unity3d.ads.adplayer;

import Ca.I;
import Ha.c;
import Ia.d;
import fb.e;
import fb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewAdPlayer$special$$inlined$map$4 implements e {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public static final class 2 implements f {
        final /* synthetic */ f $this_unsafeFlow;

        @Ia.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
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

        /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, Ga.e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$.inlined.map.4.2.1
                if (r0 == 0) goto L13
                r0 = r9
                com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$.inlined.map.4.2.1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L41
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                Ca.t.b(r9)
                goto L96
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                java.lang.Object r8 = r0.L$1
                com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                java.lang.Object r2 = r0.L$0
                fb.f r2 = (fb.f) r2
                Ca.t.b(r9)
                goto L55
            L41:
                Ca.t.b(r9)
                fb.f r2 = r7.$this_unsafeFlow
                com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                r0.L$0 = r2
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r9 = com.unity3d.ads.adplayer.Invocation.handle$default(r8, r5, r0, r4, r5)
                if (r9 != r1) goto L55
                return r1
            L55:
                java.lang.String r9 = r8.getLocation()
                java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.loadError"
                boolean r9 = kotlin.jvm.internal.t.c(r9, r4)
                if (r9 == 0) goto L87
                java.lang.Object[] r8 = r8.getParameters()
                java.lang.Object r8 = Da.r.U(r8)
                java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.t.e(r8, r9)
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.String r9 = "code"
                int r9 = r8.optInt(r9)
                java.lang.String r4 = "message"
                java.lang.String r8 = r8.optString(r4)
                com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                java.lang.String r6 = "errorMessage"
                kotlin.jvm.internal.t.f(r8, r6)
                r4.<init>(r8, r9)
                goto L89
            L87:
                com.unity3d.ads.adplayer.model.LoadEvent$Completed r4 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
            L89:
                r0.L$0 = r5
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r8 = r2.emit(r4, r0)
                if (r8 != r1) goto L96
                return r1
            L96:
                Ca.I r8 = Ca.I.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.2.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public WebViewAdPlayer$special$$inlined$map$4(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(f fVar, Ga.e eVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new 2(fVar), eVar);
        return collect == c.f() ? collect : I.a;
    }
}
