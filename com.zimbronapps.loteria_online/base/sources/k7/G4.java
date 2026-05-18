package k7;

import android.util.Log;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g4 implements u2 {
    public final /* synthetic */ q3 a;

    public g4(h4 h4Var, q3 q3Var) {
        this.a = q3Var;
        Objects.requireNonNull(h4Var);
    }

    public final boolean zza() {
        return Log.isLoggable(this.a.a().z(), 3);
    }
}
