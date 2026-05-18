package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetAdPlayerContext {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", f = "AndroidGetAdPlayerContext.kt", l = {15}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        t.g(deviceInfoRepository, "deviceInfoRepository");
        t.g(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(Ga.e r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke.1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 r2 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke.1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 r2 = new com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = Ha.c.f()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext r2 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext) r2
            Ca.t.b(r1)
            goto L4a
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            Ca.t.b(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r0.deviceInfoRepository
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.staticDeviceInfo(r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            r2 = r0
        L4a:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r1
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r3 = r2.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r3 = r3.getDynamicDeviceInfo()
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r2.sessionRepository
            java.lang.String r2 = r2.getGameId()
            if (r2 != 0) goto L5c
            java.lang.String r2 = ""
        L5c:
            java.lang.String r4 = r1.getBundleId()
            java.lang.String r5 = "bundleId"
            Ca.q r6 = Ca.x.a(r5, r4)
            java.lang.String r4 = "bundleVersion"
            java.lang.String r5 = r1.getBundleVersion()
            Ca.q r7 = Ca.x.a(r4, r5)
            java.lang.String r4 = "webviewHash"
            java.lang.String r5 = "unknown"
            Ca.q r8 = Ca.x.a(r4, r5)
            int r4 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            java.lang.Integer r4 = Ia.b.d(r4)
            java.lang.String r5 = "sdkVersion"
            Ca.q r9 = Ca.x.a(r5, r4)
            java.lang.String r4 = "sdkVersionName"
            java.lang.String r5 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            Ca.q r10 = Ca.x.a(r4, r5)
            java.lang.String r4 = "osVersion"
            java.lang.String r5 = r1.getOsVersion()
            Ca.q r11 = Ca.x.a(r4, r5)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "systemLanguage"
            Ca.q r12 = Ca.x.a(r5, r4)
            java.lang.String r4 = "deviceModel"
            java.lang.String r1 = r1.getDeviceModel()
            Ca.q r13 = Ca.x.a(r4, r1)
            boolean r1 = r3.getLimitedTracking()
            java.lang.Boolean r1 = Ia.b.a(r1)
            java.lang.String r4 = "limitAdTracking"
            Ca.q r14 = Ca.x.a(r4, r1)
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android r1 = r3.getAndroid()
            double r3 = r1.getMaxVolume()
            java.lang.Double r1 = Ia.b.b(r3)
            java.lang.String r3 = "maxVolume"
            Ca.q r15 = Ca.x.a(r3, r1)
            java.lang.String r1 = "gameId"
            Ca.q r16 = Ca.x.a(r1, r2)
            Ca.q[] r1 = new Ca.q[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.Map r1 = Da.S.l(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke(Ga.e):java.lang.Object");
    }
}
