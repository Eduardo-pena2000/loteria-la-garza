package b6;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o0 extends LinkedHashMap {
    public final /* synthetic */ r0 a;

    public o0(r0 r0Var) {
        Objects.requireNonNull(r0Var);
        this.a = r0Var;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        r0 r0Var = this.a;
        synchronized (r0Var) {
            try {
                if (size() <= r0Var.g()) {
                    return false;
                }
                r0Var.h().add(new Pair((String) entry.getKey(), ((p0) entry.getValue()).b));
                return size() > r0Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
