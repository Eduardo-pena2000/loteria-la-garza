package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;

@f(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", f = "ConfigFileFromLocalStorage.kt", l = {27}, m = "doWork-gIAlu-s")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConfigFileFromLocalStorage$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigFileFromLocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$1(ConfigFileFromLocalStorage configFileFromLocalStorage, e eVar) {
        super(eVar);
        this.this$0 = configFileFromLocalStorage;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object obj2 = this.this$0.doWork-gIAlu-s((ConfigFileFromLocalStorage.Params) null, (e) this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
