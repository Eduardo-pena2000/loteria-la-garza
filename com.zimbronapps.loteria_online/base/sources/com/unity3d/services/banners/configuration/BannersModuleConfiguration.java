package com.unity3d.services.banners.configuration;

import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IModuleConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BannersModuleConfiguration implements IModuleConfiguration {
    private static final Class[] WEB_APP_API_CLASS_LIST = {Banner.class, BannerListener.class};

    public Class[] getWebAppApiClassList() {
        return WEB_APP_API_CLASS_LIST;
    }

    public boolean initCompleteState(Configuration configuration) {
        return true;
    }

    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        return true;
    }

    public boolean resetState(Configuration configuration) {
        return true;
    }
}
