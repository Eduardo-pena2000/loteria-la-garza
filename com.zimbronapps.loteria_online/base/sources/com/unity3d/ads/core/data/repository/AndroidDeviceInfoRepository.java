package com.unity3d.ads.core.data.repository;

import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import fb.P;
import fb.e;
import fb.z;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {
    private final z allowedPii;
    private final String analyticsUserId;
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;
    private final SessionRepository sessionRepository;
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    private final e volumeSettingsChange;

    @f(c = "com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository", f = "AndroidDeviceInfoRepository.kt", l = {38}, m = "getAuidByteString")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidDeviceInfoRepository.this.getAuidByteString(this);
        }
    }

    public AndroidDeviceInfoRepository(StaticDeviceInfoDataSource staticDeviceInfoDataSource, DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource, PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, SessionRepository sessionRepository) {
        t.g(staticDeviceInfoDataSource, "staticDeviceInfoDataSource");
        t.g(dynamicDeviceInfoDataSource, "dynamicDeviceInfoDataSource");
        t.g(privacyDeviceInfoDataSource, "privacyDeviceInfoDataSource");
        t.g(sessionRepository, "sessionRepository");
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource;
        this.sessionRepository = sessionRepository;
        AllowedPiiOuterClass.AllowedPii defaultInstance = AllowedPiiOuterClass.AllowedPii.getDefaultInstance();
        t.f(defaultInstance, "getDefaultInstance()");
        this.allowedPii = P.a(defaultInstance);
        this.analyticsUserId = staticDeviceInfoDataSource.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource.getVolumeSettingsChange();
    }

    public StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    public z getAllowedPii() {
        return this.allowedPii;
    }

    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getAuidByteString(Ga.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString.1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1 r0 = (com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1 r0 = new com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Ca.t.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getAuidString(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            r0 = 0
            if (r5 != 0) goto L43
            return r0
        L43:
            java.util.UUID r5 = java.util.UUID.fromString(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "fromString(auidString)"
            kotlin.jvm.internal.t.f(r5, r1)     // Catch: java.lang.Throwable -> L50
            com.google.protobuf.ByteString r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r5)     // Catch: java.lang.Throwable -> L50
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString(Ga.e):java.lang.Object");
    }

    public Object getAuidString(Ga.e eVar) {
        return this.staticDeviceInfoDataSource.getAuid(eVar);
    }

    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    public int getCurrentUiTheme() {
        return this.dynamicDeviceInfoDataSource.getCurrentUiTheme();
    }

    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch();
    }

    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }

    public Object getIdfi(Ga.e eVar) {
        return this.staticDeviceInfoDataSource.getIdfi(eVar);
    }

    public List getLocaleList() {
        return this.dynamicDeviceInfoDataSource.getLocaleList();
    }

    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    public PiiOuterClass.Pii getPiiData() {
        return this.privacyDeviceInfoDataSource.fetch((AllowedPiiOuterClass.AllowedPii) getAllowedPii().getValue());
    }

    public int getRingerMode() {
        return this.dynamicDeviceInfoDataSource.getRingerMode();
    }

    public long getSystemBootTime() {
        return this.staticDeviceInfoDataSource.getSystemBootTime();
    }

    public Object getUnityBuildGuid(Ga.e eVar) {
        return this.staticDeviceInfoDataSource.getUnityBuildGuid(eVar);
    }

    public e getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    public Object staticDeviceInfo(Ga.e eVar) {
        StaticDeviceInfoDataSource staticDeviceInfoDataSource = this.staticDeviceInfoDataSource;
        List additionalStorePackagesList = this.sessionRepository.getNativeConfiguration().getAdditionalStorePackagesList();
        t.f(additionalStorePackagesList, "sessionRepository.native…ditionalStorePackagesList");
        return staticDeviceInfoDataSource.fetch(additionalStorePackagesList, eVar);
    }
}
