package com.google.android.gms.internal.ads;

import V5.o0;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcic extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzht zzg;
    private zzhf zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcic(String str, zzhz zzhzVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new zzcib(this);
        this.zzr = new HashSet();
        zzdg.zza(str);
        this.zzf = str;
        this.zzg = new zzht();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = o0.b;
                W5.p.d("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:9:0x0058, B:11:0x0060, B:15:0x006b, B:16:0x0071, B:18:0x0079, B:21:0x0080, B:22:0x0085, B:23:0x0086, B:25:0x000b, B:27:0x0016, B:29:0x001e, B:31:0x0026, B:34:0x003c, B:36:0x0046, B:37:0x004b, B:39:0x004c, B:40:0x0051, B:42:0x0052), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:9:0x0058, B:11:0x0060, B:15:0x006b, B:16:0x0071, B:18:0x0079, B:21:0x0080, B:22:0x0085, B:23:0x0086, B:25:0x000b, B:27:0x0016, B:29:0x001e, B:31:0x0026, B:34:0x003c, B:36:0x0046, B:37:0x004b, B:39:0x004c, B:40:0x0051, B:42:0x0052), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(byte[] r10, int r11, int r12) throws com.google.android.gms.internal.ads.zzhq {
        /*
            r9 = this;
            long r0 = r9.zzo     // Catch: java.io.IOException -> L1b
            long r2 = r9.zzm     // Catch: java.io.IOException -> L1b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = -1
            if (r0 != 0) goto Lb
            goto L55
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.zzcic.zzb     // Catch: java.io.IOException -> L1b
            r3 = 0
            java.lang.Object r3 = r0.getAndSet(r3)     // Catch: java.io.IOException -> L1b
            byte[] r3 = (byte[]) r3     // Catch: java.io.IOException -> L1b
            if (r3 != 0) goto L1e
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.io.IOException -> L1b
            goto L1e
        L1b:
            r10 = move-exception
            goto L90
        L1e:
            long r4 = r9.zzo     // Catch: java.io.IOException -> L1b
            long r6 = r9.zzm     // Catch: java.io.IOException -> L1b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L52
            int r8 = r3.length     // Catch: java.io.IOException -> L1b
            long r6 = r6 - r4
            long r4 = (long) r8     // Catch: java.io.IOException -> L1b
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.io.IOException -> L1b
            int r4 = (int) r4     // Catch: java.io.IOException -> L1b
            java.io.InputStream r5 = r9.zzj     // Catch: java.io.IOException -> L1b
            int r4 = r5.read(r3, r1, r4)     // Catch: java.io.IOException -> L1b
            boolean r5 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L1b
            if (r5 != 0) goto L4c
            if (r4 == r2) goto L46
            long r5 = r9.zzo     // Catch: java.io.IOException -> L1b
            long r7 = (long) r4     // Catch: java.io.IOException -> L1b
            long r5 = r5 + r7
            r9.zzo = r5     // Catch: java.io.IOException -> L1b
            r9.zzh(r4)     // Catch: java.io.IOException -> L1b
            goto L1e
        L46:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L4c:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L52:
            r0.set(r3)     // Catch: java.io.IOException -> L1b
        L55:
            if (r12 != 0) goto L58
            goto L8f
        L58:
            long r0 = r9.zzn     // Catch: java.io.IOException -> L1b
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L71
            long r5 = r9.zzp     // Catch: java.io.IOException -> L1b
            long r0 = r0 - r5
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L6b
        L69:
            r1 = r2
            goto L8f
        L6b:
            long r5 = (long) r12     // Catch: java.io.IOException -> L1b
            long r0 = java.lang.Math.min(r5, r0)     // Catch: java.io.IOException -> L1b
            int r12 = (int) r0     // Catch: java.io.IOException -> L1b
        L71:
            java.io.InputStream r0 = r9.zzj     // Catch: java.io.IOException -> L1b
            int r1 = r0.read(r10, r11, r12)     // Catch: java.io.IOException -> L1b
            if (r1 != r2) goto L86
            long r10 = r9.zzn     // Catch: java.io.IOException -> L1b
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 != 0) goto L80
            goto L69
        L80:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L86:
            long r10 = r9.zzp     // Catch: java.io.IOException -> L1b
            long r2 = (long) r1     // Catch: java.io.IOException -> L1b
            long r10 = r10 + r2
            r9.zzp = r10     // Catch: java.io.IOException -> L1b
            r9.zzh(r1)     // Catch: java.io.IOException -> L1b
        L8f:
            return r1
        L90:
            com.google.android.gms.internal.ads.zzhq r11 = new com.google.android.gms.internal.ads.zzhq
            com.google.android.gms.internal.ads.zzhf r12 = r9.zzh
            r0 = 2000(0x7d0, float:2.803E-42)
            r1 = 2
            r11.<init>(r10, r12, r0, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcic.zza(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02ad A[Catch: IOException -> 0x0044, TryCatch #1 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x003b, B:9:0x0048, B:10:0x0060, B:12:0x0066, B:19:0x0096, B:21:0x00ba, B:22:0x00df, B:23:0x00e4, B:25:0x00ed, B:26:0x00f4, B:39:0x011f, B:103:0x02a0, B:105:0x02ad, B:107:0x02be, B:113:0x02c7, B:114:0x02d4, B:117:0x02de, B:118:0x02e5, B:123:0x02e6, B:124:0x0303), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed A[Catch: IOException -> 0x0044, TryCatch #1 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x003b, B:9:0x0048, B:10:0x0060, B:12:0x0066, B:19:0x0096, B:21:0x00ba, B:22:0x00df, B:23:0x00e4, B:25:0x00ed, B:26:0x00f4, B:39:0x011f, B:103:0x02a0, B:105:0x02ad, B:107:0x02be, B:113:0x02c7, B:114:0x02d4, B:117:0x02de, B:118:0x02e5, B:123:0x02e6, B:124:0x0303), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhf r21) throws com.google.android.gms.internal.ads.zzhq {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcic.zzb(com.google.android.gms.internal.ads.zzhf):long");
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhq(e, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzk(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    int i2 = o0.b;
                    W5.p.g("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
