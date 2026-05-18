package c6;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbiy;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c {
    public final String a = (String) zzbiy.zza.zze();

    public String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
