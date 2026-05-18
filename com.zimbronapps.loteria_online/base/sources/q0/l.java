package q0;

import android.util.LongSparseArray;
import q0.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ LongSparseArray b;

    public /* synthetic */ l(b bVar, LongSparseArray longSparseArray) {
        this.a = bVar;
        this.b = longSparseArray;
    }

    public final void run() {
        b.c.a(this.a, this.b);
    }
}
