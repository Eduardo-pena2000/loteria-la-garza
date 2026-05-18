package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.ads.AdFormat;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.core.configuration.IExperiments;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import v9.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ScarAdFormatProvider implements IScarAdFormatProvider {
    private final IExperiments experiments;
    private final TokenConfiguration tokenConfiguration;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScarAdFormatProvider(TokenConfiguration tokenConfiguration, IExperiments experiments) {
        t.g(experiments, "experiments");
        this.tokenConfiguration = tokenConfiguration;
        this.experiments = experiments;
    }

    public List buildAdFormatList() {
        ArrayList arrayList = new ArrayList();
        TokenConfiguration tokenConfiguration = this.tokenConfiguration;
        if (tokenConfiguration == null) {
            arrayList.add(d.REWARDED);
            arrayList.add(d.INTERSTITIAL);
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(d.BANNER);
            }
        } else {
            if (WhenMappings.$EnumSwitchMapping$0[tokenConfiguration.getAdFormat().ordinal()] != 1) {
                arrayList.add(AdFormatExtensions.toUnityAdFormat(this.tokenConfiguration.getAdFormat()));
            } else if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(d.BANNER);
            }
        }
        return arrayList;
    }

    public final IExperiments getExperiments() {
        return this.experiments;
    }

    public final TokenConfiguration getTokenConfiguration() {
        return this.tokenConfiguration;
    }
}
