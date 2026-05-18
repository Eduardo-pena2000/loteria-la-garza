package com.revenuecat.purchases.ui.revenuecatui.components;

import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum ScreenCondition {
    COMPACT,
    MEDIUM,
    EXPANDED;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final /* synthetic */ ScreenCondition from(c sizeClass) {
            t.g(sizeClass, "sizeClass");
            if (t.c(sizeClass, c.c)) {
                return ScreenCondition.COMPACT;
            }
            if (t.c(sizeClass, c.d)) {
                return ScreenCondition.MEDIUM;
            }
            if (t.c(sizeClass, c.e)) {
                return ScreenCondition.EXPANDED;
            }
            Logger.INSTANCE.d("Unexpected WindowWidthSizeClass: '" + sizeClass + "'. Falling back to COMPACT.");
            return ScreenCondition.COMPACT;
        }

        private Companion() {
        }
    }
}
