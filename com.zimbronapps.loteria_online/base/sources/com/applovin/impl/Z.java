package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class z {
    private final Map a;
    private final List b;

    public z(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof z;
    }

    public List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!zVar.a(this)) {
            return false;
        }
        Map a = a();
        Map a2 = zVar.a();
        if (a != null ? !a.equals(a2) : a2 != null) {
            return false;
        }
        List b = b();
        List b2 = zVar.b();
        return b != null ? b.equals(b2) : b2 == null;
    }

    public int hashCode() {
        Map a = a();
        int hashCode = a == null ? 43 : a.hashCode();
        List b = b();
        return ((hashCode + 59) * 59) + (b != null ? b.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.a;
    }
}
