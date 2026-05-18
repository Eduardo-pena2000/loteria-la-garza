package com.unity3d.ads.core.extensions;

import Da.M;
import Da.w;
import Wa.i;
import Wa.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class JSONArrayExtensionsKt {
    public static final Map getHeadersMap(JSONArray jSONArray) {
        t.g(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            t.e(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            ArrayList arrayList = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            t.f(string, "header.getString(1)");
            arrayList.add(string);
            String string2 = jSONArray2.getString(0);
            t.f(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        t.g(jSONArray, "<this>");
        i w = n.w(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(w.y(w, 10));
        Iterator it = w.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((M) it).a()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
