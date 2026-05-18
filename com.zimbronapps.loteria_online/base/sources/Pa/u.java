package pa;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class u {
    public final Map a;

    public u(Map map) {
        this.a = map;
    }

    public u(InitializationStatus initializationStatus) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : initializationStatus.getAdapterStatusMap().entrySet()) {
            hashMap.put((String) entry.getKey(), new p((AdapterStatus) entry.getValue()));
        }
        this.a = hashMap;
    }
}
