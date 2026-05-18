package com.unity3d.services.core.domain.task;

import Ca.I;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.domain.task.InitializeStateReset;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateReset$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, e eVar) {
        super(2, eVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateReset$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[Catch: all -> 0x0018, CancellationException -> 0x001b, TryCatch #2 {CancellationException -> 0x001b, all -> 0x0018, blocks: (B:6:0x0014, B:7:0x0063, B:10:0x0071, B:12:0x0080, B:14:0x0086, B:16:0x0094, B:17:0x0096, B:19:0x0099, B:21:0x00a5, B:23:0x00b0, B:26:0x00b2, B:36:0x00bb, B:37:0x00c2, B:38:0x00c3, B:39:0x00ca, B:40:0x0069, B:41:0x0070, B:45:0x002d, B:47:0x003a, B:49:0x003f, B:51:0x0047), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[Catch: all -> 0x0018, CancellationException -> 0x001b, TryCatch #2 {CancellationException -> 0x001b, all -> 0x0018, blocks: (B:6:0x0014, B:7:0x0063, B:10:0x0071, B:12:0x0080, B:14:0x0086, B:16:0x0094, B:17:0x0096, B:19:0x0099, B:21:0x00a5, B:23:0x00b0, B:26:0x00b2, B:36:0x00bb, B:37:0x00c2, B:38:0x00c3, B:39:0x00ca, B:40:0x0069, B:41:0x0070, B:45:0x002d, B:47:0x003a, B:49:0x003f, B:51:0x0047), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
