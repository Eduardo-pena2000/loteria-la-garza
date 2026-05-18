package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb", f = "InitializeStateLoadWeb.kt", l = {39}, m = "doWork-gIAlu-s")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateLoadWeb$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$1(InitializeStateLoadWeb initializeStateLoadWeb, e eVar) {
        super(eVar);
        this.this$0 = initializeStateLoadWeb;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object obj2 = this.this$0.doWork-gIAlu-s((InitializeStateLoadWeb.Params) null, (e) this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
