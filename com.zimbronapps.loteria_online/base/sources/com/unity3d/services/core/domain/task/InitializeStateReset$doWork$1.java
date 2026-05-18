package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateReset$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, e eVar) {
        super(eVar);
        this.this$0 = initializeStateReset;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object obj2 = InitializeStateReset.doWork-gIAlu-s$suspendImpl(this.this$0, null, this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
