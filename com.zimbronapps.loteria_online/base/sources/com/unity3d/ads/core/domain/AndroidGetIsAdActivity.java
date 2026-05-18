package com.unity3d.ads.core.domain;

import Ca.l;
import Ca.m;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.t;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetIsAdActivity {
    private final l activities$delegate;
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities$delegate = m.b(new AndroidGetIsAdActivity$activities$2(this));
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(AndroidGetIsAdActivity androidGetIsAdActivity) {
        return androidGetIsAdActivity.sessionRepository;
    }

    private final List getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(String activityName) {
        t.g(activityName, "activityName");
        return getActivities().contains(h.c(StringExtensionsKt.getSHA256Hash(activityName)));
    }
}
