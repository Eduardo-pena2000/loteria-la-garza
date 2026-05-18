package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d {
    private String a;
    private String b;
    private String c;
    private String d;
    private Map e;
    private Map f;
    private Map g;
    private u4.a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private int n;

    public static class b {
        private String a;
        private String b;
        private String c;
        private String d;
        private Map e;
        private Map f;
        private Map g;
        private u4.a h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;

        public static /* synthetic */ String a(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ String b(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ boolean c(b bVar) {
            return bVar.l;
        }

        public static /* synthetic */ String d(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ String e(b bVar) {
            return bVar.d;
        }

        public static /* synthetic */ Map f(b bVar) {
            return bVar.e;
        }

        public static /* synthetic */ Map g(b bVar) {
            return bVar.f;
        }

        public static /* synthetic */ Map h(b bVar) {
            return bVar.g;
        }

        public static /* synthetic */ u4.a i(b bVar) {
            return bVar.h;
        }

        public static /* synthetic */ boolean j(b bVar) {
            return bVar.i;
        }

        public static /* synthetic */ boolean k(b bVar) {
            return bVar.j;
        }

        public static /* synthetic */ boolean l(b bVar) {
            return bVar.k;
        }

        public b a(String str) {
            this.d = str;
            return this;
        }

        public b b(String str) {
            this.a = str;
            return this;
        }

        public b c(String str) {
            this.b = str;
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }

        public b a(Map map) {
            this.f = map;
            return this;
        }

        public b b(Map map) {
            this.e = map;
            return this;
        }

        public b c(Map map) {
            this.g = map;
            return this;
        }

        public b d(boolean z) {
            this.k = z;
            return this;
        }

        public b a(u4.a aVar) {
            this.h = aVar;
            return this;
        }

        public b b(boolean z) {
            this.l = z;
            return this;
        }

        public b c(boolean z) {
            this.j = z;
            return this;
        }

        public b a(boolean z) {
            this.i = z;
            return this;
        }

        public d a() {
            return new d(this, (a) null);
        }
    }

    public /* synthetic */ d(b bVar, a aVar) {
        this(bVar);
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.e = map;
    }

    public int c() {
        return this.n;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
    }

    public u4.a f() {
        return this.h;
    }

    public Map g() {
        return this.f;
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Map i() {
        return this.e;
    }

    public Map j() {
        return this.g;
    }

    public String k() {
        return this.c;
    }

    public void l() {
        this.n++;
    }

    public boolean m() {
        return this.k;
    }

    public boolean n() {
        return this.i;
    }

    public boolean o() {
        return this.j;
    }

    public boolean p() {
        return this.l;
    }

    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.a);
        jSONObject.put("communicatorRequestId", this.m);
        jSONObject.put("httpMethod", this.b);
        jSONObject.put("targetUrl", this.c);
        jSONObject.put("backupUrl", this.d);
        jSONObject.put("encodingType", this.h);
        jSONObject.put("isEncodingEnabled", this.i);
        jSONObject.put("gzipBodyEncoding", this.j);
        jSONObject.put("isAllowedPreInitEvent", this.k);
        jSONObject.put("attemptNumber", this.n);
        if (this.e != null) {
            jSONObject.put("parameters", new JSONObject(this.e));
        }
        if (this.f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f));
        }
        if (this.g != null) {
            jSONObject.put("requestBody", new JSONObject(this.g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.a + "', communicatorRequestId='" + this.m + "', httpMethod='" + this.b + "', targetUrl='" + this.c + "', backupUrl='" + this.d + "', attemptNumber=" + this.n + ", isEncodingEnabled=" + this.i + ", isGzipBodyEncoding=" + this.j + ", isAllowedPreInitEvent=" + this.k + ", shouldFireInWebView=" + this.l + '}';
    }

    public d(JSONObject jSONObject, k kVar) {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.a = string;
        this.b = string3;
        this.m = string2;
        this.c = string4;
        this.d = string5;
        this.e = synchronizedMap;
        this.f = synchronizedMap2;
        this.g = synchronizedMap3;
        this.h = u4.a.a(jSONObject.optInt("encodingType", u4.a.c.b()));
        this.i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.n = i;
    }

    private d(b bVar) {
        this.a = UUID.randomUUID().toString();
        this.b = b.a(bVar);
        this.c = b.b(bVar);
        this.d = b.e(bVar);
        this.e = b.f(bVar);
        this.f = b.g(bVar);
        this.g = b.h(bVar);
        this.h = b.i(bVar);
        this.i = b.j(bVar);
        this.j = b.k(bVar);
        this.k = b.l(bVar);
        this.l = b.c(bVar);
        this.m = b.d(bVar);
        this.n = 0;
    }
}
