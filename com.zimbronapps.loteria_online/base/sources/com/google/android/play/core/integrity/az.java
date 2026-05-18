package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class az implements StandardIntegrityManager {
    private final bn a;
    private final bt b;

    public az(bn bnVar, bt btVar) {
        this.a = bnVar;
        this.b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l) throws Exception {
        long b = prepareIntegrityTokenRequest.b();
        long longValue = l.longValue();
        prepareIntegrityTokenRequest.a();
        return Tasks.forResult(new bs(this.b, b, longValue, 0));
    }

    public final Task prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long b = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.a.e(b, 0).onSuccessTask(new ay(this, prepareIntegrityTokenRequest));
    }
}
