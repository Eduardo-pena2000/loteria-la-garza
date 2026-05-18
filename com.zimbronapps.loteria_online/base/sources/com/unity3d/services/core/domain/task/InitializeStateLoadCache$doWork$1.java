package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache", f = "InitializeStateLoadCache.kt", l = {32}, m = "doWork-gIAlu-s")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateLoadCache$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$1(InitializeStateLoadCache initializeStateLoadCache, e eVar) {
        super(eVar);
        this.this$0 = initializeStateLoadCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object obj2 = this.this$0.doWork-gIAlu-s((InitializeStateLoadCache.Params) null, (e) this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
