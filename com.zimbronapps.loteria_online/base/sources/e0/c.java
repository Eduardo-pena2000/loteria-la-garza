package E0;

import Qa.l;
import b0.C0;
import b0.U1;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements b {
    public final l a;
    public final C0 b;

    public /* synthetic */ c(int i, l lVar, k kVar) {
        this(i, lVar);
    }

    public int a() {
        return ((a) this.b.getValue()).i();
    }

    public void b(int i) {
        this.b.setValue(a.c(i));
    }

    public c(int i, l lVar) {
        this.a = lVar;
        this.b = U1.i(a.c(i), null, 2, null);
    }
}
