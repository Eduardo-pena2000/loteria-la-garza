package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$applicablePackage$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$applicablePackage$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final Package invoke() {
        Package rcPackage = TextComponentState.access$getStyle$p(this.this$0).getRcPackage();
        if (rcPackage != null) {
            return rcPackage;
        }
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) TextComponentState.access$getSelectedPackageInfoProvider$p(this.this$0).invoke();
        if (selectedPackageInfo != null) {
            return selectedPackageInfo.getRcPackage();
        }
        return null;
    }
}
