package com.revenuecat.purchases.ui.revenuecatui.extensions;

import X.r0;
import Z0.G;
import Z0.Y0;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import d1.H;
import d1.I;
import d1.L;
import d1.u;
import h1.e;
import kotlin.jvm.internal.t;
import l1.a;
import l1.h;
import l1.k;
import l1.q;
import l1.s;
import v0.C1;
import x0.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TypographyExtensionsKt {
    public static final r0 copyWithFontProvider(r0 r0Var, FontProvider fontProvider) {
        t.g(r0Var, "<this>");
        t.g(fontProvider, "fontProvider");
        return r0Var.a(modifyFontIfNeeded(r0Var.e(), TypographyType.DISPLAY_LARGE, fontProvider), modifyFontIfNeeded(r0Var.f(), TypographyType.DISPLAY_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.g(), TypographyType.DISPLAY_SMALL, fontProvider), modifyFontIfNeeded(r0Var.h(), TypographyType.HEADLINE_LARGE, fontProvider), modifyFontIfNeeded(r0Var.i(), TypographyType.HEADLINE_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.j(), TypographyType.HEADLINE_SMALL, fontProvider), modifyFontIfNeeded(r0Var.n(), TypographyType.TITLE_LARGE, fontProvider), modifyFontIfNeeded(r0Var.o(), TypographyType.TITLE_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.p(), TypographyType.TITLE_SMALL, fontProvider), modifyFontIfNeeded(r0Var.b(), TypographyType.BODY_LARGE, fontProvider), modifyFontIfNeeded(r0Var.c(), TypographyType.BODY_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.d(), TypographyType.BODY_SMALL, fontProvider), modifyFontIfNeeded(r0Var.k(), TypographyType.LABEL_LARGE, fontProvider), modifyFontIfNeeded(r0Var.l(), TypographyType.LABEL_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.m(), TypographyType.LABEL_SMALL, fontProvider));
    }

    private static final Y0 modifyFontIfNeeded(Y0 y0, TypographyType typographyType, FontProvider fontProvider) {
        u font = fontProvider.getFont(typographyType);
        return font == null ? y0 : Y0.e(y0, 0L, 0L, (L) null, (H) null, (I) null, font, (String) null, 0L, (a) null, (q) null, (e) null, 0L, (k) null, (C1) null, (g) null, 0, 0, 0L, (s) null, (G) null, (h) null, 0, 0, (l1.u) null, 16777183, (Object) null);
    }
}
