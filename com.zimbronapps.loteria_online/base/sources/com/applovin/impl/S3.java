package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class s3 {
    private static final Set c = new HashSet();
    private static final Map d = new HashMap();
    public static final s3 e;
    public static final s3 f;
    public static final s3 g;
    private String a;
    private Set b;

    public enum a {
        SESSION("session"),
        INSTALL("install");

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        e = a("ars", aVar, a.INSTALL);
        f = a("ar", aVar);
        g = a("ttdasi_ms", aVar);
    }

    private s3(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public boolean a(Object obj) {
        return obj instanceof s3;
    }

    public Set b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!s3Var.a(this)) {
            return false;
        }
        String a2 = a();
        String a3 = s3Var.a();
        if (a2 != null ? !a2.equals(a3) : a3 != null) {
            return false;
        }
        Set b2 = b();
        Set b3 = s3Var.b();
        return b2 != null ? b2.equals(b3) : b3 == null;
    }

    public int hashCode() {
        String a2 = a();
        int hashCode = a2 == null ? 43 : a2.hashCode();
        Set b2 = b();
        return ((hashCode + 59) * 59) + (b2 != null ? b2.hashCode() : 43);
    }

    public String toString() {
        return this.a;
    }

    public String a() {
        return this.a;
    }

    private static s3 a(String str, a... aVarArr) {
        Set set = c;
        if (!set.contains(str)) {
            s3 s3Var = new s3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            d.put(str, s3Var);
            return s3Var;
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public boolean a(a aVar) {
        return this.b.contains(aVar);
    }

    public static s3 a(String str) {
        return (s3) d.get(str);
    }
}
