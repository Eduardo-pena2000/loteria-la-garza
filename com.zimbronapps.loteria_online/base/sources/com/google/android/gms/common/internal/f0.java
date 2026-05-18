package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzg;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f0 extends zzg {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d dVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(dVar);
        this.a = dVar;
    }

    public static final void a(Message message) {
        g0 g0Var = (g0) message.obj;
        if (g0Var != null) {
            g0Var.c();
        }
    }

    public static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    public final void handleMessage(Message message) {
        d dVar = this.a;
        if (dVar.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !dVar.enableLocalFallback()) || message.what == 5)) && !dVar.isConnecting()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            dVar.zzn(new v6.b(message.arg2));
            if (dVar.zzg() && !dVar.zzo()) {
                dVar.zzd(3, null);
                return;
            }
            v6.b zzm = dVar.zzm() != null ? dVar.zzm() : new v6.b(8);
            dVar.zzc.c(zzm);
            dVar.onConnectionFailed(zzm);
            return;
        }
        if (i2 == 5) {
            v6.b zzm2 = dVar.zzm() != null ? dVar.zzm() : new v6.b(8);
            dVar.zzc.c(zzm2);
            dVar.onConnectionFailed(zzm2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            v6.b bVar = new v6.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            dVar.zzc.c(bVar);
            dVar.onConnectionFailed(bVar);
            return;
        }
        if (i2 == 6) {
            dVar.zzd(5, null);
            if (dVar.zzk() != null) {
                dVar.zzk().onConnectionSuspended(message.arg2);
            }
            dVar.onConnectionSuspended(message.arg2);
            dVar.zze(5, 1, null);
            return;
        }
        if (i2 == 2 && !dVar.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((g0) message.obj).b();
            return;
        }
        int i3 = message.what;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 34);
        sb.append("Don't know how to handle message: ");
        sb.append(i3);
        Log.wtf("GmsClient", sb.toString(), new Exception());
    }
}
