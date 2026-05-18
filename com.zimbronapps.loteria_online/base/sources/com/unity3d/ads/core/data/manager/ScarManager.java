package com.unity3d.ads.core.data.manager;

import Ga.e;
import android.content.Context;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.List;
import v9.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ScarManager {
    Object getSignals(List list, e eVar);

    Object getVersion(e eVar);

    Object loadAd(String str, String str2, String str3, String str4, String str5, int i, e eVar);

    fb.e loadBannerAd(Context context, BannerView bannerView, c cVar, UnityBannerSize unityBannerSize, String str);

    fb.e show(String str, String str2);
}
