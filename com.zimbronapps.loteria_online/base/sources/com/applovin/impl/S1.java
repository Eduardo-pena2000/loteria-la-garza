package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class s1 {
    private final String b;
    private final Map c;
    private final String a = UUID.randomUUID().toString();
    private final long d = System.currentTimeMillis();

    public s1(String str, Map map) {
        this.b = str;
        this.c = map;
    }

    public long a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public Map d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.d == s1Var.d && Objects.equals(this.b, s1Var.b) && Objects.equals(this.c, s1Var.c)) {
            return Objects.equals(this.a, s1Var.a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.c;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + '}';
    }
}
