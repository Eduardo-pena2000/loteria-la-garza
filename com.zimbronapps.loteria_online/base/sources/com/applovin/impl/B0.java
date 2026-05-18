package com.applovin.impl;

import com.applovin.impl.s5;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b0 implements u5.b, s5.b {
    private final com.applovin.impl.sdk.k a;
    private final a b;
    private z c;
    private String d;

    public interface a {
        void a(b bVar, String str);

        void a(z zVar, String str);
    }

    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public b0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar;
        this.b = aVar;
    }

    public void a() {
        z zVar = this.c;
        if (zVar != null) {
            this.b.a(zVar, this.d);
        } else {
            this.a.q0().a(new u5(this.a, this));
        }
    }

    public static List a(z zVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            List list2 = (List) zVar.a().get(a0Var.b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((a0) it2.next()).a(a0Var)) {
                        break;
                    }
                }
            }
            arrayList.add(a0Var);
        }
        return arrayList;
    }

    public void a(String str) {
        this.a.q0().a(new s5(this.a, str, this));
    }

    public void a(b bVar) {
        this.b.a(bVar, (String) null);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (String str3 : str.split("\n")) {
            String trim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(trim)) {
                a0 a0Var = new a0(trim, i);
                if (a0Var.h()) {
                    String b2 = a0Var.b();
                    List arrayList2 = hashMap.containsKey(b2) ? (List) hashMap.get(b2) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(a0Var);
                        hashMap.put(b2, arrayList2);
                    }
                } else {
                    arrayList.add(a0Var);
                }
            }
            i++;
        }
        this.c = new z(hashMap, arrayList);
        this.d = str2;
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AppAdsTxtService", "app-ads.txt fetched: " + this.c);
        }
        this.b.a(this.c, str2);
    }

    public void a(b bVar, String str) {
        this.b.a(bVar, str);
    }
}
