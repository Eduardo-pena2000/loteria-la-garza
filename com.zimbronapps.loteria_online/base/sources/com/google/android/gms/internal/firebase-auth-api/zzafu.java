package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzafu {
    private static final boolean zza(int i) {
        return i >= 200 && i < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzafv zzafvVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (zza(responseCode)) {
                    zzafvVar.zza((zzaez) zzaex.zza(sb2, type));
                } else {
                    zzafvVar.zza((String) zzaex.zza(sb2, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzacn e) {
                e = e;
                zzafvVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzafvVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e2) {
                e = e2;
                zzafvVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static void zza(String str, zzafv zzafvVar, Type type, zzafe zzafeVar) {
        try {
            HttpURLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(60000);
            zzafeVar.zza((URLConnection) openConnection);
            zza(openConnection, zzafvVar, type);
        } catch (UnknownHostException unused) {
            zzafvVar.zza("<<Network Error>>");
        } catch (IOException e) {
            zzafvVar.zza(e.getMessage());
        } catch (SocketTimeoutException unused2) {
            zzafvVar.zza("TIMEOUT");
        }
    }

    public static void zza(String str, zzafa zzafaVar, zzafv zzafvVar, Type type, zzafe zzafeVar) {
        try {
            t.l(zzafaVar);
            HttpURLConnection openConnection = new URL(str).openConnection();
            openConnection.setDoOutput(true);
            byte[] bytes = zzafaVar.zza().getBytes(Charset.defaultCharset());
            openConnection.setFixedLengthStreamingMode(bytes.length);
            openConnection.setRequestProperty("Content-Type", "application/json");
            openConnection.setConnectTimeout(60000);
            zzafeVar.zza((URLConnection) openConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(openConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(openConnection, zzafvVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (UnknownHostException unused) {
            zzafvVar.zza("<<Network Error>>");
        } catch (NullPointerException e) {
            e = e;
            zzafvVar.zza(e.getMessage());
        } catch (IOException e2) {
            e = e2;
            zzafvVar.zza(e.getMessage());
        } catch (SocketTimeoutException unused2) {
            zzafvVar.zza("TIMEOUT");
        } catch (JSONException e3) {
            e = e3;
            zzafvVar.zza(e.getMessage());
        }
    }
}
