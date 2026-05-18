package E7;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class b implements Callable {
    public final /* synthetic */ FirebaseAnalytics a;

    public b(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.a = firebaseAnalytics;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.a.k().zzG();
    }
}
