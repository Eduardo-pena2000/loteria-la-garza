package com.unity3d.services.core.extensions;

import Ga.e;
import Ia.d;
import Ia.f;
import Qa.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TaskExtensionsKt {

    @f(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 30}, m = "withRetry")
    public static final class 1 extends d {
        double D$0;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011e -> B:11:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013c -> B:12:0x0145). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object withRetry(long r20, int r22, double r23, java.lang.Exception r25, Qa.p r26, Ga.e r27) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Exception, Qa.p, Ga.e):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j, int i, double d, Exception exc, p pVar, e eVar, int i2, Object obj) {
        return withRetry((i2 & 1) != 0 ? 5000L : j, (i2 & 2) != 0 ? 6 : i, (i2 & 4) != 0 ? 2.0d : d, exc, pVar, eVar);
    }
}
