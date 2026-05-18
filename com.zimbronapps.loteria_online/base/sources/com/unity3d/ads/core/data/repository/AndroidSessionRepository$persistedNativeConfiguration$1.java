package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.t;
import Ca.x;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.q;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidSessionRepository$persistedNativeConfiguration$1 extends l implements q {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public AndroidSessionRepository$persistedNativeConfiguration$1(e eVar) {
        super(3, eVar);
    }

    public final Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z, e eVar) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(eVar);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        return x.a((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, b.a(this.Z$0));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((NativeConfigurationOuterClass.NativeConfiguration) obj, ((Boolean) obj2).booleanValue(), (e) obj3);
    }
}
