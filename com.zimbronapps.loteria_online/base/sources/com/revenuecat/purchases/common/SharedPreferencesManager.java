package com.revenuecat.purchases.common;

import Ca.I;
import Ca.l;
import Ca.m;
import Da.Y;
import Za.B;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SharedPreferencesManager {
    public static final Companion Companion = new Companion(null);
    public static final int EXPECTED_VERSION = 1;
    public static final String EXPECTED_VERSION_KEY = "com.revenuecat.purchases.shared_preferences_version";
    public static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";
    private final l legacySharedPreferences;
    private final SharedPreferences revenueCatSharedPreferences;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(0);
            this.$context = context;
        }

        public final SharedPreferences invoke() {
            return PreferenceManager.getDefaultSharedPreferences(this.$context);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getEXPECTED_VERSION$annotations() {
        }

        public static /* synthetic */ void getEXPECTED_VERSION_KEY$annotations() {
        }

        public static /* synthetic */ void getSHARED_PREFERENCES_PREFIX$annotations() {
        }

        private Companion() {
        }
    }

    public SharedPreferencesManager(Context context, SharedPreferences sharedPreferences, l lVar) {
        t.g(context, "context");
        t.g(sharedPreferences, "revenueCatSharedPreferences");
        t.g(lVar, "legacySharedPreferences");
        this.revenueCatSharedPreferences = sharedPreferences;
        this.legacySharedPreferences = lVar;
    }

    private final void ensureMigrated() {
        if (hasRevenueCatVersion()) {
            return;
        }
        Collection collection = (Iterable) ((SharedPreferences) this.legacySharedPreferences.getValue()).getAll().keySet();
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                t.f(str, "key");
                if (B.N(str, "com.revenuecat.purchases.", false, 2, (Object) null)) {
                    performMigration();
                    break;
                }
            }
        }
        updateSharedPreferencesVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final List getRevenueCatKeysToMigrate() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        Iterable keySet = getRevenueCatKeysToMigrate$lambda$6(this.legacySharedPreferences).getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str3 = (String) obj;
            t.f(str3, "key");
            if (B.N(str3, "com.revenuecat.purchases.", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1 sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1 = new SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1(logIntent, arrayList);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return arrayList;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                }
                return arrayList;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                }
                return arrayList;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return arrayList;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                }
                return arrayList;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return arrayList;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return arrayList;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                }
                return arrayList;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                }
                return arrayList;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                }
                return arrayList;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            default:
                return arrayList;
        }
    }

    private static final SharedPreferences getRevenueCatKeysToMigrate$lambda$6(l lVar) {
        return (SharedPreferences) lVar.getValue();
    }

    private final boolean hasRevenueCatVersion() {
        return this.revenueCatSharedPreferences.contains("com.revenuecat.purchases.shared_preferences_version");
    }

    private final boolean migratePreferenceValue(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        try {
            Object obj = sharedPreferences.getAll().get(str);
            if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Number) obj).floatValue());
            } else {
                if (!(obj instanceof Set)) {
                    LogIntent logIntent = LogIntent.WARNING;
                    SharedPreferencesManager$migratePreferenceValue$$inlined$log$1 sharedPreferencesManager$migratePreferenceValue$$inlined$log$1 = new SharedPreferencesManager$migratePreferenceValue$$inlined$log$1(logIntent, str, obj);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                                return false;
                            }
                            str2 = "[Purchases] - " + logLevel.name();
                            str3 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                            return false;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
                                return false;
                            }
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                            return false;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) > 0) {
                                return false;
                            }
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                            return false;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) > 0) {
                                return false;
                            }
                            str2 = "[Purchases] - " + logLevel4.name();
                            str3 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                            return false;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) > 0) {
                                return false;
                            }
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                            return false;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) > 0) {
                                return false;
                            }
                            str2 = "[Purchases] - " + logLevel6.name();
                            str3 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) > 0) {
                                return false;
                            }
                            str2 = "[Purchases] - " + logLevel7.name();
                            str3 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) > 0) {
                                return false;
                            }
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                            return false;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) > 0) {
                                return false;
                            }
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                            return false;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                            return false;
                        case 13:
                            LogLevel logLevel10 = LogLevel.WARN;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) > 0) {
                                return false;
                            }
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                            return false;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                            return false;
                        default:
                            return false;
                    }
                    currentLogHandler.d(str2, str3);
                    return false;
                }
                Set set = obj instanceof Set ? (Set) obj : null;
                if (set == null) {
                    set = Y.b();
                }
                editor.putStringSet(str, set);
            }
            return true;
        } catch (ClassCastException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to migrate preference with key due to type casting: " + str, e);
            return false;
        }
    }

    private final void performMigration() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        SharedPreferencesManager$performMigration$$inlined$log$1 sharedPreferencesManager$performMigration$$inlined$log$1 = new SharedPreferencesManager$performMigration$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
        }
        List revenueCatKeysToMigrate = getRevenueCatKeysToMigrate();
        l lVar = this.legacySharedPreferences;
        SharedPreferences.Editor edit = this.revenueCatSharedPreferences.edit();
        t.f(edit, "editor");
        Iterator it = revenueCatKeysToMigrate.iterator();
        while (it.hasNext()) {
            migratePreferenceValue(performMigration$lambda$3(lVar), edit, (String) it.next());
        }
        edit.apply();
        LogIntent logIntent2 = LogIntent.DEBUG;
        SharedPreferencesManager$performMigration$$inlined$log$2 sharedPreferencesManager$performMigration$$inlined$log$2 = new SharedPreferencesManager$performMigration$$inlined$log$2(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
        }
    }

    private static final SharedPreferences performMigration$lambda$3(l lVar) {
        return (SharedPreferences) lVar.getValue();
    }

    private final void updateSharedPreferencesVersion() {
        SharedPreferences.Editor edit = this.revenueCatSharedPreferences.edit();
        t.f(edit, "editor");
        edit.putInt("com.revenuecat.purchases.shared_preferences_version", 1);
        edit.apply();
    }

    public final SharedPreferences getSharedPreferences() {
        synchronized (this) {
            ensureMigrated();
            I i = I.a;
        }
        return this.revenueCatSharedPreferences;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SharedPreferencesManager(Context context, SharedPreferences sharedPreferences, l lVar, int i, k kVar) {
        if ((i & 2) != 0) {
            sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_preferences", 0);
            t.f(sharedPreferences, "context.getSharedPrefere…ntext.MODE_PRIVATE,\n    )");
        }
        this(context, sharedPreferences, (i & 4) != 0 ? m.b(new 1(context)) : lVar);
    }
}
