package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Qa.l;
import Qa.p;
import Qa.q;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ModifierExtensionsKt {
    public static final e applyIfNotNull(e eVar, Object obj, p modifier) {
        t.g(eVar, "<this>");
        t.g(modifier, "modifier");
        return obj != null ? eVar.then((e) modifier.invoke(e.a, obj)) : eVar;
    }

    public static final e conditional(e eVar, boolean z, l modifier) {
        t.g(eVar, "<this>");
        t.g(modifier, "modifier");
        return z ? eVar.then((e) modifier.invoke(e.a)) : eVar;
    }

    public static final e applyIfNotNull(e eVar, Object obj, Object obj2, q modifier) {
        t.g(eVar, "<this>");
        t.g(modifier, "modifier");
        return (obj == null || obj2 == null) ? eVar : eVar.then((e) modifier.invoke(e.a, obj, obj2));
    }
}
