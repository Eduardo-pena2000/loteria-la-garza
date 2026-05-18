package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Ca.o;
import Da.D;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PathUtils {
    public static final int $stable = 0;
    public static final PathUtils INSTANCE = new PathUtils();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SettingsButtonStyle.values().length];
            try {
                iArr[SettingsButtonStyle.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsButtonStyle.OUTLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CustomerCenterConfigData.HelpPath.PathType.values().length];
            try {
                iArr2[CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.PathType.CUSTOM_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.PathType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.PathType.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.PathType.REFUND_REQUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.PathType.CHANGE_PLANS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PathUtils() {
    }

    private final boolean isGeneralPath(CustomerCenterConfigData.HelpPath helpPath) {
        switch (WhenMappings.$EnumSwitchMapping$1[helpPath.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new o();
        }
    }

    private final boolean isSubscriptionSpecificPath(CustomerCenterConfigData.HelpPath helpPath) {
        switch (WhenMappings.$EnumSwitchMapping$1[helpPath.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
            case 7:
                return true;
            default:
                throw new o();
        }
    }

    public final List filterGeneralPaths(List paths) {
        t.g(paths, "paths");
        ArrayList arrayList = new ArrayList();
        for (Object obj : paths) {
            if (INSTANCE.isGeneralPath((CustomerCenterConfigData.HelpPath) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List filterSubscriptionSpecificPaths(List paths) {
        t.g(paths, "paths");
        ArrayList arrayList = new ArrayList();
        for (Object obj : paths) {
            if (INSTANCE.isSubscriptionSpecificPath((CustomerCenterConfigData.HelpPath) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final SettingsButtonStyle getButtonStyleForPath(CustomerCenterConfigData.HelpPath path) {
        t.g(path, "path");
        return isSubscriptionSpecificPath(path) ? SettingsButtonStyle.FILLED : SettingsButtonStyle.OUTLINED;
    }

    public final List sortPathsByButtonPriority(List paths) {
        t.g(paths, "paths");
        return D.C0(paths, new PathUtils$sortPathsByButtonPriority$$inlined$sortedBy$1());
    }
}
