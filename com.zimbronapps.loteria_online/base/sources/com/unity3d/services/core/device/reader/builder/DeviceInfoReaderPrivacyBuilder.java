package com.unity3d.services.core.device.reader.builder;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithBehavioralFlag;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderPrivacyBuilder extends DeviceInfoReaderBuilder {
    public DeviceInfoReaderPrivacyBuilder(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    private JsonFlattenerRules getPrivacyRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList(new String[]{"privacy", "gdpr", "unity", "pipl"}), Collections.singletonList("value"), Arrays.asList(new String[]{"ts", "exclude", "mode"}));
    }

    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        Storage storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        Storage storage3 = StorageManager.getStorage(StorageManager.StorageType.MEMORY);
        return new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithBehavioralFlag(buildWithRequestType(InitRequestType.PRIVACY), new NonBehavioralFlagReader(new JsonStorageAggregator(Arrays.asList(new IJsonStorageReader[]{storage2, storage, storage3})))), getMediationInfoRules(), storage3), getPrivacyRequestStorageRules(), storage, storage2), new DeviceInfoReaderFilterProvider(storage).getFilterList());
    }
}
