package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p8 {
    public static final p8 f = new p8();
    private final p8 a;
    private final String b;
    private final Map c;
    protected String d;
    protected final List e;

    public p8(String str, Map map, p8 p8Var) {
        this.a = p8Var;
        this.b = str;
        this.c = Collections.unmodifiableMap(map);
        this.e = new ArrayList();
    }

    public Map a() {
        return this.c;
    }

    public List b() {
        return Collections.unmodifiableList(this.e);
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.d + "', attributes=" + this.c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        for (p8 p8Var : this.e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                arrayList.add(p8Var);
            }
        }
        return arrayList;
    }

    public p8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            p8 p8Var = (p8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
            arrayList.addAll(p8Var.b());
        }
        return null;
    }

    public p8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (p8 p8Var : this.e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
        }
        return null;
    }

    private p8() {
        this.a = null;
        this.b = "";
        this.c = Collections.emptyMap();
        this.d = "";
        this.e = Collections.emptyList();
    }
}
