package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IAdUnitViewHandler {
    boolean create(IAdUnitActivity iAdUnitActivity);

    boolean destroy();

    View getView();

    void onCreate(IAdUnitActivity iAdUnitActivity, Bundle bundle);

    void onDestroy(IAdUnitActivity iAdUnitActivity);

    void onPause(IAdUnitActivity iAdUnitActivity);

    void onResume(IAdUnitActivity iAdUnitActivity);

    void onStart(IAdUnitActivity iAdUnitActivity);

    void onStop(IAdUnitActivity iAdUnitActivity);
}
