package sb;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class M extends T {
    public final qb.e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(ob.b kSerializer, ob.b vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.t.g(kSerializer, "kSerializer");
        kotlin.jvm.internal.t.g(vSerializer, "vSerializer");
        this.c = new L(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    public qb.e getDescriptor() {
        return this.c;
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap a() {
        return new LinkedHashMap();
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.t.g(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap linkedHashMap, int i) {
        kotlin.jvm.internal.t.g(linkedHashMap, "<this>");
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return map.entrySet().iterator();
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return map.size();
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap k(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.t.g(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
