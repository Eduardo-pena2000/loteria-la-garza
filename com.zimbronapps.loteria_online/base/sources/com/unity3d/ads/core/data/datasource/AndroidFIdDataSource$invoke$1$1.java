package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.t;
import Ga.e;
import Ga.k;
import Ha.c;
import Ia.f;
import Ia.h;
import Ia.l;
import Qa.p;
import cb.O;
import com.google.android.gms.tasks.Task;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends l implements p {
    final /* synthetic */ Task $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task task, e eVar) {
        super(2, eVar);
        this.$task = task;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidFIdDataSource$invoke$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            Task task = this.$task;
            this.L$0 = task;
            this.label = 1;
            k kVar = new k(Ha.b.c(this));
            task.addOnSuccessListener(new AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0(new AndroidFIdDataSource$invoke$1$1$1$1(kVar)));
            task.addOnFailureListener(new AndroidFIdDataSource$invoke$1$1$1$2(kVar));
            obj = kVar.a();
            if (obj == c.f()) {
                h.c(this);
            }
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
