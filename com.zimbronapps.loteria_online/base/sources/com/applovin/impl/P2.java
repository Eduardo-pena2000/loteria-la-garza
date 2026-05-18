package com.applovin.impl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p2 {
    private String a;
    private String b;
    private int c;
    private int d;

    public static class a {
        private String a;
        private String b;
        private int c;
        private int d;

        public p2 a() {
            return new p2(this.a, this.b, this.c, this.d);
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.a + ", signature=" + this.b + ", responseCode=" + this.c + ", nonce=" + this.d + ")";
        }

        public a a(int i) {
            this.d = i;
            return this;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }
    }

    public p2(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public boolean a(Object obj) {
        return obj instanceof p2;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p2Var.a(this) || c() != p2Var.c() || b() != p2Var.b()) {
            return false;
        }
        String e = e();
        String e2 = p2Var.e();
        if (e != null ? !e.equals(e2) : e2 != null) {
            return false;
        }
        String d = d();
        String d2 = p2Var.d();
        return d != null ? d.equals(d2) : d2 == null;
    }

    public int hashCode() {
        int c = ((c() + 59) * 59) + b();
        String e = e();
        int hashCode = (c * 59) + (e == null ? 43 : e.hashCode());
        String d = d();
        return (hashCode * 59) + (d != null ? d.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
