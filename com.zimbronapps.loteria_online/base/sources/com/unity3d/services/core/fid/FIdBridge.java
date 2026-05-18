package com.unity3d.services.core.fid;

import Ca.q;
import Da.Q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FIdBridge extends GenericBridge {
    private final Object instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FIdBridge(Object instance) {
        super(Q.f(new q("getAppInstanceId", new Class[0])), false);
        t.g(instance, "instance");
        this.instance = instance;
    }

    public final Task getAppInstanceId() {
        Task task = (Task) callNonVoidMethod("getAppInstanceId", this.instance, new Object[0]);
        if (task != null) {
            return task;
        }
        Task forResult = Tasks.forResult((Object) null);
        t.f(forResult, "forResult(null)");
        return forResult;
    }

    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
