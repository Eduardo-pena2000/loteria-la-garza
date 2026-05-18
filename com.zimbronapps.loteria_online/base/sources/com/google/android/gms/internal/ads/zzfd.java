package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfd implements zzdw {
    private Message zza;

    private zzfd() {
        throw null;
    }

    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzfe.zzp(this);
    }

    public final zzfd zzb(Message message, zzfe zzfeVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzfe.zzp(this);
        return sendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzfd(byte[] bArr) {
    }
}
