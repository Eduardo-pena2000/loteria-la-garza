package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;

@f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {120}, m = "executeErrorState-BWLJW6A")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeSDK$executeErrorState$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, e eVar) {
        super(eVar);
        this.this$0 = initializeSDK;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object obj2 = InitializeSDK.access$executeErrorState-BWLJW6A(this.this$0, null, null, null, this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
