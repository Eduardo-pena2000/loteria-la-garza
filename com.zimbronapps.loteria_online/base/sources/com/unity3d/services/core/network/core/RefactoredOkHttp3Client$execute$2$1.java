package com.unity3d.services.core.network.core;

import Ca.I;
import Qa.l;
import kotlin.jvm.internal.u;
import okhttp3.Call;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RefactoredOkHttp3Client$execute$2$1 extends u implements l {
    final /* synthetic */ Call $call;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefactoredOkHttp3Client$execute$2$1(Call call) {
        super(1);
        this.$call = call;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.a;
    }

    public final void invoke(Throwable th) {
        this.$call.cancel();
    }
}
