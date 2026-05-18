package y2;

import androidx.fragment.app.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends m {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p pVar, String str) {
        super(pVar, "Attempting to reuse fragment " + pVar + " with previous ID " + str);
        t.g(pVar, "fragment");
        t.g(str, "previousFragmentId");
        this.b = str;
    }
}
