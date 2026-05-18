package V5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzgal;
import com.google.android.gms.internal.ads.zzgam;
import com.google.android.gms.internal.ads.zzgan;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgrr;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class d {
    public static void a(Context context) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzgal zzh = zzgal.zzh(context);
            zzgam zzh2 = zzgam.zzh(context);
            zzgan zza = zzgan.zza(context);
            zzh.zzk();
            zzh.zzl();
            zzh2.zzj();
            zza.zzb(null);
        } catch (IOException e) {
            R5.t.l().zzg(e, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e2) {
            R5.t.l().zzg(e2, "clearStorageOnIdlessMode_scar");
        }
    }

    public static Bundle b(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                int i = o0.b;
                W5.p.b("JSON parsing error", e);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            String optString = optJSONObject.optString("bk");
            CharSequence optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i3 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i3 != 0) {
                List zze = zzgrr.zza(zzgqq.zzc('/')).zze(optString2);
                if (zze.size() > 2 || zze.isEmpty()) {
                    obj = null;
                } else {
                    if (zze.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) zze.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) zze.get(0), 0);
                        str2 = (String) zze.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i4 = i3 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static Bundle c(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }
}
