package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import d1.L;
import kotlin.jvm.internal.u;
import l1.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IntroEligibilityStateViewKt$IntroEligibilityStateView$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ OfferEligibility $eligibility;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ j $textAlign;
    final /* synthetic */ String $textWithIntroOffer;
    final /* synthetic */ String $textWithMultipleIntroOffers;
    final /* synthetic */ String $textWithNoIntroOffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroEligibilityStateViewKt$IntroEligibilityStateView$2(String str, String str2, String str3, OfferEligibility offerEligibility, long j, Y0 y0, L l, j jVar, boolean z, e eVar, int i, int i2) {
        super(2);
        this.$textWithNoIntroOffer = str;
        this.$textWithIntroOffer = str2;
        this.$textWithMultipleIntroOffers = str3;
        this.$eligibility = offerEligibility;
        this.$color = j;
        this.$style = y0;
        this.$fontWeight = l;
        this.$textAlign = jVar;
        this.$allowLinks = z;
        this.$modifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        IntroEligibilityStateViewKt.IntroEligibilityStateView-QETHhvg(this.$textWithNoIntroOffer, this.$textWithIntroOffer, this.$textWithMultipleIntroOffers, this.$eligibility, this.$color, this.$style, this.$fontWeight, this.$textAlign, this.$allowLinks, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}
