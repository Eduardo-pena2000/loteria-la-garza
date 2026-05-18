package y2;

import androidx.fragment.app.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends m {
    public final p b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, p pVar2, int i) {
        super(pVar, "Attempting to nest fragment " + pVar + " within the view of parent fragment " + pVar2 + " via container with ID " + i + " without using parent's childFragmentManager");
        t.g(pVar, "fragment");
        t.g(pVar2, "expectedParentFragment");
        this.b = pVar2;
        this.c = i;
    }
}
