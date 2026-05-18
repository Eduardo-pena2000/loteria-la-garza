package com.unity3d.services.core.network.core;

import Ca.I;
import Ha.c;
import Ia.d;
import fb.e;
import fb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1 implements e {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public static final class 2 implements f {
        final /* synthetic */ f $this_unsafeFlow;

        @Ia.f(c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2", f = "OkHttp3Client.kt", l = {223}, m = "emit")
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
        public final java.lang.Object emit(java.lang.Object r9, Ga.e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$.inlined.filter.1.2.1
                if (r0 == 0) goto L13
                r0 = r10
                com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$1 r0 = (com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$.inlined.filter.1.2.1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$1
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r10)
                goto L4c
            L29:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L31:
                Ca.t.b(r10)
                fb.f r10 = r8.$this_unsafeFlow
                r2 = r9
                java.lang.Number r2 = (java.lang.Number) r2
                long r4 = r2.longValue()
                r6 = 0
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 == 0) goto L4c
                r0.label = r3
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto L4c
                return r1
            L4c:
                Ca.I r9 = Ca.I.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1.2.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(f fVar, Ga.e eVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new 2(fVar), eVar);
        return collect == c.f() ? collect : I.a;
    }
}
