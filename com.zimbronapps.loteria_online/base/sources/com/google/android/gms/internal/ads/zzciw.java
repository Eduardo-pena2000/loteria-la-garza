package com.google.android.gms.internal.ads;

import V5.o0;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzciw extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private zzhf zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzciw(String str, zzhz zzhzVar, int i, int i2, long j, long j2) {
        super(true);
        zzdg.zza(str);
        this.zzd = str;
        this.zze = new zzht();
        this.zzb = i;
        this.zzc = i2;
        this.zzh = new ArrayDeque();
        this.zzq = j;
        this.zzr = j2;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e) {
                int i = o0.b;
                W5.p.d("Unexpected error while disconnecting", e);
            }
        }
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzhq {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j2 = this.zzm;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzn + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.zzr;
            long j6 = this.zzp;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.zzo;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.zzq + j7) - r3) - 1, (-1) + j7 + j4));
                    zzk(j7, min, 2);
                    this.zzp = min;
                    j6 = min;
                }
            }
            int read = this.zzi.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.zzn) - this.zzm));
            if (read == -1) {
                throw new EOFException();
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e) {
            throw new zzhq(e, this.zzf, 2000, 2);
        }
    }

    public final long zzb(zzhf zzhfVar) throws zzhq {
        this.zzf = zzhfVar;
        this.zzm = 0L;
        long j = zzhfVar.zze;
        long j2 = zzhfVar.zzf;
        long min = j2 == -1 ? this.zzq : Math.min(this.zzq, j2);
        this.zzn = j;
        HttpURLConnection zzk = zzk(j, (min + j) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = zzhfVar.zzf;
                    if (j3 != -1) {
                        this.zzl = j3;
                        this.zzo = Math.max(parseLong, (this.zzn + j3) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzg(zzhfVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    String sb2 = sb.toString();
                    int i = o0.b;
                    W5.p.c(sb2);
                }
            }
        }
        throw new zzciu(headerField, zzhfVar);
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhq(e, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j, long j2, int i) throws zzhq {
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection openConnection = new URL(uri).openConnection();
            openConnection.setConnectTimeout(this.zzb);
            openConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j2).length());
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            sb.append(j2);
            openConnection.setRequestProperty("Range", sb.toString());
            openConnection.setRequestProperty("User-Agent", this.zzd);
            openConnection.setRequestProperty("Accept-Encoding", "identity");
            openConnection.setRequestMethod("GET");
            openConnection.connect();
            this.zzh.add(openConnection);
            String uri2 = this.zzf.zza.toString();
            try {
                int responseCode = openConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = openConnection.getHeaderFields();
                    zzl();
                    throw new zzciv(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    InputStream inputStream = openConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return openConnection;
                } catch (IOException e) {
                    zzl();
                    throw new zzhq(e, this.zzf, 2000, i);
                }
            } catch (IOException e2) {
                zzl();
                String valueOf = String.valueOf(uri2);
                throw new zzhq("Unable to connect to ".concat(valueOf), e2, this.zzf, 2000, i);
            }
        } catch (IOException e3) {
            String valueOf2 = String.valueOf(uri);
            throw new zzhq("Unable to connect to ".concat(valueOf2), e3, this.zzf, 2000, i);
        }
    }
}
