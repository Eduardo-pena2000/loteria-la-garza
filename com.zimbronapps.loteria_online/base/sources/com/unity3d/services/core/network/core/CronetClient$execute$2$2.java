package com.unity3d.services.core.network.core;

import Ca.I;
import Qa.l;
import kotlin.jvm.internal.u;
import org.chromium.net.UrlRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CronetClient$execute$2$2 extends u implements l {
    final /* synthetic */ UrlRequest $req;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.a;
    }

    public final void invoke(Throwable th) {
        this.$req.cancel();
    }
}
