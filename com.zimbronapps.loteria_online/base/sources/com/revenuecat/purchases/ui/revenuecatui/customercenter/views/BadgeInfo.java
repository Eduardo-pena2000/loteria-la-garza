package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import A.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class BadgeInfo {
    private final i border;
    private final r0 color;
    private final String text;
    private final r0 textColor;

    public /* synthetic */ BadgeInfo(String str, r0 r0Var, i iVar, r0 r0Var2, k kVar) {
        this(str, r0Var, iVar, r0Var2);
    }

    public static /* synthetic */ BadgeInfo copy-yw5i9vo$default(BadgeInfo badgeInfo, String str, r0 r0Var, i iVar, r0 r0Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = badgeInfo.text;
        }
        if ((i & 2) != 0) {
            r0Var = badgeInfo.color;
        }
        if ((i & 4) != 0) {
            iVar = badgeInfo.border;
        }
        if ((i & 8) != 0) {
            r0Var2 = badgeInfo.textColor;
        }
        return badgeInfo.copy-yw5i9vo(str, r0Var, iVar, r0Var2);
    }

    public final String component1() {
        return this.text;
    }

    public final r0 component2-QN2ZGVo() {
        return this.color;
    }

    public final i component3() {
        return this.border;
    }

    public final r0 component4-QN2ZGVo() {
        return this.textColor;
    }

    public final BadgeInfo copy-yw5i9vo(String str, r0 r0Var, i iVar, r0 r0Var2) {
        return new BadgeInfo(str, r0Var, iVar, r0Var2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeInfo)) {
            return false;
        }
        BadgeInfo badgeInfo = (BadgeInfo) obj;
        return t.c(this.text, badgeInfo.text) && t.c(this.color, badgeInfo.color) && t.c(this.border, badgeInfo.border) && t.c(this.textColor, badgeInfo.textColor);
    }

    public final i getBorder() {
        return this.border;
    }

    public final r0 getColor-QN2ZGVo() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    public final r0 getTextColor-QN2ZGVo() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        r0 r0Var = this.color;
        int y = (hashCode + (r0Var == null ? 0 : r0.y(r0Var.A()))) * 31;
        i iVar = this.border;
        int hashCode2 = (y + (iVar == null ? 0 : iVar.hashCode())) * 31;
        r0 r0Var2 = this.textColor;
        return hashCode2 + (r0Var2 != null ? r0.y(r0Var2.A()) : 0);
    }

    public String toString() {
        return "BadgeInfo(text=" + this.text + ", color=" + this.color + ", border=" + this.border + ", textColor=" + this.textColor + ')';
    }

    private BadgeInfo(String str, r0 r0Var, i iVar, r0 r0Var2) {
        this.text = str;
        this.color = r0Var;
        this.border = iVar;
        this.textColor = r0Var2;
    }

    public /* synthetic */ BadgeInfo(String str, r0 r0Var, i iVar, r0 r0Var2, int i, k kVar) {
        this(str, r0Var, (i & 4) != 0 ? null : iVar, (i & 8) != 0 ? null : r0Var2, null);
    }
}
