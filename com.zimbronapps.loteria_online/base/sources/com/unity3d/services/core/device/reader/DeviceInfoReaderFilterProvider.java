package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.IJsonStorageReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderFilterProvider {
    private static final String FILTER_EXCLUDE_KEY = "exclude";
    private static final String UNIFIED_CONFIG_KEY = "unifiedconfig";
    private IJsonStorageReader _storage;

    public DeviceInfoReaderFilterProvider(IJsonStorageReader iJsonStorageReader) {
        this._storage = iJsonStorageReader;
    }

    private List trimWhiteSpaces(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).trim());
        }
        return arrayList;
    }

    public List getFilterList() {
        Object opt;
        ArrayList arrayList = new ArrayList();
        IJsonStorageReader iJsonStorageReader = this._storage;
        if (iJsonStorageReader == null || iJsonStorageReader.getData() == null || (opt = this._storage.getData().opt("unifiedconfig")) == null || !(opt instanceof JSONObject)) {
            return arrayList;
        }
        Object opt2 = ((JSONObject) opt).opt("exclude");
        return opt2 instanceof String ? trimWhiteSpaces(Arrays.asList(((String) opt2).split(","))) : arrayList;
    }
}
