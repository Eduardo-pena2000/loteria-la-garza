package com.unity3d.services.core.fid;

import Ca.q;
import Da.Q;
import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FIdStaticBridge extends GenericBridge {
    public FIdStaticBridge() {
        super(Q.f(new q("getInstance", new Class[]{Context.class})), false);
    }

    public String getClassName() {
        return Constants.Companion.getClassName();
    }

    public final FIdBridge getInstance(Context context) {
        t.g(context, "context");
        Object callNonVoidMethod = callNonVoidMethod("getInstance", null, context);
        if (callNonVoidMethod != null) {
            return new FIdBridge(callNonVoidMethod);
        }
        return null;
    }
}
