package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final boolean a = false;
    public final Handler b = null;
    public c.a c;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public class b extends a.a {
        public b() {
        }

        public void g0(int i, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.b;
            if (handler != null) {
                handler.post(bVar.new c(i, bundle));
            } else {
                bVar.b(i, bundle);
            }
        }
    }

    public class c implements Runnable {
        public final int a;
        public final Bundle b;

        public c(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        public void run() {
            b.this.b(this.a, this.b);
        }
    }

    public b(Parcel parcel) {
        this.c = a.a.q1(parcel.readStrongBinder());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new b();
                }
                parcel.writeStrongBinder(this.c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(int i, Bundle bundle) {
    }
}
