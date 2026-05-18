package R2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y extends b {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;

    public static final class a extends g {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public y() {
        this(2000);
    }

    public void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) P2.a.e(this.k));
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            r();
        }
    }

    public long g(j jVar) {
        Uri uri = jVar.a;
        this.h = uri;
        String str = (String) P2.a.e(uri.getHost());
        int port = this.h.getPort();
        s(jVar);
        try {
            this.k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.e);
            this.l = true;
            t(jVar);
            return -1L;
        } catch (IOException e) {
            throw new a(e, 2001);
        } catch (SecurityException e2) {
            throw new a(e2, 2006);
        }
    }

    public Uri o() {
        return this.h;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.m == 0) {
            try {
                ((DatagramSocket) P2.a.e(this.i)).receive(this.g);
                int length = this.g.getLength();
                this.m = length;
                q(length);
            } catch (SocketTimeoutException e) {
                throw new a(e, 2002);
            } catch (IOException e2) {
                throw new a(e2, 2001);
            }
        }
        int length2 = this.g.getLength();
        int i3 = this.m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f, length2 - i3, bArr, i, min);
        this.m -= min;
        return min;
    }

    public y(int i) {
        this(i, 8000);
    }

    public y(int i, int i2) {
        super(true);
        this.e = i2;
        byte[] bArr = new byte[i];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, i);
    }
}
