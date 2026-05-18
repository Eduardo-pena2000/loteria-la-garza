package y2;

import androidx.fragment.app.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m extends RuntimeException {
    public final p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, String str) {
        super(str);
        t.g(pVar, "fragment");
        this.a = pVar;
    }

    public final p a() {
        return this.a;
    }
}
