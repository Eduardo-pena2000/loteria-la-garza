package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzs extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbzt();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzbzs(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e) {
                    e = e;
                    autoCloseOutputStream = null;
                }
                try {
                    zzcei.zza.execute(new zzbzr(autoCloseOutputStream, marshall));
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e2) {
                    e = e2;
                    int i2 = o0.b;
                    W5.p.d("Error transporting the ad response", e);
                    R5.t.l().zzg(e, "LargeParcelTeleporter.pipeData.2");
                    E6.m.b(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int a = y6.c.a(parcel);
                    y6.c.C(parcel, 2, this.zza, i, false);
                    y6.c.b(parcel, a);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a2 = y6.c.a(parcel);
        y6.c.C(parcel, 2, this.zza, i, false);
        y6.c.b(parcel, a2);
    }

    public final y6.d zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i = o0.b;
                W5.p.c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    E6.m.b(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    int i2 = o0.b;
                    W5.p.d("Could not read from parcel file descriptor", e);
                    E6.m.b(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                E6.m.b(dataInputStream);
                throw th2;
            }
        }
        return (y6.d) this.zzb;
    }
}
