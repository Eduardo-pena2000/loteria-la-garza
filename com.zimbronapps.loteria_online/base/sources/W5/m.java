package W5;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m {
    public static boolean c = false;
    public static boolean d = false;
    public final List a;
    public static final Object b = new Object();
    public static final E6.f e = E6.i.c();
    public static final Set f = new HashSet(Arrays.asList(new String[0]));

    public m(String str) {
        this.a = !j() ? new ArrayList() : Arrays.asList(new String[]{"network_request_".concat(String.valueOf(UUID.randomUUID().toString()))});
    }

    public static void g() {
        synchronized (b) {
            c = false;
            d = false;
            p.f("Ad debug logging enablement is out of date.");
        }
    }

    public static void h(boolean z) {
        synchronized (b) {
            c = true;
            d = z;
        }
    }

    public static boolean i() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    public static boolean j() {
        boolean z;
        synchronized (b) {
            try {
                z = false;
                if (c && d) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public static /* synthetic */ void k(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        p(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(E6.c.c(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void l(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        p(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void p(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        p.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static synchronized void r(String str) {
        synchronized (m.class) {
            try {
                p.e("GMA Debug BEGIN");
                int i = 0;
                while (i < str.length()) {
                    int i2 = i + 4000;
                    p.e("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                    i = i2;
                }
                p.e("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (j()) {
            m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void b(String str, String str2, Map map, byte[] bArr) {
        if (j()) {
            m(str, "GET", map, bArr);
        }
    }

    public final void c(HttpURLConnection httpURLConnection, int i) {
        if (j()) {
            String str = null;
            n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    p.f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                o(str);
            }
        }
    }

    public final void d(Map map, int i) {
        if (j()) {
            n(map, i);
            if (i < 200 || i >= 300) {
                o(null);
            }
        }
    }

    public final void e(String str) {
        if (j() && str != null) {
            f(str.getBytes());
        }
    }

    public final void f(byte[] bArr) {
        q("onNetworkResponseBody", new i(bArr));
    }

    public final void m(String str, String str2, Map map, byte[] bArr) {
        q("onNetworkRequest", new k(str, str2, map, bArr));
    }

    public final void n(Map map, int i) {
        q("onNetworkResponse", new h(i, map));
    }

    public final void o(String str) {
        q("onNetworkRequestError", new j(str));
    }

    public final void q(String str, l lVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            lVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            p.d("unable to log", e2);
        }
        r(stringWriter.toString());
    }
}
