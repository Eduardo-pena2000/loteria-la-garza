package V5;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class b0 implements a0 {
    public final /* synthetic */ Map a;

    public /* synthetic */ b0(Map map) {
        this.a = map;
    }

    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
        Map map = this.a;
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            R5.t.l().zzo().d(false);
        }
    }
}
