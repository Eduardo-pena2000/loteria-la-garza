package com.unity3d.ads.beta;

import Da.S;
import android.content.Context;
import com.unity3d.services.core.log.DeviceLog;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationConfiguration {
    private final Context context;
    private final Map extras;
    private final String gameID;
    private final boolean isTestModeEnabled;
    private final DeviceLog.UnityAdsLogLevel logLevel;
    private final MediationInfo mediationInfo;

    public static final class Builder {
        private final Context context;
        private Map extras;
        private final String gameID;
        private final boolean isTestModeEnabled;
        private DeviceLog.UnityAdsLogLevel logLevel;
        private MediationInfo mediationInfo;

        public Builder(Context context, String gameID, boolean z) {
            t.g(context, "context");
            t.g(gameID, "gameID");
            this.context = context;
            this.gameID = gameID;
            this.isTestModeEnabled = z;
            this.logLevel = DeviceLog.UnityAdsLogLevel.INFO;
            this.extras = S.h();
        }

        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.context, this.gameID, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        public final Builder withExtras(Map extras) {
            t.g(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withLogLevel(DeviceLog.UnityAdsLogLevel logLevel) {
            t.g(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public InitializationConfiguration(Context context, String gameID, boolean z, DeviceLog.UnityAdsLogLevel logLevel, Map extras, MediationInfo mediationInfo) {
        t.g(context, "context");
        t.g(gameID, "gameID");
        t.g(logLevel, "logLevel");
        t.g(extras, "extras");
        this.context = context;
        this.gameID = gameID;
        this.isTestModeEnabled = z;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map getExtras() {
        return this.extras;
    }

    public final String getGameID() {
        return this.gameID;
    }

    public final DeviceLog.UnityAdsLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(Context context, String str, boolean z, DeviceLog.UnityAdsLogLevel unityAdsLogLevel, Map map, MediationInfo mediationInfo, int i, k kVar) {
        this(context, str, z, (i & 8) != 0 ? DeviceLog.UnityAdsLogLevel.INFO : unityAdsLogLevel, (i & 16) != 0 ? S.h() : map, (i & 32) != 0 ? null : mediationInfo);
    }
}
