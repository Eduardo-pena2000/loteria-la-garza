package com.amazon.a.a.o.b;

import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f {
    public static final String a = ",";
    public static final String b = "=";
    public static final String c = "|";
    private static final com.amazon.a.a.o.c d = new com.amazon.a.a.o.c("SignedToken");
    private final Map e = new HashMap();

    public f(String str, PublicKey publicKey) throws com.amazon.a.a.o.b.a.b, com.amazon.a.a.o.b.a.c {
        String b2 = b(str);
        int lastIndexOf = b2.lastIndexOf("|");
        if (lastIndexOf == -1) {
            throw com.amazon.a.a.o.b.a.b.d();
        }
        String substring = b2.substring(0, lastIndexOf);
        String substring2 = b2.substring(lastIndexOf + 1);
        if (com.amazon.a.a.o.c.a) {
            com.amazon.a.a.o.c cVar = d;
            cVar.a("Token data: " + substring);
            cVar.a("Signature: " + substring2);
        }
        a(substring, substring2, publicKey);
        c(substring);
    }

    private void a(String str, String str2, PublicKey publicKey) throws com.amazon.a.a.o.b.a.c {
        if (!e.a(str, str2, publicKey)) {
            throw new com.amazon.a.a.o.b.a.c();
        }
    }

    private String b(String str) throws com.amazon.a.a.o.b.a.b {
        try {
            return new String(com.amazon.c.a.a.c.c(str.getBytes()));
        } catch (IOException e) {
            throw com.amazon.a.a.o.b.a.b.a((Throwable) e);
        }
    }

    private void c(String str) throws com.amazon.a.a.o.b.a.b {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            com.amazon.a.a.o.c cVar = d;
            cVar.a("Field: " + nextToken);
            int indexOf = nextToken.indexOf("=");
            if (indexOf == -1) {
                throw com.amazon.a.a.o.b.a.b.d();
            }
            String substring = nextToken.substring(0, indexOf);
            String substring2 = nextToken.substring(indexOf + 1);
            cVar.a("FieldName: " + substring);
            cVar.a("FieldValue: " + substring2);
            this.e.put(substring, substring2);
        }
    }

    public String toString() {
        return "Signed Token: " + this.e;
    }

    public String a(String str) {
        com.amazon.a.a.o.a.a.a((Object) str, "key");
        return (String) this.e.get(str);
    }
}
