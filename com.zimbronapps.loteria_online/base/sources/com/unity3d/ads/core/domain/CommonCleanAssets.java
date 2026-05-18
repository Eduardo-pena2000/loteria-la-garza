package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonCleanAssets implements CleanAssets {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @f(c = "com.unity3d.ads.core.domain.CommonCleanAssets", f = "CommonCleanAssets.kt", l = {18, 19}, m = "invoke")
    public static final class 1 extends d {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCleanAssets.this.invoke(this);
        }
    }

    public CommonCleanAssets(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(cacheRepository, "cacheRepository");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(Ga.e r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.CommonCleanAssets.invoke.1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonCleanAssets.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            long r1 = r0.J$1
            long r3 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonCleanAssets r0 = (com.unity3d.ads.core.domain.CommonCleanAssets) r0
            Ca.t.b(r15)
            goto L7a
        L34:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3c:
            long r4 = r0.J$0
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.CommonCleanAssets r2 = (com.unity3d.ads.core.domain.CommonCleanAssets) r2
            Ca.t.b(r15)
            goto L60
        L46:
            Ca.t.b(r15)
            ab.k r15 = ab.k.a
            long r5 = r15.b()
            com.unity3d.ads.core.data.repository.CacheRepository r15 = r14.cacheRepository
            r0.L$0 = r14
            r0.J$0 = r5
            r0.label = r4
            java.lang.Object r15 = r15.getCacheSize(r0)
            if (r15 != r1) goto L5e
            return r1
        L5e:
            r2 = r14
            r4 = r5
        L60:
            java.lang.Number r15 = (java.lang.Number) r15
            long r6 = r15.longValue()
            com.unity3d.ads.core.data.repository.CacheRepository r15 = r2.cacheRepository
            r0.L$0 = r2
            r0.J$0 = r4
            r0.J$1 = r6
            r0.label = r3
            java.lang.Object r15 = r15.clearCache(r0)
            if (r15 != r1) goto L77
            return r1
        L77:
            r0 = r2
            r3 = r4
            r1 = r6
        L7a:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r0.sendDiagnosticEvent
            ab.k$a r15 = ab.k.a.b(r3)
            double r3 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r15)
            java.lang.Double r7 = Ia.b.b(r3)
            r15 = 1024(0x400, float:1.435E-42)
            long r3 = (long) r15
            long r1 = r1 / r3
            int r15 = (int) r1
            java.lang.Integer r15 = Ia.b.d(r15)
            java.lang.String r0 = "size_kb"
            Ca.q r15 = Ca.x.a(r0, r15)
            java.util.Map r9 = Da.Q.f(r15)
            r12 = 52
            r13 = 0
            java.lang.String r6 = "native_clean_assets_task_success_time"
            r8 = 0
            r10 = 0
            r11 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            Ca.I r15 = Ca.I.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonCleanAssets.invoke(Ga.e):java.lang.Object");
    }
}
