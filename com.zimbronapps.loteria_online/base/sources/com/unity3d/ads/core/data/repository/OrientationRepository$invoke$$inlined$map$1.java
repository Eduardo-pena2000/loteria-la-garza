package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ha.c;
import Ia.d;
import Xa.l;
import fb.e;
import fb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OrientationRepository$invoke$$inlined$map$1 implements e {
    final /* synthetic */ e $this_unsafeTransform$inlined;
    final /* synthetic */ l receiver$inlined;

    public static final class 2 implements f {
        final /* synthetic */ f $this_unsafeFlow;
        final /* synthetic */ l receiver$inlined;

        @Ia.f(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {223}, m = "emit")
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

        public 2(f fVar, l lVar) {
            this.$this_unsafeFlow = fVar;
            this.receiver$inlined = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, Ga.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.OrientationRepository$invoke$.inlined.map.1.2.1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.OrientationRepository$invoke$.inlined.map.1.2.1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r6)
                goto L47
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Ca.t.b(r6)
                fb.f r6 = r4.$this_unsafeFlow
                com.unity3d.ads.core.domain.LifecycleEvent r5 = (com.unity3d.ads.core.domain.LifecycleEvent) r5
                Xa.l r2 = r4.receiver$inlined
                java.lang.Object r5 = r2.get(r5)
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L47
                return r1
            L47:
                Ca.I r5 = Ca.I.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.2.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public OrientationRepository$invoke$$inlined$map$1(e eVar, l lVar) {
        this.$this_unsafeTransform$inlined = eVar;
        this.receiver$inlined = lVar;
    }

    public Object collect(f fVar, Ga.e eVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new 2(fVar, this.receiver$inlined), eVar);
        return collect == c.f() ? collect : I.a;
    }
}
