package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u2 implements Comparable {
    private final String a;
    private final String b;
    private final boolean c;
    private final e3 d;

    public u2(String str, String str2, boolean z, e3 e3Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = e3Var;
    }

    public String a() {
        return this.b;
    }

    public List b() {
        List l = this.d.l();
        return (l == null || l.isEmpty()) ? Collections.singletonList(this.a) : l;
    }

    public String c() {
        return this.a;
    }

    public e3 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u2 u2Var = (u2) obj;
        String str = this.a;
        if (str == null ? u2Var.a != null : !str.equals(u2Var.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? u2Var.b == null : str2.equals(u2Var.b)) {
            return this.c == u2Var.c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1 : 0);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.b.compareToIgnoreCase(u2Var.b);
    }
}
