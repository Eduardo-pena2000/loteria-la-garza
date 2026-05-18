package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class JsonStorageAggregator implements IJsonStorageReader {
    private final List _jsonStorageReaders;

    public JsonStorageAggregator(List list) {
        this._jsonStorageReaders = list;
    }

    public Object get(String str) {
        IJsonStorageReader iJsonStorageReader;
        Iterator it = this._jsonStorageReaders.iterator();
        Object obj = null;
        while (it.hasNext() && ((iJsonStorageReader = (IJsonStorageReader) it.next()) == null || (obj = iJsonStorageReader.get(str)) == null)) {
        }
        return obj;
    }

    public JSONObject getData() {
        JSONObject jSONObject = new JSONObject();
        for (IJsonStorageReader iJsonStorageReader : this._jsonStorageReaders) {
            if (iJsonStorageReader != null) {
                try {
                    jSONObject = Utilities.mergeJsonObjects(jSONObject, iJsonStorageReader.getData());
                } catch (JSONException unused) {
                    DeviceLog.error("Failed to merge storage: " + iJsonStorageReader);
                }
            }
        }
        return jSONObject;
    }
}
