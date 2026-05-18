package org.chromium.support_lib_boundary;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    Set getProfileNamesToLoad();

    boolean shouldRunUiThreadStartUpTasks();
}
