package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class v implements u {
    public static int i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += mapEntryLite.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public static MapFieldLite j(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public MapEntryLite.b b(Object obj) {
        return ((MapEntryLite) obj).getMetadata();
    }

    public Map c(Object obj) {
        return (MapFieldLite) obj;
    }

    public Object d(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    public Map e(Object obj) {
        return (MapFieldLite) obj;
    }

    public Object f(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    public int g(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    public boolean h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
