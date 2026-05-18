package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Ca.o;
import Fa.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonStyle;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PathUtils;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PathUtils$sortPathsByButtonPriority$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        int i;
        PathUtils pathUtils = PathUtils.INSTANCE;
        SettingsButtonStyle buttonStyleForPath = pathUtils.getButtonStyleForPath((CustomerCenterConfigData.HelpPath) obj);
        int[] iArr = PathUtils.WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[buttonStyleForPath.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = 0;
        } else {
            if (i2 != 2) {
                throw new o();
            }
            i = 1;
        }
        Integer valueOf = Integer.valueOf(i);
        int i4 = iArr[pathUtils.getButtonStyleForPath((CustomerCenterConfigData.HelpPath) obj2).ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                throw new o();
            }
            i3 = 1;
        }
        return b.d(valueOf, Integer.valueOf(i3));
    }
}
