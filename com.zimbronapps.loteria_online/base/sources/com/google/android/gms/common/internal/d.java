package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class d {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile G6.a zzB;
    private v6.b zzC;
    private boolean zzD;
    private volatile m0 zzE;
    v0 zza;
    final Handler zzb;
    protected c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final j zzn;
    private final v6.h zzo;
    private final Object zzp;
    private final Object zzq;
    private o zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private i0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final v6.d[] zze = new v6.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface b {
        void onConnectionFailed(v6.b bVar);
    }

    public interface c {
        void c(v6.b bVar);
    }

    public class d implements c {
        public final /* synthetic */ d a;

        public d(d dVar) {
            Objects.requireNonNull(dVar);
            this.a = dVar;
        }

        public final void c(v6.b bVar) {
            if (bVar.R1()) {
                d dVar = this.a;
                dVar.getRemoteService(null, dVar.getScopes());
            } else {
                d dVar2 = this.a;
                if (dVar2.zzl() != null) {
                    dVar2.zzl().onConnectionFailed(bVar);
                }
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, Looper looper, int i, a aVar, b bVar, String str) {
        j a2 = j.a(context);
        v6.h f = v6.h.f();
        t.l(aVar);
        t.l(bVar);
        this(context, looper, a2, f, i, aVar, bVar, str);
    }

    public final void c(int i, IInterface iInterface) {
        v0 v0Var;
        t.a((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    i0 i0Var = this.zzu;
                    if (i0Var != null) {
                        j jVar = this.zzn;
                        String a2 = this.zza.a();
                        t.l(a2);
                        jVar.d(a2, this.zza.b(), 4225, i0Var, zza(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    i0 i0Var2 = this.zzu;
                    if (i0Var2 != null && (v0Var = this.zza) != null) {
                        String a3 = v0Var.a();
                        String b2 = v0Var.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 70 + String.valueOf(b2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a3);
                        sb.append(" on ");
                        sb.append(b2);
                        Log.e("GmsClient", sb.toString());
                        j jVar2 = this.zzn;
                        String a4 = this.zza.a();
                        t.l(a4);
                        jVar2.d(a4, this.zza.b(), 4225, i0Var2, zza(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    i0 i0Var3 = new i0(this, this.zzd.get());
                    this.zzu = i0Var3;
                    v0 v0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new v0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new v0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = v0Var2;
                    if (v0Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a())));
                    }
                    j jVar3 = this.zzn;
                    String a5 = this.zza.a();
                    t.l(a5);
                    v6.b c2 = jVar3.c(new q0(a5, this.zza.b(), 4225, this.zza.c()), i0Var3, zza(), getBindServiceExecutor());
                    if (!c2.R1()) {
                        String a6 = this.zza.a();
                        String b3 = this.zza.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a6).length() + 34 + String.valueOf(b3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a6);
                        sb2.append(" on ");
                        sb2.append(b3);
                        Log.w("GmsClient", sb2.toString());
                        int N1 = c2.N1() == -1 ? 16 : c2.N1();
                        if (c2.P1() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c2.P1());
                        }
                        zzb(N1, bundle, this.zzd.get());
                    }
                } else if (i == 4) {
                    t.l(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int h = this.zzo.h(this.zzl, getMinApkVersion());
        if (h == 0) {
            connect(new d(this));
        } else {
            c(1, null);
            triggerNotAvailable(new d(this), h, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        t.m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        c(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((g0) arrayList.get(i)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        c(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        o oVar;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            oVar = this.zzr;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (oVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(oVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzh;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 1 + String.valueOf(format).length());
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(format2).length());
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(com.google.android.gms.common.api.d.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(format3).length());
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public v6.d[] getApiFeatures() {
        return zze;
    }

    public G6.a getAttributionSourceWrapper() {
        return null;
    }

    public final v6.d[] getAvailableFeatures() {
        m0 m0Var = this.zzE;
        if (m0Var == null) {
            return null;
        }
        return m0Var.b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        v0 v0Var;
        if (!isConnected() || (v0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return v0Var.b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return v6.h.a;
    }

    public void getRemoteService(l lVar, Set set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i = this.zzy;
        int i2 = v6.h.a;
        Scope[] scopeArr = h.o;
        Bundle bundle = new Bundle();
        v6.d[] dVarArr = h.p;
        h hVar = new h(6, i, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        hVar.d = this.zzl.getPackageName();
        hVar.g = getServiceRequestExtraArgs;
        if (set != null) {
            hVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            hVar.h = account;
            if (lVar != null) {
                hVar.e = lVar.asBinder();
            }
        } else if (requiresAccount()) {
            hVar.h = getAccount();
        }
        hVar.i = zze;
        hVar.j = getApiFeatures();
        if (usesClientTelemetry()) {
            hVar.m = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    o oVar = this.zzr;
                    if (oVar != null) {
                        oVar.r0(new h0(this, this.zzd.get()), hVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(3);
        } catch (RuntimeException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                t.m(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                o oVar = this.zzr;
                if (oVar == null) {
                    return null;
                }
                return oVar.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public g getTelemetryConfiguration() {
        m0 m0Var = this.zzE;
        if (m0Var == null) {
            return null;
        }
        return m0Var.d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(v6.b bVar) {
        this.zzi = bVar.N1();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        j0 j0Var = new j0(this, i, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, j0Var));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        int i2 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i2, i));
    }

    public void triggerNotAvailable(c cVar, int i, PendingIntent pendingIntent) {
        t.m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        int i2 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i2, i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i, Bundle bundle, int i2) {
        k0 k0Var = new k0(this, i, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, k0Var));
    }

    public final /* synthetic */ void zzc(m0 m0Var) {
        this.zzE = m0Var;
        if (usesClientTelemetry()) {
            g gVar = m0Var.d;
            u.b().c(gVar == null ? null : gVar.R1());
        }
    }

    public final /* synthetic */ void zzd(int i, IInterface iInterface) {
        c(i, null);
    }

    public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                c(i2, iInterface);
                return true;
            } finally {
            }
        }
    }

    public final /* synthetic */ void zzf(int i) {
        int i2;
        int i3;
        synchronized (this.zzp) {
            i2 = this.zzv;
        }
        if (i2 == 3) {
            this.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i3, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(o oVar) {
        this.zzr = oVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ a zzk() {
        return this.zzw;
    }

    public final /* synthetic */ b zzl() {
        return this.zzx;
    }

    public final /* synthetic */ v6.b zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(v6.b bVar) {
        this.zzC = bVar;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public d(Context context, Looper looper, j jVar, v6.h hVar, int i, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        t.m(context, "Context must not be null");
        this.zzl = context;
        t.m(looper, "Looper must not be null");
        this.zzm = looper;
        t.m(jVar, "Supervisor must not be null");
        this.zzn = jVar;
        t.m(hVar, "API availability must not be null");
        this.zzo = hVar;
        this.zzb = new f0(this, looper);
        this.zzy = i;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(G6.a aVar) {
    }
}
