package com.unity3d.services.core.domain.task;

import Ca.I;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, 71}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateLoadWeb$doWork$2 extends l implements p {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, e eVar) {
        super(2, eVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    public final e create(Object obj, e eVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, eVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    public final Object invoke(O o, e eVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ba A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #6 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:10:0x018d, B:11:0x01b0, B:13:0x01ba, B:16:0x01c5, B:17:0x01d7, B:20:0x01da, B:21:0x01e6, B:35:0x0168, B:37:0x016e, B:40:0x0190, B:41:0x01a2, B:74:0x015e, B:48:0x0130, B:53:0x01a3, B:56:0x0126, B:58:0x0075, B:33:0x003d, B:34:0x0155, B:50:0x0136), top: B:2:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01da A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #6 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:10:0x018d, B:11:0x01b0, B:13:0x01ba, B:16:0x01c5, B:17:0x01d7, B:20:0x01da, B:21:0x01e6, B:35:0x0168, B:37:0x016e, B:40:0x0190, B:41:0x01a2, B:74:0x015e, B:48:0x0130, B:53:0x01a3, B:56:0x0126, B:58:0x0075, B:33:0x003d, B:34:0x0155, B:50:0x0136), top: B:2:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #6 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:10:0x018d, B:11:0x01b0, B:13:0x01ba, B:16:0x01c5, B:17:0x01d7, B:20:0x01da, B:21:0x01e6, B:35:0x0168, B:37:0x016e, B:40:0x0190, B:41:0x01a2, B:74:0x015e, B:48:0x0130, B:53:0x01a3, B:56:0x0126, B:58:0x0075, B:33:0x003d, B:34:0x0155, B:50:0x0136), top: B:2:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0190 A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #6 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:10:0x018d, B:11:0x01b0, B:13:0x01ba, B:16:0x01c5, B:17:0x01d7, B:20:0x01da, B:21:0x01e6, B:35:0x0168, B:37:0x016e, B:40:0x0190, B:41:0x01a2, B:74:0x015e, B:48:0x0130, B:53:0x01a3, B:56:0x0126, B:58:0x0075, B:33:0x003d, B:34:0x0155, B:50:0x0136), top: B:2:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #3 {all -> 0x004a, blocks: (B:33:0x003d, B:34:0x0155, B:50:0x0136), top: B:2:0x000c, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a3 A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #6 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:10:0x018d, B:11:0x01b0, B:13:0x01ba, B:16:0x01c5, B:17:0x01d7, B:20:0x01da, B:21:0x01e6, B:35:0x0168, B:37:0x016e, B:40:0x0190, B:41:0x01a2, B:74:0x015e, B:48:0x0130, B:53:0x01a3, B:56:0x0126, B:58:0x0075, B:33:0x003d, B:34:0x0155, B:50:0x0136), top: B:2:0x000c, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
