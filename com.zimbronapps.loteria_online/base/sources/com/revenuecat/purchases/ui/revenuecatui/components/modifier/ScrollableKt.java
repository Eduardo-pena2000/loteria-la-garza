package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import C.n;
import C.q;
import Ca.o;
import androidx.compose.foundation.f;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ScrollableKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ e scrollable(e eVar, f scrollState, q scrollOrientation) {
        e f;
        t.g(eVar, "<this>");
        t.g(scrollState, "scrollState");
        t.g(scrollOrientation, "scrollOrientation");
        int i = WhenMappings.$EnumSwitchMapping$0[scrollOrientation.ordinal()];
        if (i == 1) {
            f = androidx.compose.foundation.e.f(e.a, scrollState, false, (n) null, false, 14, (Object) null);
        } else {
            if (i != 2) {
                throw new o();
            }
            f = androidx.compose.foundation.e.b(e.a, scrollState, false, (n) null, false, 14, (Object) null);
        }
        return eVar.then(f);
    }
}
