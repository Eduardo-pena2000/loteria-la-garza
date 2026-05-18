package com.unity3d.services.ads.token;

import android.util.Base64;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NativeTokenGenerator implements INativeTokenGenerator {
    private static final String DEFAULT_NATIVE_TOKEN_PREFIX = "1:";
    private DeviceInfoReaderBuilder _deviceInfoReaderBuilder;
    private ExecutorService _executorService;
    private String _prependStr;

    public class 1 implements Runnable {
        final /* synthetic */ INativeTokenGeneratorListener val$callback;

        public 1(INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
            this.val$callback = iNativeTokenGeneratorListener;
        }

        public void run() {
            try {
                String encodeToString = Base64.encodeToString(new DeviceInfoReaderCompressor(NativeTokenGenerator.access$000(NativeTokenGenerator.this).build()).getDeviceData(), 2);
                if (NativeTokenGenerator.access$100(NativeTokenGenerator.this) == null || NativeTokenGenerator.access$100(NativeTokenGenerator.this).isEmpty()) {
                    this.val$callback.onReady(encodeToString);
                } else {
                    StringBuilder sb = new StringBuilder(NativeTokenGenerator.access$100(NativeTokenGenerator.this).length() + encodeToString.length());
                    sb.append(NativeTokenGenerator.access$100(NativeTokenGenerator.this));
                    sb.append(encodeToString);
                    this.val$callback.onReady(sb.toString());
                }
            } catch (Exception e) {
                DeviceLog.exception("Unity Ads failed to generate token.", e);
                this.val$callback.onReady(null);
            }
        }
    }

    public NativeTokenGenerator(ExecutorService executorService, DeviceInfoReaderBuilder deviceInfoReaderBuilder) {
        this(executorService, deviceInfoReaderBuilder, "1:");
    }

    public static /* synthetic */ DeviceInfoReaderBuilder access$000(NativeTokenGenerator nativeTokenGenerator) {
        return nativeTokenGenerator._deviceInfoReaderBuilder;
    }

    public static /* synthetic */ String access$100(NativeTokenGenerator nativeTokenGenerator) {
        return nativeTokenGenerator._prependStr;
    }

    public void generateToken(INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        this._executorService.execute(new 1(iNativeTokenGeneratorListener));
    }

    public NativeTokenGenerator(ExecutorService executorService, DeviceInfoReaderBuilder deviceInfoReaderBuilder, String str) {
        this._executorService = executorService;
        this._deviceInfoReaderBuilder = deviceInfoReaderBuilder;
        this._prependStr = str;
    }
}
