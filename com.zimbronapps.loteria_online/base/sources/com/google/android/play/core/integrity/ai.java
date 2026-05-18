package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import r7.C;
import r7.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ai extends C {
    final /* synthetic */ aj a;
    private final G b = new G("OnRequestIntegrityTokenCallback");
    private final TaskCompletionSource c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.a = ajVar;
        this.c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        this.a.a.v(this.c);
        this.b.d("onRequestIntegrityToken", new Object[0]);
        Exception a = aj.d(this.a).a(bundle);
        if (a != null) {
            this.c.trySetException(a);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, aj.g(this.a), bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
