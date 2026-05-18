package com.unity3d.services.core.domain.task;

import Ga.e;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface BaseTask extends IServiceComponent {

    public static final class DefaultImpls {
        public static IServiceProvider getServiceProvider(BaseTask baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object invoke-gIAlu-s(com.unity3d.services.core.domain.task.BaseTask r4, com.unity3d.services.core.domain.task.BaseParams r5, Ga.e r6) {
            /*
                boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                Ca.t.b(r6)
                Ca.s r6 = (Ca.s) r6
                java.lang.Object r4 = r6.j()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                Ca.t.b(r6)
                r0.label = r3
                java.lang.Object r4 = r4.doWork-gIAlu-s(r5, r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.invoke-gIAlu-s(com.unity3d.services.core.domain.task.BaseTask, com.unity3d.services.core.domain.task.BaseParams, Ga.e):java.lang.Object");
        }
    }

    Object doWork-gIAlu-s(BaseParams baseParams, e eVar);

    Object invoke-gIAlu-s(BaseParams baseParams, e eVar);
}
