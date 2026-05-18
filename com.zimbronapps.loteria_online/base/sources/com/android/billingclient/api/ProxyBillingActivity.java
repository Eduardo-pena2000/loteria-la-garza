package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

@UsedByReflection("PlatformActivityProxy")
@zzq
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;

    public final zzie a(int i) {
        return i != -1 ? i != 0 ? i != 3 ? i != 4 ? i != 5 ? zzie.zzbm : zzie.zzbn : zzie.zzbl : zzie.zzbk : zzie.zzbj : zzie.zzbi;
    }

    public final Intent b(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    public final Intent c(zzie zzieVar, long j) {
        Intent d = d();
        d.putExtra("RESPONSE_CODE", 6);
        d.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(6);
        newBuilder.setDebugMessage("An internal error occurred.");
        BillingResult build = newBuilder.build();
        int i = zzcg.zza;
        d.putExtra("FAILURE_LOGGING_PAYLOAD", zzcg.zzb(zzieVar, 2, build, null, zzil.zza).zzM());
        d.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        d.putExtra("billingClientTransactionId", j);
        d.putExtra("wasServiceAutoReconnected", this.f);
        return d;
    }

    public final Intent d() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 100
            r1 = 110(0x6e, float:1.54E-43)
            java.lang.String r2 = "ProxyBillingActivity"
            if (r6 == r0) goto L42
            if (r6 != r1) goto Le
            goto L42
        Le:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L27
            int r6 = com.google.android.gms.internal.play_billing.zzc.zza(r8, r2)
            android.os.ResultReceiver r7 = r5.a
            if (r7 == 0) goto Le6
            if (r8 != 0) goto L1e
            r8 = 0
            goto L22
        L1e:
            android.os.Bundle r8 = r8.getExtras()
        L22:
            r7.send(r6, r8)
            goto Le6
        L27:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.internal.play_billing.zzc.zzn(r2, r6)
            goto Le6
        L42:
            com.android.billingclient.api.BillingResult r0 = com.google.android.gms.internal.play_billing.zzc.zzh(r8, r2)
            int r0 = r0.getResponseCode()
            r3 = -1
            if (r7 != r3) goto L50
            if (r0 == 0) goto L6d
            r7 = r3
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " and billing's responseCode: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.play_billing.zzc.zzn(r2, r0)
            r3 = r7
        L6d:
            if (r8 == 0) goto Lb8
            android.os.Bundle r7 = r8.getExtras()
            if (r7 == 0) goto Laa
            android.os.Bundle r7 = r8.getExtras()
            java.lang.String r0 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "LAUNCH_BILLING_FLOW"
            java.lang.String r2 = "INTENT_SOURCE"
            if (r7 == 0) goto L8d
            android.content.Intent r7 = r5.b(r7)
            r7.putExtra(r2, r0)
            goto L9b
        L8d:
            android.content.Intent r7 = r5.d()
            android.os.Bundle r8 = r8.getExtras()
            r7.putExtras(r8)
            r7.putExtra(r2, r0)
        L9b:
            long r2 = r5.e
            java.lang.String r8 = "billingClientTransactionId"
            r7.putExtra(r8, r2)
            boolean r8 = r5.f
            java.lang.String r0 = "wasServiceAutoReconnected"
            r7.putExtra(r0, r8)
            goto Ldb
        Laa:
            java.lang.String r7 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.zzc.zzn(r2, r7)
            com.google.android.gms.internal.play_billing.zzie r7 = com.google.android.gms.internal.play_billing.zzie.zzv
            long r2 = r5.e
            android.content.Intent r7 = r5.c(r7, r2)
            goto Ldb
        Lb8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got null data with resultCode "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "!"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.play_billing.zzc.zzn(r2, r7)
            com.google.android.gms.internal.play_billing.zzie r7 = r5.a(r3)
            long r2 = r5.e
            android.content.Intent r7 = r5.c(r7, r2)
        Ldb:
            if (r6 != r1) goto Le3
            java.lang.String r6 = "IS_FIRST_PARTY_PURCHASE"
            r8 = 1
            r7.putExtra(r6, r8)
        Le3:
            r5.sendBroadcast(r7)
        Le6:
            r6 = 0
            r5.b = r6
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.a = bundle.getParcelable("in_app_message_result_receiver");
            }
            this.c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.a = getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(0, (Bundle) null);
            } else {
                Intent c = c(zzie.zzbG, this.e);
                if (this.c) {
                    c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(c);
            }
            this.b = false;
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.b) {
            Intent d = d();
            d.putExtra("RESPONSE_CODE", 1);
            d.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.c) {
                d.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.d;
            if (i == 110 || i == 100) {
                d.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                d.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(d);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f);
    }
}
