package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c4 {
    private final String a;
    private final List b;
    private final int c;
    private Long d;
    private final Map e = new HashMap();
    private final Deque f = new ArrayDeque();

    public c4(com.applovin.impl.sdk.k kVar) {
        this.a = (String) kVar.a(x4.u4);
        this.b = kVar.c(x4.v4);
        this.c = ((Integer) kVar.a(x4.w4)).intValue();
    }

    public Long a() {
        return this.d;
    }

    public Deque b() {
        return this.f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.c <= 0) {
            return;
        }
        Map map = (Map) this.e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty((Collection) list)) {
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((Long) it.next()).longValue();
                }
                hashMap.put((String) entry.getKey(), Long.valueOf(j / list.size()));
            }
        }
        if (this.f.size() == this.c) {
            this.f.pollLast();
        }
        this.f.addFirst(hashMap);
    }

    public void b(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty((Collection) this.b) && this.c > 0) {
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.a) && str.endsWith(this.a)) {
            this.d = Long.valueOf(j);
        }
    }

    private void a(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        HashMap hashMap = (Map) this.e.get(str2);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.e.put(str2, hashMap);
        }
        ArrayList arrayList = (List) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j));
    }
}
