package d5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import d5.e;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements e {
    public final ConnectivityManager a;
    public final e.a b;
    public final a c;

    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        public void onAvailable(Network network) {
            g.b(g.this, network, true);
        }

        public void onLost(Network network) {
            g.b(g.this, network, false);
        }
    }

    public g(ConnectivityManager connectivityManager, e.a aVar) {
        this.a = connectivityManager;
        this.b = aVar;
        a aVar2 = new a();
        this.c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    public static final /* synthetic */ void b(g gVar, Network network, boolean z) {
        gVar.d(network, z);
    }

    public boolean a() {
        for (Network network : this.a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean z) {
        Network[] allNetworks = this.a.getAllNetworks();
        int length = allNetworks.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (t.c(network2, network) ? z : c(network2)) {
                z2 = true;
                break;
            }
            i++;
        }
        this.b.a(z2);
    }

    public void shutdown() {
        this.a.unregisterNetworkCallback(this.c);
    }
}
