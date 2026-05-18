package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import fb.g;

@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {177}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends l implements p {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, e eVar) {
        super(2, eVar);
        this.this$0 = androidSessionRepository;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            fb.e access$getPersistedNativeConfiguration$p = AndroidSessionRepository.access$getPersistedNativeConfiguration$p(this.this$0);
            this.label = 1;
            obj = g.s(access$getPersistedNativeConfiguration$p, this);
            if (obj == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return obj;
    }
}
