package org.apache.tika.pipes;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ PipesClient a;
    public final /* synthetic */ FetchEmitTuple b;
    public final /* synthetic */ long c;
    public final /* synthetic */ PipesResult[] d;

    public /* synthetic */ b(PipesClient pipesClient, FetchEmitTuple fetchEmitTuple, long j, PipesResult[] pipesResultArr) {
        this.a = pipesClient;
        this.b = fetchEmitTuple;
        this.c = j;
        this.d = pipesResultArr;
    }

    public final Object call() {
        return PipesClient.b(this.a, this.b, this.c, this.d);
    }
}
