package com.google.android.recaptcha.internal;

import Ca.I;
import Qa.l;
import cb.W;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzar extends u implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ W zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, W w) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = w;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc = (Throwable) obj;
        if (exc instanceof CancellationException) {
            this.zza.setException(exc);
        } else {
            Exception completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc2 = completionExceptionOrNull instanceof Exception ? completionExceptionOrNull : null;
                if (exc2 == null) {
                    exc2 = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(exc2);
            }
        }
        return I.a;
    }
}
