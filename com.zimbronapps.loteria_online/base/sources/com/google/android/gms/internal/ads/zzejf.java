package com.google.android.gms.internal.ads;

import G1.m;
import V5.F0;
import V5.o0;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzejf extends zzbxk {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdxz zzc;
    private final W5.v zzd;
    private final zzeiu zze;
    private String zzf;
    private String zzg;

    public zzejf(Context context, zzeiu zzeiuVar, W5.v vVar, zzdxz zzdxzVar) {
        this.zzb = context;
        this.zzc = zzdxzVar;
        this.zzd = vVar;
        this.zze = zzeiuVar;
    }

    public static void zzd(Context context, zzdxz zzdxzVar, zzeiu zzeiuVar, String str, String str2) {
        zzk(context, zzdxzVar, zzeiuVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdxz zzdxzVar, zzeiu zzeiuVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != R5.t.l().zzs(context) ? "offline" : "online";
        if (zzdxzVar != null) {
            zzdxy zza = zzdxzVar.zza();
            zza.zzc("gqi", str);
            zza.zzc("action", str2);
            zza.zzc("device_connectivity", str4);
            zza.zzc("event_timestamp", String.valueOf(R5.t.o().a()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zzg();
        } else {
            str3 = "";
        }
        zzeiuVar.zze(new zzeiw(R5.t.o().a(), str, str3, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return zzgog.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzgog.zza(context, 0, intent, 201326592);
    }

    private final void zzs(Activity activity, U5.z zVar) {
        R5.t.g();
        if (G1.p.b(activity).a()) {
            zzt();
            zzu(activity, zVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgui.zza());
                return;
            }
            R5.t.g();
            AlertDialog.Builder p = F0.p(activity);
            p.setTitle(zzx(Q5.d.f, "Allow app to send you notifications?")).setPositiveButton(zzx(Q5.d.d, "Allow"), new zzeja(this, activity, zVar)).setNegativeButton(zzx(Q5.d.e, "Don't allow"), new zzejb(this, zVar)).setOnCancelListener(new zzejc(this, zVar));
            p.create().show();
            zzw(this.zzf, "rtsdi", zzgui.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzt() {
        /*
            r7 = this;
            R5.t.g()     // Catch: android.os.RemoteException -> L20
            android.content.Context r0 = r7.zzb     // Catch: android.os.RemoteException -> L20
            V5.Q r1 = V5.F0.e(r0)     // Catch: android.os.RemoteException -> L20
            N6.a r2 = N6.b.s1(r0)     // Catch: android.os.RemoteException -> L20
            T5.a r3 = new T5.a     // Catch: android.os.RemoteException -> L20
            java.lang.String r4 = r7.zzg     // Catch: android.os.RemoteException -> L20
            java.lang.String r5 = r7.zzf     // Catch: android.os.RemoteException -> L20
            java.util.Map r6 = r7.zza     // Catch: android.os.RemoteException -> L20
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.internal.ads.zzeim r6 = (com.google.android.gms.internal.ads.zzeim) r6     // Catch: android.os.RemoteException -> L20
            if (r6 != 0) goto L22
            java.lang.String r6 = ""
            goto L26
        L20:
            r0 = move-exception
            goto L40
        L22:
            java.lang.String r6 = r6.zzb()     // Catch: android.os.RemoteException -> L20
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L20
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L20
            if (r2 != 0) goto L3e
            N6.a r0 = N6.b.s1(r0)     // Catch: android.os.RemoteException -> L3c
            java.lang.String r3 = r7.zzg     // Catch: android.os.RemoteException -> L3c
            java.lang.String r4 = r7.zzf     // Catch: android.os.RemoteException -> L3c
            boolean r0 = r1.zze(r0, r3, r4)     // Catch: android.os.RemoteException -> L3c
            goto L49
        L3c:
            r0 = move-exception
            goto L41
        L3e:
            r0 = 1
            goto L49
        L40:
            r2 = 0
        L41:
            int r1 = V5.o0.b
            java.lang.String r1 = "Failed to schedule offline notification poster."
            W5.p.d(r1, r0)
            r0 = r2
        L49:
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.zzeiu r0 = r7.zze
            java.lang.String r1 = r7.zzf
            r0.zzd(r1)
            java.lang.String r0 = r7.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgui r2 = com.google.android.gms.internal.ads.zzgui.zza()
            r7.zzw(r0, r1, r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejf.zzt():void");
    }

    private final void zzu(Activity activity, U5.z zVar) {
        AlertDialog zzv = zzv(activity, zVar);
        zzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzeix(this, zzv, timer, zVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, U5.z zVar) {
        R5.t.g();
        AlertDialog.Builder onCancelListener = F0.p(activity).setOnCancelListener(new zzejd(zVar));
        XmlResourceParser zzy = zzy(Q5.c.a);
        if (zzy == null) {
            onCancelListener.setMessage(zzx(Q5.d.g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(zzy, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzz = zzz();
            if (!TextUtils.isEmpty(zzz)) {
                TextView findViewById = inflate.findViewById(Q5.b.a);
                findViewById.setVisibility(0);
                findViewById.setText(zzz);
            }
            zzeim zzeimVar = (zzeim) this.zza.get(this.zzf);
            Drawable zzc = zzeimVar != null ? zzeimVar.zzc() : null;
            if (zzc != null) {
                inflate.findViewById(Q5.b.b).setImageDrawable(zzc);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(Q5.d.g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i, String str) {
        Resources zzf = R5.t.l().zzf();
        if (zzf == null) {
            return str;
        }
        try {
            return zzf.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private static XmlResourceParser zzy(int i) {
        Resources zzf = R5.t.l().zzf();
        if (zzf == null) {
            return null;
        }
        try {
            return zzf.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzeim zzeimVar = (zzeim) this.zza.get(this.zzf);
        return zzeimVar == null ? "" : zzeimVar.zza();
    }

    public final void zzc(String str, zzdoh zzdohVar) {
        String zzQ = zzdohVar.zzQ();
        String zzB = zzdohVar.zzB();
        String str2 = "";
        if (TextUtils.isEmpty(zzQ)) {
            zzQ = zzB != null ? zzB : "";
        }
        zzbks zzD = zzdohVar.zzD();
        if (zzD != null) {
            try {
                str2 = zzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbks zzP = zzdohVar.zzP();
        Drawable drawable = null;
        if (zzP != null) {
            try {
                N6.a zzb = zzP.zzb();
                if (zzb != null) {
                    drawable = (Drawable) N6.b.r1(zzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeij(zzQ, str2, drawable));
    }

    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zzs = R5.t.l().zzs(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r9 = true == zzs ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (r9 == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeiu.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i = o0.b;
                    W5.p.c(concat);
                }
            }
        }
    }

    public final void zzf(N6.a aVar, String str, String str2) {
        zzj(aVar, new T5.a(str, str2, ""));
    }

    public final void zzg() {
        this.zze.zza(new zzeis(this.zzd));
    }

    public final void zzh(N6.a aVar) {
        zzejh zzejhVar = (zzejh) N6.b.r1(aVar);
        Activity zza = zzejhVar.zza();
        U5.z zzb = zzejhVar.zzb();
        this.zzf = zzejhVar.zzc();
        this.zzg = zzejhVar.zzd();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjM)).booleanValue()) {
            zzs(zza, zzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgui.zza());
        R5.t.g();
        AlertDialog.Builder p = F0.p(zza);
        p.setTitle(zzx(Q5.d.m, "Open ad when you're back online.")).setMessage(zzx(Q5.d.l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(Q5.d.j, "OK"), new zzeje(this, zza, zzb)).setNegativeButton(zzx(Q5.d.k, "No thanks"), new zzeiy(this, zzb)).setOnCancelListener(new zzeiz(this, zzb));
        p.create().show();
    }

    public final void zzi(String[] strArr, int[] iArr, N6.a aVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzejh zzejhVar = (zzejh) N6.b.r1(aVar);
                Activity zza = zzejhVar.zza();
                U5.z zzb = zzejhVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzt();
                    zzu(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    public final void zzj(N6.a aVar, T5.a aVar2) {
        Bitmap bitmap;
        String str;
        Context context = (Context) N6.b.r1(aVar);
        String str2 = aVar2.a;
        String str3 = aVar2.b;
        String str4 = aVar2.c;
        String zzz = zzz();
        R5.t.j().f(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent zzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        m.e eVar = new m.e(context, "offline_notification_channel");
        if (TextUtils.isEmpty(zzz)) {
            eVar.j(zzx(Q5.d.h, "You are back online! Let's pick up where we left off"));
        } else {
            eVar.j(String.format(zzx(Q5.d.i, "You are back online! Continue learning about %s"), new Object[]{zzz}));
        }
        eVar.e(true).l(zzr2).h(zzr).t(context.getApplicationInfo().icon).r(((Integer) S5.D.c().zzd(zzbhe.zzjN)).intValue());
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzjP)).booleanValue() || str4.isEmpty()) {
            bitmap = null;
        } else {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmap != null) {
            try {
                eVar.n(bitmap).v(new m.b().i(bitmap).h((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str3, 54321, eVar.b());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            hashMap.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, hashMap);
    }

    public final /* synthetic */ void zzl(Activity activity, U5.z zVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", hashMap);
        zzs(activity, zVar);
    }

    public final /* synthetic */ void zzm(U5.z zVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zVar != null) {
            zVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(U5.z zVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zVar != null) {
            zVar.zzb();
        }
    }

    public final /* synthetic */ void zzo(Activity activity, U5.z zVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", hashMap);
        activity.startActivity(R5.t.j().h(activity));
        zzt();
        if (zVar != null) {
            zVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(U5.z zVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zVar != null) {
            zVar.zzb();
        }
    }

    public final /* synthetic */ void zzq(U5.z zVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zVar != null) {
            zVar.zzb();
        }
    }
}
