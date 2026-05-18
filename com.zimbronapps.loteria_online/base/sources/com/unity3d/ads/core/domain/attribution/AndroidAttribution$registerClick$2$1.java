package com.unity3d.ads.core.domain.attribution;

import Ca.s;
import Ga.e;
import android.os.OutcomeReceiver;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidAttribution$registerClick$2$1 implements OutcomeReceiver {
    final /* synthetic */ e $continuation;

    public AndroidAttribution$registerClick$2$1(e eVar) {
        this.$continuation = eVar;
    }

    public void onResult(Object p0) {
        t.g(p0, "p0");
        e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Boolean.TRUE));
    }

    public void onError(Exception error) {
        t.g(error, "error");
        e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Boolean.FALSE));
    }
}
