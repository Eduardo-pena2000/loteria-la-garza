package org.apache.tika.pipes.async;

import org.apache.tika.pipes.pipesiterator.TotalCounter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ AsyncProcessor a;
    public final /* synthetic */ TotalCounter b;

    public /* synthetic */ f(AsyncProcessor asyncProcessor, TotalCounter totalCounter) {
        this.a = asyncProcessor;
        this.b = totalCounter;
    }

    public final void run() {
        AsyncProcessor.a(this.a, this.b);
    }
}
