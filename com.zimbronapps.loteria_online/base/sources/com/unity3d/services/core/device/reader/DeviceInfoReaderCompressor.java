package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderCompressor implements IDeviceInfoDataCompressor {
    public final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderCompressor(IDeviceInfoReader iDeviceInfoReader) {
        this._deviceInfoReader = iDeviceInfoReader;
    }

    public byte[] compressDeviceInfo(Map map) {
        if (map == null) {
            DeviceLog.error("Invalid DeviceInfoData: Expected non null map provided by reader");
            return null;
        }
        String jSONObject = new JSONObject(map).toString();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(jSONObject.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(jSONObject.getBytes());
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            DeviceLog.error("Error occurred while trying to compress device data.");
            return null;
        }
    }

    public byte[] getDeviceData() {
        return compressDeviceInfo(getDeviceInfo());
    }

    public Map getDeviceInfo() {
        return this._deviceInfoReader.getDeviceInfoData();
    }
}
