package da;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class f implements k {
    public static final f a = new f();

    public i a(ByteBuffer byteBuffer) {
        try {
            Object b = e.a.b(byteBuffer);
            if (b instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b;
                Object obj = jSONObject.get("method");
                Object g = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new i((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public ByteBuffer b(i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", iVar.a);
            jSONObject.put("args", g.a(iVar.b));
            return e.a.a(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public ByteBuffer c(Object obj) {
        return e.a.a(new JSONArray().put(g.a(obj)));
    }

    public Object d(ByteBuffer byteBuffer) {
        try {
            Object b = e.a.b(byteBuffer);
            if (b instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = g(jSONArray.opt(1));
                    Object g2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new d((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public ByteBuffer e(String str, String str2, Object obj, String str3) {
        return e.a.a(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)).put(g.a(str3)));
    }

    public ByteBuffer f(String str, String str2, Object obj) {
        return e.a.a(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)));
    }

    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
