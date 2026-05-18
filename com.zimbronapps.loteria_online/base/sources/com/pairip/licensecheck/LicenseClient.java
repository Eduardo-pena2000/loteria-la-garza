package com.pairip.licensecheck;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.pairip.licensecheck.ILicenseV2ResultListener;
import com.pairip.licensecheck.LicenseActivity;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes2.dex */
public class LicenseClient implements ServiceConnection {
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int EVENTUAL_SHUTDOWN_DELAY_MILLIS = 30000;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int REPEATED_CHECK_RETRY_DELAY_MILLIS = 300000;
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static boolean eventualShutdownEnabled = false;
    public static boolean gracefulShutdownEnabled = false;
    private static final Handler handler;
    protected static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqAiT3mYmsT5TYhZDXAonyBrjpEAL6IVrqLuaOYxrAzuC+EmTHJi466yOZqliQhG/kAkj5kH2zex+VrQGNj71ADQLb8UfbqVv7FER6t5bO7JQpTiq1Jn09bDPUvVgSHhlMaxT1BJc5hZv4jLFhB+GnbSsEkGhezc0dIu/JF2jmMAsFQZVU210fyRf0Xpbl0JQPPylg4B2mHO9m6o5KuQwfB7HdBoYX5vPp58t9rPRH12LVVsqf9mB2AkAPr12U2DVOWLYoGLz9KBagIjnRhhye7LkjUy5IDNmok98hIVR8zHL9UakXvE9sOPkSyXNNAlgHEnP56+ya6/yL+zLDFFLuQIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static ImmediateTaskExecutor mainThreadRunner = null;
    protected static String packageName = "com.zimbronapps.loteria_online";
    protected static boolean repeatedCheckEnabled = true;
    private static Bundle responsePayload;
    private final Context context;
    protected static Runnable exitAction = new 1();
    protected static LicenseCheckState licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
    protected static ImmediateTaskExecutor backgroundRunner = new LicenseClient$$ExternalSyntheticLambda2();
    protected DelayedTaskExecutor delayedTaskExecutor = new DelayedTaskExecutorImpl(null);
    private int retryNum = 0;
    protected boolean waitingForRepeatedCheck = false;
    private long repeatedCheckStartElapsedRealtime = 0;

    public interface DelayedTaskExecutor {
        void schedule(Runnable task, long delayMillis);
    }

    public interface ImmediateTaskExecutor {
        void run(Runnable task);
    }

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED,
        REPEATED_CHECK_REQUIRED
    }

    public static /* synthetic */ void $r8$lambda$8YRQpF8qc5JOZUcKq79QHnbGjYY(LicenseClient licenseClient, RepeatedCheckMetadata repeatedCheckMetadata) {
        licenseClient.lambda$scheduleRepeatedLicenseCheck$0(repeatedCheckMetadata);
    }

    public static /* synthetic */ void $r8$lambda$GS82Fij7VQePgSFog-s63-Rcyb0(LicenseClient licenseClient) {
        licenseClient.lambda$initializeLicenseCheck$0();
    }

    public static /* synthetic */ void $r8$lambda$gb-vmUiJUmqdCloCudVdY-igh7I(LicenseClient licenseClient, IBinder iBinder) {
        licenseClient.lambda$onServiceConnected$1(iBinder);
    }

    public static /* synthetic */ void $r8$lambda$ot_XkRbEJeEFG1Hy-d3H6N4DX_I(LicenseClient licenseClient, RepeatedCheckMetadata repeatedCheckMetadata, Bundle bundle) {
        licenseClient.lambda$processResponse$0(repeatedCheckMetadata, bundle);
    }

    public static /* synthetic */ void $r8$lambda$q2q7YKfx3jIZHqiUNn7fQ55wwzI(LicenseClient licenseClient, boolean z) {
        licenseClient.lambda$initializeLicenseCheck$1(z);
    }

    public static /* synthetic */ void $r8$lambda$tTRuJInP7s484yRu-m6AsnoI1z4(LicenseClient licenseClient) {
        licenseClient.connectToLicensingService();
    }

    public static /* synthetic */ void $r8$lambda$xzrAfByzooHDT9oIsgTdQvzthuE(LicenseClient licenseClient, IBinder iBinder) {
        licenseClient.lambda$onServiceConnected$0(iBinder);
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mprocessResponse(LicenseClient licenseClient, int i, Bundle bundle) {
        licenseClient.processResponse(i, bundle);
    }

    class 1 implements Runnable {
        1() {
        }

        public void run() {
            System.exit(0);
        }
    }

    static {
        Handler handler2 = new Handler(Looper.getMainLooper());
        handler = handler2;
        Objects.requireNonNull(handler2);
        mainThreadRunner = new LicenseClient$$ExternalSyntheticLambda3(handler2);
    }

    static /* synthetic */ void lambda$static$0(Runnable runnable) {
        new Thread(runnable).start();
    }

    public static void checkLicense(Context context) {
        new LicenseClient(context).initializeLicenseCheck();
    }

    public static String getLicensePubKey() {
        return licensePubKey;
    }

    public LicenseClient(Context context) {
        this.context = context;
    }

    public void initializeLicenseCheck() {
        int ordinal = licenseCheckState.ordinal();
        if (ordinal == 0) {
            if (localCheckEnabled) {
                backgroundRunner.run(new LicenseClient$$ExternalSyntheticLambda4(this));
                return;
            } else {
                connectToLicensingService();
                return;
            }
        }
        if (ordinal != 1) {
            if (ordinal != 4) {
                return;
            }
            connectToLicensingService();
        } else {
            try {
                LicenseResponseHelper.validateResponse(responsePayload, packageName);
            } catch (LicenseCheckException e) {
                handleError(e);
            }
        }
    }

    private /* synthetic */ void lambda$initializeLicenseCheck$0() {
        mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda1(this, performLocalInstallerCheck()));
    }

    private /* synthetic */ void lambda$initializeLicenseCheck$1(boolean z) {
        if (z) {
            licenseCheckState = LicenseCheckState.LOCAL_CHECK_OK;
        }
        connectToLicensingService();
    }

    private boolean performLocalInstallerCheck() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                Log.i("LicenseClient", "Local install check bypassed due to old SDK version.");
                return false;
            }
            PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                Log.i("LicenseClient", "Local install check bypassed due to package manager not found.");
                return false;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                int i = packageInfo.applicationInfo.flags;
                if ((i & 1) == 0 && (i & 128) == 0) {
                    InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                    if (installSourceInfo == null) {
                        Log.i("LicenseClient", "Local install check bypassed due to install source info not found.");
                        return false;
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null && installingPackageName.equals("com.android.vending")) {
                        return true;
                    }
                    Log.i("LicenseClient", "Local install check failed due to wrong installer.");
                    return false;
                }
                Log.i("LicenseClient", "Local install check passed due to system app.");
                return true;
            }
            Log.i("LicenseClient", "Local install check bypassed due to app package info not found.");
            return false;
        } catch (Exception e) {
            Log.w("LicenseClient", "Could not obtain package info for local installer check.", e);
            return false;
        }
    }

    private void connectToLicensingService() {
        Log.d("LicenseClient", "Connecting to the licensing service...");
        try {
            if (this.context.bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending").setAction("com.android.vending.licensing.ILicensingService"), this, 1)) {
                return;
            }
            retryOrThrow(new LicenseCheckException("Could not bind with the licensing service."));
        } catch (SecurityException e) {
            retryOrThrow(new LicenseCheckException("Not allowed to bind with the licensing service.", e));
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder licensingServiceBinder) {
        Log.d("LicenseClient", "Connected to the licensing service.");
        int ordinal = licenseCheckState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                backgroundRunner.run(new LicenseClient$$ExternalSyntheticLambda6(this, licensingServiceBinder));
                return;
            } else if (ordinal != 4) {
                return;
            }
        }
        backgroundRunner.run(new LicenseClient$$ExternalSyntheticLambda5(this, licensingServiceBinder));
    }

    private /* synthetic */ void lambda$onServiceConnected$0(IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (LicenseCheckException e) {
            handleError(e);
        }
    }

    private /* synthetic */ void lambda$onServiceConnected$1(IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (Exception e) {
            Log.e("LicenseClient", "Error while reporting license check: " + Log.getStackTraceString(e));
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (licenseCheckState.equals(LicenseCheckState.REPEATED_CHECK_REQUIRED) && this.waitingForRepeatedCheck) {
            Log.d("LicenseClient", "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
        } else {
            Log.w("LicenseClient", "Unexpectedly disconnected from the licensing service.");
            retryOrThrow(new LicenseCheckException("Licensing service unexpectedly disconnected."));
        }
    }

    private void checkLicenseInternal(IBinder licensingServiceBinder) throws LicenseCheckException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."));
            return;
        }
        Log.d("LicenseClient", "Sending request to licensing service...");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                populateInputDataForLicenseCheckV2(obtain, licensingServiceBinder);
                if (!licensingServiceBinder.transact(2, obtain, obtain2, 0)) {
                    handleError(new LicenseCheckException("Licensing service could not process request."));
                }
            } catch (DeadObjectException e) {
                retryOrThrow(new LicenseCheckException("Licensing service process died.", e));
            } catch (RemoteException e2) {
                handleError(new LicenseCheckException("Error when calling licensing service.", e2));
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
            Log.d("LicenseClient", "Request to licensing service sent.");
        }
    }

    public void reportSuccessfulLicenseCheck(IBinder licensingServiceBinder) throws LicenseCheckException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."), true);
            return;
        }
        Log.d("LicenseClient", "Sending request to license reporting service...");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                populateInputDataForReportAutoVerifiedLicense(obtain, licensingServiceBinder);
                boolean transact = licensingServiceBinder.transact(3, obtain, obtain2, 0);
                if (!transact) {
                    Log.e("LicenseClient", "Error sending request to license reporting service.");
                }
                if (transact) {
                    mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda8());
                }
            } catch (DeadObjectException e) {
                retryOrThrow(new LicenseCheckException("Licensing service process died.", e), true);
            } catch (RemoteException e2) {
                Log.e("LicenseClient", "Error when calling licensing service." + String.valueOf(e2));
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
            Log.d("LicenseClient", "Request to licensing reporting service sent.");
        }
    }

    static /* synthetic */ void lambda$reportSuccessfulLicenseCheck$0() {
        licenseCheckState = LicenseCheckState.LOCAL_CHECK_REPORTED;
    }

    private void populateInputDataForLicenseCheckV2(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        inputData.writeInt(0);
    }

    private void populateInputDataForReportAutoVerifiedLicense(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeInt(0);
    }

    class 2 extends ILicenseV2ResultListener.Stub {
        2() {
        }

        public void verifyLicense(int responseCode, Bundle responsePayload) {
            LicenseClient.-$$Nest$mprocessResponse(LicenseClient.this, responseCode, responsePayload);
        }
    }

    private static ILicenseV2ResultListener createResultListener(LicenseClient client) {
        return client.new 2();
    }

    private void retryOrThrow(LicenseCheckException error) {
        retryOrThrow(error, false);
    }

    private void retryOrThrow(LicenseCheckException error, boolean ignoreErrorOnFinalFailure) {
        int i = this.retryNum;
        if (i < 3) {
            this.retryNum = i + 1;
            this.delayedTaskExecutor.schedule(new LicenseClient$$ExternalSyntheticLambda0(this), 1000L);
            Log.d("LicenseClient", String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", new Object[]{Integer.valueOf(this.retryNum), error == null ? "null" : error.getMessage(), 1L}));
        } else {
            if (ignoreErrorOnFinalFailure) {
                Log.e("LicenseClient", "Retry limit reached for: " + String.valueOf(error));
                return;
            }
            handleError(error);
        }
    }

    private void processResponse(int responseCode, Bundle responsePayload2) {
        try {
            if (responseCode == 3) {
                throw new LicenseCheckException("Request package name invalid.");
            }
            if (responseCode == 0) {
                LicenseResponseHelper.validateResponse(responsePayload2, packageName);
                Log.i("LicenseClient", "License check succeeded.");
                mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda7(this, repeatedCheckEnabled ? LicenseResponseHelper.getRepeatedCheckMetadata(responsePayload2) : null, responsePayload2));
            } else {
                if (responseCode == 2) {
                    startPaywallActivity((PendingIntent) responsePayload2.getParcelable("PAYWALL_INTENT"));
                    return;
                }
                throw new LicenseCheckException(String.format("Unexpected response code %d received.", new Object[]{Integer.valueOf(responseCode)}));
            }
        } catch (LicenseCheckException e) {
            handleError(e);
        }
    }

    private /* synthetic */ void lambda$processResponse$0(RepeatedCheckMetadata repeatedCheckMetadata, Bundle bundle) {
        if (repeatedCheckMetadata != null) {
            licenseCheckState = LicenseCheckState.REPEATED_CHECK_REQUIRED;
            this.repeatedCheckStartElapsedRealtime = getElapsedRealtimeMillis();
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        } else {
            licenseCheckState = LicenseCheckState.FULL_CHECK_OK;
        }
        responsePayload = bundle;
    }

    private void scheduleRepeatedLicenseCheck(RepeatedCheckMetadata repeatedCheckMetadata) {
        long min = Math.min(Math.min(repeatedCheckMetadata.getDurationToRetryMillis(), Math.max(0L, repeatedCheckMetadata.getTimeToRetryMillis() - getCurrentTimeMillis())), 300000L);
        if (!this.waitingForRepeatedCheck) {
            this.waitingForRepeatedCheck = true;
            try {
                this.context.unbindService(this);
            } catch (RuntimeException e) {
                Log.e("LicenseClient", "Failed to unbind service for repeated license check.", e);
            }
        }
        this.delayedTaskExecutor.schedule(new LicenseClient$$ExternalSyntheticLambda9(this, repeatedCheckMetadata), min);
        Log.d("LicenseClient", String.format("Repeated license check is scheduled in %d ms...", new Object[]{Long.valueOf(min)}));
    }

    private /* synthetic */ void lambda$scheduleRepeatedLicenseCheck$0(RepeatedCheckMetadata repeatedCheckMetadata) {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis() - this.repeatedCheckStartElapsedRealtime;
        if (getCurrentTimeMillis() >= repeatedCheckMetadata.getTimeToRetryMillis() || elapsedRealtimeMillis >= repeatedCheckMetadata.getDurationToRetryMillis()) {
            this.waitingForRepeatedCheck = false;
            connectToLicensingService();
        } else {
            Log.d("LicenseClient", "Repeated license check is rescheduled.");
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        }
    }

    private void handleError(LicenseCheckException ex) {
        Log.e("LicenseClient", "Error while checking license: " + Log.getStackTraceString(ex));
        if (licenseCheckState.equals(LicenseCheckState.FULL_CHECK_OK)) {
            return;
        }
        startErrorDialogActivity();
    }

    private void startPaywallActivity(PendingIntent paywallIntent) {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra("paywallintent", paywallIntent);
        createCloseAppIntentOrExitIfAppInBackground.putExtra("activitytype", LicenseActivity.ActivityType.PAYWALL);
        scheduleAppShutdown();
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra("activitytype", LicenseActivity.ActivityType.ERROR_DIALOG);
        scheduleAppShutdown();
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        Intent intent = new Intent(this.context, LicenseActivity.class);
        if (gracefulShutdownEnabled) {
            intent.addFlags(65536);
        } else {
            intent.addFlags(67108864);
            intent.addFlags(32768);
        }
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    protected long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    protected long getElapsedRealtimeMillis() {
        return SystemClock.elapsedRealtime();
    }

    private void scheduleAppShutdown() {
        if (eventualShutdownEnabled) {
            this.delayedTaskExecutor.schedule(exitAction, 30000L);
        }
    }

    private static class DelayedTaskExecutorImpl implements DelayedTaskExecutor {
        private final Handler handler;

        /* synthetic */ DelayedTaskExecutorImpl(LicenseClient-IA r1) {
            this();
        }

        private DelayedTaskExecutorImpl() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        public void schedule(Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }
}
