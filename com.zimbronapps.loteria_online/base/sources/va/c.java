package va;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import va.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c {
    public final Context a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        IMAGE,
        VIDEO
    }

    public c(Context context) {
        this.a = context;
    }

    public void a() {
        this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    public Map b() {
        Set stringSet;
        HashMap hashMap = new HashMap();
        boolean z = false;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z2 = true;
        if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", (Set) null)) != null) {
            hashMap.put("pathList", new ArrayList(stringSet));
            z = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            r.a.a aVar = new r.a.a();
            aVar.b(sharedPreferences.getString("flutter_image_picker_error_code", ""));
            if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                aVar.c(sharedPreferences.getString("flutter_image_picker_error_message", ""));
            }
            hashMap.put("error", aVar.a());
        } else {
            z2 = z;
        }
        if (z2) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                hashMap.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals("video") ? r.c.c : r.c.b);
            }
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        }
        return hashMap;
    }

    public String c() {
        return this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", "");
    }

    public void d(r.g gVar) {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (gVar.c() != null) {
            edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(gVar.c().doubleValue()));
        }
        if (gVar.b() != null) {
            edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(gVar.b().doubleValue()));
        }
        edit.putInt("flutter_image_picker_image_quality", gVar.d().intValue());
        edit.apply();
    }

    public void e(Uri uri) {
        this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
    }

    public void f(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }

    public void g(b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            h("image");
        } else {
            if (i != 2) {
                return;
            }
            h("video");
        }
    }

    public final void h(String str) {
        this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", str).apply();
    }
}
