package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DynamicDeviceInfoKt {
    public static final DynamicDeviceInfoKt INSTANCE = new DynamicDeviceInfoKt();

    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    t.g(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, k kVar) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                GeneratedMessageLite build = this._builder.build();
                t.f(build, "_builder.build()");
                return (DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) build;
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final void clearFreeDiskSpaceInternal() {
                this._builder.clearFreeDiskSpaceInternal();
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            public final long getFreeDiskSpaceInternal() {
                return this._builder.getFreeDiskSpaceInternal();
            }

            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this._builder.getNetworkCapabilityTransports();
                t.f(networkCapabilityTransports, "_builder.getNetworkCapabilityTransports()");
                return networkCapabilityTransports;
            }

            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final boolean hasFreeDiskSpaceInternal() {
                return this._builder.hasFreeDiskSpaceInternal();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final void setAdbEnabled(boolean z) {
                this._builder.setAdbEnabled(z);
            }

            public final void setAirplaneMode(boolean z) {
                this._builder.setAirplaneMode(z);
            }

            public final void setChargingType(int i) {
                this._builder.setChargingType(i);
            }

            public final void setDeviceElapsedRealtime(long j) {
                this._builder.setDeviceElapsedRealtime(j);
            }

            public final void setDeviceUpTime(long j) {
                this._builder.setDeviceUpTime(j);
            }

            public final void setFreeDiskSpaceInternal(long j) {
                this._builder.setFreeDiskSpaceInternal(j);
            }

            public final void setMaxVolume(double d) {
                this._builder.setMaxVolume(d);
            }

            public final void setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports value) {
                t.g(value, "value");
                this._builder.setNetworkCapabilityTransports(value);
            }

            public final void setNetworkConnected(boolean z) {
                this._builder.setNetworkConnected(z);
            }

            public final void setNetworkMetered(boolean z) {
                this._builder.setNetworkMetered(z);
            }

            public final void setNetworkType(int i) {
                this._builder.setNetworkType(i);
            }

            public final void setScreenBrightness(double d) {
                this._builder.setScreenBrightness(d);
            }

            public final void setSdCardPresent(boolean z) {
                this._builder.setSdCardPresent(z);
            }

            public final void setStayOnWhilePluggedIn(boolean z) {
                this._builder.setStayOnWhilePluggedIn(z);
            }

            public final void setTelephonyManagerNetworkType(int i) {
                this._builder.setTelephonyManagerNetworkType(i);
            }

            public final void setUsbConnected(boolean z) {
                this._builder.setUsbConnected(z);
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) build;
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android = this._builder.getAndroid();
            t.f(android, "_builder.getAndroid()");
            return android;
        }

        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            DynamicDeviceInfoOuterClass.ConnectionType connectionType = this._builder.getConnectionType();
            t.f(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final int getConnectionTypeValue() {
            return this._builder.getConnectionTypeValue();
        }

        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = this._builder.getIos();
            t.f(ios, "_builder.getIos()");
            return ios;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            t.f(language, "_builder.getLanguage()");
            return language;
        }

        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            t.f(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final String getNetworkOperatorName() {
            String networkOperatorName = this._builder.getNetworkOperatorName();
            t.f(networkOperatorName, "_builder.getNetworkOperatorName()");
            return networkOperatorName;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            t.f(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final String getTimeZone() {
            String timeZone = this._builder.getTimeZone();
            t.f(timeZone, "_builder.getTimeZone()");
            return timeZone;
        }

        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        public final String getUserId() {
            String userId = this._builder.getUserId();
            t.f(userId, "_builder.getUserId()");
            return userId;
        }

        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        public final void setAndroid(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android value) {
            t.g(value, "value");
            this._builder.setAndroid(value);
        }

        public final void setAppActive(boolean z) {
            this._builder.setAppActive(z);
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void setConnectionType(DynamicDeviceInfoOuterClass.ConnectionType value) {
            t.g(value, "value");
            this._builder.setConnectionType(value);
        }

        public final void setConnectionTypeValue(int i) {
            this._builder.setConnectionTypeValue(i);
        }

        public final void setFreeDiskSpace(long j) {
            this._builder.setFreeDiskSpace(j);
        }

        public final void setFreeRamMemory(long j) {
            this._builder.setFreeRamMemory(j);
        }

        public final void setIos(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios value) {
            t.g(value, "value");
            this._builder.setIos(value);
        }

        public final void setLanguage(String value) {
            t.g(value, "value");
            this._builder.setLanguage(value);
        }

        public final void setLimitedOpenAdTracking(boolean z) {
            this._builder.setLimitedOpenAdTracking(z);
        }

        public final void setLimitedTracking(boolean z) {
            this._builder.setLimitedTracking(z);
        }

        public final void setLowPowerMode(boolean z) {
            this._builder.setLowPowerMode(z);
        }

        public final void setNetworkOperator(String value) {
            t.g(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void setNetworkOperatorName(String value) {
            t.g(value, "value");
            this._builder.setNetworkOperatorName(value);
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final void setTimeZone(String value) {
            t.g(value, "value");
            this._builder.setTimeZone(value);
        }

        public final void setTimeZoneOffset(long j) {
            this._builder.setTimeZoneOffset(j);
        }

        public final void setUserId(String value) {
            t.g(value, "value");
            this._builder.setUserId(value);
        }

        public final void setWiredHeadset(boolean z) {
            this._builder.setWiredHeadset(z);
        }

        private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    t.g(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public static final class LocaleListProxy extends DslProxy {
                private LocaleListProxy() {
                }
            }

            public static final class NwPathInterfacesProxy extends DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, k kVar) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                GeneratedMessageLite build = this._builder.build();
                t.f(build, "_builder.build()");
                return (DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) build;
            }

            public final /* synthetic */ void addAllLocaleList(DslList dslList, Iterable values) {
                t.g(dslList, "<this>");
                t.g(values, "values");
                this._builder.addAllLocaleList(values);
            }

            public final /* synthetic */ void addAllNwPathInterfaces(DslList dslList, Iterable values) {
                t.g(dslList, "<this>");
                t.g(values, "values");
                this._builder.addAllNwPathInterfaces(values);
            }

            public final /* synthetic */ void addLocaleList(DslList dslList, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                this._builder.addLocaleList(value);
            }

            public final /* synthetic */ void addNwPathInterfaces(DslList dslList, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                this._builder.addNwPathInterfaces(value);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            public final /* synthetic */ void clearLocaleList(DslList dslList) {
                t.g(dslList, "<this>");
                this._builder.clearLocaleList();
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            public final /* synthetic */ void clearNwPathInterfaces(DslList dslList) {
                t.g(dslList, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final String getCurrentRadioAccessTechnology() {
                String currentRadioAccessTechnology = this._builder.getCurrentRadioAccessTechnology();
                t.f(currentRadioAccessTechnology, "_builder.getCurrentRadioAccessTechnology()");
                return currentRadioAccessTechnology;
            }

            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            public final String getDeviceName() {
                String deviceName = this._builder.getDeviceName();
                t.f(deviceName, "_builder.getDeviceName()");
                return deviceName;
            }

            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            public final DslList getLocaleList() {
                List localeListList = this._builder.getLocaleListList();
                t.f(localeListList, "_builder.getLocaleListList()");
                return new DslList(localeListList);
            }

            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            public final DslList getNwPathInterfaces() {
                List nwPathInterfacesList = this._builder.getNwPathInterfacesList();
                t.f(nwPathInterfacesList, "_builder.getNwPathInterfacesList()");
                return new DslList(nwPathInterfacesList);
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final /* synthetic */ void plusAssignAllLocaleList(DslList dslList, Iterable values) {
                t.g(dslList, "<this>");
                t.g(values, "values");
                addAllLocaleList(dslList, values);
            }

            public final /* synthetic */ void plusAssignAllNwPathInterfaces(DslList dslList, Iterable values) {
                t.g(dslList, "<this>");
                t.g(values, "values");
                addAllNwPathInterfaces(dslList, values);
            }

            public final /* synthetic */ void plusAssignLocaleList(DslList dslList, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                addLocaleList(dslList, value);
            }

            public final /* synthetic */ void plusAssignNwPathInterfaces(DslList dslList, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                addNwPathInterfaces(dslList, value);
            }

            public final void setCurrentRadioAccessTechnology(String value) {
                t.g(value, "value");
                this._builder.setCurrentRadioAccessTechnology(value);
            }

            public final void setCurrentUiTheme(int i) {
                this._builder.setCurrentUiTheme(i);
            }

            public final void setDeviceName(String value) {
                t.g(value, "value");
                this._builder.setDeviceName(value);
            }

            public final void setDeviceUpTimeWithSleep(long j) {
                this._builder.setDeviceUpTimeWithSleep(j);
            }

            public final void setDeviceUpTimeWithoutSleep(long j) {
                this._builder.setDeviceUpTimeWithoutSleep(j);
            }

            public final /* synthetic */ void setLocaleList(DslList dslList, int i, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                this._builder.setLocaleList(i, value);
            }

            public final void setNetworkReachabilityFlags(int i) {
                this._builder.setNetworkReachabilityFlags(i);
            }

            public final /* synthetic */ void setNwPathInterfaces(DslList dslList, int i, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                this._builder.setNwPathInterfaces(i, value);
            }

            public final void setScreenBrightness(double d) {
                this._builder.setScreenBrightness(d);
            }

            public final void setTrackingAuthStatus(int i) {
                this._builder.setTrackingAuthStatus(i);
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private DynamicDeviceInfoKt() {
    }

    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android -initializeandroid(l block) {
        t.g(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AndroidKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios -initializeios(l block) {
        t.g(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder();
        t.f(newBuilder, "newBuilder()");
        IosKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }
}
