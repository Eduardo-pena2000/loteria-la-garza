package P2;

import P2.n;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet a;
    public final /* synthetic */ int b;
    public final /* synthetic */ n.a c;

    public /* synthetic */ m(CopyOnWriteArraySet copyOnWriteArraySet, int i, n.a aVar) {
        this.a = copyOnWriteArraySet;
        this.b = i;
        this.c = aVar;
    }

    public final void run() {
        n.a(this.a, this.b, this.c);
    }
}
