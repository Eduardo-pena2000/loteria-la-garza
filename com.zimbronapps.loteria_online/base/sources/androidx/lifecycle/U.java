package androidx.lifecycle;

import androidx.lifecycle.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {
    public static final void a(r rVar, k.b bVar, k.b bVar2) {
        kotlin.jvm.internal.t.g(bVar, "current");
        kotlin.jvm.internal.t.g(bVar2, "next");
        if (bVar == k.b.b && bVar2 == k.b.a) {
            throw new IllegalStateException(("State must be at least '" + k.b.c + "' to be moved to '" + bVar2 + "' in component " + rVar).toString());
        }
        k.b bVar3 = k.b.a;
        if (bVar != bVar3 || bVar == bVar2) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar3 + "' and cannot be moved to `" + bVar2 + "` in component " + rVar).toString());
    }
}
