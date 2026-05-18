package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class j3 {
    private final String a;
    private final MaxAdFormat b;

    public j3(String str, MaxAdFormat maxAdFormat) {
        this.a = str;
        this.b = maxAdFormat;
    }

    public boolean a(Object obj) {
        return obj instanceof j3;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        if (!j3Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = j3Var.b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        MaxAdFormat a = a();
        MaxAdFormat a2 = j3Var.a();
        return a != null ? a.equals(a2) : a2 == null;
    }

    public int hashCode() {
        String b = b();
        int hashCode = b == null ? 43 : b.hashCode();
        MaxAdFormat a = a();
        return ((hashCode + 59) * 59) + (a != null ? a.hashCode() : 43);
    }

    public String toString() {
        return this.a + "-" + this.b.getLabel();
    }

    public MaxAdFormat a() {
        return this.b;
    }

    public static j3 a(String str) {
        String[] split = str.split("-");
        return new j3(split[0], MaxAdFormat.formatFromString(split[1]));
    }
}
