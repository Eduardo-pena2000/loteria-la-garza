package y2;

import androidx.fragment.app.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends l {
    public final p b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, p pVar2, int i) {
        super(pVar, "Attempting to set target fragment " + pVar2 + " with request code " + i + " for fragment " + pVar);
        t.g(pVar, "fragment");
        t.g(pVar2, "targetFragment");
        this.b = pVar2;
        this.c = i;
    }
}
