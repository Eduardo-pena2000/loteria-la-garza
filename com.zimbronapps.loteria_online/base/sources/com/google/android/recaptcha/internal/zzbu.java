package com.google.android.recaptcha.internal;

import cb.B0;
import cb.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbu implements OnCompleteListener {
    public final /* synthetic */ x zza;

    public /* synthetic */ zzbu(x xVar) {
        this.zza = xVar;
    }

    public final void onComplete(Task task) {
        x xVar = this.zza;
        Exception exception = task.getException();
        if (exception != null) {
            xVar.b(exception);
        } else if (task.isCanceled()) {
            B0.a.b(xVar, (CancellationException) null, 1, (Object) null);
        } else {
            xVar.o(task.getResult());
        }
    }
}
