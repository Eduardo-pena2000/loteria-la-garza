package com.revenuecat.purchases.backup;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.os.ParcelFileDescriptor;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class RevenueCatBackupAgent extends BackupAgentHelper {
    public static final Companion Companion = new Companion(null);
    public static final String REVENUECAT_PREFS_FILE_NAME = "com_revenuecat_purchases_preferences";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "RevenueCatBackupAgent: Initiating backup");
        }
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
    }

    public void onCreate() {
        addHelper("revenuecat_prefs_backup", new SharedPreferencesBackupHelper(this, new String[]{"com_revenuecat_purchases_preferences"}));
    }

    public void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "RevenueCatBackupAgent: Initiating restoration");
        }
        super.onRestore(backupDataInput, j, parcelFileDescriptor);
    }
}
