package com.applovin.shadow.okhttp3;

import Qa.l;
import com.applovin.shadow.okhttp3.Interceptor;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Interceptor$Companion$invoke$1 implements Interceptor {
    final /* synthetic */ l $block;

    public Interceptor$Companion$invoke$1(l lVar) {
        this.$block = lVar;
    }

    public final Response intercept(Interceptor.Chain chain) {
        t.g(chain, "it");
        return (Response) this.$block.invoke(chain);
    }
}
