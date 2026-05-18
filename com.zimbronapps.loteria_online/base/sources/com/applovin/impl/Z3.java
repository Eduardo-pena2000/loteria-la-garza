package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class z3 extends r2 {
    private final e3 n;
    private final Context o;

    public z3(e3 e3Var, Context context) {
        super(r2.c.DETAIL);
        this.n = e3Var;
        this.o = context;
        this.c = t();
        this.d = s();
    }

    private SpannedString q() {
        if (!this.n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.n.c(), -16777216));
        if (this.n.A()) {
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("  LATEST  ", m0.a(R.color.applovin_sdk_orangeColor, this.o)));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.n.k(), -16777216));
        }
        if (!this.n.B()) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(u());
        spannableStringBuilder.append(new SpannableString("\n"));
        spannableStringBuilder.append(q());
        if (this.n.q() == e3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        } else if (this.n.q() == e3.a.INCOMPLETE_INTEGRATION && this.n.E()) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.n.g(), o() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.n.F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (!StringUtils.isValidString(this.n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.n.z() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.n.p(), -16777216));
        return new SpannedString(spannableStringBuilder);
    }

    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    public int h() {
        int h = this.n.h();
        return h > 0 ? h : R.drawable.applovin_ic_mediation_placeholder;
    }

    public boolean o() {
        return this.n.q() != e3.a.MISSING;
    }

    public e3 r() {
        return this.n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + this.c + ", detailText=" + this.d + ", network=" + this.n + "}";
    }
}
