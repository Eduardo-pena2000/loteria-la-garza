package R2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface f extends M2.i {

    public interface a {
        f a();
    }

    void close();

    default Map e() {
        return Collections.emptyMap();
    }

    long g(j jVar);

    void l(x xVar);

    Uri o();
}
