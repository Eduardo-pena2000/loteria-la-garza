package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    @f(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", l = {24, 25, 33, 34, 45, 50, 55, 60, 78}, m = "invoke")
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
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader) {
        t.g(getClientInfo, "getClientInfo");
        t.g(sessionRepository, "sessionRepository");
        t.g(deviceInfoRepository, "deviceInfoRepository");
        t.g(legacyUserConsentRepository, "legacyUserConsentRepository");
        t.g(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(Ga.e r24) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(Ga.e):java.lang.Object");
    }
}
