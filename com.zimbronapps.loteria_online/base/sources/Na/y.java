package na;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class y {
    public static y c;
    public final String a = ",";
    public SharedPreferences b;

    public static y b() {
        if (c == null) {
            c = new y();
        }
        return c;
    }

    public Map a(String str) {
        String d = d(str, null);
        if (d != null) {
            try {
                HashMap hashMap = new HashMap(1);
                Map f = f(new JSONObject(d));
                f.put("to", str);
                hashMap.put("message", f);
                return hashMap;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final SharedPreferences c() {
        if (this.b == null) {
            this.b = a.a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.b;
    }

    public String d(String str, String str2) {
        return c().getString(str, str2);
    }

    public List e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final Map f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    public void g(String str) {
        c().edit().remove(str).apply();
        String d = d("notification_ids", "");
        if (d.isEmpty()) {
            return;
        }
        h("notification_ids", d.replace(str + ",", ""));
    }

    public void h(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }

    public void i(com.google.firebase.messaging.d dVar) {
        h(dVar.P1(), new JSONObject(z.f(dVar)).toString());
        String str = d("notification_ids", "") + dVar.P1() + ",";
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
        if (arrayList.size() > 100) {
            String str2 = (String) arrayList.get(0);
            c().edit().remove(str2).apply();
            str = str.replace(str2 + ",", "");
        }
        h("notification_ids", str);
    }
}
