package com.revenuecat.purchases.utils;

import Ca.q;
import Ca.x;
import Da.Q;
import Da.w;
import Wa.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import tb.C;
import tb.E;
import tb.i;
import tb.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class JsonElementExtensionsKt {
    public static final Map asMap(i iVar) {
        t.g(iVar, "<this>");
        if (!(iVar instanceof C)) {
            return null;
        }
        Iterable<Map.Entry> entrySet = j.n(iVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            q a = x.a(entry.getKey(), getExtractedContent((i) entry.getValue()));
            linkedHashMap.put(a.c(), a.d());
        }
        return linkedHashMap;
    }

    private static final Object getExtractedContent(i iVar) {
        Double arrayList;
        if (iVar instanceof E) {
            E o = j.o(iVar);
            if (o.b()) {
                return o.a();
            }
            arrayList = j.e(o);
            if (arrayList == null && (arrayList = j.l(o)) == null && (arrayList = j.r(o)) == null && (arrayList = j.j(o)) == null && (arrayList = j.h(o)) == null) {
                return j.f(o);
            }
        } else {
            if (!(iVar instanceof tb.c)) {
                if (!(iVar instanceof C)) {
                    return null;
                }
                Iterable<Map.Entry> entrySet = j.n(iVar).entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(entrySet, 10)), 16));
                for (Map.Entry entry : entrySet) {
                    q a = x.a(entry.getKey(), getExtractedContent((i) entry.getValue()));
                    linkedHashMap.put(a.c(), a.d());
                }
                return linkedHashMap;
            }
            tb.c m = j.m(iVar);
            arrayList = new ArrayList(w.y(m, 10));
            Iterator it = m.iterator();
            while (it.hasNext()) {
                arrayList.add(getExtractedContent((i) it.next()));
            }
        }
        return arrayList;
    }
}
