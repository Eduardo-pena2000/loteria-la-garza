package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(String str);

    List getAllProfileNames();

    InvocationHandler getOrCreateProfile(String str);

    InvocationHandler getProfile(String str);
}
