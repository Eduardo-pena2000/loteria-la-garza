package V5;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbja;
import com.google.android.gms.internal.ads.zzcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class n0 {
    public static void a(Context context) {
        Object obj = W5.m.b;
        if (((Boolean) zzbja.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || W5.m.i()) {
                    return;
                }
                x7.e zzb = new d0(context).zzb();
                int i = o0.b;
                W5.p.e("Updating ad debug logging enablement.");
                zzcel.zza(zzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                W5.p.g("Fail to determine debug setting.", e);
            }
        }
    }
}
