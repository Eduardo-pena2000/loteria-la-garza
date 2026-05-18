package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h0 extends zau {
    public final /* synthetic */ j0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, Looper looper) {
        super(looper);
        this.a = j0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i);
            return;
        }
        com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) message.obj;
        synchronized (j0.c(this.a)) {
            try {
                j0 j0Var = (j0) com.google.android.gms.common.internal.t.l(j0.b(this.a));
                if (iVar == null) {
                    j0.d(j0Var, new Status(13, "Transform returned null"));
                } else {
                    j0Var.e(iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
