package OOPS.Interface;

interface OS {
    public abstract void boot();

    void shutDown();

    default void update() {  // You have to use a keyword for crating a body for the method in interface
        System.out.println("update to latest version.."); // You cannot Write a abstract when u have a body for method
    }

    static void installApp() {
        updatesChecking();
        System.out.println("Install App ");
    }

    static void installnewUpdates() {
        updatesChecking();
        System.out.println("Install Udpates ");
    }

    private static void updatesChecking() {
        System.out.println("check for updates");
        System.out.println("verify the source");
        System.out.println("check for space ");
        System.out.println("download the update");
    }
}

class Mac implements OS {
    @Override
    public void boot() {
        System.out.println("Mac is Booting..");
    }

    @Override
    public void shutDown() {
        System.out.println("Mac is shutting down..");
    }

    public void update() {
        System.out.println("Mac is updating for latest version");
    }
}

class Windows implements OS {

    @Override
    public void boot() {
        System.out.println("windows is booting");
    }

    @Override
    public void shutDown() {
        System.out.println("windows is shutting down");
    }

    public void update() {
        System.out.println("Windows is updating for latest version");
    }
}

class Linux implements OS {
    @Override
    public void boot() {
        System.out.println("Linux is booting");
    }

    @Override
    public void shutDown() {
        System.out.println("Linux is shutting down");
    }
    // the method update is inherited from the OS interface
}

public class Day36InterfaceContinue {
    public static void main(String[] args) {

//     OS myos = new Linux();
//     myos.boot();
//     myos.shutDown();
//     myos.update();   // specialized method which is present inside the mac
        OS.installApp();  // make the method in interface as static and use without creating an object
        System.out.println();
        OS.installnewUpdates();
//        OS.updatesChecking(); // it is not accessible
        // Static method cannot be Overridden
        //default method can be Overridden
    }
}
