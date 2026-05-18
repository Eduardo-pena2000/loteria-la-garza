package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import w6.g;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class BitmapTeleporter extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new g();
    public final int a;
    public ParcelFileDescriptor b;
    public final int c;
    public Bitmap d = null;
    public boolean e = false;
    public File f;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    public static final void N1(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    public void M1(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f = file;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            Bitmap bitmap = (Bitmap) t.l(this.d);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.b = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        }
                    } finally {
                        N1(dataOutputStream);
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e2) {
                throw new IllegalStateException("Could not create temporary file", e2);
            }
        }
        int a = c.a(parcel);
        c.t(parcel, 1, this.a);
        c.C(parcel, 2, this.b, i | 1, false);
        c.t(parcel, 3, this.c);
        c.b(parcel, a);
        this.b = null;
    }
}
