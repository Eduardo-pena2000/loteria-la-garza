package y2;

import androidx.fragment.app.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k extends m {
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, boolean z) {
        super(pVar, "Attempting to set user visible hint to " + z + " for fragment " + pVar);
        t.g(pVar, "fragment");
        this.b = z;
    }
}
