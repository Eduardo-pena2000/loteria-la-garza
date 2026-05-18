package com.unity3d.ads.core.extensions;

import Ca.o;
import com.unity3d.ads.AdFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import kotlin.jvm.internal.t;
import v9.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdFormatExtensions {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdFormatOuterClass.AdFormat.values().length];
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdFormat.values().length];
            try {
                iArr2[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(AdFormat adFormat) {
        t.g(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i == 1) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        if (i == 2) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i == 3) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i == 4) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
        }
        throw new o();
    }

    public static final d toUnityAdFormat(AdFormatOuterClass.AdFormat adFormat) {
        t.g(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i == 1) {
            return d.REWARDED;
        }
        if (i == 2) {
            return d.INTERSTITIAL;
        }
        if (i == 3) {
            return d.BANNER;
        }
        if (i != 4) {
            return null;
        }
        return d.UNSPECIFIED;
    }

    public static final d toUnityAdFormat(AdFormat adFormat) {
        t.g(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i == 1) {
            return d.UNSPECIFIED;
        }
        if (i == 2) {
            return d.BANNER;
        }
        if (i == 3) {
            return d.INTERSTITIAL;
        }
        if (i == 4) {
            return d.REWARDED;
        }
        throw new o();
    }
}
