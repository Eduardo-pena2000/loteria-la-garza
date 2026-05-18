package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzazd implements zzazc {
    protected static volatile zzbak zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzbac zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzazd(Context context) {
        try {
            zzayg.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzr = new zzbac();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[PHI: r1 r8
      0x007c: PHI (r1v10 int) = (r1v2 int), (r1v2 int), (r1v11 int), (r1v12 int) binds: [B:57:0x007e, B:58:0x0080, B:67:0x007b, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r8v6 com.google.android.gms.internal.ads.zzawg) = 
      (r8v3 com.google.android.gms.internal.ads.zzawg)
      (r8v3 com.google.android.gms.internal.ads.zzawg)
      (r8v8 com.google.android.gms.internal.ads.zzawg)
      (r8v8 com.google.android.gms.internal.ads.zzawg)
     binds: [B:57:0x007e, B:58:0x0080, B:67:0x007b, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed A[Catch: Exception -> 0x00e9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e9, blocks: (B:41:0x00a8, B:44:0x00b5, B:50:0x00d9, B:23:0x00ed), top: B:40:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzp(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazd.zzp(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    public abstract zzawg zza(Context context, zzavs zzavsVar);

    public abstract zzawg zzb(Context context, View view, Activity activity);

    public abstract zzawg zzc(Context context, View view, Activity activity);

    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.zzu) {
                zzo();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.zzs;
                double d2 = rawY - this.zzt;
                this.zzk += Math.sqrt((d * d) + (d2 * d2));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.zzb = obtain;
                        LinkedList linkedList = this.zzc;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zzn(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzbam zzm = zzm(motionEvent);
                        Long l2 = zzm.zzd;
                        if (l2 != null && zzm.zzg != null) {
                            this.zzi += l2.longValue() + zzm.zzg.longValue();
                        }
                        if (this.zzq != null && (l = zzm.zze) != null && zzm.zzh != null) {
                            this.zzj += l.longValue() + zzm.zzh.longValue();
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzbaa unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zze(int i, int i2, int i3) {
        try {
            if (this.zzb != null) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzdk)).booleanValue()) {
                    zzo();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    public final String zzg(Context context, String str, View view) {
        return zzp(context, str, 3, view, null, null);
    }

    public void zzh(View view) {
    }

    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzdB)).booleanValue() || (zzbacVar = this.zzr) == null) {
            return;
        }
        zzbacVar.zza(Arrays.asList(stackTraceElementArr));
    }

    public final String zzj(Context context, View view, Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    public final String zzk(Context context) {
        return "19";
    }

    public final String zzl(Context context) {
        if (zzban.zzd()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    public abstract zzbam zzm(MotionEvent motionEvent) throws zzbaa;

    public abstract long zzn(StackTraceElement[] stackTraceElementArr) throws zzbaa;
}
