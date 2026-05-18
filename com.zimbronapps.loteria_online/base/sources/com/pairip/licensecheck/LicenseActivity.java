package com.pairip.licensecheck;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes2.dex */
public class LicenseActivity extends Activity {
    public static final String ACTIVITY_TYPE_ARG_NAME = "activitytype";
    public static final String PAYWALL_INTENT_ARG_NAME = "paywallintent";
    private static final String TAG = "LicenseActivity";

    public enum ActivityType {
        PAYWALL,
        ERROR_DIALOG
    }

    public static /* synthetic */ void $r8$lambda$N5_Pzpb-eSKmOONXn3Kn0QvMbys(LicenseActivity licenseActivity) {
        licenseActivity.lambda$showErrorDialog$0();
    }

    public static /* synthetic */ void $r8$lambda$fE_XZ7S0hhHsxQNTfy8mxeJ7kEU(LicenseActivity licenseActivity, DialogInterface dialogInterface, int i) {
        licenseActivity.lambda$showErrorDialog$1(dialogInterface, i);
    }

    public static /* synthetic */ void $r8$lambda$x-JmBIDmuVzGN23Wk7Dd1TBpzO0(LicenseActivity licenseActivity, PendingIntent pendingIntent) {
        licenseActivity.lambda$showPaywallAndCloseApp$0(pendingIntent);
    }

    public void onStart() {
        super.onStart();
        try {
            int ordinal = getIntent().getSerializableExtra("activitytype").ordinal();
            if (ordinal == 0) {
                showPaywallAndCloseApp();
            } else {
                if (ordinal != 1) {
                    return;
                }
                showErrorDialog();
            }
        } catch (Exception e) {
            logAndShowErrorDialog("Couldn't process license activity correctly.", e);
        }
    }

    private void showPaywallAndCloseApp() {
        PendingIntent parcelableExtra = getIntent().getParcelableExtra("paywallintent");
        if (parcelableExtra == null) {
            logAndShowErrorDialog("Paywall intent is not provided.");
        } else {
            runOnUiThread(new LicenseActivity$$ExternalSyntheticLambda0(this, parcelableExtra));
        }
    }

    private /* synthetic */ void lambda$showPaywallAndCloseApp$0(PendingIntent pendingIntent) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } else {
                pendingIntent.send();
            }
            closeApp();
        } catch (PendingIntent.CanceledException e) {
            logAndShowErrorDialog("Paywall intent unexpectedly cancelled.", e);
        }
    }

    private void logAndShowErrorDialog(String message, Exception ex) {
        logAndShowErrorDialog(message + " " + Log.getStackTraceString(ex));
    }

    private void logAndShowErrorDialog(String message) {
        Log.e("LicenseActivity", message);
        showErrorDialog();
    }

    private void showErrorDialog() {
        runOnUiThread(new LicenseActivity$$ExternalSyntheticLambda1(this));
    }

    private /* synthetic */ void lambda$showErrorDialog$0() {
        try {
            new AlertDialog.Builder(this).setTitle("Something went wrong").setMessage("Check that Google Play is enabled on your device and that you're using an up-to-date version before opening the app. If the problem persists try reinstalling the app.").setPositiveButton("Close", new LicenseActivity$$ExternalSyntheticLambda2(this)).setCancelable(false).show();
        } catch (RuntimeException e) {
            Log.d("LicenseActivity", "Couldn't show the error dialog. " + Log.getStackTraceString(e));
        }
    }

    private /* synthetic */ void lambda$showErrorDialog$1(DialogInterface dialogInterface, int i) {
        closeApp();
    }

    private void closeApp() {
        if (LicenseClient.gracefulShutdownEnabled) {
            closeAllTasks();
        } else {
            exitApp();
        }
    }

    protected void exitApp() {
        finishAndRemoveTask();
        System.exit(0);
    }

    protected void closeAllTasks() {
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager != null) {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                try {
                    appTask.finishAndRemoveTask();
                } catch (RuntimeException e) {
                    Log.e("LicenseActivity", "Failed to gracefully clear task=" + appTask.getTaskInfo().id, e);
                }
            }
        }
        exitApp();
    }
}
