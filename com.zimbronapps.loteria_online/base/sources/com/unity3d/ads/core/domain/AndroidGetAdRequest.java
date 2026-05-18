package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    @f(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", l = {33, 40, 55}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdRequest.this.invoke(null, null, null, this);
        }
    }

    public AndroidGetAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository, WebviewConfigurationDataSource webViewConfigurationDataSource, TcfRepository tcfRepository) {
        t.g(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        t.g(sessionRepository, "sessionRepository");
        t.g(deviceInfoRepository, "deviceInfoRepository");
        t.g(campaignRepository, "campaignRepository");
        t.g(webViewConfigurationDataSource, "webViewConfigurationDataSource");
        t.g(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webViewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014e A[PHI: r1
      0x014e: PHI (r1v26 java.lang.Object) = (r1v23 java.lang.Object), (r1v1 java.lang.Object) binds: [B:24:0x014b, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.String r18, com.google.protobuf.ByteString r19, gatewayprotocol.v1.AdRequestOuterClass.BannerSize r20, Ga.e r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke(java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, Ga.e):java.lang.Object");
    }
}
