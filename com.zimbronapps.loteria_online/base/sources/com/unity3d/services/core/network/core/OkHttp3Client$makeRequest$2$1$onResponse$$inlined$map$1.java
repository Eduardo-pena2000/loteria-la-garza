package com.unity3d.services.core.network.core;

import Ca.I;
import Ha.c;
import Ia.d;
import fb.e;
import fb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1 implements e {
    final /* synthetic */ long $contentLength$inlined;
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public static final class 2 implements f {
        final /* synthetic */ long $contentLength$inlined;
        final /* synthetic */ f $this_unsafeFlow;

        @Ia.f(c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2", f = "OkHttp3Client.kt", l = {223}, m = "emit")
        public static final class 1 extends d {
            Object L$0;
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

        public 2(f fVar, long j) {
            this.$this_unsafeFlow = fVar;
            this.$contentLength$inlined = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, Ga.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$.inlined.map.1.2.1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$1 r0 = (com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$.inlined.map.1.2.1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r8)
                goto L56
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                Ca.t.b(r8)
                fb.f r8 = r6.$this_unsafeFlow
                java.lang.Number r7 = (java.lang.Number) r7
                long r4 = r7.longValue()
                float r7 = (float) r4
                long r4 = r6.$contentLength$inlined
                float r2 = (float) r4
                float r7 = r7 / r2
                r2 = 100
                float r2 = (float) r2
                float r7 = r7 * r2
                int r7 = Sa.c.d(r7)
                java.lang.Integer r7 = Ia.b.d(r7)
                r0.label = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L56
                return r1
            L56:
                Ca.I r7 = Ca.I.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1.2.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1(e eVar, long j) {
        this.$this_unsafeTransform$inlined = eVar;
        this.$contentLength$inlined = j;
    }

    public Object collect(f fVar, Ga.e eVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new 2(fVar, this.$contentLength$inlined), eVar);
        return collect == c.f() ? collect : I.a;
    }
}
