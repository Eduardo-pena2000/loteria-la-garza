package com.unity3d.services.core.domain.task;

import Ca.I;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 101, 109}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateConfigWithLoader$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, e eVar) {
        super(2, eVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    public final e create(Object obj, e eVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, eVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b2 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #7 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:9:0x01e0, B:10:0x0211, B:27:0x01ac, B:29:0x01b2, B:33:0x01ea, B:34:0x01fc, B:37:0x01a1, B:43:0x0164, B:45:0x016a, B:47:0x01fd, B:48:0x020a, B:57:0x020b, B:60:0x0159, B:62:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ea A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #7 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:9:0x01e0, B:10:0x0211, B:27:0x01ac, B:29:0x01b2, B:33:0x01ea, B:34:0x01fc, B:37:0x01a1, B:43:0x0164, B:45:0x016a, B:47:0x01fd, B:48:0x020a, B:57:0x020b, B:60:0x0159, B:62:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a A[Catch: all -> 0x0024, CancellationException -> 0x0027, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:9:0x01e0, B:10:0x0211, B:27:0x01ac, B:29:0x01b2, B:33:0x01ea, B:34:0x01fc, B:37:0x01a1, B:43:0x0164, B:45:0x016a, B:47:0x01fd, B:48:0x020a, B:57:0x020b, B:60:0x0159, B:62:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020b A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #7 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:9:0x01e0, B:10:0x0211, B:27:0x01ac, B:29:0x01b2, B:33:0x01ea, B:34:0x01fc, B:37:0x01a1, B:43:0x0164, B:45:0x016a, B:47:0x01fd, B:48:0x020a, B:57:0x020b, B:60:0x0159, B:62:0x0086), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
