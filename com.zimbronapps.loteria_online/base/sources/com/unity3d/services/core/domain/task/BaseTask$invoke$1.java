package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import com.unity3d.services.core.domain.task.BaseTask;

@f(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BaseTask$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(e eVar) {
        super(eVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object obj2 = BaseTask.DefaultImpls.invoke-gIAlu-s(null, null, this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
