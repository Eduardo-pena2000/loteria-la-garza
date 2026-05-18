package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.x;
import Da.S;
import Sa.c;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import fb.P;
import fb.e;
import fb.g;
import fb.z;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final String DIRECTORY_MODE_READ = "r";
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final String KEY_STAT_CONTENT = "stat";
    public static final String USB_EXTRA_CONNECTED = "connected";
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final z reportedWarning;
    private final e volumeSettingsChange;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(Context context, LifecycleDataSource lifecycleDataSource) {
        t.g(context, "context");
        t.g(lifecycleDataSource, "lifecycleDataSource");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.reportedWarning = P.a(S.h());
        this.volumeSettingsChange = g.e(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null));
    }

    public static final /* synthetic */ double access$getStreamVolume(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, int i) {
        return androidDynamicDeviceInfoDataSource.getStreamVolume(i);
    }

    private final boolean adbStatus() {
        Boolean bool;
        try {
            boolean z = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } catch (Exception e) {
            DeviceLog.exception("Problems fetching adb enabled status", e);
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        DynamicDeviceInfoKt dynamicDeviceInfoKt = DynamicDeviceInfoKt.INSTANCE;
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setNetworkConnected(isActiveNetworkConnected());
        _create.setNetworkType(getNetworkType());
        _create.setNetworkMetered(getNetworkMetered());
        _create.setTelephonyManagerNetworkType(getNetworkType());
        _create.setAdbEnabled(isAdbEnabled());
        _create.setUsbConnected(isUSBConnected());
        _create.setVolume(getStreamVolume(3));
        _create.setMaxVolume(getStreamMaxVolume(3));
        _create.setDeviceElapsedRealtime(getElapsedRealtime());
        _create.setDeviceUpTime(getUptime());
        _create.setAirplaneMode(getAirplaneMode());
        _create.setChargingType(getChargingType());
        _create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        _create.setSdCardPresent(getIsSdCardPresent());
        _create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        return _create._build();
    }

    private final boolean getAirplaneMode() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Throwable th) {
            DeviceLog.error("Problems fetching airplane mode status", th.getMessage());
            return false;
        }
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final double getBatteryLevel() {
        if (this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return -1.0d;
        }
        return r0.getIntExtra("level", 0) / r0.getIntExtra("scale", 0);
    }

    private final int getBatteryStatus() {
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    private final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        return isUsingWifi() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI : isActiveNetworkConnected() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR : DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }

    @Ca.e
    private final long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return c.d(file.getFreeSpace() / 1024);
    }

    private final String getLanguage() {
        String locale = Locale.getDefault().toString();
        t.f(locale, "getDefault().toString()");
        return locale;
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = -1;
            }
        } else {
            i = 1;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
        String str = null;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = randomAccessFile.readLine();
            } finally {
            }
        }
        I i4 = I.a;
        Na.c.a(randomAccessFile, null);
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final String getNetworkOperator() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        return networkOperator == null ? "" : networkOperator;
    }

    private final String getNetworkOperatorName() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    @Ca.e
    @SuppressLint({"MissingPermission"})
    private final int getNetworkType() {
        Object value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager == null) {
            return -1;
        }
        try {
            return telephonyManager.getNetworkType();
        } catch (SecurityException unused) {
            if (t.c(((Map) this.reportedWarning.getValue()).get("getNetworkType"), Boolean.TRUE)) {
                return -1;
            }
            z zVar = this.reportedWarning;
            do {
                value = zVar.getValue();
            } while (!zVar.e(value, S.q((Map) value, x.a("getNetworkType", Boolean.TRUE))));
            DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            return -1;
        }
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final double getStreamVolume(int i) {
        return getAudioManager() != null ? r0.getStreamVolume(i) : -2;
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final String getTimeZone() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            t.f(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (AssertionError e) {
            DeviceLog.error("Could not read timeZone information: %s", e.getMessage());
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return c.d(file.getUsableSpace() / 1024);
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private final boolean hasInternetConnectionM() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.hardware.usb.action.USB_STATE"));
        if (registerReceiver != null) {
            return registerReceiver.getBooleanExtra("connected", false);
        }
        return false;
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setLanguage(getLanguage());
        _create.setNetworkOperator(getNetworkOperator());
        _create.setNetworkOperatorName(getNetworkOperatorName());
        _create.setFreeDiskSpace(getUsableSpace(this.context.getExternalFilesDir((String) null)));
        _create.setFreeRamMemory(getFreeMemory());
        _create.setWiredHeadset(isWiredHeadsetOn());
        _create.setTimeZone(getTimeZone());
        _create.setTimeZoneOffset(getTimeZoneOffset());
        _create.setLimitedTracking(isLimitAdTrackingEnabled());
        _create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        _create.setBatteryLevel(getBatteryLevel());
        _create.setBatteryStatus(getBatteryStatus());
        _create.setConnectionType(getConnectionType());
        _create.setAndroid(fetchAndroidDynamicDeviceInfo());
        _create.setAppActive(isAppActive());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        return _create._build();
    }

    public final int getChargingType() {
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public String getConnectionTypeStr() {
        int i = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        return i != 1 ? i != 2 ? "none" : "cellular" : "wifi";
    }

    public final Context getContext() {
        return this.context;
    }

    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    public final boolean getIsSdCardPresent() {
        return t.c(Environment.getExternalStorageState(), "mounted");
    }

    public List getLocaleList() {
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        t.f(locales, "context.resources.configuration.locales");
        int size = locales.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String locale = locales.get(i).toString();
            t.f(locale, "locales[it].toString()");
            arrayList.add(locale);
        }
        return arrayList;
    }

    public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        Network activeNetwork;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder result = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (Build.VERSION.SDK_INT < 31) {
            GeneratedMessageLite build = result.build();
            t.f(build, "result.build()");
            return (NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) build;
        }
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            GeneratedMessageLite build2 = result.build();
            t.f(build2, "result.build()");
            return (NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) build2;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            GeneratedMessageLite build3 = result.build();
            t.f(build3, "result.build()");
            return (NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) build3;
        }
        boolean hasTransport = networkCapabilities.hasTransport(1);
        t.f(result, "result");
        result.setWifi(hasTransport);
        result.setCellular(networkCapabilities.hasTransport(0));
        result.setVpn(networkCapabilities.hasTransport(4));
        result.setEthernet(networkCapabilities.hasTransport(3));
        result.setWifiAware(networkCapabilities.hasTransport(5));
        result.setLowpan(networkCapabilities.hasTransport(6));
        result.setBluetooth(networkCapabilities.hasTransport(2));
        GeneratedMessageLite build4 = result.build();
        t.f(build4, "result.build()");
        return (NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) build4;
    }

    public final String getNetworkCountryISO() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? "" : networkCountryIso;
    }

    public String getOrientation() {
        return getScreenHeight() > getScreenWidth() ? "portrait" : "landscape";
    }

    public final Map getProcessInfo() {
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
        try {
            String statContent = randomAccessFile.readLine();
            t.f(statContent, "statContent");
            hashMap.put("stat", statContent);
            I i = I.a;
            Na.c.a(randomAccessFile, null);
            return hashMap;
        } finally {
        }
    }

    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Throwable th) {
            DeviceLog.error("Problems fetching stay on while plugged in status", th.getMessage());
            return false;
        }
    }

    public final double getStreamMaxVolume(int i) {
        return getAudioManager() != null ? r0.getStreamMaxVolume(i) : -2;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public e getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    public boolean hasInternet() {
        return hasInternetConnectionM();
    }
}
