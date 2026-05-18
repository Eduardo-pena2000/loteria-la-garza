package org.apache.tika.pipes.async;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ AsyncProcessor a;

    public /* synthetic */ g(AsyncProcessor asyncProcessor) {
        this.a = asyncProcessor;
    }

    public final Object call() {
        return AsyncProcessor.b(this.a);
    }
}
