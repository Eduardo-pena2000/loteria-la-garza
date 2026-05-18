package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s0 implements Handler.Callback {
    public final /* synthetic */ t0 a;

    public /* synthetic */ s0(t0 t0Var, byte[] bArr) {
        Objects.requireNonNull(t0Var);
        this.a = t0Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            t0 t0Var = this.a;
            synchronized (t0Var.f()) {
                try {
                    q0 q0Var = (q0) message.obj;
                    r0 r0Var = (r0) t0Var.f().get(q0Var);
                    if (r0Var != null && r0Var.g()) {
                        if (r0Var.d()) {
                            r0Var.a("GmsClientSupervisor");
                        }
                        t0Var.f().remove(q0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        t0 t0Var2 = this.a;
        synchronized (t0Var2.f()) {
            try {
                q0 q0Var2 = (q0) message.obj;
                r0 r0Var2 = (r0) t0Var2.f().get(q0Var2);
                if (r0Var2 != null && r0Var2.e() == 3) {
                    String valueOf = String.valueOf(q0Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName i2 = r0Var2.i();
                    if (i2 == null) {
                        i2 = q0Var2.c();
                    }
                    if (i2 == null) {
                        String b = q0Var2.b();
                        t.l(b);
                        i2 = new ComponentName(b, "unknown");
                    }
                    r0Var2.onServiceDisconnected(i2);
                }
            } finally {
            }
        }
        return true;
    }
}
