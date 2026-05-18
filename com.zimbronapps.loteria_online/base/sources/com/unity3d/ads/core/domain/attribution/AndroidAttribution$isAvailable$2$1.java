package com.unity3d.ads.core.domain.attribution;

import Ca.s;
import Ga.e;
import android.os.OutcomeReceiver;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidAttribution$isAvailable$2$1 implements OutcomeReceiver {
    final /* synthetic */ e $continuation;

    public AndroidAttribution$isAvailable$2$1(e eVar) {
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(((Number) obj).intValue());
    }

    public void onError(Exception error) {
        t.g(error, "error");
        e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Boolean.FALSE));
    }

    public void onResult(int i) {
        e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Boolean.valueOf(i == 1)));
    }
}
