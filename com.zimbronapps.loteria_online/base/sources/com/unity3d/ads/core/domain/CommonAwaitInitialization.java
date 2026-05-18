package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.c1;
import com.unity3d.ads.core.data.repository.SessionRepository;
import fb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonAwaitInitialization implements AwaitInitialization {
    private final SessionRepository sessionRepository;

    @f(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return CommonAwaitInitialization.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1 commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1 = new CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1(CommonAwaitInitialization.access$getSessionRepository$p(CommonAwaitInitialization.this).getObserveInitializationState());
                this.label = 1;
                obj = g.s(commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1, this);
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

    public CommonAwaitInitialization(SessionRepository sessionRepository) {
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(CommonAwaitInitialization commonAwaitInitialization) {
        return commonAwaitInitialization.sessionRepository;
    }

    public Object invoke(long j, e eVar) {
        return c1.d(j, new 2(null), eVar);
    }
}
