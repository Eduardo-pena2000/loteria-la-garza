package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a {
    private String a;
    private String b;
    private Map c;
    private Map d;
    private final JSONObject e;
    private String f;
    private final Object g;
    private final int h;
    private int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final u4.a p;
    private final boolean q;
    private final boolean r;

    public static class a {
        String a;
        String b;
        String c;
        Map e;
        JSONObject f;
        Object g;
        int i;
        int j;
        boolean k;
        boolean m;
        boolean n;
        boolean o;
        boolean p;
        u4.a q;
        int h = 1;
        boolean l = true;
        Map d = new HashMap();

        public a(k kVar) {
            this.i = ((Integer) kVar.a(x4.T2)).intValue();
            this.j = ((Integer) kVar.a(x4.S2)).intValue();
            this.m = ((Boolean) kVar.a(x4.p3)).booleanValue();
            this.n = ((Boolean) kVar.a(x4.k5)).booleanValue();
            this.q = u4.a.a(((Integer) kVar.a(x4.l5)).intValue());
            this.p = ((Boolean) kVar.a(x4.K5)).booleanValue();
        }

        public a a(Map map) {
            this.e = map;
            return this;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }

        public a d(boolean z) {
            this.l = z;
            return this;
        }

        public a e(boolean z) {
            this.m = z;
            return this;
        }

        public a f(boolean z) {
            this.o = z;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        public a b(Map map) {
            this.d = map;
            return this;
        }

        public a c(int i) {
            this.i = i;
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public a b(int i) {
            this.j = i;
            return this;
        }

        public a c(boolean z) {
            this.k = z;
            return this;
        }

        public a a(Object obj) {
            this.g = obj;
            return this;
        }

        public a b(boolean z) {
            this.p = z;
            return this;
        }

        public a a(int i) {
            this.h = i;
            return this;
        }

        public a a(boolean z) {
            this.n = z;
            return this;
        }

        public a a(u4.a aVar) {
            this.q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.c;
        this.g = aVar.g;
        int i = aVar.h;
        this.h = i;
        this.i = i;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.q;
        this.q = aVar.o;
        this.r = aVar.p;
    }

    public void a(String str) {
        this.a = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public int c() {
        return this.h - this.i;
    }

    public Object d() {
        return this.g;
    }

    public u4.a e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
            return false;
        }
        Map map = this.c;
        if (map == null ? aVar.c != null : !map.equals(aVar.c)) {
            return false;
        }
        Map map2 = this.d;
        if (map2 == null ? aVar.d != null : !map2.equals(aVar.d)) {
            return false;
        }
        String str2 = this.f;
        if (str2 == null ? aVar.f != null : !str2.equals(aVar.f)) {
            return false;
        }
        String str3 = this.b;
        if (str3 == null ? aVar.b != null : !str3.equals(aVar.b)) {
            return false;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null ? aVar.e != null : !jSONObject.equals(aVar.e)) {
            return false;
        }
        Object obj2 = this.g;
        if (obj2 == null ? aVar.g == null : obj2.equals(aVar.g)) {
            return this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r;
        }
        return false;
    }

    public String f() {
        return this.a;
    }

    public Map g() {
        return this.d;
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.g;
        int hashCode5 = ((((((((((((((((((((((hashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.p.b()) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0);
        Map map = this.c;
        if (map != null) {
            hashCode5 = (hashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.d;
        if (map2 != null) {
            hashCode5 = (hashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            return hashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (hashCode5 * 31) + new String(charArray).hashCode();
    }

    public Map i() {
        return this.c;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.j;
    }

    public boolean m() {
        return this.o;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.r;
    }

    public boolean p() {
        return this.m;
    }

    public boolean q() {
        return this.n;
    }

    public boolean r() {
        return this.q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.a + ", backupEndpoint=" + this.f + ", httpMethod=" + this.b + ", httpHeaders=" + this.d + ", body=" + this.e + ", emptyResponse=" + this.g + ", initialRetryAttempts=" + this.h + ", retryAttemptsLeft=" + this.i + ", timeoutMillis=" + this.j + ", retryDelayMillis=" + this.k + ", exponentialRetries=" + this.l + ", retryOnAllErrors=" + this.m + ", retryOnNoConnection=" + this.n + ", encodingEnabled=" + this.o + ", encodingType=" + this.p + ", trackConnectionSpeed=" + this.q + ", gzipBodyEncoding=" + this.r + '}';
    }

    public String a() {
        return this.f;
    }

    public JSONObject b() {
        return this.e;
    }

    public void a(int i) {
        this.i = i;
    }

    public static a a(k kVar) {
        return new a(kVar);
    }
}
