package org.apache.tika.pipes;

import Eb.e;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ PipesClient a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(PipesClient pipesClient, e eVar) {
        this.a = pipesClient;
        this.b = eVar;
    }

    public final Object call() {
        return PipesClient.a(this.a, this.b);
    }
}
