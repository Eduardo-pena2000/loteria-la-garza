package com.revenuecat.purchases.google.attribution;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.l;
import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.t;
import v6.i;
import v6.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        t.g(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";
    }

    public static /* synthetic */ void a(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, l lVar) {
        getDeviceIdentifiers$lambda$0(googleDeviceIdentifiersFetcher, application, lVar);
    }

    private final String getAdvertisingID(Application application) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return null;
            }
            if (!t.c(advertisingIdInfo.getId(), this.noPermissionAdvertisingIdValue)) {
                return advertisingIdInfo.getId();
            }
            LogIntent logIntent = LogIntent.WARNING;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                        return null;
                    }
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                    return null;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
                        return null;
                    }
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                    return null;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) > 0) {
                        return null;
                    }
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                    return null;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) > 0) {
                        return null;
                    }
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                    return null;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) > 0) {
                        return null;
                    }
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                    return null;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) > 0) {
                        return null;
                    }
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) > 0) {
                        return null;
                    }
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) > 0) {
                        return null;
                    }
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                    return null;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) > 0) {
                        return null;
                    }
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                    return null;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                    return null;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) > 0) {
                        return null;
                    }
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                    return null;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                    return null;
                default:
                    return null;
            }
            currentLogHandler.d(str, str2);
            return null;
        } catch (IOException e) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5(logIntent2, e);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
            }
            return null;
        } catch (i e2) {
            LogIntent logIntent3 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2(logIntent3, e2);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel21 = LogLevel.DEBUG;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel27 = LogLevel.DEBUG;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel28 = LogLevel.WARN;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel30 = LogLevel.WARN;
                    LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
            }
            return null;
        } catch (NullPointerException e3) {
            LogIntent logIntent4 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6(logIntent4, e3);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                case 1:
                    LogLevel logLevel31 = LogLevel.DEBUG;
                    LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                        currentLogHandler28.d("[Purchases] - " + logLevel31.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel32 = LogLevel.WARN;
                    LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                        currentLogHandler29.w("[Purchases] - " + logLevel32.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel33 = LogLevel.INFO;
                    LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                        currentLogHandler30.i("[Purchases] - " + logLevel33.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel34 = LogLevel.DEBUG;
                    LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                        currentLogHandler31.d("[Purchases] - " + logLevel34.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel35 = LogLevel.INFO;
                    LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                        currentLogHandler32.i("[Purchases] - " + logLevel35.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel36 = LogLevel.DEBUG;
                    LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                        currentLogHandler33.d("[Purchases] - " + logLevel36.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel37 = LogLevel.DEBUG;
                    LogHandler currentLogHandler34 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                        currentLogHandler34.d("[Purchases] - " + logLevel37.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel38 = LogLevel.WARN;
                    LogHandler currentLogHandler35 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                        currentLogHandler35.w("[Purchases] - " + logLevel38.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel39 = LogLevel.WARN;
                    LogHandler currentLogHandler36 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                        currentLogHandler36.w("[Purchases] - " + logLevel39.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel40 = LogLevel.WARN;
                    LogHandler currentLogHandler37 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                        currentLogHandler37.w("[Purchases] - " + logLevel40.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
            }
            return null;
        } catch (NoSuchMethodError unused) {
            LogIntent logIntent5 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7(logIntent5);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                case 1:
                    LogLevel logLevel41 = LogLevel.DEBUG;
                    LogHandler currentLogHandler38 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                        currentLogHandler38.d("[Purchases] - " + logLevel41.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel42 = LogLevel.WARN;
                    LogHandler currentLogHandler39 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                        currentLogHandler39.w("[Purchases] - " + logLevel42.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel43 = LogLevel.INFO;
                    LogHandler currentLogHandler40 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                        currentLogHandler40.i("[Purchases] - " + logLevel43.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel44 = LogLevel.DEBUG;
                    LogHandler currentLogHandler41 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                        currentLogHandler41.d("[Purchases] - " + logLevel44.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel45 = LogLevel.INFO;
                    LogHandler currentLogHandler42 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                        currentLogHandler42.i("[Purchases] - " + logLevel45.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel46 = LogLevel.DEBUG;
                    LogHandler currentLogHandler43 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                        currentLogHandler43.d("[Purchases] - " + logLevel46.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel47 = LogLevel.DEBUG;
                    LogHandler currentLogHandler44 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                        currentLogHandler44.d("[Purchases] - " + logLevel47.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel48 = LogLevel.WARN;
                    LogHandler currentLogHandler45 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel48) <= 0) {
                        currentLogHandler45.w("[Purchases] - " + logLevel48.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel49 = LogLevel.WARN;
                    LogHandler currentLogHandler46 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel49) <= 0) {
                        currentLogHandler46.w("[Purchases] - " + logLevel49.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel50 = LogLevel.WARN;
                    LogHandler currentLogHandler47 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel50) <= 0) {
                        currentLogHandler47.w("[Purchases] - " + logLevel50.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
            }
            return null;
        } catch (j e4) {
            LogIntent logIntent6 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3(logIntent6, e4);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent6.ordinal()]) {
                case 1:
                    LogLevel logLevel51 = LogLevel.DEBUG;
                    LogHandler currentLogHandler48 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel51) <= 0) {
                        currentLogHandler48.d("[Purchases] - " + logLevel51.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel52 = LogLevel.WARN;
                    LogHandler currentLogHandler49 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel52) <= 0) {
                        currentLogHandler49.w("[Purchases] - " + logLevel52.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel53 = LogLevel.INFO;
                    LogHandler currentLogHandler50 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel53) <= 0) {
                        currentLogHandler50.i("[Purchases] - " + logLevel53.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel54 = LogLevel.DEBUG;
                    LogHandler currentLogHandler51 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel54) <= 0) {
                        currentLogHandler51.d("[Purchases] - " + logLevel54.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel55 = LogLevel.INFO;
                    LogHandler currentLogHandler52 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel55) <= 0) {
                        currentLogHandler52.i("[Purchases] - " + logLevel55.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel56 = LogLevel.DEBUG;
                    LogHandler currentLogHandler53 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel56) <= 0) {
                        currentLogHandler53.d("[Purchases] - " + logLevel56.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel57 = LogLevel.DEBUG;
                    LogHandler currentLogHandler54 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel57) <= 0) {
                        currentLogHandler54.d("[Purchases] - " + logLevel57.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel58 = LogLevel.WARN;
                    LogHandler currentLogHandler55 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel58) <= 0) {
                        currentLogHandler55.w("[Purchases] - " + logLevel58.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel59 = LogLevel.WARN;
                    LogHandler currentLogHandler56 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel59) <= 0) {
                        currentLogHandler56.w("[Purchases] - " + logLevel59.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel60 = LogLevel.WARN;
                    LogHandler currentLogHandler57 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel60) <= 0) {
                        currentLogHandler57.w("[Purchases] - " + logLevel60.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
            }
            return null;
        } catch (TimeoutException e5) {
            LogIntent logIntent7 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4(logIntent7, e5);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent7.ordinal()]) {
                case 1:
                    LogLevel logLevel61 = LogLevel.DEBUG;
                    LogHandler currentLogHandler58 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel61) <= 0) {
                        currentLogHandler58.d("[Purchases] - " + logLevel61.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel62 = LogLevel.WARN;
                    LogHandler currentLogHandler59 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel62) <= 0) {
                        currentLogHandler59.w("[Purchases] - " + logLevel62.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel63 = LogLevel.INFO;
                    LogHandler currentLogHandler60 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel63) <= 0) {
                        currentLogHandler60.i("[Purchases] - " + logLevel63.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel64 = LogLevel.DEBUG;
                    LogHandler currentLogHandler61 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel64) <= 0) {
                        currentLogHandler61.d("[Purchases] - " + logLevel64.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel65 = LogLevel.INFO;
                    LogHandler currentLogHandler62 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel65) <= 0) {
                        currentLogHandler62.i("[Purchases] - " + logLevel65.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel66 = LogLevel.DEBUG;
                    LogHandler currentLogHandler63 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel66) <= 0) {
                        currentLogHandler63.d("[Purchases] - " + logLevel66.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel67 = LogLevel.DEBUG;
                    LogHandler currentLogHandler64 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel67) <= 0) {
                        currentLogHandler64.d("[Purchases] - " + logLevel67.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel68 = LogLevel.WARN;
                    LogHandler currentLogHandler65 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel68) <= 0) {
                        currentLogHandler65.w("[Purchases] - " + logLevel68.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel69 = LogLevel.WARN;
                    LogHandler currentLogHandler66 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel69) <= 0) {
                        currentLogHandler66.w("[Purchases] - " + logLevel69.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel70 = LogLevel.WARN;
                    LogHandler currentLogHandler67 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel70) <= 0) {
                        currentLogHandler67.w("[Purchases] - " + logLevel70.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
            }
            return null;
        }
    }

    private static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, l lVar) {
        lVar.invoke(MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), x.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"), x.a(SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), "true")})));
    }

    public void getDeviceIdentifiers(Application application, l lVar) {
        t.g(application, "applicationContext");
        t.g(lVar, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new a(this, application, lVar), null, 2, null);
    }
}
