package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Da.r;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class NonEmptySetKt {
    public static final /* synthetic */ NonEmptySet nonEmptySetOf(Object obj, Object... t) {
        t.g(t, "t");
        return new NonEmptySet(obj, r.I(t));
    }

    public static final /* synthetic */ NonEmptySet toNonEmptySetOrNull(Iterable iterable) {
        t.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return new NonEmptySet(it.next(), new NonEmptySetKt$toNonEmptySetOrNull$$inlined$Iterable$1(it));
        }
        return null;
    }
}
