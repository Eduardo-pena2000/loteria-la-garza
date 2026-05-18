package com.unity3d.ads.core.extensions;

import com.unity3d.services.store.JsonSerializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class JsonSerializableExtensionsKt {
    public static final JSONArray toJsonArray(List list) {
        t.g(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((JsonSerializable) it.next()).toJson());
        }
        return jSONArray;
    }
}
