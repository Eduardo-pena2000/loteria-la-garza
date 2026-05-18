package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b {
    public static final String a = "RESPONSE";
    public static final String b = "RESET_OFFSET";
    public static final String d = "RECEIPT_STRING";
    public static final String e = "KIWI_EXECUTION_RESULT_CODE";
    public static final String f = "RECEIPT_DELIVERED";
    public static final String g = "PURCHASE_REQUEST_ID";
    public static final String h = "userId";
    static final /* synthetic */ boolean i = true;
    public final Map c = new HashMap();

    public Object a(String str) {
        return this.c.get(str);
    }

    public boolean b(String str) {
        return this.c.containsKey(str);
    }

    public Object c(String str) {
        return this.c.remove(str);
    }

    public void a(String str, Object obj) {
        this.c.put(str, obj);
    }

    public Object b() {
        return this.c.get("RESPONSE");
    }

    public void c() {
        this.c.remove("RESPONSE");
    }

    public boolean a(Class cls) {
        return b("RESPONSE") && a("RESPONSE").getClass().equals(cls);
    }

    public void a() {
        this.c.clear();
    }

    public void a(Object obj) {
        if (!i && obj == null) {
            throw new AssertionError();
        }
        this.c.put("RESPONSE", obj);
    }
}
