package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a3 {
    private final String a;
    private final MaxAdFormat b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final h f;

    public a3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, h hVar) {
        this.a = str;
        this.b = maxAdFormat;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = hVar;
    }

    public boolean a(Object obj) {
        return obj instanceof a3;
    }

    public String b() {
        return this.a;
    }

    public Map c() {
        return this.e;
    }

    public Map d() {
        return this.d;
    }

    public Map e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        if (!a3Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = a3Var.b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        MaxAdFormat a = a();
        MaxAdFormat a2 = a3Var.a();
        if (a != null ? !a.equals(a2) : a2 != null) {
            return false;
        }
        Map e = e();
        Map e2 = a3Var.e();
        if (e != null ? !e.equals(e2) : e2 != null) {
            return false;
        }
        Map d = d();
        Map d2 = a3Var.d();
        if (d != null ? !d.equals(d2) : d2 != null) {
            return false;
        }
        Map c = c();
        Map c2 = a3Var.c();
        if (c != null ? !c.equals(c2) : c2 != null) {
            return false;
        }
        h f = f();
        h f2 = a3Var.f();
        return f != null ? f.equals(f2) : f2 == null;
    }

    public h f() {
        return this.f;
    }

    public int hashCode() {
        String b = b();
        int hashCode = b == null ? 43 : b.hashCode();
        MaxAdFormat a = a();
        int hashCode2 = ((hashCode + 59) * 59) + (a == null ? 43 : a.hashCode());
        Map e = e();
        int hashCode3 = (hashCode2 * 59) + (e == null ? 43 : e.hashCode());
        Map d = d();
        int hashCode4 = (hashCode3 * 59) + (d == null ? 43 : d.hashCode());
        Map c = c();
        int hashCode5 = (hashCode4 * 59) + (c == null ? 43 : c.hashCode());
        h f = f();
        return (hashCode5 * 59) + (f != null ? f.hashCode() : 43);
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public MaxAdFormat a() {
        return this.b;
    }
}
