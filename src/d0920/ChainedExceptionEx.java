package d0920;
//1 446p
public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch(InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // main

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch(SpaceException se) {
            InstallException ie = new InstallException("설치중 예외");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치중 예외");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace() ) {
            throw new SpaceException("공간 부족");
        }

        if (!enoughMemory() ) {
            throw new MemoryException("메모리 부족");
        }
    } // startInstall

    static void copyFiles() {}
    static void deleteTempFiles() {}

    static boolean enoughSpace() {        return false;    }
    static boolean enoughMemory() {        return true;    }
}

class InstallException extends Exception {
    InstallException(String msg) { super(msg); }
}

class SpaceException extends Exception {
    SpaceException(String msg) { super(msg); }
}

class MemoryException extends Exception {
    MemoryException(String msg) { super(msg); }
}