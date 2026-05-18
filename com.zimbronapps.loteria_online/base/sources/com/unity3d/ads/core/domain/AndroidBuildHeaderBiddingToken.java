package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    @f(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", l = {40, 52, 57, 60, 62}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidBuildHeaderBiddingToken.this.invoke(0, null, false, this);
        }
    }

    public AndroidBuildHeaderBiddingToken(GetByteStringId generateId, GetClientInfo getClientInfo, GetSharedDataTimestamps getTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo testDataInfo, OfferwallManager offerwallManager) {
        t.g(generateId, "generateId");
        t.g(getClientInfo, "getClientInfo");
        t.g(getTimestamps, "getTimestamps");
        t.g(getLimitedSessionToken, "getLimitedSessionToken");
        t.g(getInitializationData, "getInitializationData");
        t.g(deviceInfoRepository, "deviceInfoRepository");
        t.g(sessionRepository, "sessionRepository");
        t.g(campaignRepository, "campaignRepository");
        t.g(tcfRepository, "tcfRepository");
        t.g(testDataInfo, "testDataInfo");
        t.g(offerwallManager, "offerwallManager");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = testDataInfo;
        this.offerwallManager = offerwallManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r18, com.unity3d.ads.TokenConfiguration r19, boolean r20, Ga.e r21) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, boolean, Ga.e):java.lang.Object");
    }
}
