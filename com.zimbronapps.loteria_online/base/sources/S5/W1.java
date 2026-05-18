package S5;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class w1 implements InitializationStatus {
    public final /* synthetic */ A1 a;

    public /* synthetic */ w1(A1 a1) {
        this.a = a1;
    }

    public final /* synthetic */ Map getAdapterStatusMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new u1(this.a));
        return hashMap;
    }
}
