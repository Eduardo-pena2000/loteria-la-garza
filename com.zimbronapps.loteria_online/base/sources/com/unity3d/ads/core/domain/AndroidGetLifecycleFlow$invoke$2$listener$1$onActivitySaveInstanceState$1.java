package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.app.Activity;
import android.os.Bundle;
import cb.O;
import com.unity3d.ads.core.domain.LifecycleEvent;
import eb.v;
import java.lang.ref.WeakReference;

@f(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1", f = "AndroidGetLifecycleFlow.kt", l = {54}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1 extends l implements p {
    final /* synthetic */ v $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Bundle $bundle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(v vVar, Activity activity, Bundle bundle, e eVar) {
        super(2, eVar);
        this.$$this$channelFlow = vVar;
        this.$activity = activity;
        this.$bundle = bundle;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(this.$$this$channelFlow, this.$activity, this.$bundle, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            v vVar = this.$$this$channelFlow;
            LifecycleEvent.SaveInstanceState saveInstanceState = new LifecycleEvent.SaveInstanceState(new WeakReference(this.$activity), this.$bundle);
            this.label = 1;
            if (vVar.e(saveInstanceState, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
