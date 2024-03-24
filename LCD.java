package LCD;

// Enum untuk status LCD
enum Status {
    ON, OFF, Freeze
}

// Enum untuk jenis kabel yg dapat terhubung LCD
enum Cable {
    VGA, HDMI, DVI, DISPLAYPORT
}

public class LCD {
    private Status status;
    private int volume;
    private int brightness;
    private Cable cable;

    // Konstruktor
    public LCD() {
        status = Status.OFF;
        volume = 50; // Volume default
        brightness = 50; // Brightness default
    }

    // Metode untuk mematikan LCD
    public void turnOff() {
        status = Status.OFF;
    }

    // Metode untuk menyalakan LCD
    public void turnOn() {
        status = Status.ON;
    }

    // Metode untuk mengatur status LCD menjadi freeze
    public void Freeze() {
        status = Status.Freeze;
    }

    // Metode untuk menaikkan volume
    public void volumeUp() {
        if (volume < 100) {
            volume++; // Menaikkan volume kalau belum mencapai maksimum (100)
        }
    }

    // Metode untuk menurunkan volume
    public void volumeDown() {
        if (volume > 0) {
            volume--; // Menurunkan volume kalau belum mencapai minimum (0)
        }
    }

    // Metode untuk mengatur volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume; // Mengatur volume LCD dengan nilai yang valid antara 0 dan 100
        } else {
            System.out.println("Volume harus dalam rentang 0-100");
        }
    }

    // Metode untuk menaikkan brightness
    public void brightnessUp() {
        if (brightness < 100) {
            brightness++; // Menaikkan brightness kalau belum mencapai maksimum (100)
        }
    }

    // Metode untuk menurunkan brightness
    public void brightnessDown() {
        if (brightness > 0) {
            brightness--; // Menurunkan brightness kalau belum mencapai minimum (0)
        }
    }

    // Metode untuk mengatur brightness
    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness; // Mengatur brightness dalam rentang 0-100
        } else {
            System.out.println("Brightness harus dalam rentang 0-100");
        }
    }

    // Metode untuk mengatur jenis kabel
    public void setCable(int cableIndex) {
        switch (cableIndex) {
            case 1:
                cable = Cable.VGA;
                break;
            case 2:
                cable = Cable.HDMI;
                break;
            case 3:
                cable = Cable.DVI;
                break;
            case 4:
                cable = Cable.DISPLAYPORT;
                break;
            default:
                System.out.println("Indeks kabel tidak valid");
        }
    }

    // Metode untuk menampilkan informasi LCD
    public void displayMessage() {
        // Menampilkan status, volume, brightness, dan jenis kabel yang terhubung ke LCD
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }
 }