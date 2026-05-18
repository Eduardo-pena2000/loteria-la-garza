package Q;

import java.util.function.IntConsumer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ IntConsumer a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(IntConsumer intConsumer, int i) {
        this.a = intConsumer;
        this.b = i;
    }

    public final void run() {
        c.a(this.a, this.b);
    }
}
