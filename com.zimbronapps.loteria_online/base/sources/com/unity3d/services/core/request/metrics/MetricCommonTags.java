package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.IObserver;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MetricCommonTags {
    private static final String METRIC_COMMON_TAG_CONFIG_SOURCE = "src";
    private static final String METRIC_COMMON_TAG_COUNTRY_ISO = "iso";
    private static final String METRIC_COMMON_TAG_MEDIATION_ADAPTER = "m_ad_ver";
    private static final String METRIC_COMMON_TAG_MEDIATION_NAME = "m_name";
    private static final String METRIC_COMMON_TAG_MEDIATION_VERSION = "m_ver";
    private static final String METRIC_COMMON_TAG_PLATFORM = "plt";
    public static final String METRIC_COMMON_TAG_PLATFORM_ANDROID = "android";
    private static final String METRIC_COMMON_TAG_PRIVACY_MODE = "prvc";
    private static final String METRIC_COMMON_TAG_SDK_VERSION = "sdk";
    private static final String METRIC_COMMON_TAG_SYSTEM_VERSION = "system";
    private static final String METRIC_COMMON_TAG_TEST_MODE = "tm";
    private String _configSrc;
    private final String _countryISO;
    private Map _experiments;
    private String _mediationAdapter;
    private String _mediationName;
    private String _mediationVersion;
    private final String _platform;
    private String _privacyMode;
    private final IObserver _privacyObserver;
    private final String _sdkVersion;
    private final String _systemVersion;
    private final boolean _testMode;

    public class 1 implements IObserver {
        public 1() {
        }

        public void updated(PrivacyConfig privacyConfig) {
            MetricCommonTags.access$002(MetricCommonTags.this, privacyConfig.getPrivacyStatus().toString().toLowerCase());
        }
    }

    public MetricCommonTags() {
        1 r0 = new 1();
        this._privacyObserver = r0;
        this._countryISO = Device.getNetworkCountryISO();
        this._platform = "android";
        this._sdkVersion = SdkProperties.getVersionName();
        this._systemVersion = Device.getOsVersion();
        this._privacyMode = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        this._testMode = SdkProperties.isTestMode();
        PrivacyConfigStorage.getInstance().registerObserver(r0);
    }

    public static /* synthetic */ String access$002(MetricCommonTags metricCommonTags, String str) {
        metricCommonTags._privacyMode = str;
        return str;
    }

    private boolean mediationIsEmpty() {
        String str = this._mediationName;
        return str == null || str.isEmpty();
    }

    private void refreshMediationData() {
        try {
            Storage storage = StorageManager.getStorage(StorageManager.StorageType.MEMORY);
            if (storage == null || !storage.initStorage()) {
                return;
            }
            this._mediationName = (String) storage.get("mediation.name.value");
            this._mediationVersion = (String) storage.get("mediation.version.value");
            this._mediationAdapter = (String) storage.get("mediation.adapter_version.value");
        } catch (Exception e) {
            DeviceLog.debug("Failed to refreshMediationData: %s", e.getLocalizedMessage());
        }
    }

    public void shutdown() {
        PrivacyConfigStorage.getInstance().unregisterObserver(this._privacyObserver);
    }

    public Map toMap() {
        if (mediationIsEmpty()) {
            refreshMediationData();
        }
        HashMap hashMap = new HashMap();
        String str = this._countryISO;
        if (str != null) {
            hashMap.put("iso", str);
        }
        String str2 = this._platform;
        if (str2 != null) {
            hashMap.put("plt", str2);
        }
        String str3 = this._sdkVersion;
        if (str3 != null) {
            hashMap.put("sdk", str3);
        }
        String str4 = this._systemVersion;
        if (str4 != null) {
            hashMap.put("system", str4);
        }
        String str5 = this._privacyMode;
        if (str5 != null) {
            hashMap.put("prvc", str5);
        }
        String str6 = this._configSrc;
        if (str6 != null) {
            hashMap.put("src", str6);
        }
        String str7 = this._mediationName;
        if (str7 != null) {
            hashMap.put("m_name", str7);
        }
        String str8 = this._mediationVersion;
        if (str8 != null) {
            hashMap.put("m_ver", str8);
        }
        String str9 = this._mediationAdapter;
        if (str9 != null) {
            hashMap.put("m_ad_ver", str9);
        }
        Map map = this._experiments;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("tm", String.valueOf(this._testMode));
        return hashMap;
    }

    public void updateWithConfig(Configuration configuration) {
        this._configSrc = configuration.getSrc();
        if (configuration.getExperiments() != null) {
            this._experiments = configuration.getExperiments().getExperimentTags();
        }
    }
}
