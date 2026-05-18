package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderWithPrivacy implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final PiiDataProvider _piiDataProvider;
    private final PiiTrackingStatusReader _piiTrackingStatusReader;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderWithPrivacy(IDeviceInfoReader iDeviceInfoReader, PrivacyConfigStorage privacyConfigStorage, PiiDataProvider piiDataProvider, PiiTrackingStatusReader piiTrackingStatusReader) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._privacyConfigStorage = privacyConfigStorage;
        this._piiDataProvider = piiDataProvider;
        this._piiTrackingStatusReader = piiTrackingStatusReader;
    }

    private Map getPiiAttributesFromDevice() {
        HashMap hashMap = new HashMap();
        String advertisingTrackingId = this._piiDataProvider.getAdvertisingTrackingId();
        if (advertisingTrackingId != null) {
            hashMap.put("unifiedconfig.pii.advertisingTrackingId", advertisingTrackingId);
        }
        return hashMap;
    }

    public Map getDeviceInfoData() {
        Map deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        PrivacyConfigStorage privacyConfigStorage = this._privacyConfigStorage;
        if (privacyConfigStorage != null && privacyConfigStorage.getPrivacyConfig() != null) {
            if (this._privacyConfigStorage.getPrivacyConfig().allowedToSendPii()) {
                deviceInfoData.putAll(getPiiAttributesFromDevice());
            }
            if (this._privacyConfigStorage.getPrivacyConfig().shouldSendNonBehavioral()) {
                deviceInfoData.put("user.nonBehavioral", Boolean.valueOf(this._piiTrackingStatusReader.getUserNonBehavioralFlag()));
            }
        }
        return deviceInfoData;
    }
}
