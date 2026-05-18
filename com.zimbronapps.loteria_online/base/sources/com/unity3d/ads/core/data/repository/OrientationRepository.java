package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.p;
import android.app.Activity;
import cb.K;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import fb.N;
import fb.P;
import fb.g;
import fb.z;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OrientationRepository {
    private final z _resumedActivityOrientation;
    private final K defaultDispatcher;
    private final AndroidGetLifecycleFlow getLifecycleFlow;
    private final z isRunning;
    private final N resumedActivityOrientation;

    public /* synthetic */ class 3 extends F {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(LifecycleEvent.class, "activity", "getActivity()Ljava/lang/ref/WeakReference;", 0);
        }

        public Object get(Object obj) {
            return ((LifecycleEvent) obj).getActivity();
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 4 extends l implements p {
        /* synthetic */ Object L$0;
        int label;

        public 4(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            4 r0 = OrientationRepository.this.new 4(eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            WeakReference weakReference = (WeakReference) this.L$0;
            z access$get_resumedActivityOrientation$p = OrientationRepository.access$get_resumedActivityOrientation$p(OrientationRepository.this);
            Activity activity = (Activity) weakReference.get();
            access$get_resumedActivityOrientation$p.setValue(b.d(activity != null ? activity.getRequestedOrientation() : -1));
            return I.a;
        }

        public final Object invoke(WeakReference weakReference, e eVar) {
            return ((4) create(weakReference, eVar)).invokeSuspend(I.a);
        }
    }

    public OrientationRepository(AndroidGetLifecycleFlow getLifecycleFlow, K defaultDispatcher) {
        kotlin.jvm.internal.t.g(getLifecycleFlow, "getLifecycleFlow");
        kotlin.jvm.internal.t.g(defaultDispatcher, "defaultDispatcher");
        this.getLifecycleFlow = getLifecycleFlow;
        this.defaultDispatcher = defaultDispatcher;
        this.isRunning = P.a(Boolean.FALSE);
        z a = P.a(-1);
        this._resumedActivityOrientation = a;
        this.resumedActivityOrientation = a;
    }

    public static final /* synthetic */ z access$get_resumedActivityOrientation$p(OrientationRepository orientationRepository) {
        return orientationRepository._resumedActivityOrientation;
    }

    public final N getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        z zVar = this.isRunning;
        do {
            value = zVar.getValue();
            bool = (Boolean) value;
            bool.booleanValue();
        } while (!zVar.e(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        g.z(g.C(new OrientationRepository$invoke$$inlined$map$1(new OrientationRepository$invoke$$inlined$filterIsInstance$1(this.getLifecycleFlow.invoke()), 3.INSTANCE), new 4(null)), cb.P.a(this.defaultDispatcher));
    }
}
