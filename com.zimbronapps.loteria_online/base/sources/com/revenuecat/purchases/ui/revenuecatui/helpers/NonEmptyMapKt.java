package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.I;
import Ca.q;
import Da.S;
import Qa.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class NonEmptyMapKt {

    public static final class 1 extends u implements l {
        final /* synthetic */ LinkedHashMap $remaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(LinkedHashMap linkedHashMap) {
            super(1);
            this.$remaining = linkedHashMap;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map.Entry) obj);
            return I.a;
        }

        public final void invoke(Map.Entry entry) {
            t.g(entry, "<name for destructuring parameter 0>");
            this.$remaining.put(entry.getKey(), entry.getValue());
        }
    }

    public static /* synthetic */ void a(l lVar, Object obj) {
        toNonEmptyMapOrNull$lambda$0(lVar, obj);
    }

    public static final /* synthetic */ NonEmptyMap nonEmptyMapOf(q entry, q... t) {
        t.g(entry, "entry");
        t.g(t, "t");
        return new NonEmptyMap(entry, S.A(t));
    }

    public static final /* synthetic */ NonEmptyMap toNonEmptyMapOrNull(Map map) {
        t.g(map, "<this>");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() - 1);
        it.forEachRemaining(new a(new 1(linkedHashMap)));
        return new NonEmptyMap(new q(entry.getKey(), entry.getValue()), (Map) linkedHashMap);
    }

    private static final void toNonEmptyMapOrNull$lambda$0(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final /* synthetic */ NonEmptyMap nonEmptyMapOf(q entry, Map map) {
        t.g(entry, "entry");
        t.g(map, "map");
        return new NonEmptyMap(entry, map);
    }
}
