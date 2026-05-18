package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Ca.o;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BadgeStyleKt {
    public static final /* synthetic */ Result toBadgeStyle(Badge badge, l createStackComponentStyle) {
        t.g(badge, "<this>");
        t.g(createStackComponentStyle, "createStackComponentStyle");
        Result result = (Result) createStackComponentStyle.invoke(badge.getStack());
        if (result instanceof Result.Success) {
            return new Result.Success(new BadgeStyle((StackComponentStyle) ((Result.Success) result).getValue(), badge.getStyle(), badge.getAlignment()));
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new o();
    }
}
